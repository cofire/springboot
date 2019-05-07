package com.cf.common.impl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cf.dao.mapper.custom.SystemCustomMapper;

/**
 * 
 * @ClassName: SystemService
 * @Description: 系统参数管理（系统参数和数据字典）
 * @date 2019年5月5日
 *
 */
@Service
public class SystemService {
    private final static Logger logger = LoggerFactory.getLogger(SystemService.class);

    @Autowired
    private SystemCustomMapper systemCustomMapper;

    // 系统参数列表
    private static List<Map<String, String>> sysParamList;
    // 系统参数Map
    private static Map<String, Map<String, String>> sysParamMap;
    // 某一数据字典
    private static List<Map<String, String>> dictList = new ArrayList<Map<String, String>>();
    // 所有的数据字典
    private static Map<String, Map<String, String>> dictMap = new HashMap<String, Map<String, String>>();

    public SystemCustomMapper getSystemCustomMapper() {
        return systemCustomMapper;
    }

    public void setSystemCustomMapper(SystemCustomMapper systemCustomMapper) {
        this.systemCustomMapper = systemCustomMapper;
    }

    public static List<Map<String, String>> getSysParamList() {
        return sysParamList;
    }

    public static void setSysParamList(List<Map<String, String>> sysParamList) {
        SystemService.sysParamList = sysParamList;
    }

    public static Map<String, Map<String, String>> getSysParamMap() {
        return sysParamMap;
    }

    public static void setSysParamMap(Map<String, Map<String, String>> sysParamMap) {
        SystemService.sysParamMap = sysParamMap;
    }

    public static List<Map<String, String>> getDictList() {
        return dictList;
    }

    public static void setDictList(List<Map<String, String>> dictList) {
        SystemService.dictList = dictList;
    }

    public static Map<String, Map<String, String>> getDictMap() {
        return dictMap;
    }

    public static void setDictMap(Map<String, Map<String, String>> dictMap) {
        SystemService.dictMap = dictMap;
    }

    public static Logger getLogger() {
        return logger;
    }

    /**
     * 
     * @Title: initSysParam
     * @Description:初始化系统参数
     * @return void 返回类型
     */
    // @Autowired
    public void initSysParam() {
        logger.info("正在初始化系统参数");
        try {
            sysParamList = systemCustomMapper.getSysparamsList();
        } catch (Exception e) {
            logger.info(e.toString());
            logger.info("初始化系统参数失败");
            return;
        }

        logger.info("初始化系统参数完成");
    }

    /**
     * 
     * @Title: initSysParam
     * @Description:初始化系统数据字典
     * @return void 返回类型
     */
    // @Autowired
    public void initSysDict() {
        logger.info("正在初始化数据字典");
        try {
            // dictList = systemCustomMapper.getDictList();
        } catch (Exception e) {
            logger.info(e.toString());
            logger.info("初始化数据字典失败");
            return;
        }
        logger.info("初始化数据字典完成");
    }
}
