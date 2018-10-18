package com.unicom.wobeyond.model;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class ProdExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ProdExample() {
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

        public Criteria andProdTypeIsNull() {
            addCriterion("PROD_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andProdTypeIsNotNull() {
            addCriterion("PROD_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andProdTypeEqualTo(String value) {
            addCriterion("PROD_TYPE =", value, "prodType");
            return (Criteria) this;
        }

        public Criteria andProdTypeNotEqualTo(String value) {
            addCriterion("PROD_TYPE <>", value, "prodType");
            return (Criteria) this;
        }

        public Criteria andProdTypeGreaterThan(String value) {
            addCriterion("PROD_TYPE >", value, "prodType");
            return (Criteria) this;
        }

        public Criteria andProdTypeGreaterThanOrEqualTo(String value) {
            addCriterion("PROD_TYPE >=", value, "prodType");
            return (Criteria) this;
        }

        public Criteria andProdTypeLessThan(String value) {
            addCriterion("PROD_TYPE <", value, "prodType");
            return (Criteria) this;
        }

        public Criteria andProdTypeLessThanOrEqualTo(String value) {
            addCriterion("PROD_TYPE <=", value, "prodType");
            return (Criteria) this;
        }

        public Criteria andProdTypeLike(String value) {
            addCriterion("PROD_TYPE like", value, "prodType");
            return (Criteria) this;
        }

        public Criteria andProdTypeNotLike(String value) {
            addCriterion("PROD_TYPE not like", value, "prodType");
            return (Criteria) this;
        }

        public Criteria andProdTypeIn(List<String> values) {
            addCriterion("PROD_TYPE in", values, "prodType");
            return (Criteria) this;
        }

        public Criteria andProdTypeNotIn(List<String> values) {
            addCriterion("PROD_TYPE not in", values, "prodType");
            return (Criteria) this;
        }

        public Criteria andProdTypeBetween(String value1, String value2) {
            addCriterion("PROD_TYPE between", value1, value2, "prodType");
            return (Criteria) this;
        }

        public Criteria andProdTypeNotBetween(String value1, String value2) {
            addCriterion("PROD_TYPE not between", value1, value2, "prodType");
            return (Criteria) this;
        }

        public Criteria andProdNameIsNull() {
            addCriterion("PROD_NAME is null");
            return (Criteria) this;
        }

        public Criteria andProdNameIsNotNull() {
            addCriterion("PROD_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andProdNameEqualTo(String value) {
            addCriterion("PROD_NAME =", value, "prodName");
            return (Criteria) this;
        }

        public Criteria andProdNameNotEqualTo(String value) {
            addCriterion("PROD_NAME <>", value, "prodName");
            return (Criteria) this;
        }

        public Criteria andProdNameGreaterThan(String value) {
            addCriterion("PROD_NAME >", value, "prodName");
            return (Criteria) this;
        }

        public Criteria andProdNameGreaterThanOrEqualTo(String value) {
            addCriterion("PROD_NAME >=", value, "prodName");
            return (Criteria) this;
        }

        public Criteria andProdNameLessThan(String value) {
            addCriterion("PROD_NAME <", value, "prodName");
            return (Criteria) this;
        }

        public Criteria andProdNameLessThanOrEqualTo(String value) {
            addCriterion("PROD_NAME <=", value, "prodName");
            return (Criteria) this;
        }

        public Criteria andProdNameLike(String value) {
            addCriterion("PROD_NAME like", value, "prodName");
            return (Criteria) this;
        }

        public Criteria andProdNameNotLike(String value) {
            addCriterion("PROD_NAME not like", value, "prodName");
            return (Criteria) this;
        }

        public Criteria andProdNameIn(List<String> values) {
            addCriterion("PROD_NAME in", values, "prodName");
            return (Criteria) this;
        }

        public Criteria andProdNameNotIn(List<String> values) {
            addCriterion("PROD_NAME not in", values, "prodName");
            return (Criteria) this;
        }

        public Criteria andProdNameBetween(String value1, String value2) {
            addCriterion("PROD_NAME between", value1, value2, "prodName");
            return (Criteria) this;
        }

        public Criteria andProdNameNotBetween(String value1, String value2) {
            addCriterion("PROD_NAME not between", value1, value2, "prodName");
            return (Criteria) this;
        }

        public Criteria andComboFeeIsNull() {
            addCriterion("COMBO_FEE is null");
            return (Criteria) this;
        }

        public Criteria andComboFeeIsNotNull() {
            addCriterion("COMBO_FEE is not null");
            return (Criteria) this;
        }

        public Criteria andComboFeeEqualTo(BigDecimal value) {
            addCriterion("COMBO_FEE =", value, "comboFee");
            return (Criteria) this;
        }

        public Criteria andComboFeeNotEqualTo(BigDecimal value) {
            addCriterion("COMBO_FEE <>", value, "comboFee");
            return (Criteria) this;
        }

        public Criteria andComboFeeGreaterThan(BigDecimal value) {
            addCriterion("COMBO_FEE >", value, "comboFee");
            return (Criteria) this;
        }

        public Criteria andComboFeeGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("COMBO_FEE >=", value, "comboFee");
            return (Criteria) this;
        }

        public Criteria andComboFeeLessThan(BigDecimal value) {
            addCriterion("COMBO_FEE <", value, "comboFee");
            return (Criteria) this;
        }

        public Criteria andComboFeeLessThanOrEqualTo(BigDecimal value) {
            addCriterion("COMBO_FEE <=", value, "comboFee");
            return (Criteria) this;
        }

        public Criteria andComboFeeIn(List<BigDecimal> values) {
            addCriterion("COMBO_FEE in", values, "comboFee");
            return (Criteria) this;
        }

        public Criteria andComboFeeNotIn(List<BigDecimal> values) {
            addCriterion("COMBO_FEE not in", values, "comboFee");
            return (Criteria) this;
        }

        public Criteria andComboFeeBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("COMBO_FEE between", value1, value2, "comboFee");
            return (Criteria) this;
        }

        public Criteria andComboFeeNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("COMBO_FEE not between", value1, value2, "comboFee");
            return (Criteria) this;
        }

        public Criteria andPromiseTimeIsNull() {
            addCriterion("PROMISE_TIME is null");
            return (Criteria) this;
        }

        public Criteria andPromiseTimeIsNotNull() {
            addCriterion("PROMISE_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andPromiseTimeEqualTo(Integer value) {
            addCriterion("PROMISE_TIME =", value, "promiseTime");
            return (Criteria) this;
        }

        public Criteria andPromiseTimeNotEqualTo(Integer value) {
            addCriterion("PROMISE_TIME <>", value, "promiseTime");
            return (Criteria) this;
        }

        public Criteria andPromiseTimeGreaterThan(Integer value) {
            addCriterion("PROMISE_TIME >", value, "promiseTime");
            return (Criteria) this;
        }

        public Criteria andPromiseTimeGreaterThanOrEqualTo(Integer value) {
            addCriterion("PROMISE_TIME >=", value, "promiseTime");
            return (Criteria) this;
        }

        public Criteria andPromiseTimeLessThan(Integer value) {
            addCriterion("PROMISE_TIME <", value, "promiseTime");
            return (Criteria) this;
        }

        public Criteria andPromiseTimeLessThanOrEqualTo(Integer value) {
            addCriterion("PROMISE_TIME <=", value, "promiseTime");
            return (Criteria) this;
        }

        public Criteria andPromiseTimeIn(List<Integer> values) {
            addCriterion("PROMISE_TIME in", values, "promiseTime");
            return (Criteria) this;
        }

        public Criteria andPromiseTimeNotIn(List<Integer> values) {
            addCriterion("PROMISE_TIME not in", values, "promiseTime");
            return (Criteria) this;
        }

        public Criteria andPromiseTimeBetween(Integer value1, Integer value2) {
            addCriterion("PROMISE_TIME between", value1, value2, "promiseTime");
            return (Criteria) this;
        }

        public Criteria andPromiseTimeNotBetween(Integer value1, Integer value2) {
            addCriterion("PROMISE_TIME not between", value1, value2, "promiseTime");
            return (Criteria) this;
        }

        public Criteria andPrePayFeeIsNull() {
            addCriterion("PRE_PAY_FEE is null");
            return (Criteria) this;
        }

        public Criteria andPrePayFeeIsNotNull() {
            addCriterion("PRE_PAY_FEE is not null");
            return (Criteria) this;
        }

        public Criteria andPrePayFeeEqualTo(BigDecimal value) {
            addCriterion("PRE_PAY_FEE =", value, "prePayFee");
            return (Criteria) this;
        }

        public Criteria andPrePayFeeNotEqualTo(BigDecimal value) {
            addCriterion("PRE_PAY_FEE <>", value, "prePayFee");
            return (Criteria) this;
        }

        public Criteria andPrePayFeeGreaterThan(BigDecimal value) {
            addCriterion("PRE_PAY_FEE >", value, "prePayFee");
            return (Criteria) this;
        }

        public Criteria andPrePayFeeGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("PRE_PAY_FEE >=", value, "prePayFee");
            return (Criteria) this;
        }

        public Criteria andPrePayFeeLessThan(BigDecimal value) {
            addCriterion("PRE_PAY_FEE <", value, "prePayFee");
            return (Criteria) this;
        }

        public Criteria andPrePayFeeLessThanOrEqualTo(BigDecimal value) {
            addCriterion("PRE_PAY_FEE <=", value, "prePayFee");
            return (Criteria) this;
        }

        public Criteria andPrePayFeeIn(List<BigDecimal> values) {
            addCriterion("PRE_PAY_FEE in", values, "prePayFee");
            return (Criteria) this;
        }

        public Criteria andPrePayFeeNotIn(List<BigDecimal> values) {
            addCriterion("PRE_PAY_FEE not in", values, "prePayFee");
            return (Criteria) this;
        }

        public Criteria andPrePayFeeBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("PRE_PAY_FEE between", value1, value2, "prePayFee");
            return (Criteria) this;
        }

        public Criteria andPrePayFeeNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("PRE_PAY_FEE not between", value1, value2, "prePayFee");
            return (Criteria) this;
        }

        public Criteria andDesPicIsNull() {
            addCriterion("DES_PIC is null");
            return (Criteria) this;
        }

        public Criteria andDesPicIsNotNull() {
            addCriterion("DES_PIC is not null");
            return (Criteria) this;
        }

        public Criteria andDesPicEqualTo(String value) {
            addCriterion("DES_PIC =", value, "desPic");
            return (Criteria) this;
        }

        public Criteria andDesPicNotEqualTo(String value) {
            addCriterion("DES_PIC <>", value, "desPic");
            return (Criteria) this;
        }

        public Criteria andDesPicGreaterThan(String value) {
            addCriterion("DES_PIC >", value, "desPic");
            return (Criteria) this;
        }

        public Criteria andDesPicGreaterThanOrEqualTo(String value) {
            addCriterion("DES_PIC >=", value, "desPic");
            return (Criteria) this;
        }

        public Criteria andDesPicLessThan(String value) {
            addCriterion("DES_PIC <", value, "desPic");
            return (Criteria) this;
        }

        public Criteria andDesPicLessThanOrEqualTo(String value) {
            addCriterion("DES_PIC <=", value, "desPic");
            return (Criteria) this;
        }

        public Criteria andDesPicLike(String value) {
            addCriterion("DES_PIC like", value, "desPic");
            return (Criteria) this;
        }

        public Criteria andDesPicNotLike(String value) {
            addCriterion("DES_PIC not like", value, "desPic");
            return (Criteria) this;
        }

        public Criteria andDesPicIn(List<String> values) {
            addCriterion("DES_PIC in", values, "desPic");
            return (Criteria) this;
        }

        public Criteria andDesPicNotIn(List<String> values) {
            addCriterion("DES_PIC not in", values, "desPic");
            return (Criteria) this;
        }

        public Criteria andDesPicBetween(String value1, String value2) {
            addCriterion("DES_PIC between", value1, value2, "desPic");
            return (Criteria) this;
        }

        public Criteria andDesPicNotBetween(String value1, String value2) {
            addCriterion("DES_PIC not between", value1, value2, "desPic");
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