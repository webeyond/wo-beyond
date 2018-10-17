package com.unicom.wobeyond.model;

import java.util.ArrayList;
import java.util.List;

public class OrderSendExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public OrderSendExample() {
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

        public Criteria andDeliNoIsNull() {
            addCriterion("DELI_NO is null");
            return (Criteria) this;
        }

        public Criteria andDeliNoIsNotNull() {
            addCriterion("DELI_NO is not null");
            return (Criteria) this;
        }

        public Criteria andDeliNoEqualTo(Integer value) {
            addCriterion("DELI_NO =", value, "deliNo");
            return (Criteria) this;
        }

        public Criteria andDeliNoNotEqualTo(Integer value) {
            addCriterion("DELI_NO <>", value, "deliNo");
            return (Criteria) this;
        }

        public Criteria andDeliNoGreaterThan(Integer value) {
            addCriterion("DELI_NO >", value, "deliNo");
            return (Criteria) this;
        }

        public Criteria andDeliNoGreaterThanOrEqualTo(Integer value) {
            addCriterion("DELI_NO >=", value, "deliNo");
            return (Criteria) this;
        }

        public Criteria andDeliNoLessThan(Integer value) {
            addCriterion("DELI_NO <", value, "deliNo");
            return (Criteria) this;
        }

        public Criteria andDeliNoLessThanOrEqualTo(Integer value) {
            addCriterion("DELI_NO <=", value, "deliNo");
            return (Criteria) this;
        }

        public Criteria andDeliNoIn(List<Integer> values) {
            addCriterion("DELI_NO in", values, "deliNo");
            return (Criteria) this;
        }

        public Criteria andDeliNoNotIn(List<Integer> values) {
            addCriterion("DELI_NO not in", values, "deliNo");
            return (Criteria) this;
        }

        public Criteria andDeliNoBetween(Integer value1, Integer value2) {
            addCriterion("DELI_NO between", value1, value2, "deliNo");
            return (Criteria) this;
        }

        public Criteria andDeliNoNotBetween(Integer value1, Integer value2) {
            addCriterion("DELI_NO not between", value1, value2, "deliNo");
            return (Criteria) this;
        }

        public Criteria andOperIdIsNull() {
            addCriterion("OPER_ID is null");
            return (Criteria) this;
        }

        public Criteria andOperIdIsNotNull() {
            addCriterion("OPER_ID is not null");
            return (Criteria) this;
        }

        public Criteria andOperIdEqualTo(Integer value) {
            addCriterion("OPER_ID =", value, "operId");
            return (Criteria) this;
        }

        public Criteria andOperIdNotEqualTo(Integer value) {
            addCriterion("OPER_ID <>", value, "operId");
            return (Criteria) this;
        }

        public Criteria andOperIdGreaterThan(Integer value) {
            addCriterion("OPER_ID >", value, "operId");
            return (Criteria) this;
        }

