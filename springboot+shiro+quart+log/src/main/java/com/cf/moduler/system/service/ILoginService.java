package com.cf.moduler.system.service;

import java.util.Map;

import com.alibaba.fastjson.JSONObject;
import com.cf.common.Result;

public interface ILoginService {
    /**
     * 登录表单提交
     */
    Result<Map> authLogin(String p_id, String p_passwd);

    /**
     * 查询当前登录用户的权限等信息
     */
    Result<Map> getInfo();

    /**
     * 退出登录
     */
    JSONObject logout();
}
