package com.cf.dao.model.system;

/**
 * @数表名称 sys_operate_audits
 * @开发日期 2019-04-30
 * @开发作者 by:ly 
 */
public class OperateAudits {
    /**  (主健ID) (无默认值) */
    private String id;

    /** ip地址 (无默认值) */
    private String ip;

    /** sessionid (无默认值) */
    private String sessionId;

    /** 创建日期 (无默认值) */
    private String createTime;

    /** 登录的id (无默认值) */
    private String userId;

    /**  (无默认值) */
    private String filler1;

    /**  (无默认值) */
    private String filler2;

    /**  (无默认值) */
    private String filler3;

    /** 请求的urltext (无默认值) */
    private String reqUrl;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip == null ? null : ip.trim();
    }

    public String getSessionId() {
        return sessionId;
    }

    public void setSessionId(String sessionId) {
        this.sessionId = sessionId == null ? null : sessionId.trim();
    }

    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime == null ? null : createTime.trim();
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId == null ? null : userId.trim();
    }

    public String getFiller1() {
        return filler1;
    }

    public void setFiller1(String filler1) {
        this.filler1 = filler1 == null ? null : filler1.trim();
    }

    public String getFiller2() {
        return filler2;
    }

    public void setFiller2(String filler2) {
        this.filler2 = filler2 == null ? null : filler2.trim();
    }

    public String getFiller3() {
        return filler3;
    }

    public void setFiller3(String filler3) {
        this.filler3 = filler3 == null ? null : filler3.trim();
    }

    public String getReqUrl() {
        return reqUrl;
    }

    public void setReqUrl(String reqUrl) {
        this.reqUrl = reqUrl == null ? null : reqUrl.trim();
    }
}