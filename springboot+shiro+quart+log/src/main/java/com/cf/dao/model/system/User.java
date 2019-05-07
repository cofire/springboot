package com.cf.dao.model.system;

/**
 * @数表名称 cf_user
 * @开发日期 2019-04-28
 * @开发作者 by:ly 
 */
public class User {
    /** 用户ID (主健ID) (无默认值) */
    private String userId;

    /** 密码 (无默认值) */
    private String passwd;

    /** 职员名称 (无默认值) */
    private String userName;

    /** 员工号 (无默认值) */
    private String employeeId;

    /** 部门号 (无默认值) */
    private String branchNo;

    /** 上次登录IP (无默认值) */
    private String lastIp;

    /** 上次登录时间 (无默认值) */
    private String lastDate;

    /** 密码连续错误次数 (无默认值) */
    private Integer wrongPwdCount;

    /** 创建人 (无默认值) */
    private String creator;

    /** 创建时间 (无默认值) */
    private String createTime;

    /** 账号是否未过期 (无默认值) */
    private String accountnonexpired;

    /** 账号是否未锁定 (无默认值) */
    private String accountnonlocked;

    /** 证书是否未过期 (无默认值) */
    private String credentialsnonexpired;

    /** 用户状态 "00-未登录
01-已登录
02-已冻结
03-已过期"(必填项) (无默认值) */
    private String status;

    /** 审核状态0-未审核;1-已审核;2-审核拒绝 (无默认值) */
    private String checkStatus;

    /** 审核人 (无默认值) */
    private String checker;

    /** 审核时间,格式yyyymmddhh24miss (无默认值) */
    private String checkTime;

    /**  (无默认值) */
    private String changePwdFlag;

    /** 预留字段1 (无默认值) */
    private String filler1;

    /** 预留字段2 (无默认值) */
    private String filler2;

    /** 预留字段3 (无默认值) */
    private String filler3;

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId == null ? null : userId.trim();
    }

    public String getPasswd() {
        return passwd;
    }

    public void setPasswd(String passwd) {
        this.passwd = passwd == null ? null : passwd.trim();
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName == null ? null : userName.trim();
    }

    public String getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(String employeeId) {
        this.employeeId = employeeId == null ? null : employeeId.trim();
    }

    public String getBranchNo() {
        return branchNo;
    }

    public void setBranchNo(String branchNo) {
        this.branchNo = branchNo == null ? null : branchNo.trim();
    }

    public String getLastIp() {
        return lastIp;
    }

    public void setLastIp(String lastIp) {
        this.lastIp = lastIp == null ? null : lastIp.trim();
    }

    public String getLastDate() {
        return lastDate;
    }

    public void setLastDate(String lastDate) {
        this.lastDate = lastDate == null ? null : lastDate.trim();
    }

    public Integer getWrongPwdCount() {
        return wrongPwdCount;
    }

    public void setWrongPwdCount(Integer wrongPwdCount) {
        this.wrongPwdCount = wrongPwdCount;
    }

    public String getCreator() {
        return creator;
    }

    public void setCreator(String creator) {
        this.creator = creator == null ? null : creator.trim();
    }

    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime == null ? null : createTime.trim();
    }

    public String getAccountnonexpired() {
        return accountnonexpired;
    }

    public void setAccountnonexpired(String accountnonexpired) {
        this.accountnonexpired = accountnonexpired == null ? null : accountnonexpired.trim();
    }

    public String getAccountnonlocked() {
        return accountnonlocked;
    }

    public void setAccountnonlocked(String accountnonlocked) {
        this.accountnonlocked = accountnonlocked == null ? null : accountnonlocked.trim();
    }

    public String getCredentialsnonexpired() {
        return credentialsnonexpired;
    }

    public void setCredentialsnonexpired(String credentialsnonexpired) {
        this.credentialsnonexpired = credentialsnonexpired == null ? null : credentialsnonexpired.trim();
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status == null ? null : status.trim();
    }

    public String getCheckStatus() {
        return checkStatus;
    }

    public void setCheckStatus(String checkStatus) {
        this.checkStatus = checkStatus == null ? null : checkStatus.trim();
    }

    public String getChecker() {
        return checker;
    }

    public void setChecker(String checker) {
        this.checker = checker == null ? null : checker.trim();
    }

    public String getCheckTime() {
        return checkTime;
    }

    public void setCheckTime(String checkTime) {
        this.checkTime = checkTime == null ? null : checkTime.trim();
    }

    public String getChangePwdFlag() {
        return changePwdFlag;
    }

    public void setChangePwdFlag(String changePwdFlag) {
        this.changePwdFlag = changePwdFlag == null ? null : changePwdFlag.trim();
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
}