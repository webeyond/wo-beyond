package com.unicom.wobeyond.model;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class AccounHandApplyExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public AccounHandApplyExample() {
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

        public Criteria andOperatoridIsNull() {
            addCriterion("OPERATORID is null");
            return (Criteria) this;
        }

        public Criteria andOperatoridIsNotNull() {
            addCriterion("OPERATORID is not null");
            return (Criteria) this;
        }

        public Criteria andOperatoridEqualTo(Integer value) {
            addCriterion("OPERATORID =", value, "operatorid");
            return (Criteria) this;
        }

        public Criteria andOperatoridNotEqualTo(Integer value) {
            addCriterion("OPERATORID <>", value, "operatorid");
            return (Criteria) this;
        }

        public Criteria andOperatoridGreaterThan(Integer value) {
            addCriterion("OPERATORID >", value, "operatorid");
            return (Criteria) this;
        }

        public Criteria andOperatoridGreaterThanOrEqualTo(Integer value) {
            addCriterion("OPERATORID >=", value, "operatorid");
            return (Criteria) this;
        }

        public Criteria andOperatoridLessThan(Integer value) {
            addCriterion("OPERATORID <", value, "operatorid");
            return (Criteria) this;
        }

        public Criteria andOperatoridLessThanOrEqualTo(Integer value) {
            addCriterion("OPERATORID <=", value, "operatorid");
            return (Criteria) this;
        }

        public Criteria andOperatoridIn(List<Integer> values) {
            addCriterion("OPERATORID in", values, "operatorid");
            return (Criteria) this;
        }

        public Criteria andOperatoridNotIn(List<Integer> values) {
            addCriterion("OPERATORID not in", values, "operatorid");
            return (Criteria) this;
        }

        public Criteria andOperatoridBetween(Integer value1, Integer value2) {
            addCriterion("OPERATORID between", value1, value2, "operatorid");
            return (Criteria) this;
        }

        public Criteria andOperatoridNotBetween(Integer value1, Integer value2) {
            addCriterion("OPERATORID not between", value1, value2, "operatorid");
            return (Criteria) this;
        }

        public Criteria andOperatornameIsNull() {
            addCriterion("OPERATORNAME is null");
            return (Criteria) this;
        }

        public Criteria andOperatornameIsNotNull() {
            addCriterion("OPERATORNAME is not null");
            return (Criteria) this;
        }

        public Criteria andOperatornameEqualTo(String value) {
            addCriterion("OPERATORNAME =", value, "operatorname");
            return (Criteria) this;
        }

        public Criteria andOperatornameNotEqualTo(String value) {
            addCriterion("OPERATORNAME <>", value, "operatorname");
            return (Criteria) this;
        }

        public Criteria andOperatornameGreaterThan(String value) {
            addCriterion("OPERATORNAME >", value, "operatorname");
            return (Criteria) this;
        }

        public Criteria andOperatornameGreaterThanOrEqualTo(String value) {
            addCriterion("OPERATORNAME >=", value, "operatorname");
            return (Criteria) this;
        }

        public Criteria andOperatornameLessThan(String value) {
            addCriterion("OPERATORNAME <", value, "operatorname");
            return (Criteria) this;
        }

        public Criteria andOperatornameLessThanOrEqualTo(String value) {
            addCriterion("OPERATORNAME <=", value, "operatorname");
            return (Criteria) this;
        }

        public Criteria andOperatornameLike(String value) {
            addCriterion("OPERATORNAME like", value, "operatorname");
            return (Criteria) this;
        }

        public Criteria andOperatornameNotLike(String value) {
            addCriterion("OPERATORNAME not like", value, "operatorname");
            return (Criteria) this;
        }

        public Criteria andOperatornameIn(List<String> values) {
            addCriterion("OPERATORNAME in", values, "operatorname");
            return (Criteria) this;
        }

        public Criteria andOperatornameNotIn(List<String> values) {
            addCriterion("OPERATORNAME not in", values, "operatorname");
            return (Criteria) this;
        }

        public Criteria andOperatornameBetween(String value1, String value2) {
            addCriterion("OPERATORNAME between", value1, value2, "operatorname");
            return (Criteria) this;
        }

        public Criteria andOperatornameNotBetween(String value1, String value2) {
            addCriterion("OPERATORNAME not between", value1, value2, "operatorname");
            return (Criteria) this;
        }

        public Criteria andProvinceIsNull() {
            addCriterion("PROVINCE is null");
            return (Criteria) this;
        }

        public Criteria andProvinceIsNotNull() {
            addCriterion("PROVINCE is not null");
            return (Criteria) this;
        }

        public Criteria andProvinceEqualTo(String value) {
            addCriterion("PROVINCE =", value, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceNotEqualTo(String value) {
            addCriterion("PROVINCE <>", value, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceGreaterThan(String value) {
            addCriterion("PROVINCE >", value, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceGreaterThanOrEqualTo(String value) {
            addCriterion("PROVINCE >=", value, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceLessThan(String value) {
            addCriterion("PROVINCE <", value, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceLessThanOrEqualTo(String value) {
            addCriterion("PROVINCE <=", value, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceLike(String value) {
            addCriterion("PROVINCE like", value, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceNotLike(String value) {
            addCriterion("PROVINCE not like", value, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceIn(List<String> values) {
            addCriterion("PROVINCE in", values, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceNotIn(List<String> values) {
            addCriterion("PROVINCE not in", values, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceBetween(String value1, String value2) {
            addCriterion("PROVINCE between", value1, value2, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceNotBetween(String value1, String value2) {
            addCriterion("PROVINCE not between", value1, value2, "province");
            return (Criteria) this;
        }

        public Criteria andCityIsNull() {
            addCriterion("CITY is null");
            return (Criteria) this;
        }

        public Criteria andCityIsNotNull() {
            addCriterion("CITY is not null");
            return (Criteria) this;
        }

        public Criteria andCityEqualTo(String value) {
            addCriterion("CITY =", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityNotEqualTo(String value) {
            addCriterion("CITY <>", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityGreaterThan(String value) {
            addCriterion("CITY >", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityGreaterThanOrEqualTo(String value) {
            addCriterion("CITY >=", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityLessThan(String value) {
            addCriterion("CITY <", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityLessThanOrEqualTo(String value) {
            addCriterion("CITY <=", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityLike(String value) {
            addCriterion("CITY like", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityNotLike(String value) {
            addCriterion("CITY not like", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityIn(List<String> values) {
            addCriterion("CITY in", values, "city");
            return (Criteria) this;
        }

        public Criteria andCityNotIn(List<String> values) {
            addCriterion("CITY not in", values, "city");
            return (Criteria) this;
        }

        public Criteria andCityBetween(String value1, String value2) {
            addCriterion("CITY between", value1, value2, "city");
            return (Criteria) this;
        }

        public Criteria andCityNotBetween(String value1, String value2) {
            addCriterion("CITY not between", value1, value2, "city");
            return (Criteria) this;
        }

        public Criteria andDistrictIsNull() {
            addCriterion("DISTRICT is null");
            return (Criteria) this;
        }

        public Criteria andDistrictIsNotNull() {
            addCriterion("DISTRICT is not null");
            return (Criteria) this;
        }

        public Criteria andDistrictEqualTo(String value) {
            addCriterion("DISTRICT =", value, "district");
            return (Criteria) this;
        }

        public Criteria andDistrictNotEqualTo(String value) {
            addCriterion("DISTRICT <>", value, "district");
            return (Criteria) this;
        }

        public Criteria andDistrictGreaterThan(String value) {
            addCriterion("DISTRICT >", value, "district");
            return (Criteria) this;
        }

        public Criteria andDistrictGreaterThanOrEqualTo(String value) {
            addCriterion("DISTRICT >=", value, "district");
            return (Criteria) this;
        }

        public Criteria andDistrictLessThan(String value) {
            addCriterion("DISTRICT <", value, "district");
            return (Criteria) this;
        }

        public Criteria andDistrictLessThanOrEqualTo(String value) {
            addCriterion("DISTRICT <=", value, "district");
            return (Criteria) this;
        }

        public Criteria andDistrictLike(String value) {
            addCriterion("DISTRICT like", value, "district");
            return (Criteria) this;
        }

        public Criteria andDistrictNotLike(String value) {
            addCriterion("DISTRICT not like", value, "district");
            return (Criteria) this;
        }

        public Criteria andDistrictIn(List<String> values) {
            addCriterion("DISTRICT in", values, "district");
            return (Criteria) this;
        }

        public Criteria andDistrictNotIn(List<String> values) {
            addCriterion("DISTRICT not in", values, "district");
            return (Criteria) this;
        }

        public Criteria andDistrictBetween(String value1, String value2) {
            addCriterion("DISTRICT between", value1, value2, "district");
            return (Criteria) this;
        }

        public Criteria andDistrictNotBetween(String value1, String value2) {
            addCriterion("DISTRICT not between", value1, value2, "district");
            return (Criteria) this;
        }

        public Criteria andDepartmentIsNull() {
            addCriterion("DEPARTMENT is null");
            return (Criteria) this;
        }

        public Criteria andDepartmentIsNotNull() {
            addCriterion("DEPARTMENT is not null");
            return (Criteria) this;
        }

        public Criteria andDepartmentEqualTo(String value) {
            addCriterion("DEPARTMENT =", value, "department");
            return (Criteria) this;
        }

        public Criteria andDepartmentNotEqualTo(String value) {
            addCriterion("DEPARTMENT <>", value, "department");
            return (Criteria) this;
        }

        public Criteria andDepartmentGreaterThan(String value) {
            addCriterion("DEPARTMENT >", value, "department");
            return (Criteria) this;
        }

        public Criteria andDepartmentGreaterThanOrEqualTo(String value) {
            addCriterion("DEPARTMENT >=", value, "department");
            return (Criteria) this;
        }

        public Criteria andDepartmentLessThan(String value) {
            addCriterion("DEPARTMENT <", value, "department");
            return (Criteria) this;
        }

        public Criteria andDepartmentLessThanOrEqualTo(String value) {
            addCriterion("DEPARTMENT <=", value, "department");
            return (Criteria) this;
        }

        public Criteria andDepartmentLike(String value) {
            addCriterion("DEPARTMENT like", value, "department");
            return (Criteria) this;
        }

        public Criteria andDepartmentNotLike(String value) {
            addCriterion("DEPARTMENT not like", value, "department");
            return (Criteria) this;
        }

        public Criteria andDepartmentIn(List<String> values) {
            addCriterion("DEPARTMENT in", values, "department");
            return (Criteria) this;
        }

        public Criteria andDepartmentNotIn(List<String> values) {
            addCriterion("DEPARTMENT not in", values, "department");
            return (Criteria) this;
        }

        public Criteria andDepartmentBetween(String value1, String value2) {
            addCriterion("DEPARTMENT between", value1, value2, "department");
            return (Criteria) this;
        }

        public Criteria andDepartmentNotBetween(String value1, String value2) {
            addCriterion("DEPARTMENT not between", value1, value2, "department");
            return (Criteria) this;
        }

        public Criteria andChannelIsNull() {
            addCriterion("CHANNEL is null");
            return (Criteria) this;
        }

        public Criteria andChannelIsNotNull() {
            addCriterion("CHANNEL is not null");
            return (Criteria) this;
        }

        public Criteria andChannelEqualTo(String value) {
            addCriterion("CHANNEL =", value, "channel");
            return (Criteria) this;
        }

        public Criteria andChannelNotEqualTo(String value) {
            addCriterion("CHANNEL <>", value, "channel");
            return (Criteria) this;
        }

        public Criteria andChannelGreaterThan(String value) {
            addCriterion("CHANNEL >", value, "channel");
            return (Criteria) this;
        }

        public Criteria andChannelGreaterThanOrEqualTo(String value) {
            addCriterion("CHANNEL >=", value, "channel");
            return (Criteria) this;
        }

        public Criteria andChannelLessThan(String value) {
            addCriterion("CHANNEL <", value, "channel");
            return (Criteria) this;
        }

        public Criteria andChannelLessThanOrEqualTo(String value) {
            addCriterion("CHANNEL <=", value, "channel");
            return (Criteria) this;
        }

        public Criteria andChannelLike(String value) {
            addCriterion("CHANNEL like", value, "channel");
            return (Criteria) this;
        }

        public Criteria andChannelNotLike(String value) {
            addCriterion("CHANNEL not like", value, "channel");
            return (Criteria) this;
        }

        public Criteria andChannelIn(List<String> values) {
            addCriterion("CHANNEL in", values, "channel");
            return (Criteria) this;
        }

        public Criteria andChannelNotIn(List<String> values) {
            addCriterion("CHANNEL not in", values, "channel");
            return (Criteria) this;
        }

        public Criteria andChannelBetween(String value1, String value2) {
            addCriterion("CHANNEL between", value1, value2, "channel");
            return (Criteria) this;
        }

        public Criteria andChannelNotBetween(String value1, String value2) {
            addCriterion("CHANNEL not between", value1, value2, "channel");
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

        public Criteria andRealnametypeIsNull() {
            addCriterion("REALNAMETYPE is null");
            return (Criteria) this;
        }

        public Criteria andRealnametypeIsNotNull() {
            addCriterion("REALNAMETYPE is not null");
            return (Criteria) this;
        }

        public Criteria andRealnametypeEqualTo(Integer value) {
            addCriterion("REALNAMETYPE =", value, "realnametype");
            return (Criteria) this;
        }

        public Criteria andRealnametypeNotEqualTo(Integer value) {
            addCriterion("REALNAMETYPE <>", value, "realnametype");
            return (Criteria) this;
        }

        public Criteria andRealnametypeGreaterThan(Integer value) {
            addCriterion("REALNAMETYPE >", value, "realnametype");
            return (Criteria) this;
        }

        public Criteria andRealnametypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("REALNAMETYPE >=", value, "realnametype");
            return (Criteria) this;
        }

        public Criteria andRealnametypeLessThan(Integer value) {
            addCriterion("REALNAMETYPE <", value, "realnametype");
            return (Criteria) this;
        }

        public Criteria andRealnametypeLessThanOrEqualTo(Integer value) {
            addCriterion("REALNAMETYPE <=", value, "realnametype");
            return (Criteria) this;
        }

        public Criteria andRealnametypeIn(List<Integer> values) {
            addCriterion("REALNAMETYPE in", values, "realnametype");
            return (Criteria) this;
        }

        public Criteria andRealnametypeNotIn(List<Integer> values) {
            addCriterion("REALNAMETYPE not in", values, "realnametype");
            return (Criteria) this;
        }

        public Criteria andRealnametypeBetween(Integer value1, Integer value2) {
            addCriterion("REALNAMETYPE between", value1, value2, "realnametype");
            return (Criteria) this;
        }

        public Criteria andRealnametypeNotBetween(Integer value1, Integer value2) {
            addCriterion("REALNAMETYPE not between", value1, value2, "realnametype");
            return (Criteria) this;
        }

        public Criteria andCusttypeIsNull() {
            addCriterion("CUSTTYPE is null");
            return (Criteria) this;
        }

        public Criteria andCusttypeIsNotNull() {
            addCriterion("CUSTTYPE is not null");
            return (Criteria) this;
        }

        public Criteria andCusttypeEqualTo(Integer value) {
            addCriterion("CUSTTYPE =", value, "custtype");
            return (Criteria) this;
        }

        public Criteria andCusttypeNotEqualTo(Integer value) {
            addCriterion("CUSTTYPE <>", value, "custtype");
            return (Criteria) this;
        }

        public Criteria andCusttypeGreaterThan(Integer value) {
            addCriterion("CUSTTYPE >", value, "custtype");
            return (Criteria) this;
        }

        public Criteria andCusttypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("CUSTTYPE >=", value, "custtype");
            return (Criteria) this;
        }

        public Criteria andCusttypeLessThan(Integer value) {
            addCriterion("CUSTTYPE <", value, "custtype");
            return (Criteria) this;
        }

        public Criteria andCusttypeLessThanOrEqualTo(Integer value) {
            addCriterion("CUSTTYPE <=", value, "custtype");
            return (Criteria) this;
        }

        public Criteria andCusttypeIn(List<Integer> values) {
            addCriterion("CUSTTYPE in", values, "custtype");
            return (Criteria) this;
        }

        public Criteria andCusttypeNotIn(List<Integer> values) {
            addCriterion("CUSTTYPE not in", values, "custtype");
            return (Criteria) this;
        }

        public Criteria andCusttypeBetween(Integer value1, Integer value2) {
            addCriterion("CUSTTYPE between", value1, value2, "custtype");
            return (Criteria) this;
        }

        public Criteria andCusttypeNotBetween(Integer value1, Integer value2) {
            addCriterion("CUSTTYPE not between", value1, value2, "custtype");
            return (Criteria) this;
        }

        public Criteria andRefcustidIsNull() {
            addCriterion("REFCUSTID is null");
            return (Criteria) this;
        }

        public Criteria andRefcustidIsNotNull() {
            addCriterion("REFCUSTID is not null");
            return (Criteria) this;
        }

        public Criteria andRefcustidEqualTo(Integer value) {
            addCriterion("REFCUSTID =", value, "refcustid");
            return (Criteria) this;
        }

        public Criteria andRefcustidNotEqualTo(Integer value) {
            addCriterion("REFCUSTID <>", value, "refcustid");
            return (Criteria) this;
        }

        public Criteria andRefcustidGreaterThan(Integer value) {
            addCriterion("REFCUSTID >", value, "refcustid");
            return (Criteria) this;
        }

        public Criteria andRefcustidGreaterThanOrEqualTo(Integer value) {
            addCriterion("REFCUSTID >=", value, "refcustid");
            return (Criteria) this;
        }

        public Criteria andRefcustidLessThan(Integer value) {
            addCriterion("REFCUSTID <", value, "refcustid");
            return (Criteria) this;
        }

        public Criteria andRefcustidLessThanOrEqualTo(Integer value) {
            addCriterion("REFCUSTID <=", value, "refcustid");
            return (Criteria) this;
        }

        public Criteria andRefcustidIn(List<Integer> values) {
            addCriterion("REFCUSTID in", values, "refcustid");
            return (Criteria) this;
        }

        public Criteria andRefcustidNotIn(List<Integer> values) {
            addCriterion("REFCUSTID not in", values, "refcustid");
            return (Criteria) this;
        }

        public Criteria andRefcustidBetween(Integer value1, Integer value2) {
            addCriterion("REFCUSTID between", value1, value2, "refcustid");
            return (Criteria) this;
        }

        public Criteria andRefcustidNotBetween(Integer value1, Integer value2) {
            addCriterion("REFCUSTID not between", value1, value2, "refcustid");
            return (Criteria) this;
        }

        public Criteria andCerttypeIsNull() {
            addCriterion("CERTTYPE is null");
            return (Criteria) this;
        }

        public Criteria andCerttypeIsNotNull() {
            addCriterion("CERTTYPE is not null");
            return (Criteria) this;
        }

        public Criteria andCerttypeEqualTo(Integer value) {
            addCriterion("CERTTYPE =", value, "certtype");
            return (Criteria) this;
        }

        public Criteria andCerttypeNotEqualTo(Integer value) {
            addCriterion("CERTTYPE <>", value, "certtype");
            return (Criteria) this;
        }

        public Criteria andCerttypeGreaterThan(Integer value) {
            addCriterion("CERTTYPE >", value, "certtype");
            return (Criteria) this;
        }

        public Criteria andCerttypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("CERTTYPE >=", value, "certtype");
            return (Criteria) this;
        }

        public Criteria andCerttypeLessThan(Integer value) {
            addCriterion("CERTTYPE <", value, "certtype");
            return (Criteria) this;
        }

        public Criteria andCerttypeLessThanOrEqualTo(Integer value) {
            addCriterion("CERTTYPE <=", value, "certtype");
            return (Criteria) this;
        }

        public Criteria andCerttypeIn(List<Integer> values) {
            addCriterion("CERTTYPE in", values, "certtype");
            return (Criteria) this;
        }

        public Criteria andCerttypeNotIn(List<Integer> values) {
            addCriterion("CERTTYPE not in", values, "certtype");
            return (Criteria) this;
        }

        public Criteria andCerttypeBetween(Integer value1, Integer value2) {
            addCriterion("CERTTYPE between", value1, value2, "certtype");
            return (Criteria) this;
        }

        public Criteria andCerttypeNotBetween(Integer value1, Integer value2) {
            addCriterion("CERTTYPE not between", value1, value2, "certtype");
            return (Criteria) this;
        }

        public Criteria andCertnumIsNull() {
            addCriterion("CERTNUM is null");
            return (Criteria) this;
        }

        public Criteria andCertnumIsNotNull() {
            addCriterion("CERTNUM is not null");
            return (Criteria) this;
        }

        public Criteria andCertnumEqualTo(String value) {
            addCriterion("CERTNUM =", value, "certnum");
            return (Criteria) this;
        }

        public Criteria andCertnumNotEqualTo(String value) {
            addCriterion("CERTNUM <>", value, "certnum");
            return (Criteria) this;
        }

        public Criteria andCertnumGreaterThan(String value) {
            addCriterion("CERTNUM >", value, "certnum");
            return (Criteria) this;
        }

        public Criteria andCertnumGreaterThanOrEqualTo(String value) {
            addCriterion("CERTNUM >=", value, "certnum");
            return (Criteria) this;
        }

        public Criteria andCertnumLessThan(String value) {
            addCriterion("CERTNUM <", value, "certnum");
            return (Criteria) this;
        }

        public Criteria andCertnumLessThanOrEqualTo(String value) {
            addCriterion("CERTNUM <=", value, "certnum");
            return (Criteria) this;
        }

        public Criteria andCertnumLike(String value) {
            addCriterion("CERTNUM like", value, "certnum");
            return (Criteria) this;
        }

        public Criteria andCertnumNotLike(String value) {
            addCriterion("CERTNUM not like", value, "certnum");
            return (Criteria) this;
        }

        public Criteria andCertnumIn(List<String> values) {
            addCriterion("CERTNUM in", values, "certnum");
            return (Criteria) this;
        }

        public Criteria andCertnumNotIn(List<String> values) {
            addCriterion("CERTNUM not in", values, "certnum");
            return (Criteria) this;
        }

        public Criteria andCertnumBetween(String value1, String value2) {
            addCriterion("CERTNUM between", value1, value2, "certnum");
            return (Criteria) this;
        }

        public Criteria andCertnumNotBetween(String value1, String value2) {
            addCriterion("CERTNUM not between", value1, value2, "certnum");
            return (Criteria) this;
        }

        public Criteria andCertadressIsNull() {
            addCriterion("CERTADRESS is null");
            return (Criteria) this;
        }

        public Criteria andCertadressIsNotNull() {
            addCriterion("CERTADRESS is not null");
            return (Criteria) this;
        }

        public Criteria andCertadressEqualTo(String value) {
            addCriterion("CERTADRESS =", value, "certadress");
            return (Criteria) this;
        }

        public Criteria andCertadressNotEqualTo(String value) {
            addCriterion("CERTADRESS <>", value, "certadress");
            return (Criteria) this;
        }

        public Criteria andCertadressGreaterThan(String value) {
            addCriterion("CERTADRESS >", value, "certadress");
            return (Criteria) this;
        }

        public Criteria andCertadressGreaterThanOrEqualTo(String value) {
            addCriterion("CERTADRESS >=", value, "certadress");
            return (Criteria) this;
        }

        public Criteria andCertadressLessThan(String value) {
            addCriterion("CERTADRESS <", value, "certadress");
            return (Criteria) this;
        }

        public Criteria andCertadressLessThanOrEqualTo(String value) {
            addCriterion("CERTADRESS <=", value, "certadress");
            return (Criteria) this;
        }

        public Criteria andCertadressLike(String value) {
            addCriterion("CERTADRESS like", value, "certadress");
            return (Criteria) this;
        }

        public Criteria andCertadressNotLike(String value) {
            addCriterion("CERTADRESS not like", value, "certadress");
            return (Criteria) this;
        }

        public Criteria andCertadressIn(List<String> values) {
            addCriterion("CERTADRESS in", values, "certadress");
            return (Criteria) this;
        }

        public Criteria andCertadressNotIn(List<String> values) {
            addCriterion("CERTADRESS not in", values, "certadress");
            return (Criteria) this;
        }

        public Criteria andCertadressBetween(String value1, String value2) {
            addCriterion("CERTADRESS between", value1, value2, "certadress");
            return (Criteria) this;
        }

        public Criteria andCertadressNotBetween(String value1, String value2) {
            addCriterion("CERTADRESS not between", value1, value2, "certadress");
            return (Criteria) this;
        }

        public Criteria andCustomernameIsNull() {
            addCriterion("CUSTOMERNAME is null");
            return (Criteria) this;
        }

        public Criteria andCustomernameIsNotNull() {
            addCriterion("CUSTOMERNAME is not null");
            return (Criteria) this;
        }

        public Criteria andCustomernameEqualTo(String value) {
            addCriterion("CUSTOMERNAME =", value, "customername");
            return (Criteria) this;
        }

        public Criteria andCustomernameNotEqualTo(String value) {
            addCriterion("CUSTOMERNAME <>", value, "customername");
            return (Criteria) this;
        }

        public Criteria andCustomernameGreaterThan(String value) {
            addCriterion("CUSTOMERNAME >", value, "customername");
            return (Criteria) this;
        }

        public Criteria andCustomernameGreaterThanOrEqualTo(String value) {
            addCriterion("CUSTOMERNAME >=", value, "customername");
            return (Criteria) this;
        }

        public Criteria andCustomernameLessThan(String value) {
            addCriterion("CUSTOMERNAME <", value, "customername");
            return (Criteria) this;
        }

        public Criteria andCustomernameLessThanOrEqualTo(String value) {
            addCriterion("CUSTOMERNAME <=", value, "customername");
            return (Criteria) this;
        }

        public Criteria andCustomernameLike(String value) {
            addCriterion("CUSTOMERNAME like", value, "customername");
            return (Criteria) this;
        }

        public Criteria andCustomernameNotLike(String value) {
            addCriterion("CUSTOMERNAME not like", value, "customername");
            return (Criteria) this;
        }

        public Criteria andCustomernameIn(List<String> values) {
            addCriterion("CUSTOMERNAME in", values, "customername");
            return (Criteria) this;
        }

        public Criteria andCustomernameNotIn(List<String> values) {
            addCriterion("CUSTOMERNAME not in", values, "customername");
            return (Criteria) this;
        }

        public Criteria andCustomernameBetween(String value1, String value2) {
            addCriterion("CUSTOMERNAME between", value1, value2, "customername");
            return (Criteria) this;
        }

        public Criteria andCustomernameNotBetween(String value1, String value2) {
            addCriterion("CUSTOMERNAME not between", value1, value2, "customername");
            return (Criteria) this;
        }

        public Criteria andSexIsNull() {
            addCriterion("SEX is null");
            return (Criteria) this;
        }

        public Criteria andSexIsNotNull() {
            addCriterion("SEX is not null");
            return (Criteria) this;
        }

        public Criteria andSexEqualTo(String value) {
            addCriterion("SEX =", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexNotEqualTo(String value) {
            addCriterion("SEX <>", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexGreaterThan(String value) {
            addCriterion("SEX >", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexGreaterThanOrEqualTo(String value) {
            addCriterion("SEX >=", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexLessThan(String value) {
            addCriterion("SEX <", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexLessThanOrEqualTo(String value) {
            addCriterion("SEX <=", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexLike(String value) {
            addCriterion("SEX like", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexNotLike(String value) {
            addCriterion("SEX not like", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexIn(List<String> values) {
            addCriterion("SEX in", values, "sex");
            return (Criteria) this;
        }

        public Criteria andSexNotIn(List<String> values) {
            addCriterion("SEX not in", values, "sex");
            return (Criteria) this;
        }

        public Criteria andSexBetween(String value1, String value2) {
            addCriterion("SEX between", value1, value2, "sex");
            return (Criteria) this;
        }

        public Criteria andSexNotBetween(String value1, String value2) {
            addCriterion("SEX not between", value1, value2, "sex");
            return (Criteria) this;
        }

        public Criteria andTmpphoneIsNull() {
            addCriterion("TMPPHONE is null");
            return (Criteria) this;
        }

        public Criteria andTmpphoneIsNotNull() {
            addCriterion("TMPPHONE is not null");
            return (Criteria) this;
        }

        public Criteria andTmpphoneEqualTo(String value) {
            addCriterion("TMPPHONE =", value, "tmpphone");
            return (Criteria) this;
        }

        public Criteria andTmpphoneNotEqualTo(String value) {
            addCriterion("TMPPHONE <>", value, "tmpphone");
            return (Criteria) this;
        }

        public Criteria andTmpphoneGreaterThan(String value) {
            addCriterion("TMPPHONE >", value, "tmpphone");
            return (Criteria) this;
        }

        public Criteria andTmpphoneGreaterThanOrEqualTo(String value) {
            addCriterion("TMPPHONE >=", value, "tmpphone");
            return (Criteria) this;
        }

        public Criteria andTmpphoneLessThan(String value) {
            addCriterion("TMPPHONE <", value, "tmpphone");
            return (Criteria) this;
        }

        public Criteria andTmpphoneLessThanOrEqualTo(String value) {
            addCriterion("TMPPHONE <=", value, "tmpphone");
            return (Criteria) this;
        }

        public Criteria andTmpphoneLike(String value) {
            addCriterion("TMPPHONE like", value, "tmpphone");
            return (Criteria) this;
        }

        public Criteria andTmpphoneNotLike(String value) {
            addCriterion("TMPPHONE not like", value, "tmpphone");
            return (Criteria) this;
        }

        public Criteria andTmpphoneIn(List<String> values) {
            addCriterion("TMPPHONE in", values, "tmpphone");
            return (Criteria) this;
        }

        public Criteria andTmpphoneNotIn(List<String> values) {
            addCriterion("TMPPHONE not in", values, "tmpphone");
            return (Criteria) this;
        }

        public Criteria andTmpphoneBetween(String value1, String value2) {
            addCriterion("TMPPHONE between", value1, value2, "tmpphone");
            return (Criteria) this;
        }

        public Criteria andTmpphoneNotBetween(String value1, String value2) {
            addCriterion("TMPPHONE not between", value1, value2, "tmpphone");
            return (Criteria) this;
        }

        public Criteria andCusttype1IsNull() {
            addCriterion("CUSTTYPE1 is null");
            return (Criteria) this;
        }

        public Criteria andCusttype1IsNotNull() {
            addCriterion("CUSTTYPE1 is not null");
            return (Criteria) this;
        }

        public Criteria andCusttype1EqualTo(String value) {
            addCriterion("CUSTTYPE1 =", value, "custtype1");
            return (Criteria) this;
        }

        public Criteria andCusttype1NotEqualTo(String value) {
            addCriterion("CUSTTYPE1 <>", value, "custtype1");
            return (Criteria) this;
        }

        public Criteria andCusttype1GreaterThan(String value) {
            addCriterion("CUSTTYPE1 >", value, "custtype1");
            return (Criteria) this;
        }

        public Criteria andCusttype1GreaterThanOrEqualTo(String value) {
            addCriterion("CUSTTYPE1 >=", value, "custtype1");
            return (Criteria) this;
        }

        public Criteria andCusttype1LessThan(String value) {
            addCriterion("CUSTTYPE1 <", value, "custtype1");
            return (Criteria) this;
        }

        public Criteria andCusttype1LessThanOrEqualTo(String value) {
            addCriterion("CUSTTYPE1 <=", value, "custtype1");
            return (Criteria) this;
        }

        public Criteria andCusttype1Like(String value) {
            addCriterion("CUSTTYPE1 like", value, "custtype1");
            return (Criteria) this;
        }

        public Criteria andCusttype1NotLike(String value) {
            addCriterion("CUSTTYPE1 not like", value, "custtype1");
            return (Criteria) this;
        }

        public Criteria andCusttype1In(List<String> values) {
            addCriterion("CUSTTYPE1 in", values, "custtype1");
            return (Criteria) this;
        }

        public Criteria andCusttype1NotIn(List<String> values) {
            addCriterion("CUSTTYPE1 not in", values, "custtype1");
            return (Criteria) this;
        }

        public Criteria andCusttype1Between(String value1, String value2) {
            addCriterion("CUSTTYPE1 between", value1, value2, "custtype1");
            return (Criteria) this;
        }

        public Criteria andCusttype1NotBetween(String value1, String value2) {
            addCriterion("CUSTTYPE1 not between", value1, value2, "custtype1");
            return (Criteria) this;
        }

        public Criteria andPsptnumberIsNull() {
            addCriterion("PSPTNUMBER is null");
            return (Criteria) this;
        }

        public Criteria andPsptnumberIsNotNull() {
            addCriterion("PSPTNUMBER is not null");
            return (Criteria) this;
        }

        public Criteria andPsptnumberEqualTo(String value) {
            addCriterion("PSPTNUMBER =", value, "psptnumber");
            return (Criteria) this;
        }

        public Criteria andPsptnumberNotEqualTo(String value) {
            addCriterion("PSPTNUMBER <>", value, "psptnumber");
            return (Criteria) this;
        }

        public Criteria andPsptnumberGreaterThan(String value) {
            addCriterion("PSPTNUMBER >", value, "psptnumber");
            return (Criteria) this;
        }

        public Criteria andPsptnumberGreaterThanOrEqualTo(String value) {
            addCriterion("PSPTNUMBER >=", value, "psptnumber");
            return (Criteria) this;
        }

        public Criteria andPsptnumberLessThan(String value) {
            addCriterion("PSPTNUMBER <", value, "psptnumber");
            return (Criteria) this;
        }

        public Criteria andPsptnumberLessThanOrEqualTo(String value) {
            addCriterion("PSPTNUMBER <=", value, "psptnumber");
            return (Criteria) this;
        }

        public Criteria andPsptnumberLike(String value) {
            addCriterion("PSPTNUMBER like", value, "psptnumber");
            return (Criteria) this;
        }

        public Criteria andPsptnumberNotLike(String value) {
            addCriterion("PSPTNUMBER not like", value, "psptnumber");
            return (Criteria) this;
        }

        public Criteria andPsptnumberIn(List<String> values) {
            addCriterion("PSPTNUMBER in", values, "psptnumber");
            return (Criteria) this;
        }

        public Criteria andPsptnumberNotIn(List<String> values) {
            addCriterion("PSPTNUMBER not in", values, "psptnumber");
            return (Criteria) this;
        }

        public Criteria andPsptnumberBetween(String value1, String value2) {
            addCriterion("PSPTNUMBER between", value1, value2, "psptnumber");
            return (Criteria) this;
        }

        public Criteria andPsptnumberNotBetween(String value1, String value2) {
            addCriterion("PSPTNUMBER not between", value1, value2, "psptnumber");
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

        public Criteria andPayinfoIsNull() {
            addCriterion("PAYINFO is null");
            return (Criteria) this;
        }

        public Criteria andPayinfoIsNotNull() {
            addCriterion("PAYINFO is not null");
            return (Criteria) this;
        }

        public Criteria andPayinfoEqualTo(String value) {
            addCriterion("PAYINFO =", value, "payinfo");
            return (Criteria) this;
        }

        public Criteria andPayinfoNotEqualTo(String value) {
            addCriterion("PAYINFO <>", value, "payinfo");
            return (Criteria) this;
        }

        public Criteria andPayinfoGreaterThan(String value) {
            addCriterion("PAYINFO >", value, "payinfo");
            return (Criteria) this;
        }

        public Criteria andPayinfoGreaterThanOrEqualTo(String value) {
            addCriterion("PAYINFO >=", value, "payinfo");
            return (Criteria) this;
        }

        public Criteria andPayinfoLessThan(String value) {
            addCriterion("PAYINFO <", value, "payinfo");
            return (Criteria) this;
        }

        public Criteria andPayinfoLessThanOrEqualTo(String value) {
            addCriterion("PAYINFO <=", value, "payinfo");
            return (Criteria) this;
        }

        public Criteria andPayinfoLike(String value) {
            addCriterion("PAYINFO like", value, "payinfo");
            return (Criteria) this;
        }

        public Criteria andPayinfoNotLike(String value) {
            addCriterion("PAYINFO not like", value, "payinfo");
            return (Criteria) this;
        }

        public Criteria andPayinfoIn(List<String> values) {
            addCriterion("PAYINFO in", values, "payinfo");
            return (Criteria) this;
        }

        public Criteria andPayinfoNotIn(List<String> values) {
            addCriterion("PAYINFO not in", values, "payinfo");
            return (Criteria) this;
        }

        public Criteria andPayinfoBetween(String value1, String value2) {
            addCriterion("PAYINFO between", value1, value2, "payinfo");
            return (Criteria) this;
        }

        public Criteria andPayinfoNotBetween(String value1, String value2) {
            addCriterion("PAYINFO not between", value1, value2, "payinfo");
            return (Criteria) this;
        }

        public Criteria andPaytypeIsNull() {
            addCriterion("PAYTYPE is null");
            return (Criteria) this;
        }

        public Criteria andPaytypeIsNotNull() {
            addCriterion("PAYTYPE is not null");
            return (Criteria) this;
        }

        public Criteria andPaytypeEqualTo(String value) {
            addCriterion("PAYTYPE =", value, "paytype");
            return (Criteria) this;
        }

        public Criteria andPaytypeNotEqualTo(String value) {
            addCriterion("PAYTYPE <>", value, "paytype");
            return (Criteria) this;
        }

        public Criteria andPaytypeGreaterThan(String value) {
            addCriterion("PAYTYPE >", value, "paytype");
            return (Criteria) this;
        }

        public Criteria andPaytypeGreaterThanOrEqualTo(String value) {
            addCriterion("PAYTYPE >=", value, "paytype");
            return (Criteria) this;
        }

        public Criteria andPaytypeLessThan(String value) {
            addCriterion("PAYTYPE <", value, "paytype");
            return (Criteria) this;
        }

        public Criteria andPaytypeLessThanOrEqualTo(String value) {
            addCriterion("PAYTYPE <=", value, "paytype");
            return (Criteria) this;
        }

        public Criteria andPaytypeLike(String value) {
            addCriterion("PAYTYPE like", value, "paytype");
            return (Criteria) this;
        }

        public Criteria andPaytypeNotLike(String value) {
            addCriterion("PAYTYPE not like", value, "paytype");
            return (Criteria) this;
        }

        public Criteria andPaytypeIn(List<String> values) {
            addCriterion("PAYTYPE in", values, "paytype");
            return (Criteria) this;
        }

        public Criteria andPaytypeNotIn(List<String> values) {
            addCriterion("PAYTYPE not in", values, "paytype");
            return (Criteria) this;
        }

        public Criteria andPaytypeBetween(String value1, String value2) {
            addCriterion("PAYTYPE between", value1, value2, "paytype");
            return (Criteria) this;
        }

        public Criteria andPaytypeNotBetween(String value1, String value2) {
            addCriterion("PAYTYPE not between", value1, value2, "paytype");
            return (Criteria) this;
        }

        public Criteria andPayorgIsNull() {
            addCriterion("PAYORG is null");
            return (Criteria) this;
        }

        public Criteria andPayorgIsNotNull() {
            addCriterion("PAYORG is not null");
            return (Criteria) this;
        }

        public Criteria andPayorgEqualTo(String value) {
            addCriterion("PAYORG =", value, "payorg");
            return (Criteria) this;
        }

        public Criteria andPayorgNotEqualTo(String value) {
            addCriterion("PAYORG <>", value, "payorg");
            return (Criteria) this;
        }

        public Criteria andPayorgGreaterThan(String value) {
            addCriterion("PAYORG >", value, "payorg");
            return (Criteria) this;
        }

        public Criteria andPayorgGreaterThanOrEqualTo(String value) {
            addCriterion("PAYORG >=", value, "payorg");
            return (Criteria) this;
        }

        public Criteria andPayorgLessThan(String value) {
            addCriterion("PAYORG <", value, "payorg");
            return (Criteria) this;
        }

        public Criteria andPayorgLessThanOrEqualTo(String value) {
            addCriterion("PAYORG <=", value, "payorg");
            return (Criteria) this;
        }

        public Criteria andPayorgLike(String value) {
            addCriterion("PAYORG like", value, "payorg");
            return (Criteria) this;
        }

        public Criteria andPayorgNotLike(String value) {
            addCriterion("PAYORG not like", value, "payorg");
            return (Criteria) this;
        }

        public Criteria andPayorgIn(List<String> values) {
            addCriterion("PAYORG in", values, "payorg");
            return (Criteria) this;
        }

        public Criteria andPayorgNotIn(List<String> values) {
            addCriterion("PAYORG not in", values, "payorg");
            return (Criteria) this;
        }

        public Criteria andPayorgBetween(String value1, String value2) {
            addCriterion("PAYORG between", value1, value2, "payorg");
            return (Criteria) this;
        }

        public Criteria andPayorgNotBetween(String value1, String value2) {
            addCriterion("PAYORG not between", value1, value2, "payorg");
            return (Criteria) this;
        }

        public Criteria andPaynumIsNull() {
            addCriterion("PAYNUM is null");
            return (Criteria) this;
        }

        public Criteria andPaynumIsNotNull() {
            addCriterion("PAYNUM is not null");
            return (Criteria) this;
        }

        public Criteria andPaynumEqualTo(String value) {
            addCriterion("PAYNUM =", value, "paynum");
            return (Criteria) this;
        }

        public Criteria andPaynumNotEqualTo(String value) {
            addCriterion("PAYNUM <>", value, "paynum");
            return (Criteria) this;
        }

        public Criteria andPaynumGreaterThan(String value) {
            addCriterion("PAYNUM >", value, "paynum");
            return (Criteria) this;
        }

        public Criteria andPaynumGreaterThanOrEqualTo(String value) {
            addCriterion("PAYNUM >=", value, "paynum");
            return (Criteria) this;
        }

        public Criteria andPaynumLessThan(String value) {
            addCriterion("PAYNUM <", value, "paynum");
            return (Criteria) this;
        }

        public Criteria andPaynumLessThanOrEqualTo(String value) {
            addCriterion("PAYNUM <=", value, "paynum");
            return (Criteria) this;
        }

        public Criteria andPaynumLike(String value) {
            addCriterion("PAYNUM like", value, "paynum");
            return (Criteria) this;
        }

        public Criteria andPaynumNotLike(String value) {
            addCriterion("PAYNUM not like", value, "paynum");
            return (Criteria) this;
        }

        public Criteria andPaynumIn(List<String> values) {
            addCriterion("PAYNUM in", values, "paynum");
            return (Criteria) this;
        }

        public Criteria andPaynumNotIn(List<String> values) {
            addCriterion("PAYNUM not in", values, "paynum");
            return (Criteria) this;
        }

        public Criteria andPaynumBetween(String value1, String value2) {
            addCriterion("PAYNUM between", value1, value2, "paynum");
            return (Criteria) this;
        }

        public Criteria andPaynumNotBetween(String value1, String value2) {
            addCriterion("PAYNUM not between", value1, value2, "paynum");
            return (Criteria) this;
        }

        public Criteria andSalepriceIsNull() {
            addCriterion("SALEPRICE is null");
            return (Criteria) this;
        }

        public Criteria andSalepriceIsNotNull() {
            addCriterion("SALEPRICE is not null");
            return (Criteria) this;
        }

        public Criteria andSalepriceEqualTo(BigDecimal value) {
            addCriterion("SALEPRICE =", value, "saleprice");
            return (Criteria) this;
        }

        public Criteria andSalepriceNotEqualTo(BigDecimal value) {
            addCriterion("SALEPRICE <>", value, "saleprice");
            return (Criteria) this;
        }

        public Criteria andSalepriceGreaterThan(BigDecimal value) {
            addCriterion("SALEPRICE >", value, "saleprice");
            return (Criteria) this;
        }

        public Criteria andSalepriceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("SALEPRICE >=", value, "saleprice");
            return (Criteria) this;
        }

        public Criteria andSalepriceLessThan(BigDecimal value) {
            addCriterion("SALEPRICE <", value, "saleprice");
            return (Criteria) this;
        }

        public Criteria andSalepriceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("SALEPRICE <=", value, "saleprice");
            return (Criteria) this;
        }

        public Criteria andSalepriceIn(List<BigDecimal> values) {
            addCriterion("SALEPRICE in", values, "saleprice");
            return (Criteria) this;
        }

        public Criteria andSalepriceNotIn(List<BigDecimal> values) {
            addCriterion("SALEPRICE not in", values, "saleprice");
            return (Criteria) this;
        }

        public Criteria andSalepriceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("SALEPRICE between", value1, value2, "saleprice");
            return (Criteria) this;
        }

        public Criteria andSalepriceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("SALEPRICE not between", value1, value2, "saleprice");
            return (Criteria) this;
        }

        public Criteria andCostIsNull() {
            addCriterion("COST is null");
            return (Criteria) this;
        }

        public Criteria andCostIsNotNull() {
            addCriterion("COST is not null");
            return (Criteria) this;
        }

        public Criteria andCostEqualTo(BigDecimal value) {
            addCriterion("COST =", value, "cost");
            return (Criteria) this;
        }

        public Criteria andCostNotEqualTo(BigDecimal value) {
            addCriterion("COST <>", value, "cost");
            return (Criteria) this;
        }

        public Criteria andCostGreaterThan(BigDecimal value) {
            addCriterion("COST >", value, "cost");
            return (Criteria) this;
        }

        public Criteria andCostGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("COST >=", value, "cost");
            return (Criteria) this;
        }

        public Criteria andCostLessThan(BigDecimal value) {
            addCriterion("COST <", value, "cost");
            return (Criteria) this;
        }

        public Criteria andCostLessThanOrEqualTo(BigDecimal value) {
            addCriterion("COST <=", value, "cost");
            return (Criteria) this;
        }

        public Criteria andCostIn(List<BigDecimal> values) {
            addCriterion("COST in", values, "cost");
            return (Criteria) this;
        }

        public Criteria andCostNotIn(List<BigDecimal> values) {
            addCriterion("COST not in", values, "cost");
            return (Criteria) this;
        }

        public Criteria andCostBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("COST between", value1, value2, "cost");
            return (Criteria) this;
        }

        public Criteria andCostNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("COST not between", value1, value2, "cost");
            return (Criteria) this;
        }

        public Criteria andCardpriceIsNull() {
            addCriterion("CARDPRICE is null");
            return (Criteria) this;
        }

        public Criteria andCardpriceIsNotNull() {
            addCriterion("CARDPRICE is not null");
            return (Criteria) this;
        }

        public Criteria andCardpriceEqualTo(BigDecimal value) {
            addCriterion("CARDPRICE =", value, "cardprice");
            return (Criteria) this;
        }

        public Criteria andCardpriceNotEqualTo(BigDecimal value) {
            addCriterion("CARDPRICE <>", value, "cardprice");
            return (Criteria) this;
        }

        public Criteria andCardpriceGreaterThan(BigDecimal value) {
            addCriterion("CARDPRICE >", value, "cardprice");
            return (Criteria) this;
        }

        public Criteria andCardpriceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("CARDPRICE >=", value, "cardprice");
            return (Criteria) this;
        }

        public Criteria andCardpriceLessThan(BigDecimal value) {
            addCriterion("CARDPRICE <", value, "cardprice");
            return (Criteria) this;
        }

        public Criteria andCardpriceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("CARDPRICE <=", value, "cardprice");
            return (Criteria) this;
        }

        public Criteria andCardpriceIn(List<BigDecimal> values) {
            addCriterion("CARDPRICE in", values, "cardprice");
            return (Criteria) this;
        }

        public Criteria andCardpriceNotIn(List<BigDecimal> values) {
            addCriterion("CARDPRICE not in", values, "cardprice");
            return (Criteria) this;
        }

        public Criteria andCardpriceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("CARDPRICE between", value1, value2, "cardprice");
            return (Criteria) this;
        }

        public Criteria andCardpriceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("CARDPRICE not between", value1, value2, "cardprice");
            return (Criteria) this;
        }

        public Criteria andReservapriceIsNull() {
            addCriterion("RESERVAPRICE is null");
            return (Criteria) this;
        }

        public Criteria andReservapriceIsNotNull() {
            addCriterion("RESERVAPRICE is not null");
            return (Criteria) this;
        }

        public Criteria andReservapriceEqualTo(BigDecimal value) {
            addCriterion("RESERVAPRICE =", value, "reservaprice");
            return (Criteria) this;
        }

        public Criteria andReservapriceNotEqualTo(BigDecimal value) {
            addCriterion("RESERVAPRICE <>", value, "reservaprice");
            return (Criteria) this;
        }

        public Criteria andReservapriceGreaterThan(BigDecimal value) {
            addCriterion("RESERVAPRICE >", value, "reservaprice");
            return (Criteria) this;
        }

        public Criteria andReservapriceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("RESERVAPRICE >=", value, "reservaprice");
            return (Criteria) this;
        }

        public Criteria andReservapriceLessThan(BigDecimal value) {
            addCriterion("RESERVAPRICE <", value, "reservaprice");
            return (Criteria) this;
        }

        public Criteria andReservapriceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("RESERVAPRICE <=", value, "reservaprice");
            return (Criteria) this;
        }

        public Criteria andReservapriceIn(List<BigDecimal> values) {
            addCriterion("RESERVAPRICE in", values, "reservaprice");
            return (Criteria) this;
        }

        public Criteria andReservapriceNotIn(List<BigDecimal> values) {
            addCriterion("RESERVAPRICE not in", values, "reservaprice");
            return (Criteria) this;
        }

        public Criteria andReservapriceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("RESERVAPRICE between", value1, value2, "reservaprice");
            return (Criteria) this;
        }

        public Criteria andReservapriceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("RESERVAPRICE not between", value1, value2, "reservaprice");
            return (Criteria) this;
        }

        public Criteria andResourcesbrandcodeIsNull() {
            addCriterion("RESOURCESBRANDCODE is null");
            return (Criteria) this;
        }

        public Criteria andResourcesbrandcodeIsNotNull() {
            addCriterion("RESOURCESBRANDCODE is not null");
            return (Criteria) this;
        }

        public Criteria andResourcesbrandcodeEqualTo(String value) {
            addCriterion("RESOURCESBRANDCODE =", value, "resourcesbrandcode");
            return (Criteria) this;
        }

        public Criteria andResourcesbrandcodeNotEqualTo(String value) {
            addCriterion("RESOURCESBRANDCODE <>", value, "resourcesbrandcode");
            return (Criteria) this;
        }

        public Criteria andResourcesbrandcodeGreaterThan(String value) {
            addCriterion("RESOURCESBRANDCODE >", value, "resourcesbrandcode");
            return (Criteria) this;
        }

        public Criteria andResourcesbrandcodeGreaterThanOrEqualTo(String value) {
            addCriterion("RESOURCESBRANDCODE >=", value, "resourcesbrandcode");
            return (Criteria) this;
        }

        public Criteria andResourcesbrandcodeLessThan(String value) {
            addCriterion("RESOURCESBRANDCODE <", value, "resourcesbrandcode");
            return (Criteria) this;
        }

        public Criteria andResourcesbrandcodeLessThanOrEqualTo(String value) {
            addCriterion("RESOURCESBRANDCODE <=", value, "resourcesbrandcode");
            return (Criteria) this;
        }

        public Criteria andResourcesbrandcodeLike(String value) {
            addCriterion("RESOURCESBRANDCODE like", value, "resourcesbrandcode");
            return (Criteria) this;
        }

        public Criteria andResourcesbrandcodeNotLike(String value) {
            addCriterion("RESOURCESBRANDCODE not like", value, "resourcesbrandcode");
            return (Criteria) this;
        }

        public Criteria andResourcesbrandcodeIn(List<String> values) {
            addCriterion("RESOURCESBRANDCODE in", values, "resourcesbrandcode");
            return (Criteria) this;
        }

        public Criteria andResourcesbrandcodeNotIn(List<String> values) {
            addCriterion("RESOURCESBRANDCODE not in", values, "resourcesbrandcode");
            return (Criteria) this;
        }

        public Criteria andResourcesbrandcodeBetween(String value1, String value2) {
            addCriterion("RESOURCESBRANDCODE between", value1, value2, "resourcesbrandcode");
            return (Criteria) this;
        }

        public Criteria andResourcesbrandcodeNotBetween(String value1, String value2) {
            addCriterion("RESOURCESBRANDCODE not between", value1, value2, "resourcesbrandcode");
            return (Criteria) this;
        }

        public Criteria andOrgdevicebrandcodeIsNull() {
            addCriterion("ORGDEVICEBRANDCODE is null");
            return (Criteria) this;
        }

        public Criteria andOrgdevicebrandcodeIsNotNull() {
            addCriterion("ORGDEVICEBRANDCODE is not null");
            return (Criteria) this;
        }

        public Criteria andOrgdevicebrandcodeEqualTo(String value) {
            addCriterion("ORGDEVICEBRANDCODE =", value, "orgdevicebrandcode");
            return (Criteria) this;
        }

        public Criteria andOrgdevicebrandcodeNotEqualTo(String value) {
            addCriterion("ORGDEVICEBRANDCODE <>", value, "orgdevicebrandcode");
            return (Criteria) this;
        }

        public Criteria andOrgdevicebrandcodeGreaterThan(String value) {
            addCriterion("ORGDEVICEBRANDCODE >", value, "orgdevicebrandcode");
            return (Criteria) this;
        }

        public Criteria andOrgdevicebrandcodeGreaterThanOrEqualTo(String value) {
            addCriterion("ORGDEVICEBRANDCODE >=", value, "orgdevicebrandcode");
            return (Criteria) this;
        }

        public Criteria andOrgdevicebrandcodeLessThan(String value) {
            addCriterion("ORGDEVICEBRANDCODE <", value, "orgdevicebrandcode");
            return (Criteria) this;
        }

        public Criteria andOrgdevicebrandcodeLessThanOrEqualTo(String value) {
            addCriterion("ORGDEVICEBRANDCODE <=", value, "orgdevicebrandcode");
            return (Criteria) this;
        }

        public Criteria andOrgdevicebrandcodeLike(String value) {
            addCriterion("ORGDEVICEBRANDCODE like", value, "orgdevicebrandcode");
            return (Criteria) this;
        }

        public Criteria andOrgdevicebrandcodeNotLike(String value) {
            addCriterion("ORGDEVICEBRANDCODE not like", value, "orgdevicebrandcode");
            return (Criteria) this;
        }

        public Criteria andOrgdevicebrandcodeIn(List<String> values) {
            addCriterion("ORGDEVICEBRANDCODE in", values, "orgdevicebrandcode");
            return (Criteria) this;
        }

        public Criteria andOrgdevicebrandcodeNotIn(List<String> values) {
            addCriterion("ORGDEVICEBRANDCODE not in", values, "orgdevicebrandcode");
            return (Criteria) this;
        }

        public Criteria andOrgdevicebrandcodeBetween(String value1, String value2) {
            addCriterion("ORGDEVICEBRANDCODE between", value1, value2, "orgdevicebrandcode");
            return (Criteria) this;
        }

        public Criteria andOrgdevicebrandcodeNotBetween(String value1, String value2) {
            addCriterion("ORGDEVICEBRANDCODE not between", value1, value2, "orgdevicebrandcode");
            return (Criteria) this;
        }

        public Criteria andResourcesbrandnameIsNull() {
            addCriterion("RESOURCESBRANDNAME is null");
            return (Criteria) this;
        }

        public Criteria andResourcesbrandnameIsNotNull() {
            addCriterion("RESOURCESBRANDNAME is not null");
            return (Criteria) this;
        }

        public Criteria andResourcesbrandnameEqualTo(String value) {
            addCriterion("RESOURCESBRANDNAME =", value, "resourcesbrandname");
            return (Criteria) this;
        }

        public Criteria andResourcesbrandnameNotEqualTo(String value) {
            addCriterion("RESOURCESBRANDNAME <>", value, "resourcesbrandname");
            return (Criteria) this;
        }

        public Criteria andResourcesbrandnameGreaterThan(String value) {
            addCriterion("RESOURCESBRANDNAME >", value, "resourcesbrandname");
            return (Criteria) this;
        }

        public Criteria andResourcesbrandnameGreaterThanOrEqualTo(String value) {
            addCriterion("RESOURCESBRANDNAME >=", value, "resourcesbrandname");
            return (Criteria) this;
        }

        public Criteria andResourcesbrandnameLessThan(String value) {
            addCriterion("RESOURCESBRANDNAME <", value, "resourcesbrandname");
            return (Criteria) this;
        }

        public Criteria andResourcesbrandnameLessThanOrEqualTo(String value) {
            addCriterion("RESOURCESBRANDNAME <=", value, "resourcesbrandname");
            return (Criteria) this;
        }

        public Criteria andResourcesbrandnameLike(String value) {
            addCriterion("RESOURCESBRANDNAME like", value, "resourcesbrandname");
            return (Criteria) this;
        }

        public Criteria andResourcesbrandnameNotLike(String value) {
            addCriterion("RESOURCESBRANDNAME not like", value, "resourcesbrandname");
            return (Criteria) this;
        }

        public Criteria andResourcesbrandnameIn(List<String> values) {
            addCriterion("RESOURCESBRANDNAME in", values, "resourcesbrandname");
            return (Criteria) this;
        }

        public Criteria andResourcesbrandnameNotIn(List<String> values) {
            addCriterion("RESOURCESBRANDNAME not in", values, "resourcesbrandname");
            return (Criteria) this;
        }

        public Criteria andResourcesbrandnameBetween(String value1, String value2) {
            addCriterion("RESOURCESBRANDNAME between", value1, value2, "resourcesbrandname");
            return (Criteria) this;
        }

        public Criteria andResourcesbrandnameNotBetween(String value1, String value2) {
            addCriterion("RESOURCESBRANDNAME not between", value1, value2, "resourcesbrandname");
            return (Criteria) this;
        }

        public Criteria andResourcesmodelcodeIsNull() {
            addCriterion("RESOURCESMODELCODE is null");
            return (Criteria) this;
        }

        public Criteria andResourcesmodelcodeIsNotNull() {
            addCriterion("RESOURCESMODELCODE is not null");
            return (Criteria) this;
        }

        public Criteria andResourcesmodelcodeEqualTo(String value) {
            addCriterion("RESOURCESMODELCODE =", value, "resourcesmodelcode");
            return (Criteria) this;
        }

        public Criteria andResourcesmodelcodeNotEqualTo(String value) {
            addCriterion("RESOURCESMODELCODE <>", value, "resourcesmodelcode");
            return (Criteria) this;
        }

        public Criteria andResourcesmodelcodeGreaterThan(String value) {
            addCriterion("RESOURCESMODELCODE >", value, "resourcesmodelcode");
            return (Criteria) this;
        }

        public Criteria andResourcesmodelcodeGreaterThanOrEqualTo(String value) {
            addCriterion("RESOURCESMODELCODE >=", value, "resourcesmodelcode");
            return (Criteria) this;
        }

        public Criteria andResourcesmodelcodeLessThan(String value) {
            addCriterion("RESOURCESMODELCODE <", value, "resourcesmodelcode");
            return (Criteria) this;
        }

        public Criteria andResourcesmodelcodeLessThanOrEqualTo(String value) {
            addCriterion("RESOURCESMODELCODE <=", value, "resourcesmodelcode");
            return (Criteria) this;
        }

        public Criteria andResourcesmodelcodeLike(String value) {
            addCriterion("RESOURCESMODELCODE like", value, "resourcesmodelcode");
            return (Criteria) this;
        }

        public Criteria andResourcesmodelcodeNotLike(String value) {
            addCriterion("RESOURCESMODELCODE not like", value, "resourcesmodelcode");
            return (Criteria) this;
        }

        public Criteria andResourcesmodelcodeIn(List<String> values) {
            addCriterion("RESOURCESMODELCODE in", values, "resourcesmodelcode");
            return (Criteria) this;
        }

        public Criteria andResourcesmodelcodeNotIn(List<String> values) {
            addCriterion("RESOURCESMODELCODE not in", values, "resourcesmodelcode");
            return (Criteria) this;
        }

        public Criteria andResourcesmodelcodeBetween(String value1, String value2) {
            addCriterion("RESOURCESMODELCODE between", value1, value2, "resourcesmodelcode");
            return (Criteria) this;
        }

        public Criteria andResourcesmodelcodeNotBetween(String value1, String value2) {
            addCriterion("RESOURCESMODELCODE not between", value1, value2, "resourcesmodelcode");
            return (Criteria) this;
        }

        public Criteria andResourcesmodelnameIsNull() {
            addCriterion("RESOURCESMODELNAME is null");
            return (Criteria) this;
        }

        public Criteria andResourcesmodelnameIsNotNull() {
            addCriterion("RESOURCESMODELNAME is not null");
            return (Criteria) this;
        }

        public Criteria andResourcesmodelnameEqualTo(String value) {
            addCriterion("RESOURCESMODELNAME =", value, "resourcesmodelname");
            return (Criteria) this;
        }

        public Criteria andResourcesmodelnameNotEqualTo(String value) {
            addCriterion("RESOURCESMODELNAME <>", value, "resourcesmodelname");
            return (Criteria) this;
        }

        public Criteria andResourcesmodelnameGreaterThan(String value) {
            addCriterion("RESOURCESMODELNAME >", value, "resourcesmodelname");
            return (Criteria) this;
        }

        public Criteria andResourcesmodelnameGreaterThanOrEqualTo(String value) {
            addCriterion("RESOURCESMODELNAME >=", value, "resourcesmodelname");
            return (Criteria) this;
        }

        public Criteria andResourcesmodelnameLessThan(String value) {
            addCriterion("RESOURCESMODELNAME <", value, "resourcesmodelname");
            return (Criteria) this;
        }

        public Criteria andResourcesmodelnameLessThanOrEqualTo(String value) {
            addCriterion("RESOURCESMODELNAME <=", value, "resourcesmodelname");
            return (Criteria) this;
        }

        public Criteria andResourcesmodelnameLike(String value) {
            addCriterion("RESOURCESMODELNAME like", value, "resourcesmodelname");
            return (Criteria) this;
        }

        public Criteria andResourcesmodelnameNotLike(String value) {
            addCriterion("RESOURCESMODELNAME not like", value, "resourcesmodelname");
            return (Criteria) this;
        }

        public Criteria andResourcesmodelnameIn(List<String> values) {
            addCriterion("RESOURCESMODELNAME in", values, "resourcesmodelname");
            return (Criteria) this;
        }

        public Criteria andResourcesmodelnameNotIn(List<String> values) {
            addCriterion("RESOURCESMODELNAME not in", values, "resourcesmodelname");
            return (Criteria) this;
        }

        public Criteria andResourcesmodelnameBetween(String value1, String value2) {
            addCriterion("RESOURCESMODELNAME between", value1, value2, "resourcesmodelname");
            return (Criteria) this;
        }

        public Criteria andResourcesmodelnameNotBetween(String value1, String value2) {
            addCriterion("RESOURCESMODELNAME not between", value1, value2, "resourcesmodelname");
            return (Criteria) this;
        }

        public Criteria andResourcessrccodeIsNull() {
            addCriterion("RESOURCESSRCCODE is null");
            return (Criteria) this;
        }

        public Criteria andResourcessrccodeIsNotNull() {
            addCriterion("RESOURCESSRCCODE is not null");
            return (Criteria) this;
        }

        public Criteria andResourcessrccodeEqualTo(String value) {
            addCriterion("RESOURCESSRCCODE =", value, "resourcessrccode");
            return (Criteria) this;
        }

        public Criteria andResourcessrccodeNotEqualTo(String value) {
            addCriterion("RESOURCESSRCCODE <>", value, "resourcessrccode");
            return (Criteria) this;
        }

        public Criteria andResourcessrccodeGreaterThan(String value) {
            addCriterion("RESOURCESSRCCODE >", value, "resourcessrccode");
            return (Criteria) this;
        }

        public Criteria andResourcessrccodeGreaterThanOrEqualTo(String value) {
            addCriterion("RESOURCESSRCCODE >=", value, "resourcessrccode");
            return (Criteria) this;
        }

        public Criteria andResourcessrccodeLessThan(String value) {
            addCriterion("RESOURCESSRCCODE <", value, "resourcessrccode");
            return (Criteria) this;
        }

        public Criteria andResourcessrccodeLessThanOrEqualTo(String value) {
            addCriterion("RESOURCESSRCCODE <=", value, "resourcessrccode");
            return (Criteria) this;
        }

        public Criteria andResourcessrccodeLike(String value) {
            addCriterion("RESOURCESSRCCODE like", value, "resourcessrccode");
            return (Criteria) this;
        }

        public Criteria andResourcessrccodeNotLike(String value) {
            addCriterion("RESOURCESSRCCODE not like", value, "resourcessrccode");
            return (Criteria) this;
        }

        public Criteria andResourcessrccodeIn(List<String> values) {
            addCriterion("RESOURCESSRCCODE in", values, "resourcessrccode");
            return (Criteria) this;
        }

        public Criteria andResourcessrccodeNotIn(List<String> values) {
            addCriterion("RESOURCESSRCCODE not in", values, "resourcessrccode");
            return (Criteria) this;
        }

        public Criteria andResourcessrccodeBetween(String value1, String value2) {
            addCriterion("RESOURCESSRCCODE between", value1, value2, "resourcessrccode");
            return (Criteria) this;
        }

        public Criteria andResourcessrccodeNotBetween(String value1, String value2) {
            addCriterion("RESOURCESSRCCODE not between", value1, value2, "resourcessrccode");
            return (Criteria) this;
        }

        public Criteria andResourcessrcnameIsNull() {
            addCriterion("RESOURCESSRCNAME is null");
            return (Criteria) this;
        }

        public Criteria andResourcessrcnameIsNotNull() {
            addCriterion("RESOURCESSRCNAME is not null");
            return (Criteria) this;
        }

        public Criteria andResourcessrcnameEqualTo(String value) {
            addCriterion("RESOURCESSRCNAME =", value, "resourcessrcname");
            return (Criteria) this;
        }

        public Criteria andResourcessrcnameNotEqualTo(String value) {
            addCriterion("RESOURCESSRCNAME <>", value, "resourcessrcname");
            return (Criteria) this;
        }

        public Criteria andResourcessrcnameGreaterThan(String value) {
            addCriterion("RESOURCESSRCNAME >", value, "resourcessrcname");
            return (Criteria) this;
        }

        public Criteria andResourcessrcnameGreaterThanOrEqualTo(String value) {
            addCriterion("RESOURCESSRCNAME >=", value, "resourcessrcname");
            return (Criteria) this;
        }

        public Criteria andResourcessrcnameLessThan(String value) {
            addCriterion("RESOURCESSRCNAME <", value, "resourcessrcname");
            return (Criteria) this;
        }

        public Criteria andResourcessrcnameLessThanOrEqualTo(String value) {
            addCriterion("RESOURCESSRCNAME <=", value, "resourcessrcname");
            return (Criteria) this;
        }

        public Criteria andResourcessrcnameLike(String value) {
            addCriterion("RESOURCESSRCNAME like", value, "resourcessrcname");
            return (Criteria) this;
        }

        public Criteria andResourcessrcnameNotLike(String value) {
            addCriterion("RESOURCESSRCNAME not like", value, "resourcessrcname");
            return (Criteria) this;
        }

        public Criteria andResourcessrcnameIn(List<String> values) {
            addCriterion("RESOURCESSRCNAME in", values, "resourcessrcname");
            return (Criteria) this;
        }

        public Criteria andResourcessrcnameNotIn(List<String> values) {
            addCriterion("RESOURCESSRCNAME not in", values, "resourcessrcname");
            return (Criteria) this;
        }

        public Criteria andResourcessrcnameBetween(String value1, String value2) {
            addCriterion("RESOURCESSRCNAME between", value1, value2, "resourcessrcname");
            return (Criteria) this;
        }

        public Criteria andResourcessrcnameNotBetween(String value1, String value2) {
            addCriterion("RESOURCESSRCNAME not between", value1, value2, "resourcessrcname");
            return (Criteria) this;
        }

        public Criteria andResourcessupplycorpIsNull() {
            addCriterion("RESOURCESSUPPLYCORP is null");
            return (Criteria) this;
        }

        public Criteria andResourcessupplycorpIsNotNull() {
            addCriterion("RESOURCESSUPPLYCORP is not null");
            return (Criteria) this;
        }

        public Criteria andResourcessupplycorpEqualTo(String value) {
            addCriterion("RESOURCESSUPPLYCORP =", value, "resourcessupplycorp");
            return (Criteria) this;
        }

        public Criteria andResourcessupplycorpNotEqualTo(String value) {
            addCriterion("RESOURCESSUPPLYCORP <>", value, "resourcessupplycorp");
            return (Criteria) this;
        }

        public Criteria andResourcessupplycorpGreaterThan(String value) {
            addCriterion("RESOURCESSUPPLYCORP >", value, "resourcessupplycorp");
            return (Criteria) this;
        }

        public Criteria andResourcessupplycorpGreaterThanOrEqualTo(String value) {
            addCriterion("RESOURCESSUPPLYCORP >=", value, "resourcessupplycorp");
            return (Criteria) this;
        }

        public Criteria andResourcessupplycorpLessThan(String value) {
            addCriterion("RESOURCESSUPPLYCORP <", value, "resourcessupplycorp");
            return (Criteria) this;
        }

        public Criteria andResourcessupplycorpLessThanOrEqualTo(String value) {
            addCriterion("RESOURCESSUPPLYCORP <=", value, "resourcessupplycorp");
            return (Criteria) this;
        }

        public Criteria andResourcessupplycorpLike(String value) {
            addCriterion("RESOURCESSUPPLYCORP like", value, "resourcessupplycorp");
            return (Criteria) this;
        }

        public Criteria andResourcessupplycorpNotLike(String value) {
            addCriterion("RESOURCESSUPPLYCORP not like", value, "resourcessupplycorp");
            return (Criteria) this;
        }

        public Criteria andResourcessupplycorpIn(List<String> values) {
            addCriterion("RESOURCESSUPPLYCORP in", values, "resourcessupplycorp");
            return (Criteria) this;
        }

        public Criteria andResourcessupplycorpNotIn(List<String> values) {
            addCriterion("RESOURCESSUPPLYCORP not in", values, "resourcessupplycorp");
            return (Criteria) this;
        }

        public Criteria andResourcessupplycorpBetween(String value1, String value2) {
            addCriterion("RESOURCESSUPPLYCORP between", value1, value2, "resourcessupplycorp");
            return (Criteria) this;
        }

        public Criteria andResourcessupplycorpNotBetween(String value1, String value2) {
            addCriterion("RESOURCESSUPPLYCORP not between", value1, value2, "resourcessupplycorp");
            return (Criteria) this;
        }

        public Criteria andResourcesservicecorpIsNull() {
            addCriterion("RESOURCESSERVICECORP is null");
            return (Criteria) this;
        }

        public Criteria andResourcesservicecorpIsNotNull() {
            addCriterion("RESOURCESSERVICECORP is not null");
            return (Criteria) this;
        }

        public Criteria andResourcesservicecorpEqualTo(String value) {
            addCriterion("RESOURCESSERVICECORP =", value, "resourcesservicecorp");
            return (Criteria) this;
        }

        public Criteria andResourcesservicecorpNotEqualTo(String value) {
            addCriterion("RESOURCESSERVICECORP <>", value, "resourcesservicecorp");
            return (Criteria) this;
        }

        public Criteria andResourcesservicecorpGreaterThan(String value) {
            addCriterion("RESOURCESSERVICECORP >", value, "resourcesservicecorp");
            return (Criteria) this;
        }

        public Criteria andResourcesservicecorpGreaterThanOrEqualTo(String value) {
            addCriterion("RESOURCESSERVICECORP >=", value, "resourcesservicecorp");
            return (Criteria) this;
        }

        public Criteria andResourcesservicecorpLessThan(String value) {
            addCriterion("RESOURCESSERVICECORP <", value, "resourcesservicecorp");
            return (Criteria) this;
        }

        public Criteria andResourcesservicecorpLessThanOrEqualTo(String value) {
            addCriterion("RESOURCESSERVICECORP <=", value, "resourcesservicecorp");
            return (Criteria) this;
        }

        public Criteria andResourcesservicecorpLike(String value) {
            addCriterion("RESOURCESSERVICECORP like", value, "resourcesservicecorp");
            return (Criteria) this;
        }

        public Criteria andResourcesservicecorpNotLike(String value) {
            addCriterion("RESOURCESSERVICECORP not like", value, "resourcesservicecorp");
            return (Criteria) this;
        }

        public Criteria andResourcesservicecorpIn(List<String> values) {
            addCriterion("RESOURCESSERVICECORP in", values, "resourcesservicecorp");
            return (Criteria) this;
        }

        public Criteria andResourcesservicecorpNotIn(List<String> values) {
            addCriterion("RESOURCESSERVICECORP not in", values, "resourcesservicecorp");
            return (Criteria) this;
        }

        public Criteria andResourcesservicecorpBetween(String value1, String value2) {
            addCriterion("RESOURCESSERVICECORP between", value1, value2, "resourcesservicecorp");
            return (Criteria) this;
        }

        public Criteria andResourcesservicecorpNotBetween(String value1, String value2) {
            addCriterion("RESOURCESSERVICECORP not between", value1, value2, "resourcesservicecorp");
            return (Criteria) this;
        }

        public Criteria andResourcescolorIsNull() {
            addCriterion("RESOURCESCOLOR is null");
            return (Criteria) this;
        }

        public Criteria andResourcescolorIsNotNull() {
            addCriterion("RESOURCESCOLOR is not null");
            return (Criteria) this;
        }

        public Criteria andResourcescolorEqualTo(String value) {
            addCriterion("RESOURCESCOLOR =", value, "resourcescolor");
            return (Criteria) this;
        }

        public Criteria andResourcescolorNotEqualTo(String value) {
            addCriterion("RESOURCESCOLOR <>", value, "resourcescolor");
            return (Criteria) this;
        }

        public Criteria andResourcescolorGreaterThan(String value) {
            addCriterion("RESOURCESCOLOR >", value, "resourcescolor");
            return (Criteria) this;
        }

        public Criteria andResourcescolorGreaterThanOrEqualTo(String value) {
            addCriterion("RESOURCESCOLOR >=", value, "resourcescolor");
            return (Criteria) this;
        }

        public Criteria andResourcescolorLessThan(String value) {
            addCriterion("RESOURCESCOLOR <", value, "resourcescolor");
            return (Criteria) this;
        }

        public Criteria andResourcescolorLessThanOrEqualTo(String value) {
            addCriterion("RESOURCESCOLOR <=", value, "resourcescolor");
            return (Criteria) this;
        }

        public Criteria andResourcescolorLike(String value) {
            addCriterion("RESOURCESCOLOR like", value, "resourcescolor");
            return (Criteria) this;
        }

        public Criteria andResourcescolorNotLike(String value) {
            addCriterion("RESOURCESCOLOR not like", value, "resourcescolor");
            return (Criteria) this;
        }

        public Criteria andResourcescolorIn(List<String> values) {
            addCriterion("RESOURCESCOLOR in", values, "resourcescolor");
            return (Criteria) this;
        }

        public Criteria andResourcescolorNotIn(List<String> values) {
            addCriterion("RESOURCESCOLOR not in", values, "resourcescolor");
            return (Criteria) this;
        }

        public Criteria andResourcescolorBetween(String value1, String value2) {
            addCriterion("RESOURCESCOLOR between", value1, value2, "resourcescolor");
            return (Criteria) this;
        }

        public Criteria andResourcescolorNotBetween(String value1, String value2) {
            addCriterion("RESOURCESCOLOR not between", value1, value2, "resourcescolor");
            return (Criteria) this;
        }

        public Criteria andMachinetypecodeIsNull() {
            addCriterion("MACHINETYPECODE is null");
            return (Criteria) this;
        }

        public Criteria andMachinetypecodeIsNotNull() {
            addCriterion("MACHINETYPECODE is not null");
            return (Criteria) this;
        }

        public Criteria andMachinetypecodeEqualTo(String value) {
            addCriterion("MACHINETYPECODE =", value, "machinetypecode");
            return (Criteria) this;
        }

        public Criteria andMachinetypecodeNotEqualTo(String value) {
            addCriterion("MACHINETYPECODE <>", value, "machinetypecode");
            return (Criteria) this;
        }

        public Criteria andMachinetypecodeGreaterThan(String value) {
            addCriterion("MACHINETYPECODE >", value, "machinetypecode");
            return (Criteria) this;
        }

        public Criteria andMachinetypecodeGreaterThanOrEqualTo(String value) {
            addCriterion("MACHINETYPECODE >=", value, "machinetypecode");
            return (Criteria) this;
        }

        public Criteria andMachinetypecodeLessThan(String value) {
            addCriterion("MACHINETYPECODE <", value, "machinetypecode");
            return (Criteria) this;
        }

        public Criteria andMachinetypecodeLessThanOrEqualTo(String value) {
            addCriterion("MACHINETYPECODE <=", value, "machinetypecode");
            return (Criteria) this;
        }

        public Criteria andMachinetypecodeLike(String value) {
            addCriterion("MACHINETYPECODE like", value, "machinetypecode");
            return (Criteria) this;
        }

        public Criteria andMachinetypecodeNotLike(String value) {
            addCriterion("MACHINETYPECODE not like", value, "machinetypecode");
            return (Criteria) this;
        }

        public Criteria andMachinetypecodeIn(List<String> values) {
            addCriterion("MACHINETYPECODE in", values, "machinetypecode");
            return (Criteria) this;
        }

        public Criteria andMachinetypecodeNotIn(List<String> values) {
            addCriterion("MACHINETYPECODE not in", values, "machinetypecode");
            return (Criteria) this;
        }

        public Criteria andMachinetypecodeBetween(String value1, String value2) {
            addCriterion("MACHINETYPECODE between", value1, value2, "machinetypecode");
            return (Criteria) this;
        }

        public Criteria andMachinetypecodeNotBetween(String value1, String value2) {
            addCriterion("MACHINETYPECODE not between", value1, value2, "machinetypecode");
            return (Criteria) this;
        }

        public Criteria andMachinetypenameIsNull() {
            addCriterion("MACHINETYPENAME is null");
            return (Criteria) this;
        }

        public Criteria andMachinetypenameIsNotNull() {
            addCriterion("MACHINETYPENAME is not null");
            return (Criteria) this;
        }

        public Criteria andMachinetypenameEqualTo(String value) {
            addCriterion("MACHINETYPENAME =", value, "machinetypename");
            return (Criteria) this;
        }

        public Criteria andMachinetypenameNotEqualTo(String value) {
            addCriterion("MACHINETYPENAME <>", value, "machinetypename");
            return (Criteria) this;
        }

        public Criteria andMachinetypenameGreaterThan(String value) {
            addCriterion("MACHINETYPENAME >", value, "machinetypename");
            return (Criteria) this;
        }

        public Criteria andMachinetypenameGreaterThanOrEqualTo(String value) {
            addCriterion("MACHINETYPENAME >=", value, "machinetypename");
            return (Criteria) this;
        }

        public Criteria andMachinetypenameLessThan(String value) {
            addCriterion("MACHINETYPENAME <", value, "machinetypename");
            return (Criteria) this;
        }

        public Criteria andMachinetypenameLessThanOrEqualTo(String value) {
            addCriterion("MACHINETYPENAME <=", value, "machinetypename");
            return (Criteria) this;
        }

        public Criteria andMachinetypenameLike(String value) {
            addCriterion("MACHINETYPENAME like", value, "machinetypename");
            return (Criteria) this;
        }

        public Criteria andMachinetypenameNotLike(String value) {
            addCriterion("MACHINETYPENAME not like", value, "machinetypename");
            return (Criteria) this;
        }

        public Criteria andMachinetypenameIn(List<String> values) {
            addCriterion("MACHINETYPENAME in", values, "machinetypename");
            return (Criteria) this;
        }

        public Criteria andMachinetypenameNotIn(List<String> values) {
            addCriterion("MACHINETYPENAME not in", values, "machinetypename");
            return (Criteria) this;
        }

        public Criteria andMachinetypenameBetween(String value1, String value2) {
            addCriterion("MACHINETYPENAME between", value1, value2, "machinetypename");
            return (Criteria) this;
        }

        public Criteria andMachinetypenameNotBetween(String value1, String value2) {
            addCriterion("MACHINETYPENAME not between", value1, value2, "machinetypename");
            return (Criteria) this;
        }

        public Criteria andTerminaltypeIsNull() {
            addCriterion("TERMINALTYPE is null");
            return (Criteria) this;
        }

        public Criteria andTerminaltypeIsNotNull() {
            addCriterion("TERMINALTYPE is not null");
            return (Criteria) this;
        }

        public Criteria andTerminaltypeEqualTo(String value) {
            addCriterion("TERMINALTYPE =", value, "terminaltype");
            return (Criteria) this;
        }

        public Criteria andTerminaltypeNotEqualTo(String value) {
            addCriterion("TERMINALTYPE <>", value, "terminaltype");
            return (Criteria) this;
        }

        public Criteria andTerminaltypeGreaterThan(String value) {
            addCriterion("TERMINALTYPE >", value, "terminaltype");
            return (Criteria) this;
        }

        public Criteria andTerminaltypeGreaterThanOrEqualTo(String value) {
            addCriterion("TERMINALTYPE >=", value, "terminaltype");
            return (Criteria) this;
        }

        public Criteria andTerminaltypeLessThan(String value) {
            addCriterion("TERMINALTYPE <", value, "terminaltype");
            return (Criteria) this;
        }

        public Criteria andTerminaltypeLessThanOrEqualTo(String value) {
            addCriterion("TERMINALTYPE <=", value, "terminaltype");
            return (Criteria) this;
        }

        public Criteria andTerminaltypeLike(String value) {
            addCriterion("TERMINALTYPE like", value, "terminaltype");
            return (Criteria) this;
        }

        public Criteria andTerminaltypeNotLike(String value) {
            addCriterion("TERMINALTYPE not like", value, "terminaltype");
            return (Criteria) this;
        }

        public Criteria andTerminaltypeIn(List<String> values) {
            addCriterion("TERMINALTYPE in", values, "terminaltype");
            return (Criteria) this;
        }

        public Criteria andTerminaltypeNotIn(List<String> values) {
            addCriterion("TERMINALTYPE not in", values, "terminaltype");
            return (Criteria) this;
        }

        public Criteria andTerminaltypeBetween(String value1, String value2) {
            addCriterion("TERMINALTYPE between", value1, value2, "terminaltype");
            return (Criteria) this;
        }

        public Criteria andTerminaltypeNotBetween(String value1, String value2) {
            addCriterion("TERMINALTYPE not between", value1, value2, "terminaltype");
            return (Criteria) this;
        }

        public Criteria andTerminaltsubtypeIsNull() {
            addCriterion("TERMINALTSUBTYPE is null");
            return (Criteria) this;
        }

        public Criteria andTerminaltsubtypeIsNotNull() {
            addCriterion("TERMINALTSUBTYPE is not null");
            return (Criteria) this;
        }

        public Criteria andTerminaltsubtypeEqualTo(String value) {
            addCriterion("TERMINALTSUBTYPE =", value, "terminaltsubtype");
            return (Criteria) this;
        }

        public Criteria andTerminaltsubtypeNotEqualTo(String value) {
            addCriterion("TERMINALTSUBTYPE <>", value, "terminaltsubtype");
            return (Criteria) this;
        }

        public Criteria andTerminaltsubtypeGreaterThan(String value) {
            addCriterion("TERMINALTSUBTYPE >", value, "terminaltsubtype");
            return (Criteria) this;
        }

        public Criteria andTerminaltsubtypeGreaterThanOrEqualTo(String value) {
            addCriterion("TERMINALTSUBTYPE >=", value, "terminaltsubtype");
            return (Criteria) this;
        }

        public Criteria andTerminaltsubtypeLessThan(String value) {
            addCriterion("TERMINALTSUBTYPE <", value, "terminaltsubtype");
            return (Criteria) this;
        }

        public Criteria andTerminaltsubtypeLessThanOrEqualTo(String value) {
            addCriterion("TERMINALTSUBTYPE <=", value, "terminaltsubtype");
            return (Criteria) this;
        }

        public Criteria andTerminaltsubtypeLike(String value) {
            addCriterion("TERMINALTSUBTYPE like", value, "terminaltsubtype");
            return (Criteria) this;
        }

        public Criteria andTerminaltsubtypeNotLike(String value) {
            addCriterion("TERMINALTSUBTYPE not like", value, "terminaltsubtype");
            return (Criteria) this;
        }

        public Criteria andTerminaltsubtypeIn(List<String> values) {
            addCriterion("TERMINALTSUBTYPE in", values, "terminaltsubtype");
            return (Criteria) this;
        }

        public Criteria andTerminaltsubtypeNotIn(List<String> values) {
            addCriterion("TERMINALTSUBTYPE not in", values, "terminaltsubtype");
            return (Criteria) this;
        }

        public Criteria andTerminaltsubtypeBetween(String value1, String value2) {
            addCriterion("TERMINALTSUBTYPE between", value1, value2, "terminaltsubtype");
            return (Criteria) this;
        }

        public Criteria andTerminaltsubtypeNotBetween(String value1, String value2) {
            addCriterion("TERMINALTSUBTYPE not between", value1, value2, "terminaltsubtype");
            return (Criteria) this;
        }

        public Criteria andSimidIsNull() {
            addCriterion("SIMID is null");
            return (Criteria) this;
        }

        public Criteria andSimidIsNotNull() {
            addCriterion("SIMID is not null");
            return (Criteria) this;
        }

        public Criteria andSimidEqualTo(Integer value) {
            addCriterion("SIMID =", value, "simid");
            return (Criteria) this;
        }

        public Criteria andSimidNotEqualTo(Integer value) {
            addCriterion("SIMID <>", value, "simid");
            return (Criteria) this;
        }

        public Criteria andSimidGreaterThan(Integer value) {
            addCriterion("SIMID >", value, "simid");
            return (Criteria) this;
        }

        public Criteria andSimidGreaterThanOrEqualTo(Integer value) {
            addCriterion("SIMID >=", value, "simid");
            return (Criteria) this;
        }

        public Criteria andSimidLessThan(Integer value) {
            addCriterion("SIMID <", value, "simid");
            return (Criteria) this;
        }

        public Criteria andSimidLessThanOrEqualTo(Integer value) {
            addCriterion("SIMID <=", value, "simid");
            return (Criteria) this;
        }

        public Criteria andSimidIn(List<Integer> values) {
            addCriterion("SIMID in", values, "simid");
            return (Criteria) this;
        }

        public Criteria andSimidNotIn(List<Integer> values) {
            addCriterion("SIMID not in", values, "simid");
            return (Criteria) this;
        }

        public Criteria andSimidBetween(Integer value1, Integer value2) {
            addCriterion("SIMID between", value1, value2, "simid");
            return (Criteria) this;
        }

        public Criteria andSimidNotBetween(Integer value1, Integer value2) {
            addCriterion("SIMID not between", value1, value2, "simid");
            return (Criteria) this;
        }

        public Criteria andImsiIsNull() {
            addCriterion("IMSI is null");
            return (Criteria) this;
        }

        public Criteria andImsiIsNotNull() {
            addCriterion("IMSI is not null");
            return (Criteria) this;
        }

        public Criteria andImsiEqualTo(String value) {
            addCriterion("IMSI =", value, "imsi");
            return (Criteria) this;
        }

        public Criteria andImsiNotEqualTo(String value) {
            addCriterion("IMSI <>", value, "imsi");
            return (Criteria) this;
        }

        public Criteria andImsiGreaterThan(String value) {
            addCriterion("IMSI >", value, "imsi");
            return (Criteria) this;
        }

        public Criteria andImsiGreaterThanOrEqualTo(String value) {
            addCriterion("IMSI >=", value, "imsi");
            return (Criteria) this;
        }

        public Criteria andImsiLessThan(String value) {
            addCriterion("IMSI <", value, "imsi");
            return (Criteria) this;
        }

        public Criteria andImsiLessThanOrEqualTo(String value) {
            addCriterion("IMSI <=", value, "imsi");
            return (Criteria) this;
        }

        public Criteria andImsiLike(String value) {
            addCriterion("IMSI like", value, "imsi");
            return (Criteria) this;
        }

        public Criteria andImsiNotLike(String value) {
            addCriterion("IMSI not like", value, "imsi");
            return (Criteria) this;
        }

        public Criteria andImsiIn(List<String> values) {
            addCriterion("IMSI in", values, "imsi");
            return (Criteria) this;
        }

        public Criteria andImsiNotIn(List<String> values) {
            addCriterion("IMSI not in", values, "imsi");
            return (Criteria) this;
        }

        public Criteria andImsiBetween(String value1, String value2) {
            addCriterion("IMSI between", value1, value2, "imsi");
            return (Criteria) this;
        }

        public Criteria andImsiNotBetween(String value1, String value2) {
            addCriterion("IMSI not between", value1, value2, "imsi");
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