        public Criteria andOperIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("OPER_ID >=", value, "operId");
            return (Criteria) this;
        }

        public Criteria andOperIdLessThan(Integer value) {
            addCriterion("OPER_ID <", value, "operId");
            return (Criteria) this;
        }

        public Criteria andOperIdLessThanOrEqualTo(Integer value) {
            addCriterion("OPER_ID <=", value, "operId");
            return (Criteria) this;
        }

        public Criteria andOperIdIn(List<Integer> values) {
            addCriterion("OPER_ID in", values, "operId");
            return (Criteria) this;
        }

        public Criteria andOperIdNotIn(List<Integer> values) {
            addCriterion("OPER_ID not in", values, "operId");
            return (Criteria) this;
        }

        public Criteria andOperIdBetween(Integer value1, Integer value2) {
            addCriterion("OPER_ID between", value1, value2, "operId");
            return (Criteria) this;
        }

        public Criteria andOperIdNotBetween(Integer value1, Integer value2) {
            addCriterion("OPER_ID not between", value1, value2, "operId");
            return (Criteria) this;
        }

        public Criteria andCustidIsNull() {
            addCriterion("CUSTID is null");
            return (Criteria) this;
        }

        public Criteria andCustidIsNotNull() {
            addCriterion("CUSTID is not null");
            return (Criteria) this;
        }

        public Criteria andCustidEqualTo(Integer value) {
            addCriterion("CUSTID =", value, "custid");
            return (Criteria) this;
        }

        public Criteria andCustidNotEqualTo(Integer value) {
            addCriterion("CUSTID <>", value, "custid");
            return (Criteria) this;
        }

        public Criteria andCustidGreaterThan(Integer value) {
            addCriterion("CUSTID >", value, "custid");
            return (Criteria) this;
        }

        public Criteria andCustidGreaterThanOrEqualTo(Integer value) {
            addCriterion("CUSTID >=", value, "custid");
            return (Criteria) this;
        }

        public Criteria andCustidLessThan(Integer value) {
            addCriterion("CUSTID <", value, "custid");
            return (Criteria) this;
        }

        public Criteria andCustidLessThanOrEqualTo(Integer value) {
            addCriterion("CUSTID <=", value, "custid");
            return (Criteria) this;
        }

        public Criteria andCustidIn(List<Integer> values) {
            addCriterion("CUSTID in", values, "custid");
            return (Criteria) this;
        }

        public Criteria andCustidNotIn(List<Integer> values) {
            addCriterion("CUSTID not in", values, "custid");
            return (Criteria) this;
        }

        public Criteria andCustidBetween(Integer value1, Integer value2) {
            addCriterion("CUSTID between", value1, value2, "custid");
            return (Criteria) this;
        }

        public Criteria andCustidNotBetween(Integer value1, Integer value2) {
            addCriterion("CUSTID not between", value1, value2, "custid");
            return (Criteria) this;
        }

        public Criteria andSerialIdIsNull() {
            addCriterion("SERIAL_ID is null");
            return (Criteria) this;
        }

        public Criteria andSerialIdIsNotNull() {
            addCriterion("SERIAL_ID is not null");
            return (Criteria) this;
        }

        public Criteria andSerialIdEqualTo(Integer value) {
            addCriterion("SERIAL_ID =", value, "serialId");
            return (Criteria) this;
        }

        public Criteria andSerialIdNotEqualTo(Integer value) {
            addCriterion("SERIAL_ID <>", value, "serialId");
            return (Criteria) this;
        }

        public Criteria andSerialIdGreaterThan(Integer value) {
            addCriterion("SERIAL_ID >", value, "serialId");
            return (Criteria) this;
        }

        public Criteria andSerialIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("SERIAL_ID >=", value, "serialId");
            return (Criteria) this;
        }

        public Criteria andSerialIdLessThan(Integer value) {
            addCriterion("SERIAL_ID <", value, "serialId");
            return (Criteria) this;
        }

        public Criteria andSerialIdLessThanOrEqualTo(Integer value) {
            addCriterion("SERIAL_ID <=", value, "serialId");
            return (Criteria) this;
        }

        public Criteria andSerialIdIn(List<Integer> values) {
            addCriterion("SERIAL_ID in", values, "serialId");
            return (Criteria) this;
        }

        public Criteria andSerialIdNotIn(List<Integer> values) {
            addCriterion("SERIAL_ID not in", values, "serialId");
            return (Criteria) this;
        }

        public Criteria andSerialIdBetween(Integer value1, Integer value2) {
            addCriterion("SERIAL_ID between", value1, value2, "serialId");
            return (Criteria) this;
        }

        public Criteria andSerialIdNotBetween(Integer value1, Integer value2) {
            addCriterion("SERIAL_ID not between", value1, value2, "serialId");
            return (Criteria) this;
        }

        public Criteria andProdIdIsNull() {
            addCriterion("PROD_ID is null");
            return (Criteria) this;
        }

        public Criteria andProdIdIsNotNull() {
            addCriterion("PROD_ID is not null");
            return (Criteria) this;
        }

        public Criteria andProdIdEqualTo(Integer value) {
            addCriterion("PROD_ID =", value, "prodId");
            return (Criteria) this;
        }

        public Criteria andProdIdNotEqualTo(Integer value) {
            addCriterion("PROD_ID <>", value, "prodId");
            return (Criteria) this;
        }

        public Criteria andProdIdGreaterThan(Integer value) {
            addCriterion("PROD_ID >", value, "prodId");
            return (Criteria) this;
        }

        public Criteria andProdIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("PROD_ID >=", value, "prodId");
            return (Criteria) this;
        }

        public Criteria andProdIdLessThan(Integer value) {
            addCriterion("PROD_ID <", value, "prodId");
            return (Criteria) this;
        }

        public Criteria andProdIdLessThanOrEqualTo(Integer value) {
            addCriterion("PROD_ID <=", value, "prodId");
            return (Criteria) this;
        }

        public Criteria andProdIdIn(List<Integer> values) {
            addCriterion("PROD_ID in", values, "prodId");
            return (Criteria) this;
        }

        public Criteria andProdIdNotIn(List<Integer> values) {
            addCriterion("PROD_ID not in", values, "prodId");
            return (Criteria) this;
        }

        public Criteria andProdIdBetween(Integer value1, Integer value2) {
            addCriterion("PROD_ID between", value1, value2, "prodId");
            return (Criteria) this;
        }

        public Criteria andProdIdNotBetween(Integer value1, Integer value2) {
            addCriterion("PROD_ID not between", value1, value2, "prodId");
            return (Criteria) this;
        }

        public Criteria andAccountHandApplyIdIsNull() {
            addCriterion("ACCOUNT_HAND_APPLY_ID is null");
            return (Criteria) this;
        }

        public Criteria andAccountHandApplyIdIsNotNull() {
            addCriterion("ACCOUNT_HAND_APPLY_ID is not null");
            return (Criteria) this;
        }

        public Criteria andAccountHandApplyIdEqualTo(Integer value) {
            addCriterion("ACCOUNT_HAND_APPLY_ID =", value, "accountHandApplyId");
            return (Criteria) this;
        }

        public Criteria andAccountHandApplyIdNotEqualTo(Integer value) {
            addCriterion("ACCOUNT_HAND_APPLY_ID <>", value, "accountHandApplyId");
            return (Criteria) this;
        }

        public Criteria andAccountHandApplyIdGreaterThan(Integer value) {
            addCriterion("ACCOUNT_HAND_APPLY_ID >", value, "accountHandApplyId");
            return (Criteria) this;
        }

        public Criteria andAccountHandApplyIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("ACCOUNT_HAND_APPLY_ID >=", value, "accountHandApplyId");
            return (Criteria) this;
        }

        public Criteria andAccountHandApplyIdLessThan(Integer value) {
            addCriterion("ACCOUNT_HAND_APPLY_ID <", value, "accountHandApplyId");
            return (Criteria) this;
        }

        public Criteria andAccountHandApplyIdLessThanOrEqualTo(Integer value) {
            addCriterion("ACCOUNT_HAND_APPLY_ID <=", value, "accountHandApplyId");
            return (Criteria) this;
        }

        public Criteria andAccountHandApplyIdIn(List<Integer> values) {
            addCriterion("ACCOUNT_HAND_APPLY_ID in", values, "accountHandApplyId");
            return (Criteria) this;
        }

        public Criteria andAccountHandApplyIdNotIn(List<Integer> values) {
            addCriterion("ACCOUNT_HAND_APPLY_ID not in", values, "accountHandApplyId");
            return (Criteria) this;
        }

        public Criteria andAccountHandApplyIdBetween(Integer value1, Integer value2) {
            addCriterion("ACCOUNT_HAND_APPLY_ID between", value1, value2, "accountHandApplyId");
            return (Criteria) this;
        }

        public Criteria andAccountHandApplyIdNotBetween(Integer value1, Integer value2) {
            addCriterion("ACCOUNT_HAND_APPLY_ID not between", value1, value2, "accountHandApplyId");
            return (Criteria) this;
        }

        public Criteria andContactaddressIsNull() {
            addCriterion("CONTACTADDRESS is null");
            return (Criteria) this;
        }

        public Criteria andContactaddressIsNotNull() {
            addCriterion("CONTACTADDRESS is not null");
            return (Criteria) this;
        }

        public Criteria andContactaddressEqualTo(String value) {
            addCriterion("CONTACTADDRESS =", value, "contactaddress");
            return (Criteria) this;
        }

        public Criteria andContactaddressNotEqualTo(String value) {
            addCriterion("CONTACTADDRESS <>", value, "contactaddress");
            return (Criteria) this;
        }

        public Criteria andContactaddressGreaterThan(String value) {
            addCriterion("CONTACTADDRESS >", value, "contactaddress");
            return (Criteria) this;
        }

        public Criteria andContactaddressGreaterThanOrEqualTo(String value) {
            addCriterion("CONTACTADDRESS >=", value, "contactaddress");
            return (Criteria) this;
        }

        public Criteria andContactaddressLessThan(String value) {
            addCriterion("CONTACTADDRESS <", value, "contactaddress");
            return (Criteria) this;
        }

        public Criteria andContactaddressLessThanOrEqualTo(String value) {
            addCriterion("CONTACTADDRESS <=", value, "contactaddress");
            return (Criteria) this;
        }

        public Criteria andContactaddressLike(String value) {
            addCriterion("CONTACTADDRESS like", value, "contactaddress");
            return (Criteria) this;
        }

        public Criteria andContactaddressNotLike(String value) {
            addCriterion("CONTACTADDRESS not like", value, "contactaddress");
            return (Criteria) this;
        }

        public Criteria andContactaddressIn(List<String> values) {
            addCriterion("CONTACTADDRESS in", values, "contactaddress");
            return (Criteria) this;
        }

        public Criteria andContactaddressNotIn(List<String> values) {
            addCriterion("CONTACTADDRESS not in", values, "contactaddress");
            return (Criteria) this;
        }

        public Criteria andContactaddressBetween(String value1, String value2) {
            addCriterion("CONTACTADDRESS between", value1, value2, "contactaddress");
            return (Criteria) this;
        }

        public Criteria andContactaddressNotBetween(String value1, String value2) {
            addCriterion("CONTACTADDRESS not between", value1, value2, "contactaddress");
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