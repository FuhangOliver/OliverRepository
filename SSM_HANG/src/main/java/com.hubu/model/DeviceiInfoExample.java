package com.hubu.model;

import java.util.ArrayList;
import java.util.List;

public class DeviceiInfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public DeviceiInfoExample() {
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

        public Criteria andDeviceidIsNull() {
            addCriterion("deviceId is null");
            return (Criteria) this;
        }

        public Criteria andDeviceidIsNotNull() {
            addCriterion("deviceId is not null");
            return (Criteria) this;
        }

        public Criteria andDeviceidEqualTo(Integer value) {
            addCriterion("deviceId =", value, "deviceid");
            return (Criteria) this;
        }

        public Criteria andDeviceidNotEqualTo(Integer value) {
            addCriterion("deviceId <>", value, "deviceid");
            return (Criteria) this;
        }

        public Criteria andDeviceidGreaterThan(Integer value) {
            addCriterion("deviceId >", value, "deviceid");
            return (Criteria) this;
        }

        public Criteria andDeviceidGreaterThanOrEqualTo(Integer value) {
            addCriterion("deviceId >=", value, "deviceid");
            return (Criteria) this;
        }

        public Criteria andDeviceidLessThan(Integer value) {
            addCriterion("deviceId <", value, "deviceid");
            return (Criteria) this;
        }

        public Criteria andDeviceidLessThanOrEqualTo(Integer value) {
            addCriterion("deviceId <=", value, "deviceid");
            return (Criteria) this;
        }

        public Criteria andDeviceidIn(List<Integer> values) {
            addCriterion("deviceId in", values, "deviceid");
            return (Criteria) this;
        }

        public Criteria andDeviceidNotIn(List<Integer> values) {
            addCriterion("deviceId not in", values, "deviceid");
            return (Criteria) this;
        }

        public Criteria andDeviceidBetween(Integer value1, Integer value2) {
            addCriterion("deviceId between", value1, value2, "deviceid");
            return (Criteria) this;
        }

        public Criteria andDeviceidNotBetween(Integer value1, Integer value2) {
            addCriterion("deviceId not between", value1, value2, "deviceid");
            return (Criteria) this;
        }

        public Criteria andDevicenameIsNull() {
            addCriterion("deviceName is null");
            return (Criteria) this;
        }

        public Criteria andDevicenameIsNotNull() {
            addCriterion("deviceName is not null");
            return (Criteria) this;
        }

        public Criteria andDevicenameEqualTo(String value) {
            addCriterion("deviceName =", value, "devicename");
            return (Criteria) this;
        }

        public Criteria andDevicenameNotEqualTo(String value) {
            addCriterion("deviceName <>", value, "devicename");
            return (Criteria) this;
        }

        public Criteria andDevicenameGreaterThan(String value) {
            addCriterion("deviceName >", value, "devicename");
            return (Criteria) this;
        }

        public Criteria andDevicenameGreaterThanOrEqualTo(String value) {
            addCriterion("deviceName >=", value, "devicename");
            return (Criteria) this;
        }

        public Criteria andDevicenameLessThan(String value) {
            addCriterion("deviceName <", value, "devicename");
            return (Criteria) this;
        }

        public Criteria andDevicenameLessThanOrEqualTo(String value) {
            addCriterion("deviceName <=", value, "devicename");
            return (Criteria) this;
        }

        public Criteria andDevicenameLike(String value) {
            addCriterion("deviceName like", value, "devicename");
            return (Criteria) this;
        }

        public Criteria andDevicenameNotLike(String value) {
            addCriterion("deviceName not like", value, "devicename");
            return (Criteria) this;
        }

        public Criteria andDevicenameIn(List<String> values) {
            addCriterion("deviceName in", values, "devicename");
            return (Criteria) this;
        }

        public Criteria andDevicenameNotIn(List<String> values) {
            addCriterion("deviceName not in", values, "devicename");
            return (Criteria) this;
        }

        public Criteria andDevicenameBetween(String value1, String value2) {
            addCriterion("deviceName between", value1, value2, "devicename");
            return (Criteria) this;
        }

        public Criteria andDevicenameNotBetween(String value1, String value2) {
            addCriterion("deviceName not between", value1, value2, "devicename");
            return (Criteria) this;
        }

