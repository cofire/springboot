package com.cf.dao.mapper.custom;

import java.util.Set;

import org.apache.ibatis.annotations.Param;

public interface UserPermissionCustomMapper {

    /**
     * 
     * @Title: selectByExample
     * @Description: 查询用户的权限
     * @param example
     * @return
     * @return List<UserPermissionCustom> 返回类型
     */
    Set<String> getUserPermission(@Param("USER_ID") String p_userId);

}
