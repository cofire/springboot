package com.cf.moduler.system.service;

import java.util.Set;

import com.cf.dao.model.system.User;

public interface IUserService {
    User getUserByIdAndPwd(String id, String password);

    Set<String> getUserPermission(String p_userId);
}
