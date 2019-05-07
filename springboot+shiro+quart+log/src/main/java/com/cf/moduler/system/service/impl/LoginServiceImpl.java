package com.cf.moduler.system.service.impl;

import java.util.Map;
import java.util.Set;

import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.session.Session;
import org.apache.shiro.subject.Subject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.alibaba.fastjson.JSONObject;
import com.cf.common.Result;
import com.cf.config.shiro.UserRealm;
import com.cf.dao.mapper.custom.UserPermissionCustomMapper;
import com.cf.dao.model.system.User;
import com.cf.moduler.system.service.ILoginService;
import com.cf.moduler.system.service.IUserService;
import com.cf.util.constants.Constants;

@Service
public class LoginServiceImpl implements ILoginService {
    private Logger logger = LoggerFactory.getLogger(UserRealm.class);

    @Autowired
    private IUserService c_userService;

    @Autowired
    private UserPermissionCustomMapper c_userPermissionCustomMapper;

    @Override
    public Result<Map> authLogin(String p_id, String p_passwd) {
        Result<Map> c_result = new Result<Map>();
        String c_retMessage;
        boolean c_success;
        Subject currentUser = SecurityUtils.getSubject();
        UsernamePasswordToken token = new UsernamePasswordToken(p_id, p_passwd);
        try {
            currentUser.login(token);
            c_success = true;
            c_retMessage = "登陆成功";
            logger.info("登录成功！");
        } catch (AuthenticationException e) {
            c_success = true;
            c_retMessage = "登陆失败";
            logger.info("登陆失败！");
        }
        c_result.setRetMessage(c_retMessage);
        c_result.setSuccess(c_success);
        return c_result;
    }

    @Override
    public Result<Map> getInfo() {
        Result<Map> c_result = new Result<Map>();
        Session session = SecurityUtils.getSubject().getSession();
        User user = (User) session.getAttribute(Constants.SESSION_USER_INFO);
        String userId = user.getUserId();
        Set<String> userPermission = c_userPermissionCustomMapper.getUserPermission(userId);
        userPermission.remove(null);
        userPermission.remove("");
        session.setAttribute(Constants.SESSION_USER_PERMISSION, userPermission);
        c_result.setData(session.getAttribute(Constants.SESSION_USER_PERMISSION));
        return c_result;
    }

    @Override
    public JSONObject logout() {
        // TODO Auto-generated method stub
        return null;
    }

}