        public Criteria andDevicetypeIsNull() {
            addCriterion("deviceType is null");
            return (Criteria) this;
        }

        public Criteria andDevicetypeIsNotNull() {
            addCriterion("deviceType is not null");
            return (Criteria) this;
        }

        public Criteria andDevicetypeEqualTo(String value) {
            addCriterion("deviceType =", value, "devicetype");
            return (Criteria) this;
        }

        public Criteria andDevicetypeNotEqualTo(String value) {
            addCriterion("deviceType <>", value, "devicetype");
            return (Criteria) this;
        }

        public Criteria andDevicetypeGreaterThan(String value) {
            addCriterion("deviceType >", value, "devicetype");
            return (Criteria) this;
        }

        public Criteria andDevicetypeGreaterThanOrEqualTo(String value) {
            addCriterion("deviceType >=", value, "devicetype");
            return (Criteria) this;
        }

        public Criteria andDevicetypeLessThan(String value) {
            addCriterion("deviceType <", value, "devicetype");
            return (Criteria) this;
        }

        public Criteria andDevicetypeLessThanOrEqualTo(String value) {
            addCriterion("deviceType <=", value, "devicetype");
            return (Criteria) this;
        }

        public Criteria andDevicetypeLike(String value) {
            addCriterion("deviceType like", value, "devicetype");
            return (Criteria) this;
        }

        public Criteria andDevicetypeNotLike(String value) {
            addCriterion("deviceType not like", value, "devicetype");
            return (Criteria) this;
        }

        public Criteria andDevicetypeIn(List<String> values) {
            addCriterion("deviceType in", values, "devicetype");
            return (Criteria) this;
        }

        public Criteria andDevicetypeNotIn(List<String> values) {
            addCriterion("deviceType not in", values, "devicetype");
            return (Criteria) this;
        }

        public Criteria andDevicetypeBetween(String value1, String value2) {
            addCriterion("deviceType between", value1, value2, "devicetype");
            return (Criteria) this;
        }

        public Criteria andDevicetypeNotBetween(String value1, String value2) {
            addCriterion("deviceType not between", value1, value2, "devicetype");
            return (Criteria) this;
        }

        public Criteria andDeviceipIsNull() {
            addCriterion("deviceIp is null");
            return (Criteria) this;
        }

        public Criteria andDeviceipIsNotNull() {
            addCriterion("deviceIp is not null");
            return (Criteria) this;
        }

        public Criteria andDeviceipEqualTo(String value) {
            addCriterion("deviceIp =", value, "deviceip");
            return (Criteria) this;
        }

        public Criteria andDeviceipNotEqualTo(String value) {
            addCriterion("deviceIp <>", value, "deviceip");
            return (Criteria) this;
        }

        public Criteria andDeviceipGreaterThan(String value) {
            addCriterion("deviceIp >", value, "deviceip");
            return (Criteria) this;
        }

        public Criteria andDeviceipGreaterThanOrEqualTo(String value) {
            addCriterion("deviceIp >=", value, "deviceip");
            return (Criteria) this;
        }

        public Criteria andDeviceipLessThan(String value) {
            addCriterion("deviceIp <", value, "deviceip");
            return (Criteria) this;
        }

        public Criteria andDeviceipLessThanOrEqualTo(String value) {
            addCriterion("deviceIp <=", value, "deviceip");
            return (Criteria) this;
        }

        public Criteria andDeviceipLike(String value) {
            addCriterion("deviceIp like", value, "deviceip");
            return (Criteria) this;
        }

        public Criteria andDeviceipNotLike(String value) {
            addCriterion("deviceIp not like", value, "deviceip");
            return (Criteria) this;
        }

        public Criteria andDeviceipIn(List<String> values) {
            addCriterion("deviceIp in", values, "deviceip");
            return (Criteria) this;
        }

        public Criteria andDeviceipNotIn(List<String> values) {
            addCriterion("deviceIp not in", values, "deviceip");
            return (Criteria) this;
        }

        public Criteria andDeviceipBetween(String value1, String value2) {
            addCriterion("deviceIp between", value1, value2, "deviceip");
            return (Criteria) this;
        }

        public Criteria andDeviceipNotBetween(String value1, String value2) {
            addCriterion("deviceIp not between", value1, value2, "deviceip");
            return (Criteria) this;
        }

