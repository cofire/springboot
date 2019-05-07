package com.cf.moduler.quatz;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cf.dao.mapper.custom.SystemCustomMapper;

@Service
public class TestQtz {
    @Autowired
    private SystemCustomMapper systemCustomMapper;
    private static final Logger logger = LoggerFactory.getLogger(TestQtz.class);

    public void execute() {
        logger.info("执行测试定时任务开始");
        System.out.println(systemCustomMapper.getSysparamsList());
        logger.info("执行测试定时任务结束");
    }
}
