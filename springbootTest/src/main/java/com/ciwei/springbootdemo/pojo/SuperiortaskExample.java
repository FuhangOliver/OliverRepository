package com.ciwei.springbootdemo.pojo;

import java.util.ArrayList;
import java.util.List;

public class SuperiortaskExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SuperiortaskExample() {
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

        public Criteria andInitiatingidIsNull() {
            addCriterion("initiatingId is null");
            return (Criteria) this;
        }

        public Criteria andInitiatingidIsNotNull() {
            addCriterion("initiatingId is not null");
            return (Criteria) this;
        }

        public Criteria andInitiatingidEqualTo(Integer value) {
            addCriterion("initiatingId =", value, "initiatingid");
            return (Criteria) this;
        }

        public Criteria andInitiatingidNotEqualTo(Integer value) {
            addCriterion("initiatingId <>", value, "initiatingid");
            return (Criteria) this;
        }

        public Criteria andInitiatingidGreaterThan(Integer value) {
            addCriterion("initiatingId >", value, "initiatingid");
            return (Criteria) this;
        }

        public Criteria andInitiatingidGreaterThanOrEqualTo(Integer value) {
            addCriterion("initiatingId >=", value, "initiatingid");
            return (Criteria) this;
        }

        public Criteria andInitiatingidLessThan(Integer value) {
            addCriterion("initiatingId <", value, "initiatingid");
            return (Criteria) this;
        }

        public Criteria andInitiatingidLessThanOrEqualTo(Integer value) {
            addCriterion("initiatingId <=", value, "initiatingid");
            return (Criteria) this;
        }

        public Criteria andInitiatingidIn(List<Integer> values) {
            addCriterion("initiatingId in", values, "initiatingid");
            return (Criteria) this;
        }

        public Criteria andInitiatingidNotIn(List<Integer> values) {
            addCriterion("initiatingId not in", values, "initiatingid");
            return (Criteria) this;
        }

        public Criteria andInitiatingidBetween(Integer value1, Integer value2) {
            addCriterion("initiatingId between", value1, value2, "initiatingid");
            return (Criteria) this;
        }

        public Criteria andInitiatingidNotBetween(Integer value1, Integer value2) {
            addCriterion("initiatingId not between", value1, value2, "initiatingid");
            return (Criteria) this;
        }

        public Criteria andInitiatingdeviceIsNull() {
            addCriterion("initiatingdevice is null");
            return (Criteria) this;
        }

        public Criteria andInitiatingdeviceIsNotNull() {
            addCriterion("initiatingdevice is not null");
            return (Criteria) this;
        }

        public Criteria andInitiatingdeviceEqualTo(String value) {
            addCriterion("initiatingdevice =", value, "initiatingdevice");
            return (Criteria) this;
        }

        public Criteria andInitiatingdeviceNotEqualTo(String value) {
            addCriterion("initiatingdevice <>", value, "initiatingdevice");
            return (Criteria) this;
        }

        public Criteria andInitiatingdeviceGreaterThan(String value) {
            addCriterion("initiatingdevice >", value, "initiatingdevice");
            return (Criteria) this;
        }

        public Criteria andInitiatingdeviceGreaterThanOrEqualTo(String value) {
            addCriterion("initiatingdevice >=", value, "initiatingdevice");
            return (Criteria) this;
        }

        public Criteria andInitiatingdeviceLessThan(String value) {
            addCriterion("initiatingdevice <", value, "initiatingdevice");
            return (Criteria) this;
        }

        public Criteria andInitiatingdeviceLessThanOrEqualTo(String value) {
            addCriterion("initiatingdevice <=", value, "initiatingdevice");
            return (Criteria) this;
        }

        public Criteria andInitiatingdeviceLike(String value) {
            addCriterion("initiatingdevice like", value, "initiatingdevice");
            return (Criteria) this;
        }

