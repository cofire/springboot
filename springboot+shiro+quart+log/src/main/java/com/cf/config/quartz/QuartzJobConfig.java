package com.cf.config.quartz;

import org.quartz.CronTrigger;
import org.quartz.JobDetail;
import org.quartz.Scheduler;
import org.quartz.SchedulerFactory;
import org.quartz.Trigger;
import org.quartz.impl.StdSchedulerFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.cf.dao.mapper.custom.SystemCustomMapper;

/**
 * 
 * @ClassName: QuartzJobConfig
 * @Description:Quartz操作类
 * @date 2019年5月5日
 *
 */
@Component
public class QuartzJobConfig {
    // 常量
    private static Scheduler sched;
    private final static String JOB_GROUP = "jobGroup";
    private final static String TRIGGER_GROUP = "triggerGroup";
    private final static Logger logger = LoggerFactory.getLogger(QuartzJobConfig.class);

    @Autowired
    private SystemCustomMapper systemCustomMapper;

    public void registerQuartzJob() throws Exception {
        logger.info("准备注册定时任务");
        System.out.println(systemCustomMapper.getSysparamsList());
        SchedulerFactory schedulerFactory = new StdSchedulerFactory();
        sched = schedulerFactory.getScheduler();
        JobDetail jobDetail = new JobDetail("test", JOB_GROUP, QuartzJobBusiness.class);
        Trigger trigger = new CronTrigger("1234", TRIGGER_GROUP, "0 0/1 * ? * * *");
        sched.scheduleJob(jobDetail, trigger);
        sched.start();
        logger.info("Quartz任务注册成功");
    }
}
