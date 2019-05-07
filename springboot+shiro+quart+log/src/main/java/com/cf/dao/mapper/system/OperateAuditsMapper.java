package com.cf.dao.mapper.system;

import com.cf.dao.model.system.OperateAudits;
import com.cf.dao.model.system.OperateAuditsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface OperateAuditsMapper {
    long countByExample(OperateAuditsExample example);

    int deleteByExample(OperateAuditsExample example);

    int deleteByPrimaryKey(String id);

    int insert(OperateAudits record);

    int insertSelective(OperateAudits record);

    List<OperateAudits> selectByExampleWithBLOBs(OperateAuditsExample example);

    List<OperateAudits> selectByExample(OperateAuditsExample example);

    OperateAudits selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") OperateAudits record, @Param("example") OperateAuditsExample example);

    int updateByExampleWithBLOBs(@Param("record") OperateAudits record, @Param("example") OperateAuditsExample example);

    int updateByExample(@Param("record") OperateAudits record, @Param("example") OperateAuditsExample example);

    int updateByPrimaryKeySelective(OperateAudits record);

    int updateByPrimaryKeyWithBLOBs(OperateAudits record);

    int updateByPrimaryKey(OperateAudits record);
}