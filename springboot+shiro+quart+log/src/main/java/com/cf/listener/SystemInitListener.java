package com.cf.listener;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.DependsOn;

import com.cf.common.impl.SystemService;
import com.cf.config.quartz.QuartzJobConfig;

/**
 * 系统启动监听器
 * 
 * @ClassName: SystemInitListener
 * @Description:
 * @date 2019年5月5日
 *
 */

@WebListener
@SuppressWarnings("unused")
@DependsOn("springContextHolder")
public class SystemInitListener implements ServletContextListener {
    private final static Logger logger = LoggerFactory.getLogger(SystemInitListener.class);
    @Autowired
    private SystemService systemService;
    @Autowired
    private QuartzJobConfig quartzJobConfig;

    @Override
    public void contextInitialized(ServletContextEvent sce) {
        if (logger.isDebugEnabled()) {
            logger.debug(new StringBuilder().append("---------- Start to init ServletContextListener  at ").append(System.currentTimeMillis())
                    .append(" --------------").toString());
        }
        logger.info("正在初始化全局变量");
        systemStartup(sce.getServletContext());
        logger.info("初始化全局变量完成");

    }

    @Override
    public void contextDestroyed(ServletContextEvent sce) {
        if (logger.isDebugEnabled()) {
            logger.debug(new StringBuilder().append("---------- Start to Destroy ServletContextListener  at ").append(System.currentTimeMillis())
                    .append(" --------------").toString());
        }

    }

    /**
     * 
     * @Title: systemStartup
     * @Description:初始化全局变量
     * @param servletContext
     * @return void 返回类型
     */
    private void systemStartup(ServletContext servletContext) {
        if (logger.isDebugEnabled()) {
            logger.debug(
                    new StringBuilder().append("---------- Start to 初始化全局变量  at ").append(System.currentTimeMillis()).append(" --------------").toString());
        }
        // SystemService.initSysParam();
        // SystemService.initSysDict();
        systemService.initSysParam();
        systemService.initSysDict();
        System.out.println(systemService.getSysParamList());
        try {
            quartzJobConfig.registerQuartzJob();
        } catch (Exception e) {
            logger.info(e.toString());
            logger.info("定时任务注册失败");
        }
    }

}
