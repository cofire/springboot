package com.cf.dao.mapper.system;

import com.cf.dao.model.system.LoginAudits;
import com.cf.dao.model.system.LoginAuditsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface LoginAuditsMapper {
    long countByExample(LoginAuditsExample example);

    int deleteByExample(LoginAuditsExample example);

    int deleteByPrimaryKey(String id);

    int insert(LoginAudits record);

    int insertSelective(LoginAudits record);

    List<LoginAudits> selectByExampleWithBLOBs(LoginAuditsExample example);

    List<LoginAudits> selectByExample(LoginAuditsExample example);

    LoginAudits selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") LoginAudits record, @Param("example") LoginAuditsExample example);

    int updateByExampleWithBLOBs(@Param("record") LoginAudits record, @Param("example") LoginAuditsExample example);

    int updateByExample(@Param("record") LoginAudits record, @Param("example") LoginAuditsExample example);

    int updateByPrimaryKeySelective(LoginAudits record);

    int updateByPrimaryKeyWithBLOBs(LoginAudits record);

    int updateByPrimaryKey(LoginAudits record);
}