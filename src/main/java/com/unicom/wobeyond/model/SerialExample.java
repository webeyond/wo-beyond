package com.unicom.wobeyond.model;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class SerialExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SerialExample() {
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

        public Criteria andSerialNumberIsNull() {
            addCriterion("SERIAL_NUMBER is null");
            return (Criteria) this;
        }

        public Criteria andSerialNumberIsNotNull() {
            addCriterion("SERIAL_NUMBER is not null");
            return (Criteria) this;
        }

        public Criteria andSerialNumberEqualTo(String value) {
            addCriterion("SERIAL_NUMBER =", value, "serialNumber");
            return (Criteria) this;
        }

        public Criteria andSerialNumberNotEqualTo(String value) {
            addCriterion("SERIAL_NUMBER <>", value, "serialNumber");
            return (Criteria) this;
        }

        public Criteria andSerialNumberGreaterThan(String value) {
            addCriterion("SERIAL_NUMBER >", value, "serialNumber");
            return (Criteria) this;
        }

        public Criteria andSerialNumberGreaterThanOrEqualTo(String value) {
            addCriterion("SERIAL_NUMBER >=", value, "serialNumber");
            return (Criteria) this;
        }

        public Criteria andSerialNumberLessThan(String value) {
            addCriterion("SERIAL_NUMBER <", value, "serialNumber");
            return (Criteria) this;
        }

        public Criteria andSerialNumberLessThanOrEqualTo(String value) {
            addCriterion("SERIAL_NUMBER <=", value, "serialNumber");
            return (Criteria) this;
        }

        public Criteria andSerialNumberLike(String value) {
            addCriterion("SERIAL_NUMBER like", value, "serialNumber");
            return (Criteria) this;
        }

        public Criteria andSerialNumberNotLike(String value) {
            addCriterion("SERIAL_NUMBER not like", value, "serialNumber");
            return (Criteria) this;
        }

        public Criteria andSerialNumberIn(List<String> values) {
            addCriterion("SERIAL_NUMBER in", values, "serialNumber");
            return (Criteria) this;
        }

        public Criteria andSerialNumberNotIn(List<String> values) {
            addCriterion("SERIAL_NUMBER not in", values, "serialNumber");
            return (Criteria) this;
        }

        public Criteria andSerialNumberBetween(String value1, String value2) {
            addCriterion("SERIAL_NUMBER between", value1, value2, "serialNumber");
            return (Criteria) this;
        }

        public Criteria andSerialNumberNotBetween(String value1, String value2) {
            addCriterion("SERIAL_NUMBER not between", value1, value2, "serialNumber");
            return (Criteria) this;
        }

        public Criteria andSerialProvinceIsNull() {
            addCriterion("SERIAL_PROVINCE is null");
            return (Criteria) this;
        }

        public Criteria andSerialProvinceIsNotNull() {
            addCriterion("SERIAL_PROVINCE is not null");
            return (Criteria) this;
        }

        public Criteria andSerialProvinceEqualTo(String value) {
            addCriterion("SERIAL_PROVINCE =", value, "serialProvince");
            return (Criteria) this;
        }

        public Criteria andSerialProvinceNotEqualTo(String value) {
            addCriterion("SERIAL_PROVINCE <>", value, "serialProvince");
            return (Criteria) this;
        }

        public Criteria andSerialProvinceGreaterThan(String value) {
            addCriterion("SERIAL_PROVINCE >", value, "serialProvince");
            return (Criteria) this;
        }

        public Criteria andSerialProvinceGreaterThanOrEqualTo(String value) {
            addCriterion("SERIAL_PROVINCE >=", value, "serialProvince");
            return (Criteria) this;
        }

        public Criteria andSerialProvinceLessThan(String value) {
            addCriterion("SERIAL_PROVINCE <", value, "serialProvince");
            return (Criteria) this;
        }

        public Criteria andSerialProvinceLessThanOrEqualTo(String value) {
            addCriterion("SERIAL_PROVINCE <=", value, "serialProvince");
            return (Criteria) this;
        }

        public Criteria andSerialProvinceLike(String value) {
            addCriterion("SERIAL_PROVINCE like", value, "serialProvince");
            return (Criteria) this;
        }

        public Criteria andSerialProvinceNotLike(String value) {
            addCriterion("SERIAL_PROVINCE not like", value, "serialProvince");
            return (Criteria) this;
        }

        public Criteria andSerialProvinceIn(List<String> values) {
            addCriterion("SERIAL_PROVINCE in", values, "serialProvince");
            return (Criteria) this;
        }

        public Criteria andSerialProvinceNotIn(List<String> values) {
            addCriterion("SERIAL_PROVINCE not in", values, "serialProvince");
            return (Criteria) this;
        }

        public Criteria andSerialProvinceBetween(String value1, String value2) {
            addCriterion("SERIAL_PROVINCE between", value1, value2, "serialProvince");
            return (Criteria) this;
        }

        public Criteria andSerialProvinceNotBetween(String value1, String value2) {
            addCriterion("SERIAL_PROVINCE not between", value1, value2, "serialProvince");
            return (Criteria) this;
        }

        public Criteria andSerialCityIsNull() {
            addCriterion("SERIAL_CITY is null");
            return (Criteria) this;
        }

        public Criteria andSerialCityIsNotNull() {
            addCriterion("SERIAL_CITY is not null");
            return (Criteria) this;
        }

        public Criteria andSerialCityEqualTo(String value) {
            addCriterion("SERIAL_CITY =", value, "serialCity");
            return (Criteria) this;
        }

        public Criteria andSerialCityNotEqualTo(String value) {
            addCriterion("SERIAL_CITY <>", value, "serialCity");
            return (Criteria) this;
        }

        public Criteria andSerialCityGreaterThan(String value) {
            addCriterion("SERIAL_CITY >", value, "serialCity");
            return (Criteria) this;
        }

        public Criteria andSerialCityGreaterThanOrEqualTo(String value) {
            addCriterion("SERIAL_CITY >=", value, "serialCity");
            return (Criteria) this;
        }

        public Criteria andSerialCityLessThan(String value) {
            addCriterion("SERIAL_CITY <", value, "serialCity");
            return (Criteria) this;
        }

        public Criteria andSerialCityLessThanOrEqualTo(String value) {
            addCriterion("SERIAL_CITY <=", value, "serialCity");
            return (Criteria) this;
        }

        public Criteria andSerialCityLike(String value) {
            addCriterion("SERIAL_CITY like", value, "serialCity");
            return (Criteria) this;
        }

        public Criteria andSerialCityNotLike(String value) {
            addCriterion("SERIAL_CITY not like", value, "serialCity");
            return (Criteria) this;
        }

        public Criteria andSerialCityIn(List<String> values) {
            addCriterion("SERIAL_CITY in", values, "serialCity");
            return (Criteria) this;
        }

        public Criteria andSerialCityNotIn(List<String> values) {
            addCriterion("SERIAL_CITY not in", values, "serialCity");
            return (Criteria) this;
        }

        public Criteria andSerialCityBetween(String value1, String value2) {
            addCriterion("SERIAL_CITY between", value1, value2, "serialCity");
            return (Criteria) this;
        }

        public Criteria andSerialCityNotBetween(String value1, String value2) {
            addCriterion("SERIAL_CITY not between", value1, value2, "serialCity");
            return (Criteria) this;
        }

        public Criteria andBusinessTypeIsNull() {
            addCriterion("BUSINESS_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andBusinessTypeIsNotNull() {
            addCriterion("BUSINESS_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andBusinessTypeEqualTo(String value) {
            addCriterion("BUSINESS_TYPE =", value, "businessType");
            return (Criteria) this;
        }

        public Criteria andBusinessTypeNotEqualTo(String value) {
            addCriterion("BUSINESS_TYPE <>", value, "businessType");
            return (Criteria) this;
        }

        public Criteria andBusinessTypeGreaterThan(String value) {
            addCriterion("BUSINESS_TYPE >", value, "businessType");
            return (Criteria) this;
        }

        public Criteria andBusinessTypeGreaterThanOrEqualTo(String value) {
            addCriterion("BUSINESS_TYPE >=", value, "businessType");
            return (Criteria) this;
        }

        public Criteria andBusinessTypeLessThan(String value) {
            addCriterion("BUSINESS_TYPE <", value, "businessType");
            return (Criteria) this;
        }

        public Criteria andBusinessTypeLessThanOrEqualTo(String value) {
            addCriterion("BUSINESS_TYPE <=", value, "businessType");
            return (Criteria) this;
        }

        public Criteria andBusinessTypeLike(String value) {
            addCriterion("BUSINESS_TYPE like", value, "businessType");
            return (Criteria) this;
        }

        public Criteria andBusinessTypeNotLike(String value) {
            addCriterion("BUSINESS_TYPE not like", value, "businessType");
            return (Criteria) this;
        }

        public Criteria andBusinessTypeIn(List<String> values) {
            addCriterion("BUSINESS_TYPE in", values, "businessType");
            return (Criteria) this;
        }

        public Criteria andBusinessTypeNotIn(List<String> values) {
            addCriterion("BUSINESS_TYPE not in", values, "businessType");
            return (Criteria) this;
        }

        public Criteria andBusinessTypeBetween(String value1, String value2) {
            addCriterion("BUSINESS_TYPE between", value1, value2, "businessType");
            return (Criteria) this;
        }

        public Criteria andBusinessTypeNotBetween(String value1, String value2) {
            addCriterion("BUSINESS_TYPE not between", value1, value2, "businessType");
            return (Criteria) this;
        }

        public Criteria andAdvanceLimitIsNull() {
            addCriterion("ADVANCE_LIMIT is null");
            return (Criteria) this;
        }

        public Criteria andAdvanceLimitIsNotNull() {
            addCriterion("ADVANCE_LIMIT is not null");
            return (Criteria) this;
        }

        public Criteria andAdvanceLimitEqualTo(BigDecimal value) {
            addCriterion("ADVANCE_LIMIT =", value, "advanceLimit");
            return (Criteria) this;
        }

        public Criteria andAdvanceLimitNotEqualTo(BigDecimal value) {
            addCriterion("ADVANCE_LIMIT <>", value, "advanceLimit");
            return (Criteria) this;
        }

        public Criteria andAdvanceLimitGreaterThan(BigDecimal value) {
            addCriterion("ADVANCE_LIMIT >", value, "advanceLimit");
            return (Criteria) this;
        }

        public Criteria andAdvanceLimitGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("ADVANCE_LIMIT >=", value, "advanceLimit");
            return (Criteria) this;
        }

        public Criteria andAdvanceLimitLessThan(BigDecimal value) {
            addCriterion("ADVANCE_LIMIT <", value, "advanceLimit");
            return (Criteria) this;
        }

        public Criteria andAdvanceLimitLessThanOrEqualTo(BigDecimal value) {
            addCriterion("ADVANCE_LIMIT <=", value, "advanceLimit");
            return (Criteria) this;
        }

        public Criteria andAdvanceLimitIn(List<BigDecimal> values) {
            addCriterion("ADVANCE_LIMIT in", values, "advanceLimit");
            return (Criteria) this;
        }

        public Criteria andAdvanceLimitNotIn(List<BigDecimal> values) {
            addCriterion("ADVANCE_LIMIT not in", values, "advanceLimit");
            return (Criteria) this;
        }

        public Criteria andAdvanceLimitBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("ADVANCE_LIMIT between", value1, value2, "advanceLimit");
            return (Criteria) this;
        }

        public Criteria andAdvanceLimitNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("ADVANCE_LIMIT not between", value1, value2, "advanceLimit");
            return (Criteria) this;
        }

        public Criteria andMonthfeeLimitIsNull() {
            addCriterion("MONTHFEE_LIMIT is null");
            return (Criteria) this;
        }

        public Criteria andMonthfeeLimitIsNotNull() {
            addCriterion("MONTHFEE_LIMIT is not null");
            return (Criteria) this;
        }

        public Criteria andMonthfeeLimitEqualTo(BigDecimal value) {
            addCriterion("MONTHFEE_LIMIT =", value, "monthfeeLimit");
            return (Criteria) this;
        }

        public Criteria andMonthfeeLimitNotEqualTo(BigDecimal value) {
            addCriterion("MONTHFEE_LIMIT <>", value, "monthfeeLimit");
            return (Criteria) this;
        }

        public Criteria andMonthfeeLimitGreaterThan(BigDecimal value) {
            addCriterion("MONTHFEE_LIMIT >", value, "monthfeeLimit");
            return (Criteria) this;
        }

        public Criteria andMonthfeeLimitGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("MONTHFEE_LIMIT >=", value, "monthfeeLimit");
            return (Criteria) this;
        }

        public Criteria andMonthfeeLimitLessThan(BigDecimal value) {
            addCriterion("MONTHFEE_LIMIT <", value, "monthfeeLimit");
            return (Criteria) this;
        }

        public Criteria andMonthfeeLimitLessThanOrEqualTo(BigDecimal value) {
            addCriterion("MONTHFEE_LIMIT <=", value, "monthfeeLimit");
            return (Criteria) this;
        }

        public Criteria andMonthfeeLimitIn(List<BigDecimal> values) {
            addCriterion("MONTHFEE_LIMIT in", values, "monthfeeLimit");
            return (Criteria) this;
        }

        public Criteria andMonthfeeLimitNotIn(List<BigDecimal> values) {
            addCriterion("MONTHFEE_LIMIT not in", values, "monthfeeLimit");
            return (Criteria) this;
        }

        public Criteria andMonthfeeLimitBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("MONTHFEE_LIMIT between", value1, value2, "monthfeeLimit");
            return (Criteria) this;
        }

        public Criteria andMonthfeeLimitNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("MONTHFEE_LIMIT not between", value1, value2, "monthfeeLimit");
            return (Criteria) this;
        }

        public Criteria andMonthLimitIsNull() {
            addCriterion("MONTH_LIMIT is null");
            return (Criteria) this;
        }

        public Criteria andMonthLimitIsNotNull() {
            addCriterion("MONTH_LIMIT is not null");
            return (Criteria) this;
        }

        public Criteria andMonthLimitEqualTo(Integer value) {
            addCriterion("MONTH_LIMIT =", value, "monthLimit");
            return (Criteria) this;
        }

        public Criteria andMonthLimitNotEqualTo(Integer value) {
            addCriterion("MONTH_LIMIT <>", value, "monthLimit");
            return (Criteria) this;
        }

        public Criteria andMonthLimitGreaterThan(Integer value) {
            addCriterion("MONTH_LIMIT >", value, "monthLimit");
            return (Criteria) this;
        }

        public Criteria andMonthLimitGreaterThanOrEqualTo(Integer value) {
            addCriterion("MONTH_LIMIT >=", value, "monthLimit");
            return (Criteria) this;
        }

        public Criteria andMonthLimitLessThan(Integer value) {
            addCriterion("MONTH_LIMIT <", value, "monthLimit");
            return (Criteria) this;
        }

        public Criteria andMonthLimitLessThanOrEqualTo(Integer value) {
            addCriterion("MONTH_LIMIT <=", value, "monthLimit");
            return (Criteria) this;
        }

        public Criteria andMonthLimitIn(List<Integer> values) {
            addCriterion("MONTH_LIMIT in", values, "monthLimit");
            return (Criteria) this;
        }

        public Criteria andMonthLimitNotIn(List<Integer> values) {
            addCriterion("MONTH_LIMIT not in", values, "monthLimit");
            return (Criteria) this;
        }

        public Criteria andMonthLimitBetween(Integer value1, Integer value2) {
            addCriterion("MONTH_LIMIT between", value1, value2, "monthLimit");
            return (Criteria) this;
        }

        public Criteria andMonthLimitNotBetween(Integer value1, Integer value2) {
            addCriterion("MONTH_LIMIT not between", value1, value2, "monthLimit");
            return (Criteria) this;
        }

        public Criteria andNiceRuleTagIsNull() {
            addCriterion("NICE_RULE_TAG is null");
            return (Criteria) this;
        }

        public Criteria andNiceRuleTagIsNotNull() {
            addCriterion("NICE_RULE_TAG is not null");
            return (Criteria) this;
        }

        public Criteria andNiceRuleTagEqualTo(Integer value) {
            addCriterion("NICE_RULE_TAG =", value, "niceRuleTag");
            return (Criteria) this;
        }

        public Criteria andNiceRuleTagNotEqualTo(Integer value) {
            addCriterion("NICE_RULE_TAG <>", value, "niceRuleTag");
            return (Criteria) this;
        }

        public Criteria andNiceRuleTagGreaterThan(Integer value) {
            addCriterion("NICE_RULE_TAG >", value, "niceRuleTag");
            return (Criteria) this;
        }

        public Criteria andNiceRuleTagGreaterThanOrEqualTo(Integer value) {
            addCriterion("NICE_RULE_TAG >=", value, "niceRuleTag");
            return (Criteria) this;
        }

        public Criteria andNiceRuleTagLessThan(Integer value) {
            addCriterion("NICE_RULE_TAG <", value, "niceRuleTag");
            return (Criteria) this;
        }

        public Criteria andNiceRuleTagLessThanOrEqualTo(Integer value) {
            addCriterion("NICE_RULE_TAG <=", value, "niceRuleTag");
            return (Criteria) this;
        }

        public Criteria andNiceRuleTagIn(List<Integer> values) {
            addCriterion("NICE_RULE_TAG in", values, "niceRuleTag");
            return (Criteria) this;
        }

        public Criteria andNiceRuleTagNotIn(List<Integer> values) {
            addCriterion("NICE_RULE_TAG not in", values, "niceRuleTag");
            return (Criteria) this;
        }

        public Criteria andNiceRuleTagBetween(Integer value1, Integer value2) {
            addCriterion("NICE_RULE_TAG between", value1, value2, "niceRuleTag");
            return (Criteria) this;
        }

        public Criteria andNiceRuleTagNotBetween(Integer value1, Integer value2) {
            addCriterion("NICE_RULE_TAG not between", value1, value2, "niceRuleTag");
            return (Criteria) this;
        }

        public Criteria andFeatureTypeIsNull() {
            addCriterion("FEATURE_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andFeatureTypeIsNotNull() {
            addCriterion("FEATURE_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andFeatureTypeEqualTo(String value) {
            addCriterion("FEATURE_TYPE =", value, "featureType");
            return (Criteria) this;
        }

        public Criteria andFeatureTypeNotEqualTo(String value) {
            addCriterion("FEATURE_TYPE <>", value, "featureType");
            return (Criteria) this;
        }

        public Criteria andFeatureTypeGreaterThan(String value) {
            addCriterion("FEATURE_TYPE >", value, "featureType");
            return (Criteria) this;
        }

        public Criteria andFeatureTypeGreaterThanOrEqualTo(String value) {
            addCriterion("FEATURE_TYPE >=", value, "featureType");
            return (Criteria) this;
        }

        public Criteria andFeatureTypeLessThan(String value) {
            addCriterion("FEATURE_TYPE <", value, "featureType");
            return (Criteria) this;
        }

        public Criteria andFeatureTypeLessThanOrEqualTo(String value) {
            addCriterion("FEATURE_TYPE <=", value, "featureType");
            return (Criteria) this;
        }

        public Criteria andFeatureTypeLike(String value) {
            addCriterion("FEATURE_TYPE like", value, "featureType");
            return (Criteria) this;
        }

        public Criteria andFeatureTypeNotLike(String value) {
            addCriterion("FEATURE_TYPE not like", value, "featureType");
            return (Criteria) this;
        }

        public Criteria andFeatureTypeIn(List<String> values) {
            addCriterion("FEATURE_TYPE in", values, "featureType");
            return (Criteria) this;
        }

        public Criteria andFeatureTypeNotIn(List<String> values) {
            addCriterion("FEATURE_TYPE not in", values, "featureType");
            return (Criteria) this;
        }

        public Criteria andFeatureTypeBetween(String value1, String value2) {
            addCriterion("FEATURE_TYPE between", value1, value2, "featureType");
            return (Criteria) this;
        }

        public Criteria andFeatureTypeNotBetween(String value1, String value2) {
            addCriterion("FEATURE_TYPE not between", value1, value2, "featureType");
            return (Criteria) this;
        }

        public Criteria andFeatureNameIsNull() {
            addCriterion("FEATURE_NAME is null");
            return (Criteria) this;
        }

        public Criteria andFeatureNameIsNotNull() {
            addCriterion("FEATURE_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andFeatureNameEqualTo(String value) {
            addCriterion("FEATURE_NAME =", value, "featureName");
            return (Criteria) this;
        }

        public Criteria andFeatureNameNotEqualTo(String value) {
            addCriterion("FEATURE_NAME <>", value, "featureName");
            return (Criteria) this;
        }

        public Criteria andFeatureNameGreaterThan(String value) {
            addCriterion("FEATURE_NAME >", value, "featureName");
            return (Criteria) this;
        }

        public Criteria andFeatureNameGreaterThanOrEqualTo(String value) {
            addCriterion("FEATURE_NAME >=", value, "featureName");
            return (Criteria) this;
        }

        public Criteria andFeatureNameLessThan(String value) {
            addCriterion("FEATURE_NAME <", value, "featureName");
            return (Criteria) this;
        }

        public Criteria andFeatureNameLessThanOrEqualTo(String value) {
            addCriterion("FEATURE_NAME <=", value, "featureName");
            return (Criteria) this;
        }

        public Criteria andFeatureNameLike(String value) {
            addCriterion("FEATURE_NAME like", value, "featureName");
            return (Criteria) this;
        }

        public Criteria andFeatureNameNotLike(String value) {
            addCriterion("FEATURE_NAME not like", value, "featureName");
            return (Criteria) this;
        }

        public Criteria andFeatureNameIn(List<String> values) {
            addCriterion("FEATURE_NAME in", values, "featureName");
            return (Criteria) this;
        }

        public Criteria andFeatureNameNotIn(List<String> values) {
            addCriterion("FEATURE_NAME not in", values, "featureName");
            return (Criteria) this;
        }

        public Criteria andFeatureNameBetween(String value1, String value2) {
            addCriterion("FEATURE_NAME between", value1, value2, "featureName");
            return (Criteria) this;
        }

        public Criteria andFeatureNameNotBetween(String value1, String value2) {
            addCriterion("FEATURE_NAME not between", value1, value2, "featureName");
            return (Criteria) this;
        }

        public Criteria andGoodTypeIsNull() {
            addCriterion("GOOD_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andGoodTypeIsNotNull() {
            addCriterion("GOOD_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andGoodTypeEqualTo(String value) {
            addCriterion("GOOD_TYPE =", value, "goodType");
            return (Criteria) this;
        }

        public Criteria andGoodTypeNotEqualTo(String value) {
            addCriterion("GOOD_TYPE <>", value, "goodType");
            return (Criteria) this;
        }

        public Criteria andGoodTypeGreaterThan(String value) {
            addCriterion("GOOD_TYPE >", value, "goodType");
            return (Criteria) this;
        }

        public Criteria andGoodTypeGreaterThanOrEqualTo(String value) {
            addCriterion("GOOD_TYPE >=", value, "goodType");
            return (Criteria) this;
        }

        public Criteria andGoodTypeLessThan(String value) {
            addCriterion("GOOD_TYPE <", value, "goodType");
            return (Criteria) this;
        }

        public Criteria andGoodTypeLessThanOrEqualTo(String value) {
            addCriterion("GOOD_TYPE <=", value, "goodType");
            return (Criteria) this;
        }

        public Criteria andGoodTypeLike(String value) {
            addCriterion("GOOD_TYPE like", value, "goodType");
            return (Criteria) this;
        }

        public Criteria andGoodTypeNotLike(String value) {
            addCriterion("GOOD_TYPE not like", value, "goodType");
            return (Criteria) this;
        }

        public Criteria andGoodTypeIn(List<String> values) {
            addCriterion("GOOD_TYPE in", values, "goodType");
            return (Criteria) this;
        }

        public Criteria andGoodTypeNotIn(List<String> values) {
            addCriterion("GOOD_TYPE not in", values, "goodType");
            return (Criteria) this;
        }

        public Criteria andGoodTypeBetween(String value1, String value2) {
            addCriterion("GOOD_TYPE between", value1, value2, "goodType");
            return (Criteria) this;
        }

        public Criteria andGoodTypeNotBetween(String value1, String value2) {
            addCriterion("GOOD_TYPE not between", value1, value2, "goodType");
            return (Criteria) this;
        }

        public Criteria andHighlightNumsIsNull() {
            addCriterion("HIGHLIGHT_NUMS is null");
            return (Criteria) this;
        }

        public Criteria andHighlightNumsIsNotNull() {
            addCriterion("HIGHLIGHT_NUMS is not null");
            return (Criteria) this;
        }

        public Criteria andHighlightNumsEqualTo(Integer value) {
            addCriterion("HIGHLIGHT_NUMS =", value, "highlightNums");
            return (Criteria) this;
        }

        public Criteria andHighlightNumsNotEqualTo(Integer value) {
            addCriterion("HIGHLIGHT_NUMS <>", value, "highlightNums");
            return (Criteria) this;
        }

        public Criteria andHighlightNumsGreaterThan(Integer value) {
            addCriterion("HIGHLIGHT_NUMS >", value, "highlightNums");
            return (Criteria) this;
        }

        public Criteria andHighlightNumsGreaterThanOrEqualTo(Integer value) {
            addCriterion("HIGHLIGHT_NUMS >=", value, "highlightNums");
            return (Criteria) this;
        }

        public Criteria andHighlightNumsLessThan(Integer value) {
            addCriterion("HIGHLIGHT_NUMS <", value, "highlightNums");
            return (Criteria) this;
        }

        public Criteria andHighlightNumsLessThanOrEqualTo(Integer value) {
            addCriterion("HIGHLIGHT_NUMS <=", value, "highlightNums");
            return (Criteria) this;
        }

        public Criteria andHighlightNumsIn(List<Integer> values) {
            addCriterion("HIGHLIGHT_NUMS in", values, "highlightNums");
            return (Criteria) this;
        }

        public Criteria andHighlightNumsNotIn(List<Integer> values) {
            addCriterion("HIGHLIGHT_NUMS not in", values, "highlightNums");
            return (Criteria) this;
        }

        public Criteria andHighlightNumsBetween(Integer value1, Integer value2) {
            addCriterion("HIGHLIGHT_NUMS between", value1, value2, "highlightNums");
            return (Criteria) this;
        }

        public Criteria andHighlightNumsNotBetween(Integer value1, Integer value2) {
            addCriterion("HIGHLIGHT_NUMS not between", value1, value2, "highlightNums");
            return (Criteria) this;
        }

        public Criteria andTopHighlightNumsIsNull() {
            addCriterion("TOP_HIGHLIGHT_NUMS is null");
            return (Criteria) this;
        }

        public Criteria andTopHighlightNumsIsNotNull() {
            addCriterion("TOP_HIGHLIGHT_NUMS is not null");
            return (Criteria) this;
        }

        public Criteria andTopHighlightNumsEqualTo(Integer value) {
            addCriterion("TOP_HIGHLIGHT_NUMS =", value, "topHighlightNums");
            return (Criteria) this;
        }

        public Criteria andTopHighlightNumsNotEqualTo(Integer value) {
            addCriterion("TOP_HIGHLIGHT_NUMS <>", value, "topHighlightNums");
            return (Criteria) this;
        }

        public Criteria andTopHighlightNumsGreaterThan(Integer value) {
            addCriterion("TOP_HIGHLIGHT_NUMS >", value, "topHighlightNums");
            return (Criteria) this;
        }

        public Criteria andTopHighlightNumsGreaterThanOrEqualTo(Integer value) {
            addCriterion("TOP_HIGHLIGHT_NUMS >=", value, "topHighlightNums");
            return (Criteria) this;
        }

        public Criteria andTopHighlightNumsLessThan(Integer value) {
            addCriterion("TOP_HIGHLIGHT_NUMS <", value, "topHighlightNums");
            return (Criteria) this;
        }

        public Criteria andTopHighlightNumsLessThanOrEqualTo(Integer value) {
            addCriterion("TOP_HIGHLIGHT_NUMS <=", value, "topHighlightNums");
            return (Criteria) this;
        }

        public Criteria andTopHighlightNumsIn(List<Integer> values) {
            addCriterion("TOP_HIGHLIGHT_NUMS in", values, "topHighlightNums");
            return (Criteria) this;
        }

        public Criteria andTopHighlightNumsNotIn(List<Integer> values) {
            addCriterion("TOP_HIGHLIGHT_NUMS not in", values, "topHighlightNums");
            return (Criteria) this;
        }

        public Criteria andTopHighlightNumsBetween(Integer value1, Integer value2) {
            addCriterion("TOP_HIGHLIGHT_NUMS between", value1, value2, "topHighlightNums");
            return (Criteria) this;
        }

        public Criteria andTopHighlightNumsNotBetween(Integer value1, Integer value2) {
            addCriterion("TOP_HIGHLIGHT_NUMS not between", value1, value2, "topHighlightNums");
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