        public Criteria andInitiatingdeviceNotLike(String value) {
            addCriterion("initiatingdevice not like", value, "initiatingdevice");
            return (Criteria) this;
        }

        public Criteria andInitiatingdeviceIn(List<String> values) {
            addCriterion("initiatingdevice in", values, "initiatingdevice");
            return (Criteria) this;
        }

        public Criteria andInitiatingdeviceNotIn(List<String> values) {
            addCriterion("initiatingdevice not in", values, "initiatingdevice");
            return (Criteria) this;
        }

        public Criteria andInitiatingdeviceBetween(String value1, String value2) {
            addCriterion("initiatingdevice between", value1, value2, "initiatingdevice");
            return (Criteria) this;
        }

        public Criteria andInitiatingdeviceNotBetween(String value1, String value2) {
            addCriterion("initiatingdevice not between", value1, value2, "initiatingdevice");
            return (Criteria) this;
        }

        public Criteria andTargetdeviceIsNull() {
            addCriterion("targetdevice is null");
            return (Criteria) this;
        }

        public Criteria andTargetdeviceIsNotNull() {
            addCriterion("targetdevice is not null");
            return (Criteria) this;
        }

        public Criteria andTargetdeviceEqualTo(String value) {
            addCriterion("targetdevice =", value, "targetdevice");
            return (Criteria) this;
        }

        public Criteria andTargetdeviceNotEqualTo(String value) {
            addCriterion("targetdevice <>", value, "targetdevice");
            return (Criteria) this;
        }

        public Criteria andTargetdeviceGreaterThan(String value) {
            addCriterion("targetdevice >", value, "targetdevice");
            return (Criteria) this;
        }

        public Criteria andTargetdeviceGreaterThanOrEqualTo(String value) {
            addCriterion("targetdevice >=", value, "targetdevice");
            return (Criteria) this;
        }

        public Criteria andTargetdeviceLessThan(String value) {
            addCriterion("targetdevice <", value, "targetdevice");
            return (Criteria) this;
        }

        public Criteria andTargetdeviceLessThanOrEqualTo(String value) {
            addCriterion("targetdevice <=", value, "targetdevice");
            return (Criteria) this;
        }

        public Criteria andTargetdeviceLike(String value) {
            addCriterion("targetdevice like", value, "targetdevice");
            return (Criteria) this;
        }

        public Criteria andTargetdeviceNotLike(String value) {
            addCriterion("targetdevice not like", value, "targetdevice");
            return (Criteria) this;
        }

        public Criteria andTargetdeviceIn(List<String> values) {
            addCriterion("targetdevice in", values, "targetdevice");
            return (Criteria) this;
        }

        public Criteria andTargetdeviceNotIn(List<String> values) {
            addCriterion("targetdevice not in", values, "targetdevice");
            return (Criteria) this;
        }

        public Criteria andTargetdeviceBetween(String value1, String value2) {
            addCriterion("targetdevice between", value1, value2, "targetdevice");
            return (Criteria) this;
        }

        public Criteria andTargetdeviceNotBetween(String value1, String value2) {
            addCriterion("targetdevice not between", value1, value2, "targetdevice");
            return (Criteria) this;
        }

        public Criteria andIssuedpathIsNull() {
            addCriterion("issuedpath is null");
            return (Criteria) this;
        }

        public Criteria andIssuedpathIsNotNull() {
            addCriterion("issuedpath is not null");
            return (Criteria) this;
        }

        public Criteria andIssuedpathEqualTo(String value) {
            addCriterion("issuedpath =", value, "issuedpath");
            return (Criteria) this;
        }

        public Criteria andIssuedpathNotEqualTo(String value) {
            addCriterion("issuedpath <>", value, "issuedpath");
            return (Criteria) this;
        }

        public Criteria andIssuedpathGreaterThan(String value) {
            addCriterion("issuedpath >", value, "issuedpath");
            return (Criteria) this;
        }

