package com.cf.moduler.system.controller.system;

import java.util.Map;

import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.cf.common.Result;
import com.cf.config.log.BussinessLog;
import com.cf.config.log.LogManager;
import com.cf.config.log.factory.LogTaskFactory;
import com.cf.moduler.system.service.ILoginService;

@RestController
@RequestMapping("/login")
public class LoginController {

    @Autowired
    private ILoginService c_loginService;

    @BussinessLog("操作日志")
    @RequestMapping("/auth")
    public Result<Map> auth(@RequestParam("userId") String p_userId, @RequestParam("password") String p_password) {
        LogManager.me().executeLog(LogTaskFactory.loginLog("", "", ""));
        return c_loginService.authLogin(p_userId, p_password);
    }

    @RequestMapping("/getInfo")
    public Result<Map> getInfo() {
        return c_loginService.getInfo();
    }

    @RequiresPermissions("/projectManage")
    @RequestMapping("/test")
    public String test() {
        return "有权限";
    }

    @RequiresPermissions("/projectManage2")
    @RequestMapping("/test2")
    public String test2() {
        return "没有有权限";
    }
}
