package com.cf.config.log.factory;

import java.util.Date;

import com.cf.dao.model.system.LoginAudits;
import com.cf.dao.model.system.OperateAudits;
import com.cf.util.DateUtils;
import com.cf.util.security.Util;

public class LogFactory {

    /**
     * 
     * @Title: OperateAudits
     * @Description:创建操作日志
     * @return
     * @return OperateAudits 返回类型
     */
    public static OperateAudits createOperateAudits(String ip, String sessionId, String reqUrl, String createTime, String userId) {
        OperateAudits operateAudits = new OperateAudits();
        operateAudits.setId(Util.getUUID());
        operateAudits.setIp("");
        operateAudits.setSessionId("");
        operateAudits.setReqUrl("");
        operateAudits.setCreateTime(DateUtils.dataTimeToNumber(new Date()));
        operateAudits.setUserId("");
        operateAudits.setFiller1("");
        operateAudits.setFiller2("");
        operateAudits.setFiller3("");
        return operateAudits;
    }

    public static LoginAudits createLoginAudits() {
        LoginAudits loginAudits = new LoginAudits();
        loginAudits.setId(Util.getUUID());
        loginAudits.setIp("");
        loginAudits.setSessionId("");
        loginAudits.setCreateTime("");
        loginAudits.setAuditType("");
        loginAudits.setUserId("");
        loginAudits.setFiller1("");
        loginAudits.setFiller2("");
        loginAudits.setFiller3("");
        loginAudits.setFiller4("");
        loginAudits.setSourceType("");
        loginAudits.setMessage("");
        return loginAudits;
    }
}