        public Criteria andIssuedpathGreaterThanOrEqualTo(String value) {
            addCriterion("issuedpath >=", value, "issuedpath");
            return (Criteria) this;
        }

        public Criteria andIssuedpathLessThan(String value) {
            addCriterion("issuedpath <", value, "issuedpath");
            return (Criteria) this;
        }

        public Criteria andIssuedpathLessThanOrEqualTo(String value) {
            addCriterion("issuedpath <=", value, "issuedpath");
            return (Criteria) this;
        }

        public Criteria andIssuedpathLike(String value) {
            addCriterion("issuedpath like", value, "issuedpath");
            return (Criteria) this;
        }

        public Criteria andIssuedpathNotLike(String value) {
            addCriterion("issuedpath not like", value, "issuedpath");
            return (Criteria) this;
        }

        public Criteria andIssuedpathIn(List<String> values) {
            addCriterion("issuedpath in", values, "issuedpath");
            return (Criteria) this;
        }

        public Criteria andIssuedpathNotIn(List<String> values) {
            addCriterion("issuedpath not in", values, "issuedpath");
            return (Criteria) this;
        }

        public Criteria andIssuedpathBetween(String value1, String value2) {
            addCriterion("issuedpath between", value1, value2, "issuedpath");
            return (Criteria) this;
        }

        public Criteria andIssuedpathNotBetween(String value1, String value2) {
            addCriterion("issuedpath not between", value1, value2, "issuedpath");
            return (Criteria) this;
        }

        public Criteria andTasktypeIsNull() {
            addCriterion("tasktype is null");
            return (Criteria) this;
        }

        public Criteria andTasktypeIsNotNull() {
            addCriterion("tasktype is not null");
            return (Criteria) this;
        }

        public Criteria andTasktypeEqualTo(String value) {
            addCriterion("tasktype =", value, "tasktype");
            return (Criteria) this;
        }

        public Criteria andTasktypeNotEqualTo(String value) {
            addCriterion("tasktype <>", value, "tasktype");
            return (Criteria) this;
        }

        public Criteria andTasktypeGreaterThan(String value) {
            addCriterion("tasktype >", value, "tasktype");
            return (Criteria) this;
        }

        public Criteria andTasktypeGreaterThanOrEqualTo(String value) {
            addCriterion("tasktype >=", value, "tasktype");
            return (Criteria) this;
        }

        public Criteria andTasktypeLessThan(String value) {
            addCriterion("tasktype <", value, "tasktype");
            return (Criteria) this;
        }

        public Criteria andTasktypeLessThanOrEqualTo(String value) {
            addCriterion("tasktype <=", value, "tasktype");
            return (Criteria) this;
        }

        public Criteria andTasktypeLike(String value) {
            addCriterion("tasktype like", value, "tasktype");
            return (Criteria) this;
        }

        public Criteria andTasktypeNotLike(String value) {
            addCriterion("tasktype not like", value, "tasktype");
            return (Criteria) this;
        }

        public Criteria andTasktypeIn(List<String> values) {
            addCriterion("tasktype in", values, "tasktype");
            return (Criteria) this;
        }

        public Criteria andTasktypeNotIn(List<String> values) {
            addCriterion("tasktype not in", values, "tasktype");
            return (Criteria) this;
        }

        public Criteria andTasktypeBetween(String value1, String value2) {
            addCriterion("tasktype between", value1, value2, "tasktype");
            return (Criteria) this;
        }

        public Criteria andTasktypeNotBetween(String value1, String value2) {
            addCriterion("tasktype not between", value1, value2, "tasktype");
            return (Criteria) this;
        }

        public Criteria andTasknameIsNull() {
            addCriterion("taskname is null");
            return (Criteria) this;
        }

        public Criteria andTasknameIsNotNull() {
            addCriterion("taskname is not null");
            return (Criteria) this;
        }

        public Criteria andTasknameEqualTo(String value) {
            addCriterion("taskname =", value, "taskname");
            return (Criteria) this;
        }

