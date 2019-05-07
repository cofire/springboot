package com.cf.config.log.factory;

import java.util.TimerTask;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.DependsOn;

import com.cf.dao.mapper.system.LoginAuditsMapper;
import com.cf.dao.mapper.system.OperateAuditsMapper;
import com.cf.dao.model.system.LoginAudits;
import com.cf.dao.model.system.OperateAudits;
import com.cf.util.spring.SpringContextHolder;

/**
 * 
 * @ClassName: LogTaskFactory
 * @Description:日志操作任务创建工厂
 * @date 2019年4月30日
 *
 */
@DependsOn("springContextHolder")
public class LogTaskFactory {
    private static Logger logger = LoggerFactory.getLogger(LogTaskFactory.class);
    private static OperateAuditsMapper operationLogMapper = SpringContextHolder.getBean(OperateAuditsMapper.class);
    private static LoginAuditsMapper loginAuditsMapper = SpringContextHolder.getBean(LoginAuditsMapper.class);

    public static TimerTask bussinessLog() {
        return new TimerTask() {
            @Override
            public void run() {
                OperateAudits operateAudit = LogFactory.createOperateAudits("", "", "", "", "");
                try {
                    operationLogMapper.insert(operateAudit);
                } catch (Exception e) {
                    logger.error("创建业务日志异常!", e);
                }
            }
        };
    }

    public static TimerTask loginLog(final String userId, final String ip, String type) {
        return new TimerTask() {
            @Override
            public void run() {
                LoginAudits loginAudits = LogFactory.createLoginAudits();
                try {
                    loginAuditsMapper.insert(loginAudits);
                } catch (Exception e) {
                    logger.error("创建业务日志异常!", e);
                }
            }
        };
    }
}
