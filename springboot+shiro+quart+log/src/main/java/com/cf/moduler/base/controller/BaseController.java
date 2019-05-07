package com.cf.moduler.base.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BaseController {

    /**
     * 
     * @Title: unauth
     * @Description:权限验证失败
     * @return
     * @return String 返回类型
     */
    @RequestMapping("/error/unauth")
    public String unauth() {
        return "unauth";
    }
}