        public Criteria andTasknameNotEqualTo(String value) {
            addCriterion("taskname <>", value, "taskname");
            return (Criteria) this;
        }

        public Criteria andTasknameGreaterThan(String value) {
            addCriterion("taskname >", value, "taskname");
            return (Criteria) this;
        }

        public Criteria andTasknameGreaterThanOrEqualTo(String value) {
            addCriterion("taskname >=", value, "taskname");
            return (Criteria) this;
        }

        public Criteria andTasknameLessThan(String value) {
            addCriterion("taskname <", value, "taskname");
            return (Criteria) this;
        }

        public Criteria andTasknameLessThanOrEqualTo(String value) {
            addCriterion("taskname <=", value, "taskname");
            return (Criteria) this;
        }

        public Criteria andTasknameLike(String value) {
            addCriterion("taskname like", value, "taskname");
            return (Criteria) this;
        }

        public Criteria andTasknameNotLike(String value) {
            addCriterion("taskname not like", value, "taskname");
            return (Criteria) this;
        }

        public Criteria andTasknameIn(List<String> values) {
            addCriterion("taskname in", values, "taskname");
            return (Criteria) this;
        }

        public Criteria andTasknameNotIn(List<String> values) {
            addCriterion("taskname not in", values, "taskname");
            return (Criteria) this;
        }

        public Criteria andTasknameBetween(String value1, String value2) {
            addCriterion("taskname between", value1, value2, "taskname");
            return (Criteria) this;
        }

        public Criteria andTasknameNotBetween(String value1, String value2) {
            addCriterion("taskname not between", value1, value2, "taskname");
            return (Criteria) this;
        }

        public Criteria andTaskdetailsIsNull() {
            addCriterion("taskdetails is null");
            return (Criteria) this;
        }

        public Criteria andTaskdetailsIsNotNull() {
            addCriterion("taskdetails is not null");
            return (Criteria) this;
        }

        public Criteria andTaskdetailsEqualTo(String value) {
            addCriterion("taskdetails =", value, "taskdetails");
            return (Criteria) this;
        }

        public Criteria andTaskdetailsNotEqualTo(String value) {
            addCriterion("taskdetails <>", value, "taskdetails");
            return (Criteria) this;
        }

        public Criteria andTaskdetailsGreaterThan(String value) {
            addCriterion("taskdetails >", value, "taskdetails");
            return (Criteria) this;
        }

        public Criteria andTaskdetailsGreaterThanOrEqualTo(String value) {
            addCriterion("taskdetails >=", value, "taskdetails");
            return (Criteria) this;
        }

        public Criteria andTaskdetailsLessThan(String value) {
            addCriterion("taskdetails <", value, "taskdetails");
            return (Criteria) this;
        }

        public Criteria andTaskdetailsLessThanOrEqualTo(String value) {
            addCriterion("taskdetails <=", value, "taskdetails");
            return (Criteria) this;
        }

        public Criteria andTaskdetailsLike(String value) {
            addCriterion("taskdetails like", value, "taskdetails");
            return (Criteria) this;
        }

        public Criteria andTaskdetailsNotLike(String value) {
            addCriterion("taskdetails not like", value, "taskdetails");
            return (Criteria) this;
        }

        public Criteria andTaskdetailsIn(List<String> values) {
            addCriterion("taskdetails in", values, "taskdetails");
            return (Criteria) this;
        }

        public Criteria andTaskdetailsNotIn(List<String> values) {
            addCriterion("taskdetails not in", values, "taskdetails");
            return (Criteria) this;
        }

        public Criteria andTaskdetailsBetween(String value1, String value2) {
            addCriterion("taskdetails between", value1, value2, "taskdetails");
            return (Criteria) this;
        }

        public Criteria andTaskdetailsNotBetween(String value1, String value2) {
            addCriterion("taskdetails not between", value1, value2, "taskdetails");
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