        public Criteria andDevicestateIsNull() {
            addCriterion("deviceState is null");
            return (Criteria) this;
        }

        public Criteria andDevicestateIsNotNull() {
            addCriterion("deviceState is not null");
            return (Criteria) this;
        }

        public Criteria andDevicestateEqualTo(String value) {
            addCriterion("deviceState =", value, "devicestate");
            return (Criteria) this;
        }

        public Criteria andDevicestateNotEqualTo(String value) {
            addCriterion("deviceState <>", value, "devicestate");
            return (Criteria) this;
        }

        public Criteria andDevicestateGreaterThan(String value) {
            addCriterion("deviceState >", value, "devicestate");
            return (Criteria) this;
        }

        public Criteria andDevicestateGreaterThanOrEqualTo(String value) {
            addCriterion("deviceState >=", value, "devicestate");
            return (Criteria) this;
        }

        public Criteria andDevicestateLessThan(String value) {
            addCriterion("deviceState <", value, "devicestate");
            return (Criteria) this;
        }

        public Criteria andDevicestateLessThanOrEqualTo(String value) {
            addCriterion("deviceState <=", value, "devicestate");
            return (Criteria) this;
        }

        public Criteria andDevicestateLike(String value) {
            addCriterion("deviceState like", value, "devicestate");
            return (Criteria) this;
        }

        public Criteria andDevicestateNotLike(String value) {
            addCriterion("deviceState not like", value, "devicestate");
            return (Criteria) this;
        }

        public Criteria andDevicestateIn(List<String> values) {
            addCriterion("deviceState in", values, "devicestate");
            return (Criteria) this;
        }

        public Criteria andDevicestateNotIn(List<String> values) {
            addCriterion("deviceState not in", values, "devicestate");
            return (Criteria) this;
        }

        public Criteria andDevicestateBetween(String value1, String value2) {
            addCriterion("deviceState between", value1, value2, "devicestate");
            return (Criteria) this;
        }

        public Criteria andDevicestateNotBetween(String value1, String value2) {
            addCriterion("deviceState not between", value1, value2, "devicestate");
            return (Criteria) this;
        }

        public Criteria andResourcetypeIsNull() {
            addCriterion("resourceType is null");
            return (Criteria) this;
        }

        public Criteria andResourcetypeIsNotNull() {
            addCriterion("resourceType is not null");
            return (Criteria) this;
        }

        public Criteria andResourcetypeEqualTo(String value) {
            addCriterion("resourceType =", value, "resourcetype");
            return (Criteria) this;
        }

        public Criteria andResourcetypeNotEqualTo(String value) {
            addCriterion("resourceType <>", value, "resourcetype");
            return (Criteria) this;
        }

        public Criteria andResourcetypeGreaterThan(String value) {
            addCriterion("resourceType >", value, "resourcetype");
            return (Criteria) this;
        }

        public Criteria andResourcetypeGreaterThanOrEqualTo(String value) {
            addCriterion("resourceType >=", value, "resourcetype");
            return (Criteria) this;
        }

        public Criteria andResourcetypeLessThan(String value) {
            addCriterion("resourceType <", value, "resourcetype");
            return (Criteria) this;
        }

        public Criteria andResourcetypeLessThanOrEqualTo(String value) {
            addCriterion("resourceType <=", value, "resourcetype");
            return (Criteria) this;
        }

        public Criteria andResourcetypeLike(String value) {
            addCriterion("resourceType like", value, "resourcetype");
            return (Criteria) this;
        }

        public Criteria andResourcetypeNotLike(String value) {
            addCriterion("resourceType not like", value, "resourcetype");
            return (Criteria) this;
        }

        public Criteria andResourcetypeIn(List<String> values) {
            addCriterion("resourceType in", values, "resourcetype");
            return (Criteria) this;
        }

        public Criteria andResourcetypeNotIn(List<String> values) {
            addCriterion("resourceType not in", values, "resourcetype");
            return (Criteria) this;
        }

        public Criteria andResourcetypeBetween(String value1, String value2) {
            addCriterion("resourceType between", value1, value2, "resourcetype");
            return (Criteria) this;
        }

        public Criteria andResourcetypeNotBetween(String value1, String value2) {
            addCriterion("resourceType not between", value1, value2, "resourcetype");
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