package com.cf.config.log;

import java.lang.reflect.Method;
import java.util.Map;

import org.apache.shiro.SecurityUtils;
import org.apache.shiro.session.Session;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.Signature;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.aspectj.lang.reflect.MethodSignature;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import com.cf.config.log.factory.LogTaskFactory;
import com.cf.dao.model.system.User;
import com.cf.util.HttpContext;
import com.cf.util.constants.Constants;

/**
 * 
 * @ClassName: LogAop
 * @Description: 业务日志记录
 * @date 2019年4月30日
 *
 */
@Aspect
@Component
public class LogAop {

    private Logger log = LoggerFactory.getLogger(LogAop.class);

    @Pointcut(value = "@annotation(com.cf.config.log.BussinessLog)")
    public void cutService() {
    }

    @Around("cutService()")
    public Object recordSysLog(ProceedingJoinPoint point) throws Throwable {

        // 先执行业务
        Object result = point.proceed();

        try {
            handle(point);
        } catch (Exception e) {
            log.error("日志记录出错!", e);
        }

        return result;
    }

    private void handle(ProceedingJoinPoint point) throws Exception {
        // 获取当前用户
        Session session = SecurityUtils.getSubject().getSession();
        User user = (User) session.getAttribute(Constants.SESSION_USER_INFO);
        // 用户为空时，不记日志
        if (null == user) {
            return;
        }
        String userId = user.getUserId();
        String sesionId = (String) session.getId();
        // 获取拦截的方法名
        Signature sig = point.getSignature();
        MethodSignature msig = null;
        if (!(sig instanceof MethodSignature)) {
            throw new IllegalArgumentException("该注解只能用于方法");
        }

        msig = (MethodSignature) sig;
        Object target = point.getTarget();
        Method currentMethod = target.getClass().getMethod(msig.getName(), msig.getParameterTypes());
        String methodName = currentMethod.getName();
        // 获取请求的类名
        String className = point.getTarget().getClass().getName();
        // 获取请求参数
        Map<String, String> obj2 = HttpContext.getRequestParameters();
        log.info(obj2.toString());
        // 获取请求ip
        String ip = HttpContext.getClientIP();
        String reqURI = HttpContext.getRequestURI();
        log.info("请求用户id：" + userId);
        log.info("请求用户Session：" + sesionId);
        log.info("请求方法：" + className + "." + methodName);
        log.info("请求Ip：" + ip);
        log.info("请求URI：" + reqURI);
        LogManager.me().executeLog(LogTaskFactory.bussinessLog());
    }
}
