package com.cf.config.quartz;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.Map;

import org.quartz.Job;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.DependsOn;

import com.cf.dao.mapper.custom.SystemCustomMapper;
import com.cf.moduler.quatz.TestQtz;
import com.cf.util.spring.SpringContextHolder;

@DependsOn("springContextHolder")
public class QuartzJobBusiness implements Job {

    private final static Logger logger = LoggerFactory.getLogger(QuartzJobBusiness.class);
    private static SystemCustomMapper systemCustomMapper = SpringContextHolder.getBean(SystemCustomMapper.class);

    @SuppressWarnings("unused")
    @Override
    public void execute(JobExecutionContext context) throws JobExecutionException {

        // 判断一下本机ip是多少，只在测试服务器和开发服务器上运行quartzjob
        InetAddress ia = null;
        String localname = null;
        String localip = null;
        try {
            ia = ia.getLocalHost();
            localname = ia.getHostName();
            localip = ia.getHostAddress();
            logger.info("本机名称是：" + localname);
            logger.info("本机的ip是 ：" + localip);
        } catch (UnknownHostException e) {
            // TODO Auto-generated catch block
            logger.error(e.getMessage(), e);
        }
        /*
         * if (!("172.16.200.115".equals(localip) || "192.168.1.37".equals(localip) || "127.0.0.1".equals(localip))) {
         * logger.info("本机不是开发或测试服务器,不运行quartzjob"); return; }
         */

        // TB_JOB表ID作为Trigger的key名称
        String jobId = context.getTrigger().getName();
        System.out.println(jobId);
        System.out.println(systemCustomMapper.getSysparamsList());
        Map job = null;
        String errorMsg = "";
        try {
            // job = (Map) BaseSupport.myBatisSessionTemplate.selectOne("orm.cfquartz.TbJobMapper.selectJob", jobId);
        } catch (Exception e) {
            logger.error("读取数据库失败，失败原因：" + e.getMessage());
            errorMsg = e.getMessage();
        }

        TestQtz testQtz = SpringContextHolder.getBean(TestQtz.class);
        testQtz.execute();

        if (null == job) {
            logger.info("没有找到id为:" + jobId + "的任务");
        } else {
            if (!"1".equals(job.get("DEL"))) {
                logger.info("开始执行名为:" + job.get("JOB_NAME").toString() + "的任务");
                try {
                    executePServiceJob(job);
                    // int i=1/0;
                } catch (Exception e) {
                    // TODO Auto-generated catch block
                    logger.debug(e.getMessage(), e);
                    errorMsg = e.getMessage();
                }
            }
        }
        // Map<String, String> jobRunStatus = new HashMap<>();
        // jobRunStatus.put("LOG_ID", CommonUtils.getUUID());
        // jobRunStatus.put("IP", localip);
        // jobRunStatus.put("JOB_ID", jobId);
        // jobRunStatus.put("RUN_TIME", BaseSupport.CframeUtil.GetCurrentLongTime());
        // if ("".equals(errorMsg)) {
        // jobRunStatus.put("IS_SUCCESS", JonConstant.SUCCESS_YES);
        // } else {
        // jobRunStatus.put("IS_SUCCESS", JonConstant.SUCCESS_NO);
        // jobRunStatus.put("ERROR_MESSAGE", errorMsg);
        // }
        // BaseSupport.myBatisSessionTemplate.selectOne("orm.cfquartz.TbJobLog.insertJobLog", jobRunStatus);
    }

    private void executePServiceJob(Map job) throws Exception {
        String jobType = job.get("JOB_TYPE").toString();
        switch (jobType) {

            case ("01"):
                TestQtz testQtz = SpringContextHolder.getBean(TestQtz.class);
                testQtz.execute();
                break;

        }

    }
}
