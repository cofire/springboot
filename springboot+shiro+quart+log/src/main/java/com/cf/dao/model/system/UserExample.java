package com.cf.dao.model.system;

import java.util.ArrayList;
import java.util.List;

public class UserExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    protected Integer limitStart;

    protected Integer limitSize;

    public UserExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    public void setLimitStart(Integer limitStart) {
        this.limitStart = limitStart;
    }

    public Integer getLimitStart() {
        return limitStart;
    }

    public void setLimitSize(Integer limitSize) {
        this.limitSize = limitSize;
    }

    public Integer getLimitSize() {
        return limitSize;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andUserIdIsNull() {
            addCriterion("USER_ID is null");
            return (Criteria) this;
        }

        public Criteria andUserIdIsNotNull() {
            addCriterion("USER_ID is not null");
            return (Criteria) this;
        }

        public Criteria andUserIdEqualTo(String value) {
            addCriterion("USER_ID =", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotEqualTo(String value) {
            addCriterion("USER_ID <>", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThan(String value) {
            addCriterion("USER_ID >", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThanOrEqualTo(String value) {
            addCriterion("USER_ID >=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThan(String value) {
            addCriterion("USER_ID <", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThanOrEqualTo(String value) {
            addCriterion("USER_ID <=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLike(String value) {
            addCriterion("USER_ID like", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotLike(String value) {
            addCriterion("USER_ID not like", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdIn(List<String> values) {
            addCriterion("USER_ID in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotIn(List<String> values) {
            addCriterion("USER_ID not in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdBetween(String value1, String value2) {
            addCriterion("USER_ID between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotBetween(String value1, String value2) {
            addCriterion("USER_ID not between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andPasswdIsNull() {
            addCriterion("PASSWD is null");
            return (Criteria) this;
        }

        public Criteria andPasswdIsNotNull() {
            addCriterion("PASSWD is not null");
            return (Criteria) this;
        }

        public Criteria andPasswdEqualTo(String value) {
            addCriterion("PASSWD =", value, "passwd");
            return (Criteria) this;
        }

        public Criteria andPasswdNotEqualTo(String value) {
            addCriterion("PASSWD <>", value, "passwd");
            return (Criteria) this;
        }

        public Criteria andPasswdGreaterThan(String value) {
            addCriterion("PASSWD >", value, "passwd");
            return (Criteria) this;
        }

        public Criteria andPasswdGreaterThanOrEqualTo(String value) {
            addCriterion("PASSWD >=", value, "passwd");
            return (Criteria) this;
        }

        public Criteria andPasswdLessThan(String value) {
            addCriterion("PASSWD <", value, "passwd");
            return (Criteria) this;
        }

        public Criteria andPasswdLessThanOrEqualTo(String value) {
            addCriterion("PASSWD <=", value, "passwd");
            return (Criteria) this;
        }

        public Criteria andPasswdLike(String value) {
            addCriterion("PASSWD like", value, "passwd");
            return (Criteria) this;
        }

        public Criteria andPasswdNotLike(String value) {
            addCriterion("PASSWD not like", value, "passwd");
            return (Criteria) this;
        }

        public Criteria andPasswdIn(List<String> values) {
            addCriterion("PASSWD in", values, "passwd");
            return (Criteria) this;
        }

        public Criteria andPasswdNotIn(List<String> values) {
            addCriterion("PASSWD not in", values, "passwd");
            return (Criteria) this;
        }

        public Criteria andPasswdBetween(String value1, String value2) {
            addCriterion("PASSWD between", value1, value2, "passwd");
            return (Criteria) this;
        }

        public Criteria andPasswdNotBetween(String value1, String value2) {
            addCriterion("PASSWD not between", value1, value2, "passwd");
            return (Criteria) this;
        }

        public Criteria andUserNameIsNull() {
            addCriterion("USER_NAME is null");
            return (Criteria) this;
        }

        public Criteria andUserNameIsNotNull() {
            addCriterion("USER_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andUserNameEqualTo(String value) {
            addCriterion("USER_NAME =", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameNotEqualTo(String value) {
            addCriterion("USER_NAME <>", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameGreaterThan(String value) {
            addCriterion("USER_NAME >", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameGreaterThanOrEqualTo(String value) {
            addCriterion("USER_NAME >=", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameLessThan(String value) {
            addCriterion("USER_NAME <", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameLessThanOrEqualTo(String value) {
            addCriterion("USER_NAME <=", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameLike(String value) {
            addCriterion("USER_NAME like", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameNotLike(String value) {
            addCriterion("USER_NAME not like", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameIn(List<String> values) {
            addCriterion("USER_NAME in", values, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameNotIn(List<String> values) {
            addCriterion("USER_NAME not in", values, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameBetween(String value1, String value2) {
            addCriterion("USER_NAME between", value1, value2, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameNotBetween(String value1, String value2) {
            addCriterion("USER_NAME not between", value1, value2, "userName");
            return (Criteria) this;
        }

        public Criteria andEmployeeIdIsNull() {
            addCriterion("EMPLOYEE_ID is null");
            return (Criteria) this;
        }

        public Criteria andEmployeeIdIsNotNull() {
            addCriterion("EMPLOYEE_ID is not null");
            return (Criteria) this;
        }

        public Criteria andEmployeeIdEqualTo(String value) {
            addCriterion("EMPLOYEE_ID =", value, "employeeId");
            return (Criteria) this;
        }

        public Criteria andEmployeeIdNotEqualTo(String value) {
            addCriterion("EMPLOYEE_ID <>", value, "employeeId");
            return (Criteria) this;
        }

        public Criteria andEmployeeIdGreaterThan(String value) {
            addCriterion("EMPLOYEE_ID >", value, "employeeId");
            return (Criteria) this;
        }

        public Criteria andEmployeeIdGreaterThanOrEqualTo(String value) {
            addCriterion("EMPLOYEE_ID >=", value, "employeeId");
            return (Criteria) this;
        }

        public Criteria andEmployeeIdLessThan(String value) {
            addCriterion("EMPLOYEE_ID <", value, "employeeId");
            return (Criteria) this;
        }

        public Criteria andEmployeeIdLessThanOrEqualTo(String value) {
            addCriterion("EMPLOYEE_ID <=", value, "employeeId");
            return (Criteria) this;
        }

        public Criteria andEmployeeIdLike(String value) {
            addCriterion("EMPLOYEE_ID like", value, "employeeId");
            return (Criteria) this;
        }

        public Criteria andEmployeeIdNotLike(String value) {
            addCriterion("EMPLOYEE_ID not like", value, "employeeId");
            return (Criteria) this;
        }

        public Criteria andEmployeeIdIn(List<String> values) {
            addCriterion("EMPLOYEE_ID in", values, "employeeId");
            return (Criteria) this;
        }

        public Criteria andEmployeeIdNotIn(List<String> values) {
            addCriterion("EMPLOYEE_ID not in", values, "employeeId");
            return (Criteria) this;
        }

        public Criteria andEmployeeIdBetween(String value1, String value2) {
            addCriterion("EMPLOYEE_ID between", value1, value2, "employeeId");
            return (Criteria) this;
        }

        public Criteria andEmployeeIdNotBetween(String value1, String value2) {
            addCriterion("EMPLOYEE_ID not between", value1, value2, "employeeId");
            return (Criteria) this;
        }

        public Criteria andBranchNoIsNull() {
            addCriterion("BRANCH_NO is null");
            return (Criteria) this;
        }

        public Criteria andBranchNoIsNotNull() {
            addCriterion("BRANCH_NO is not null");
            return (Criteria) this;
        }

        public Criteria andBranchNoEqualTo(String value) {
            addCriterion("BRANCH_NO =", value, "branchNo");
            return (Criteria) this;
        }

        public Criteria andBranchNoNotEqualTo(String value) {
            addCriterion("BRANCH_NO <>", value, "branchNo");
            return (Criteria) this;
        }

        public Criteria andBranchNoGreaterThan(String value) {
            addCriterion("BRANCH_NO >", value, "branchNo");
            return (Criteria) this;
        }

        public Criteria andBranchNoGreaterThanOrEqualTo(String value) {
            addCriterion("BRANCH_NO >=", value, "branchNo");
            return (Criteria) this;
        }

        public Criteria andBranchNoLessThan(String value) {
            addCriterion("BRANCH_NO <", value, "branchNo");
            return (Criteria) this;
        }

        public Criteria andBranchNoLessThanOrEqualTo(String value) {
            addCriterion("BRANCH_NO <=", value, "branchNo");
            return (Criteria) this;
        }

        public Criteria andBranchNoLike(String value) {
            addCriterion("BRANCH_NO like", value, "branchNo");
            return (Criteria) this;
        }

        public Criteria andBranchNoNotLike(String value) {
            addCriterion("BRANCH_NO not like", value, "branchNo");
            return (Criteria) this;
        }

        public Criteria andBranchNoIn(List<String> values) {
            addCriterion("BRANCH_NO in", values, "branchNo");
            return (Criteria) this;
        }

        public Criteria andBranchNoNotIn(List<String> values) {
            addCriterion("BRANCH_NO not in", values, "branchNo");
            return (Criteria) this;
        }

        public Criteria andBranchNoBetween(String value1, String value2) {
            addCriterion("BRANCH_NO between", value1, value2, "branchNo");
            return (Criteria) this;
        }

        public Criteria andBranchNoNotBetween(String value1, String value2) {
            addCriterion("BRANCH_NO not between", value1, value2, "branchNo");
            return (Criteria) this;
        }

        public Criteria andLastIpIsNull() {
            addCriterion("LAST_IP is null");
            return (Criteria) this;
        }

        public Criteria andLastIpIsNotNull() {
            addCriterion("LAST_IP is not null");
            return (Criteria) this;
        }

        public Criteria andLastIpEqualTo(String value) {
            addCriterion("LAST_IP =", value, "lastIp");
            return (Criteria) this;
        }

        public Criteria andLastIpNotEqualTo(String value) {
            addCriterion("LAST_IP <>", value, "lastIp");
            return (Criteria) this;
        }

        public Criteria andLastIpGreaterThan(String value) {
            addCriterion("LAST_IP >", value, "lastIp");
            return (Criteria) this;
        }

        public Criteria andLastIpGreaterThanOrEqualTo(String value) {
            addCriterion("LAST_IP >=", value, "lastIp");
            return (Criteria) this;
        }

        public Criteria andLastIpLessThan(String value) {
            addCriterion("LAST_IP <", value, "lastIp");
            return (Criteria) this;
        }

        public Criteria andLastIpLessThanOrEqualTo(String value) {
            addCriterion("LAST_IP <=", value, "lastIp");
            return (Criteria) this;
        }

        public Criteria andLastIpLike(String value) {
            addCriterion("LAST_IP like", value, "lastIp");
            return (Criteria) this;
        }

        public Criteria andLastIpNotLike(String value) {
            addCriterion("LAST_IP not like", value, "lastIp");
            return (Criteria) this;
        }

        public Criteria andLastIpIn(List<String> values) {
            addCriterion("LAST_IP in", values, "lastIp");
            return (Criteria) this;
        }

        public Criteria andLastIpNotIn(List<String> values) {
            addCriterion("LAST_IP not in", values, "lastIp");
            return (Criteria) this;
        }

        public Criteria andLastIpBetween(String value1, String value2) {
            addCriterion("LAST_IP between", value1, value2, "lastIp");
            return (Criteria) this;
        }

        public Criteria andLastIpNotBetween(String value1, String value2) {
            addCriterion("LAST_IP not between", value1, value2, "lastIp");
            return (Criteria) this;
        }

        public Criteria andLastDateIsNull() {
            addCriterion("LAST_DATE is null");
            return (Criteria) this;
        }

        public Criteria andLastDateIsNotNull() {
            addCriterion("LAST_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andLastDateEqualTo(String value) {
            addCriterion("LAST_DATE =", value, "lastDate");
            return (Criteria) this;
        }

        public Criteria andLastDateNotEqualTo(String value) {
            addCriterion("LAST_DATE <>", value, "lastDate");
            return (Criteria) this;
        }

        public Criteria andLastDateGreaterThan(String value) {
            addCriterion("LAST_DATE >", value, "lastDate");
            return (Criteria) this;
        }

        public Criteria andLastDateGreaterThanOrEqualTo(String value) {
            addCriterion("LAST_DATE >=", value, "lastDate");
            return (Criteria) this;
        }

        public Criteria andLastDateLessThan(String value) {
            addCriterion("LAST_DATE <", value, "lastDate");
            return (Criteria) this;
        }

        public Criteria andLastDateLessThanOrEqualTo(String value) {
            addCriterion("LAST_DATE <=", value, "lastDate");
            return (Criteria) this;
        }

        public Criteria andLastDateLike(String value) {
            addCriterion("LAST_DATE like", value, "lastDate");
            return (Criteria) this;
        }

        public Criteria andLastDateNotLike(String value) {
            addCriterion("LAST_DATE not like", value, "lastDate");
            return (Criteria) this;
        }

        public Criteria andLastDateIn(List<String> values) {
            addCriterion("LAST_DATE in", values, "lastDate");
            return (Criteria) this;
        }

        public Criteria andLastDateNotIn(List<String> values) {
            addCriterion("LAST_DATE not in", values, "lastDate");
            return (Criteria) this;
        }

        public Criteria andLastDateBetween(String value1, String value2) {
            addCriterion("LAST_DATE between", value1, value2, "lastDate");
            return (Criteria) this;
        }

        public Criteria andLastDateNotBetween(String value1, String value2) {
            addCriterion("LAST_DATE not between", value1, value2, "lastDate");
            return (Criteria) this;
        }

        public Criteria andWrongPwdCountIsNull() {
            addCriterion("WRONG_PWD_COUNT is null");
            return (Criteria) this;
        }

        public Criteria andWrongPwdCountIsNotNull() {
            addCriterion("WRONG_PWD_COUNT is not null");
            return (Criteria) this;
        }

        public Criteria andWrongPwdCountEqualTo(Integer value) {
            addCriterion("WRONG_PWD_COUNT =", value, "wrongPwdCount");
            return (Criteria) this;
        }

        public Criteria andWrongPwdCountNotEqualTo(Integer value) {
            addCriterion("WRONG_PWD_COUNT <>", value, "wrongPwdCount");
            return (Criteria) this;
        }

        public Criteria andWrongPwdCountGreaterThan(Integer value) {
            addCriterion("WRONG_PWD_COUNT >", value, "wrongPwdCount");
            return (Criteria) this;
        }

        public Criteria andWrongPwdCountGreaterThanOrEqualTo(Integer value) {
            addCriterion("WRONG_PWD_COUNT >=", value, "wrongPwdCount");
            return (Criteria) this;
        }

        public Criteria andWrongPwdCountLessThan(Integer value) {
            addCriterion("WRONG_PWD_COUNT <", value, "wrongPwdCount");
            return (Criteria) this;
        }

        public Criteria andWrongPwdCountLessThanOrEqualTo(Integer value) {
            addCriterion("WRONG_PWD_COUNT <=", value, "wrongPwdCount");
            return (Criteria) this;
        }

        public Criteria andWrongPwdCountIn(List<Integer> values) {
            addCriterion("WRONG_PWD_COUNT in", values, "wrongPwdCount");
            return (Criteria) this;
        }

        public Criteria andWrongPwdCountNotIn(List<Integer> values) {
            addCriterion("WRONG_PWD_COUNT not in", values, "wrongPwdCount");
            return (Criteria) this;
        }

        public Criteria andWrongPwdCountBetween(Integer value1, Integer value2) {
            addCriterion("WRONG_PWD_COUNT between", value1, value2, "wrongPwdCount");
            return (Criteria) this;
        }

        public Criteria andWrongPwdCountNotBetween(Integer value1, Integer value2) {
            addCriterion("WRONG_PWD_COUNT not between", value1, value2, "wrongPwdCount");
            return (Criteria) this;
        }

        public Criteria andCreatorIsNull() {
            addCriterion("CREATOR is null");
            return (Criteria) this;
        }

        public Criteria andCreatorIsNotNull() {
            addCriterion("CREATOR is not null");
            return (Criteria) this;
        }

        public Criteria andCreatorEqualTo(String value) {
            addCriterion("CREATOR =", value, "creator");
            return (Criteria) this;
        }

        public Criteria andCreatorNotEqualTo(String value) {
            addCriterion("CREATOR <>", value, "creator");
            return (Criteria) this;
        }

        public Criteria andCreatorGreaterThan(String value) {
            addCriterion("CREATOR >", value, "creator");
            return (Criteria) this;
        }

        public Criteria andCreatorGreaterThanOrEqualTo(String value) {
            addCriterion("CREATOR >=", value, "creator");
            return (Criteria) this;
        }

        public Criteria andCreatorLessThan(String value) {
            addCriterion("CREATOR <", value, "creator");
            return (Criteria) this;
        }

        public Criteria andCreatorLessThanOrEqualTo(String value) {
            addCriterion("CREATOR <=", value, "creator");
            return (Criteria) this;
        }

        public Criteria andCreatorLike(String value) {
            addCriterion("CREATOR like", value, "creator");
            return (Criteria) this;
        }

        public Criteria andCreatorNotLike(String value) {
            addCriterion("CREATOR not like", value, "creator");
            return (Criteria) this;
        }

        public Criteria andCreatorIn(List<String> values) {
            addCriterion("CREATOR in", values, "creator");
            return (Criteria) this;
        }

        public Criteria andCreatorNotIn(List<String> values) {
            addCriterion("CREATOR not in", values, "creator");
            return (Criteria) this;
        }

        public Criteria andCreatorBetween(String value1, String value2) {
            addCriterion("CREATOR between", value1, value2, "creator");
            return (Criteria) this;
        }

        public Criteria andCreatorNotBetween(String value1, String value2) {
            addCriterion("CREATOR not between", value1, value2, "creator");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNull() {
            addCriterion("CREATE_TIME is null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNotNull() {
            addCriterion("CREATE_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeEqualTo(String value) {
            addCriterion("CREATE_TIME =", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotEqualTo(String value) {
            addCriterion("CREATE_TIME <>", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThan(String value) {
            addCriterion("CREATE_TIME >", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThanOrEqualTo(String value) {
            addCriterion("CREATE_TIME >=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThan(String value) {
            addCriterion("CREATE_TIME <", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThanOrEqualTo(String value) {
            addCriterion("CREATE_TIME <=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLike(String value) {
            addCriterion("CREATE_TIME like", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotLike(String value) {
            addCriterion("CREATE_TIME not like", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIn(List<String> values) {
            addCriterion("CREATE_TIME in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotIn(List<String> values) {
            addCriterion("CREATE_TIME not in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeBetween(String value1, String value2) {
            addCriterion("CREATE_TIME between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotBetween(String value1, String value2) {
            addCriterion("CREATE_TIME not between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andAccountnonexpiredIsNull() {
            addCriterion("accountNonExpired is null");
            return (Criteria) this;
        }

        public Criteria andAccountnonexpiredIsNotNull() {
            addCriterion("accountNonExpired is not null");
            return (Criteria) this;
        }

        public Criteria andAccountnonexpiredEqualTo(String value) {
            addCriterion("accountNonExpired =", value, "accountnonexpired");
            return (Criteria) this;
        }

        public Criteria andAccountnonexpiredNotEqualTo(String value) {
            addCriterion("accountNonExpired <>", value, "accountnonexpired");
            return (Criteria) this;
        }

        public Criteria andAccountnonexpiredGreaterThan(String value) {
            addCriterion("accountNonExpired >", value, "accountnonexpired");
            return (Criteria) this;
        }

        public Criteria andAccountnonexpiredGreaterThanOrEqualTo(String value) {
            addCriterion("accountNonExpired >=", value, "accountnonexpired");
            return (Criteria) this;
        }

        public Criteria andAccountnonexpiredLessThan(String value) {
            addCriterion("accountNonExpired <", value, "accountnonexpired");
            return (Criteria) this;
        }

        public Criteria andAccountnonexpiredLessThanOrEqualTo(String value) {
            addCriterion("accountNonExpired <=", value, "accountnonexpired");
            return (Criteria) this;
        }

        public Criteria andAccountnonexpiredLike(String value) {
            addCriterion("accountNonExpired like", value, "accountnonexpired");
            return (Criteria) this;
        }

        public Criteria andAccountnonexpiredNotLike(String value) {
            addCriterion("accountNonExpired not like", value, "accountnonexpired");
            return (Criteria) this;
        }

        public Criteria andAccountnonexpiredIn(List<String> values) {
            addCriterion("accountNonExpired in", values, "accountnonexpired");
            return (Criteria) this;
        }

        public Criteria andAccountnonexpiredNotIn(List<String> values) {
            addCriterion("accountNonExpired not in", values, "accountnonexpired");
            return (Criteria) this;
        }

        public Criteria andAccountnonexpiredBetween(String value1, String value2) {
            addCriterion("accountNonExpired between", value1, value2, "accountnonexpired");
            return (Criteria) this;
        }

        public Criteria andAccountnonexpiredNotBetween(String value1, String value2) {
            addCriterion("accountNonExpired not between", value1, value2, "accountnonexpired");
            return (Criteria) this;
        }

        public Criteria andAccountnonlockedIsNull() {
            addCriterion("accountNonLocked is null");
            return (Criteria) this;
        }

        public Criteria andAccountnonlockedIsNotNull() {
            addCriterion("accountNonLocked is not null");
            return (Criteria) this;
        }

        public Criteria andAccountnonlockedEqualTo(String value) {
            addCriterion("accountNonLocked =", value, "accountnonlocked");
            return (Criteria) this;
        }

        public Criteria andAccountnonlockedNotEqualTo(String value) {
            addCriterion("accountNonLocked <>", value, "accountnonlocked");
            return (Criteria) this;
        }

        public Criteria andAccountnonlockedGreaterThan(String value) {
            addCriterion("accountNonLocked >", value, "accountnonlocked");
            return (Criteria) this;
        }

        public Criteria andAccountnonlockedGreaterThanOrEqualTo(String value) {
            addCriterion("accountNonLocked >=", value, "accountnonlocked");
            return (Criteria) this;
        }

        public Criteria andAccountnonlockedLessThan(String value) {
            addCriterion("accountNonLocked <", value, "accountnonlocked");
            return (Criteria) this;
        }

        public Criteria andAccountnonlockedLessThanOrEqualTo(String value) {
            addCriterion("accountNonLocked <=", value, "accountnonlocked");
            return (Criteria) this;
        }

        public Criteria andAccountnonlockedLike(String value) {
            addCriterion("accountNonLocked like", value, "accountnonlocked");
            return (Criteria) this;
        }

        public Criteria andAccountnonlockedNotLike(String value) {
            addCriterion("accountNonLocked not like", value, "accountnonlocked");
            return (Criteria) this;
        }

        public Criteria andAccountnonlockedIn(List<String> values) {
            addCriterion("accountNonLocked in", values, "accountnonlocked");
            return (Criteria) this;
        }

        public Criteria andAccountnonlockedNotIn(List<String> values) {
            addCriterion("accountNonLocked not in", values, "accountnonlocked");
            return (Criteria) this;
        }

        public Criteria andAccountnonlockedBetween(String value1, String value2) {
            addCriterion("accountNonLocked between", value1, value2, "accountnonlocked");
            return (Criteria) this;
        }

        public Criteria andAccountnonlockedNotBetween(String value1, String value2) {
            addCriterion("accountNonLocked not between", value1, value2, "accountnonlocked");
            return (Criteria) this;
        }

        public Criteria andCredentialsnonexpiredIsNull() {
            addCriterion("credentialsNonExpired is null");
            return (Criteria) this;
        }

        public Criteria andCredentialsnonexpiredIsNotNull() {
            addCriterion("credentialsNonExpired is not null");
            return (Criteria) this;
        }

        public Criteria andCredentialsnonexpiredEqualTo(String value) {
            addCriterion("credentialsNonExpired =", value, "credentialsnonexpired");
            return (Criteria) this;
        }

        public Criteria andCredentialsnonexpiredNotEqualTo(String value) {
            addCriterion("credentialsNonExpired <>", value, "credentialsnonexpired");
            return (Criteria) this;
        }

        public Criteria andCredentialsnonexpiredGreaterThan(String value) {
            addCriterion("credentialsNonExpired >", value, "credentialsnonexpired");
            return (Criteria) this;
        }

        public Criteria andCredentialsnonexpiredGreaterThanOrEqualTo(String value) {
            addCriterion("credentialsNonExpired >=", value, "credentialsnonexpired");
            return (Criteria) this;
        }

        public Criteria andCredentialsnonexpiredLessThan(String value) {
            addCriterion("credentialsNonExpired <", value, "credentialsnonexpired");
            return (Criteria) this;
        }

        public Criteria andCredentialsnonexpiredLessThanOrEqualTo(String value) {
            addCriterion("credentialsNonExpired <=", value, "credentialsnonexpired");
            return (Criteria) this;
        }

        public Criteria andCredentialsnonexpiredLike(String value) {
            addCriterion("credentialsNonExpired like", value, "credentialsnonexpired");
            return (Criteria) this;
        }

        public Criteria andCredentialsnonexpiredNotLike(String value) {
            addCriterion("credentialsNonExpired not like", value, "credentialsnonexpired");
            return (Criteria) this;
        }

        public Criteria andCredentialsnonexpiredIn(List<String> values) {
            addCriterion("credentialsNonExpired in", values, "credentialsnonexpired");
            return (Criteria) this;
        }

        public Criteria andCredentialsnonexpiredNotIn(List<String> values) {
            addCriterion("credentialsNonExpired not in", values, "credentialsnonexpired");
            return (Criteria) this;
        }

        public Criteria andCredentialsnonexpiredBetween(String value1, String value2) {
            addCriterion("credentialsNonExpired between", value1, value2, "credentialsnonexpired");
            return (Criteria) this;
        }

        public Criteria andCredentialsnonexpiredNotBetween(String value1, String value2) {
            addCriterion("credentialsNonExpired not between", value1, value2, "credentialsnonexpired");
            return (Criteria) this;
        }

        public Criteria andStatusIsNull() {
            addCriterion("STATUS is null");
            return (Criteria) this;
        }

        public Criteria andStatusIsNotNull() {
            addCriterion("STATUS is not null");
            return (Criteria) this;
        }

        public Criteria andStatusEqualTo(String value) {
            addCriterion("STATUS =", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotEqualTo(String value) {
            addCriterion("STATUS <>", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThan(String value) {
            addCriterion("STATUS >", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThanOrEqualTo(String value) {
            addCriterion("STATUS >=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThan(String value) {
            addCriterion("STATUS <", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThanOrEqualTo(String value) {
            addCriterion("STATUS <=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLike(String value) {
            addCriterion("STATUS like", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotLike(String value) {
            addCriterion("STATUS not like", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusIn(List<String> values) {
            addCriterion("STATUS in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotIn(List<String> values) {
            addCriterion("STATUS not in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusBetween(String value1, String value2) {
            addCriterion("STATUS between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotBetween(String value1, String value2) {
            addCriterion("STATUS not between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andCheckStatusIsNull() {
            addCriterion("CHECK_STATUS is null");
            return (Criteria) this;
        }

        public Criteria andCheckStatusIsNotNull() {
            addCriterion("CHECK_STATUS is not null");
            return (Criteria) this;
        }

        public Criteria andCheckStatusEqualTo(String value) {
            addCriterion("CHECK_STATUS =", value, "checkStatus");
            return (Criteria) this;
        }

        public Criteria andCheckStatusNotEqualTo(String value) {
            addCriterion("CHECK_STATUS <>", value, "checkStatus");
            return (Criteria) this;
        }

        public Criteria andCheckStatusGreaterThan(String value) {
            addCriterion("CHECK_STATUS >", value, "checkStatus");
            return (Criteria) this;
        }

        public Criteria andCheckStatusGreaterThanOrEqualTo(String value) {
            addCriterion("CHECK_STATUS >=", value, "checkStatus");
            return (Criteria) this;
        }

        public Criteria andCheckStatusLessThan(String value) {
            addCriterion("CHECK_STATUS <", value, "checkStatus");
            return (Criteria) this;
        }

        public Criteria andCheckStatusLessThanOrEqualTo(String value) {
            addCriterion("CHECK_STATUS <=", value, "checkStatus");
            return (Criteria) this;
        }

        public Criteria andCheckStatusLike(String value) {
            addCriterion("CHECK_STATUS like", value, "checkStatus");
            return (Criteria) this;
        }

        public Criteria andCheckStatusNotLike(String value) {
            addCriterion("CHECK_STATUS not like", value, "checkStatus");
            return (Criteria) this;
        }

        public Criteria andCheckStatusIn(List<String> values) {
            addCriterion("CHECK_STATUS in", values, "checkStatus");
            return (Criteria) this;
        }

        public Criteria andCheckStatusNotIn(List<String> values) {
            addCriterion("CHECK_STATUS not in", values, "checkStatus");
            return (Criteria) this;
        }

        public Criteria andCheckStatusBetween(String value1, String value2) {
            addCriterion("CHECK_STATUS between", value1, value2, "checkStatus");
            return (Criteria) this;
        }

        public Criteria andCheckStatusNotBetween(String value1, String value2) {
            addCriterion("CHECK_STATUS not between", value1, value2, "checkStatus");
            return (Criteria) this;
        }

        public Criteria andCheckerIsNull() {
            addCriterion("CHECKER is null");
            return (Criteria) this;
        }

        public Criteria andCheckerIsNotNull() {
            addCriterion("CHECKER is not null");
            return (Criteria) this;
        }

        public Criteria andCheckerEqualTo(String value) {
            addCriterion("CHECKER =", value, "checker");
            return (Criteria) this;
        }

        public Criteria andCheckerNotEqualTo(String value) {
            addCriterion("CHECKER <>", value, "checker");
            return (Criteria) this;
        }

        public Criteria andCheckerGreaterThan(String value) {
            addCriterion("CHECKER >", value, "checker");
            return (Criteria) this;
        }

        public Criteria andCheckerGreaterThanOrEqualTo(String value) {
            addCriterion("CHECKER >=", value, "checker");
            return (Criteria) this;
        }

        public Criteria andCheckerLessThan(String value) {
            addCriterion("CHECKER <", value, "checker");
            return (Criteria) this;
        }

        public Criteria andCheckerLessThanOrEqualTo(String value) {
            addCriterion("CHECKER <=", value, "checker");
            return (Criteria) this;
        }

        public Criteria andCheckerLike(String value) {
            addCriterion("CHECKER like", value, "checker");
            return (Criteria) this;
        }

        public Criteria andCheckerNotLike(String value) {
            addCriterion("CHECKER not like", value, "checker");
            return (Criteria) this;
        }

        public Criteria andCheckerIn(List<String> values) {
            addCriterion("CHECKER in", values, "checker");
            return (Criteria) this;
        }

        public Criteria andCheckerNotIn(List<String> values) {
            addCriterion("CHECKER not in", values, "checker");
            return (Criteria) this;
        }

        public Criteria andCheckerBetween(String value1, String value2) {
            addCriterion("CHECKER between", value1, value2, "checker");
            return (Criteria) this;
        }

        public Criteria andCheckerNotBetween(String value1, String value2) {
            addCriterion("CHECKER not between", value1, value2, "checker");
            return (Criteria) this;
        }

        public Criteria andCheckTimeIsNull() {
            addCriterion("CHECK_TIME is null");
            return (Criteria) this;
        }

        public Criteria andCheckTimeIsNotNull() {
            addCriterion("CHECK_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andCheckTimeEqualTo(String value) {
            addCriterion("CHECK_TIME =", value, "checkTime");
            return (Criteria) this;
        }

        public Criteria andCheckTimeNotEqualTo(String value) {
            addCriterion("CHECK_TIME <>", value, "checkTime");
            return (Criteria) this;
        }

        public Criteria andCheckTimeGreaterThan(String value) {
            addCriterion("CHECK_TIME >", value, "checkTime");
            return (Criteria) this;
        }

        public Criteria andCheckTimeGreaterThanOrEqualTo(String value) {
            addCriterion("CHECK_TIME >=", value, "checkTime");
            return (Criteria) this;
        }

        public Criteria andCheckTimeLessThan(String value) {
            addCriterion("CHECK_TIME <", value, "checkTime");
            return (Criteria) this;
        }

        public Criteria andCheckTimeLessThanOrEqualTo(String value) {
            addCriterion("CHECK_TIME <=", value, "checkTime");
            return (Criteria) this;
        }

        public Criteria andCheckTimeLike(String value) {
            addCriterion("CHECK_TIME like", value, "checkTime");
            return (Criteria) this;
        }

        public Criteria andCheckTimeNotLike(String value) {
            addCriterion("CHECK_TIME not like", value, "checkTime");
            return (Criteria) this;
        }

        public Criteria andCheckTimeIn(List<String> values) {
            addCriterion("CHECK_TIME in", values, "checkTime");
            return (Criteria) this;
        }

        public Criteria andCheckTimeNotIn(List<String> values) {
            addCriterion("CHECK_TIME not in", values, "checkTime");
            return (Criteria) this;
        }

        public Criteria andCheckTimeBetween(String value1, String value2) {
            addCriterion("CHECK_TIME between", value1, value2, "checkTime");
            return (Criteria) this;
        }

        public Criteria andCheckTimeNotBetween(String value1, String value2) {
            addCriterion("CHECK_TIME not between", value1, value2, "checkTime");
            return (Criteria) this;
        }

        public Criteria andChangePwdFlagIsNull() {
            addCriterion("CHANGE_PWD_FLAG is null");
            return (Criteria) this;
        }

        public Criteria andChangePwdFlagIsNotNull() {
            addCriterion("CHANGE_PWD_FLAG is not null");
            return (Criteria) this;
        }

        public Criteria andChangePwdFlagEqualTo(String value) {
            addCriterion("CHANGE_PWD_FLAG =", value, "changePwdFlag");
            return (Criteria) this;
        }

        public Criteria andChangePwdFlagNotEqualTo(String value) {
            addCriterion("CHANGE_PWD_FLAG <>", value, "changePwdFlag");
            return (Criteria) this;
        }

        public Criteria andChangePwdFlagGreaterThan(String value) {
            addCriterion("CHANGE_PWD_FLAG >", value, "changePwdFlag");
            return (Criteria) this;
        }

        public Criteria andChangePwdFlagGreaterThanOrEqualTo(String value) {
            addCriterion("CHANGE_PWD_FLAG >=", value, "changePwdFlag");
            return (Criteria) this;
        }

        public Criteria andChangePwdFlagLessThan(String value) {
            addCriterion("CHANGE_PWD_FLAG <", value, "changePwdFlag");
            return (Criteria) this;
        }

        public Criteria andChangePwdFlagLessThanOrEqualTo(String value) {
            addCriterion("CHANGE_PWD_FLAG <=", value, "changePwdFlag");
            return (Criteria) this;
        }

        public Criteria andChangePwdFlagLike(String value) {
            addCriterion("CHANGE_PWD_FLAG like", value, "changePwdFlag");
            return (Criteria) this;
        }

        public Criteria andChangePwdFlagNotLike(String value) {
            addCriterion("CHANGE_PWD_FLAG not like", value, "changePwdFlag");
            return (Criteria) this;
        }

        public Criteria andChangePwdFlagIn(List<String> values) {
            addCriterion("CHANGE_PWD_FLAG in", values, "changePwdFlag");
            return (Criteria) this;
        }

        public Criteria andChangePwdFlagNotIn(List<String> values) {
            addCriterion("CHANGE_PWD_FLAG not in", values, "changePwdFlag");
            return (Criteria) this;
        }

        public Criteria andChangePwdFlagBetween(String value1, String value2) {
            addCriterion("CHANGE_PWD_FLAG between", value1, value2, "changePwdFlag");
            return (Criteria) this;
        }

        public Criteria andChangePwdFlagNotBetween(String value1, String value2) {
            addCriterion("CHANGE_PWD_FLAG not between", value1, value2, "changePwdFlag");
            return (Criteria) this;
        }

        public Criteria andFiller1IsNull() {
            addCriterion("FILLER1 is null");
            return (Criteria) this;
        }

        public Criteria andFiller1IsNotNull() {
            addCriterion("FILLER1 is not null");
            return (Criteria) this;
        }

        public Criteria andFiller1EqualTo(String value) {
            addCriterion("FILLER1 =", value, "filler1");
            return (Criteria) this;
        }

        public Criteria andFiller1NotEqualTo(String value) {
            addCriterion("FILLER1 <>", value, "filler1");
            return (Criteria) this;
        }

        public Criteria andFiller1GreaterThan(String value) {
            addCriterion("FILLER1 >", value, "filler1");
            return (Criteria) this;
        }

        public Criteria andFiller1GreaterThanOrEqualTo(String value) {
            addCriterion("FILLER1 >=", value, "filler1");
            return (Criteria) this;
        }

        public Criteria andFiller1LessThan(String value) {
            addCriterion("FILLER1 <", value, "filler1");
            return (Criteria) this;
        }

        public Criteria andFiller1LessThanOrEqualTo(String value) {
            addCriterion("FILLER1 <=", value, "filler1");
            return (Criteria) this;
        }

        public Criteria andFiller1Like(String value) {
            addCriterion("FILLER1 like", value, "filler1");
            return (Criteria) this;
        }

        public Criteria andFiller1NotLike(String value) {
            addCriterion("FILLER1 not like", value, "filler1");
            return (Criteria) this;
        }

        public Criteria andFiller1In(List<String> values) {
            addCriterion("FILLER1 in", values, "filler1");
            return (Criteria) this;
        }

        public Criteria andFiller1NotIn(List<String> values) {
            addCriterion("FILLER1 not in", values, "filler1");
            return (Criteria) this;
        }

        public Criteria andFiller1Between(String value1, String value2) {
            addCriterion("FILLER1 between", value1, value2, "filler1");
            return (Criteria) this;
        }

        public Criteria andFiller1NotBetween(String value1, String value2) {
            addCriterion("FILLER1 not between", value1, value2, "filler1");
            return (Criteria) this;
        }

        public Criteria andFiller2IsNull() {
            addCriterion("FILLER2 is null");
            return (Criteria) this;
        }

        public Criteria andFiller2IsNotNull() {
            addCriterion("FILLER2 is not null");
            return (Criteria) this;
        }

        public Criteria andFiller2EqualTo(String value) {
            addCriterion("FILLER2 =", value, "filler2");
            return (Criteria) this;
        }

        public Criteria andFiller2NotEqualTo(String value) {
            addCriterion("FILLER2 <>", value, "filler2");
            return (Criteria) this;
        }

        public Criteria andFiller2GreaterThan(String value) {
            addCriterion("FILLER2 >", value, "filler2");
            return (Criteria) this;
        }

        public Criteria andFiller2GreaterThanOrEqualTo(String value) {
            addCriterion("FILLER2 >=", value, "filler2");
            return (Criteria) this;
        }

        public Criteria andFiller2LessThan(String value) {
            addCriterion("FILLER2 <", value, "filler2");
            return (Criteria) this;
        }

        public Criteria andFiller2LessThanOrEqualTo(String value) {
            addCriterion("FILLER2 <=", value, "filler2");
            return (Criteria) this;
        }

        public Criteria andFiller2Like(String value) {
            addCriterion("FILLER2 like", value, "filler2");
            return (Criteria) this;
        }

        public Criteria andFiller2NotLike(String value) {
            addCriterion("FILLER2 not like", value, "filler2");
            return (Criteria) this;
        }

        public Criteria andFiller2In(List<String> values) {
            addCriterion("FILLER2 in", values, "filler2");
            return (Criteria) this;
        }

        public Criteria andFiller2NotIn(List<String> values) {
            addCriterion("FILLER2 not in", values, "filler2");
            return (Criteria) this;
        }

        public Criteria andFiller2Between(String value1, String value2) {
            addCriterion("FILLER2 between", value1, value2, "filler2");
            return (Criteria) this;
        }

        public Criteria andFiller2NotBetween(String value1, String value2) {
            addCriterion("FILLER2 not between", value1, value2, "filler2");
            return (Criteria) this;
        }

        public Criteria andFiller3IsNull() {
            addCriterion("FILLER3 is null");
            return (Criteria) this;
        }

        public Criteria andFiller3IsNotNull() {
            addCriterion("FILLER3 is not null");
            return (Criteria) this;
        }

        public Criteria andFiller3EqualTo(String value) {
            addCriterion("FILLER3 =", value, "filler3");
            return (Criteria) this;
        }

        public Criteria andFiller3NotEqualTo(String value) {
            addCriterion("FILLER3 <>", value, "filler3");
            return (Criteria) this;
        }

        public Criteria andFiller3GreaterThan(String value) {
            addCriterion("FILLER3 >", value, "filler3");
            return (Criteria) this;
        }

        public Criteria andFiller3GreaterThanOrEqualTo(String value) {
            addCriterion("FILLER3 >=", value, "filler3");
            return (Criteria) this;
        }

        public Criteria andFiller3LessThan(String value) {
            addCriterion("FILLER3 <", value, "filler3");
            return (Criteria) this;
        }

        public Criteria andFiller3LessThanOrEqualTo(String value) {
            addCriterion("FILLER3 <=", value, "filler3");
            return (Criteria) this;
        }

        public Criteria andFiller3Like(String value) {
            addCriterion("FILLER3 like", value, "filler3");
            return (Criteria) this;
        }

        public Criteria andFiller3NotLike(String value) {
            addCriterion("FILLER3 not like", value, "filler3");
            return (Criteria) this;
        }

        public Criteria andFiller3In(List<String> values) {
            addCriterion("FILLER3 in", values, "filler3");
            return (Criteria) this;
        }

        public Criteria andFiller3NotIn(List<String> values) {
            addCriterion("FILLER3 not in", values, "filler3");
            return (Criteria) this;
        }

        public Criteria andFiller3Between(String value1, String value2) {
            addCriterion("FILLER3 between", value1, value2, "filler3");
            return (Criteria) this;
        }

        public Criteria andFiller3NotBetween(String value1, String value2) {
            addCriterion("FILLER3 not between", value1, value2, "filler3");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}