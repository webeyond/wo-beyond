package com.unicom.wobeyond.model;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class BusiOrderExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public BusiOrderExample() {
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

        public Criteria andBusiCellnoIsNull() {
            addCriterion("BUSI_CELLNO is null");
            return (Criteria) this;
        }

        public Criteria andBusiCellnoIsNotNull() {
            addCriterion("BUSI_CELLNO is not null");
            return (Criteria) this;
        }

        public Criteria andBusiCellnoEqualTo(Integer value) {
            addCriterion("BUSI_CELLNO =", value, "busiCellno");
            return (Criteria) this;
        }

        public Criteria andBusiCellnoNotEqualTo(Integer value) {
            addCriterion("BUSI_CELLNO <>", value, "busiCellno");
            return (Criteria) this;
        }

        public Criteria andBusiCellnoGreaterThan(Integer value) {
            addCriterion("BUSI_CELLNO >", value, "busiCellno");
            return (Criteria) this;
        }

        public Criteria andBusiCellnoGreaterThanOrEqualTo(Integer value) {
            addCriterion("BUSI_CELLNO >=", value, "busiCellno");
            return (Criteria) this;
        }

        public Criteria andBusiCellnoLessThan(Integer value) {
            addCriterion("BUSI_CELLNO <", value, "busiCellno");
            return (Criteria) this;
        }

        public Criteria andBusiCellnoLessThanOrEqualTo(Integer value) {
            addCriterion("BUSI_CELLNO <=", value, "busiCellno");
            return (Criteria) this;
        }

        public Criteria andBusiCellnoIn(List<Integer> values) {
            addCriterion("BUSI_CELLNO in", values, "busiCellno");
            return (Criteria) this;
        }

        public Criteria andBusiCellnoNotIn(List<Integer> values) {
            addCriterion("BUSI_CELLNO not in", values, "busiCellno");
            return (Criteria) this;
        }

        public Criteria andBusiCellnoBetween(Integer value1, Integer value2) {
            addCriterion("BUSI_CELLNO between", value1, value2, "busiCellno");
            return (Criteria) this;
        }

        public Criteria andBusiCellnoNotBetween(Integer value1, Integer value2) {
            addCriterion("BUSI_CELLNO not between", value1, value2, "busiCellno");
            return (Criteria) this;
        }

        public Criteria andBusiOrderDateIsNull() {
            addCriterion("BUSI_ORDER_DATE is null");
            return (Criteria) this;
        }

        public Criteria andBusiOrderDateIsNotNull() {
            addCriterion("BUSI_ORDER_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andBusiOrderDateEqualTo(Date value) {
            addCriterion("BUSI_ORDER_DATE =", value, "busiOrderDate");
            return (Criteria) this;
        }

        public Criteria andBusiOrderDateNotEqualTo(Date value) {
            addCriterion("BUSI_ORDER_DATE <>", value, "busiOrderDate");
            return (Criteria) this;
        }

        public Criteria andBusiOrderDateGreaterThan(Date value) {
            addCriterion("BUSI_ORDER_DATE >", value, "busiOrderDate");
            return (Criteria) this;
        }

        public Criteria andBusiOrderDateGreaterThanOrEqualTo(Date value) {
            addCriterion("BUSI_ORDER_DATE >=", value, "busiOrderDate");
            return (Criteria) this;
        }

        public Criteria andBusiOrderDateLessThan(Date value) {
            addCriterion("BUSI_ORDER_DATE <", value, "busiOrderDate");
            return (Criteria) this;
        }

        public Criteria andBusiOrderDateLessThanOrEqualTo(Date value) {
            addCriterion("BUSI_ORDER_DATE <=", value, "busiOrderDate");
            return (Criteria) this;
        }

        public Criteria andBusiOrderDateIn(List<Date> values) {
            addCriterion("BUSI_ORDER_DATE in", values, "busiOrderDate");
            return (Criteria) this;
        }

        public Criteria andBusiOrderDateNotIn(List<Date> values) {
            addCriterion("BUSI_ORDER_DATE not in", values, "busiOrderDate");
            return (Criteria) this;
        }

        public Criteria andBusiOrderDateBetween(Date value1, Date value2) {
            addCriterion("BUSI_ORDER_DATE between", value1, value2, "busiOrderDate");
            return (Criteria) this;
        }

        public Criteria andBusiOrderDateNotBetween(Date value1, Date value2) {
            addCriterion("BUSI_ORDER_DATE not between", value1, value2, "busiOrderDate");
            return (Criteria) this;
        }

        public Criteria andProvinceCodeIsNull() {
            addCriterion("PROVINCE_CODE is null");
            return (Criteria) this;
        }

        public Criteria andProvinceCodeIsNotNull() {
            addCriterion("PROVINCE_CODE is not null");
            return (Criteria) this;
        }

        public Criteria andProvinceCodeEqualTo(String value) {
            addCriterion("PROVINCE_CODE =", value, "provinceCode");
            return (Criteria) this;
        }

        public Criteria andProvinceCodeNotEqualTo(String value) {
            addCriterion("PROVINCE_CODE <>", value, "provinceCode");
            return (Criteria) this;
        }

        public Criteria andProvinceCodeGreaterThan(String value) {
            addCriterion("PROVINCE_CODE >", value, "provinceCode");
            return (Criteria) this;
        }

        public Criteria andProvinceCodeGreaterThanOrEqualTo(String value) {
            addCriterion("PROVINCE_CODE >=", value, "provinceCode");
            return (Criteria) this;
        }

        public Criteria andProvinceCodeLessThan(String value) {
            addCriterion("PROVINCE_CODE <", value, "provinceCode");
            return (Criteria) this;
        }

        public Criteria andProvinceCodeLessThanOrEqualTo(String value) {
            addCriterion("PROVINCE_CODE <=", value, "provinceCode");
            return (Criteria) this;
        }

        public Criteria andProvinceCodeLike(String value) {
            addCriterion("PROVINCE_CODE like", value, "provinceCode");
            return (Criteria) this;
        }

        public Criteria andProvinceCodeNotLike(String value) {
            addCriterion("PROVINCE_CODE not like", value, "provinceCode");
            return (Criteria) this;
        }

        public Criteria andProvinceCodeIn(List<String> values) {
            addCriterion("PROVINCE_CODE in", values, "provinceCode");
            return (Criteria) this;
        }

        public Criteria andProvinceCodeNotIn(List<String> values) {
            addCriterion("PROVINCE_CODE not in", values, "provinceCode");
            return (Criteria) this;
        }

        public Criteria andProvinceCodeBetween(String value1, String value2) {
            addCriterion("PROVINCE_CODE between", value1, value2, "provinceCode");
            return (Criteria) this;
        }

        public Criteria andProvinceCodeNotBetween(String value1, String value2) {
            addCriterion("PROVINCE_CODE not between", value1, value2, "provinceCode");
            return (Criteria) this;
        }

        public Criteria andEparchyCodeIsNull() {
            addCriterion("EPARCHY_CODE is null");
            return (Criteria) this;
        }

        public Criteria andEparchyCodeIsNotNull() {
            addCriterion("EPARCHY_CODE is not null");
            return (Criteria) this;
        }

        public Criteria andEparchyCodeEqualTo(String value) {
            addCriterion("EPARCHY_CODE =", value, "eparchyCode");
            return (Criteria) this;
        }

        public Criteria andEparchyCodeNotEqualTo(String value) {
            addCriterion("EPARCHY_CODE <>", value, "eparchyCode");
            return (Criteria) this;
        }

        public Criteria andEparchyCodeGreaterThan(String value) {
            addCriterion("EPARCHY_CODE >", value, "eparchyCode");
            return (Criteria) this;
        }

        public Criteria andEparchyCodeGreaterThanOrEqualTo(String value) {
            addCriterion("EPARCHY_CODE >=", value, "eparchyCode");
            return (Criteria) this;
        }

        public Criteria andEparchyCodeLessThan(String value) {
            addCriterion("EPARCHY_CODE <", value, "eparchyCode");
            return (Criteria) this;
        }

        public Criteria andEparchyCodeLessThanOrEqualTo(String value) {
            addCriterion("EPARCHY_CODE <=", value, "eparchyCode");
            return (Criteria) this;
        }

        public Criteria andEparchyCodeLike(String value) {
            addCriterion("EPARCHY_CODE like", value, "eparchyCode");
            return (Criteria) this;
        }

        public Criteria andEparchyCodeNotLike(String value) {
            addCriterion("EPARCHY_CODE not like", value, "eparchyCode");
            return (Criteria) this;
        }

        public Criteria andEparchyCodeIn(List<String> values) {
            addCriterion("EPARCHY_CODE in", values, "eparchyCode");
            return (Criteria) this;
        }

        public Criteria andEparchyCodeNotIn(List<String> values) {
            addCriterion("EPARCHY_CODE not in", values, "eparchyCode");
            return (Criteria) this;
        }

        public Criteria andEparchyCodeBetween(String value1, String value2) {
            addCriterion("EPARCHY_CODE between", value1, value2, "eparchyCode");
            return (Criteria) this;
        }

        public Criteria andEparchyCodeNotBetween(String value1, String value2) {
            addCriterion("EPARCHY_CODE not between", value1, value2, "eparchyCode");
            return (Criteria) this;
        }

        public Criteria andCityCodeIsNull() {
            addCriterion("CITY_CODE is null");
            return (Criteria) this;
        }

        public Criteria andCityCodeIsNotNull() {
            addCriterion("CITY_CODE is not null");
            return (Criteria) this;
        }

        public Criteria andCityCodeEqualTo(String value) {
            addCriterion("CITY_CODE =", value, "cityCode");
            return (Criteria) this;
        }

        public Criteria andCityCodeNotEqualTo(String value) {
            addCriterion("CITY_CODE <>", value, "cityCode");
            return (Criteria) this;
        }

        public Criteria andCityCodeGreaterThan(String value) {
            addCriterion("CITY_CODE >", value, "cityCode");
            return (Criteria) this;
        }

        public Criteria andCityCodeGreaterThanOrEqualTo(String value) {
            addCriterion("CITY_CODE >=", value, "cityCode");
            return (Criteria) this;
        }

        public Criteria andCityCodeLessThan(String value) {
            addCriterion("CITY_CODE <", value, "cityCode");
            return (Criteria) this;
        }

        public Criteria andCityCodeLessThanOrEqualTo(String value) {
            addCriterion("CITY_CODE <=", value, "cityCode");
            return (Criteria) this;
        }

        public Criteria andCityCodeLike(String value) {
            addCriterion("CITY_CODE like", value, "cityCode");
            return (Criteria) this;
        }

        public Criteria andCityCodeNotLike(String value) {
            addCriterion("CITY_CODE not like", value, "cityCode");
            return (Criteria) this;
        }

        public Criteria andCityCodeIn(List<String> values) {
            addCriterion("CITY_CODE in", values, "cityCode");
            return (Criteria) this;
        }

        public Criteria andCityCodeNotIn(List<String> values) {
            addCriterion("CITY_CODE not in", values, "cityCode");
            return (Criteria) this;
        }

        public Criteria andCityCodeBetween(String value1, String value2) {
            addCriterion("CITY_CODE between", value1, value2, "cityCode");
            return (Criteria) this;
        }

        public Criteria andCityCodeNotBetween(String value1, String value2) {
            addCriterion("CITY_CODE not between", value1, value2, "cityCode");
            return (Criteria) this;
        }

        public Criteria andChannelIdIsNull() {
            addCriterion("CHANNEL_ID is null");
            return (Criteria) this;
        }

        public Criteria andChannelIdIsNotNull() {
            addCriterion("CHANNEL_ID is not null");
            return (Criteria) this;
        }

        public Criteria andChannelIdEqualTo(String value) {
            addCriterion("CHANNEL_ID =", value, "channelId");
            return (Criteria) this;
        }

        public Criteria andChannelIdNotEqualTo(String value) {
            addCriterion("CHANNEL_ID <>", value, "channelId");
            return (Criteria) this;
        }

        public Criteria andChannelIdGreaterThan(String value) {
            addCriterion("CHANNEL_ID >", value, "channelId");
            return (Criteria) this;
        }

        public Criteria andChannelIdGreaterThanOrEqualTo(String value) {
            addCriterion("CHANNEL_ID >=", value, "channelId");
            return (Criteria) this;
        }

        public Criteria andChannelIdLessThan(String value) {
            addCriterion("CHANNEL_ID <", value, "channelId");
            return (Criteria) this;
        }

        public Criteria andChannelIdLessThanOrEqualTo(String value) {
            addCriterion("CHANNEL_ID <=", value, "channelId");
            return (Criteria) this;
        }

        public Criteria andChannelIdLike(String value) {
            addCriterion("CHANNEL_ID like", value, "channelId");
            return (Criteria) this;
        }

        public Criteria andChannelIdNotLike(String value) {
            addCriterion("CHANNEL_ID not like", value, "channelId");
            return (Criteria) this;
        }

        public Criteria andChannelIdIn(List<String> values) {
            addCriterion("CHANNEL_ID in", values, "channelId");
            return (Criteria) this;
        }

        public Criteria andChannelIdNotIn(List<String> values) {
            addCriterion("CHANNEL_ID not in", values, "channelId");
            return (Criteria) this;
        }

        public Criteria andChannelIdBetween(String value1, String value2) {
            addCriterion("CHANNEL_ID between", value1, value2, "channelId");
            return (Criteria) this;
        }

        public Criteria andChannelIdNotBetween(String value1, String value2) {
            addCriterion("CHANNEL_ID not between", value1, value2, "channelId");
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

        public Criteria andBusiOrderIdIsNull() {
            addCriterion("BUSI_ORDER_ID is null");
            return (Criteria) this;
        }

        public Criteria andBusiOrderIdIsNotNull() {
            addCriterion("BUSI_ORDER_ID is not null");
            return (Criteria) this;
        }

        public Criteria andBusiOrderIdEqualTo(String value) {
            addCriterion("BUSI_ORDER_ID =", value, "busiOrderId");
            return (Criteria) this;
        }

        public Criteria andBusiOrderIdNotEqualTo(String value) {
            addCriterion("BUSI_ORDER_ID <>", value, "busiOrderId");
            return (Criteria) this;
        }

        public Criteria andBusiOrderIdGreaterThan(String value) {
            addCriterion("BUSI_ORDER_ID >", value, "busiOrderId");
            return (Criteria) this;
        }

        public Criteria andBusiOrderIdGreaterThanOrEqualTo(String value) {
            addCriterion("BUSI_ORDER_ID >=", value, "busiOrderId");
            return (Criteria) this;
        }

        public Criteria andBusiOrderIdLessThan(String value) {
            addCriterion("BUSI_ORDER_ID <", value, "busiOrderId");
            return (Criteria) this;
        }

        public Criteria andBusiOrderIdLessThanOrEqualTo(String value) {
            addCriterion("BUSI_ORDER_ID <=", value, "busiOrderId");
            return (Criteria) this;
        }

        public Criteria andBusiOrderIdLike(String value) {
            addCriterion("BUSI_ORDER_ID like", value, "busiOrderId");
            return (Criteria) this;
        }

        public Criteria andBusiOrderIdNotLike(String value) {
            addCriterion("BUSI_ORDER_ID not like", value, "busiOrderId");
            return (Criteria) this;
        }

        public Criteria andBusiOrderIdIn(List<String> values) {
            addCriterion("BUSI_ORDER_ID in", values, "busiOrderId");
            return (Criteria) this;
        }

        public Criteria andBusiOrderIdNotIn(List<String> values) {
            addCriterion("BUSI_ORDER_ID not in", values, "busiOrderId");
            return (Criteria) this;
        }

        public Criteria andBusiOrderIdBetween(String value1, String value2) {
            addCriterion("BUSI_ORDER_ID between", value1, value2, "busiOrderId");
            return (Criteria) this;
        }

        public Criteria andBusiOrderIdNotBetween(String value1, String value2) {
            addCriterion("BUSI_ORDER_ID not between", value1, value2, "busiOrderId");
            return (Criteria) this;
        }

        public Criteria andSignatureIsNull() {
            addCriterion("SIGNATURE is null");
            return (Criteria) this;
        }

        public Criteria andSignatureIsNotNull() {
            addCriterion("SIGNATURE is not null");
            return (Criteria) this;
        }

        public Criteria andSignatureEqualTo(String value) {
            addCriterion("SIGNATURE =", value, "signature");
            return (Criteria) this;
        }

        public Criteria andSignatureNotEqualTo(String value) {
            addCriterion("SIGNATURE <>", value, "signature");
            return (Criteria) this;
        }

        public Criteria andSignatureGreaterThan(String value) {
            addCriterion("SIGNATURE >", value, "signature");
            return (Criteria) this;
        }

        public Criteria andSignatureGreaterThanOrEqualTo(String value) {
            addCriterion("SIGNATURE >=", value, "signature");
            return (Criteria) this;
        }

        public Criteria andSignatureLessThan(String value) {
            addCriterion("SIGNATURE <", value, "signature");
            return (Criteria) this;
        }

        public Criteria andSignatureLessThanOrEqualTo(String value) {
            addCriterion("SIGNATURE <=", value, "signature");
            return (Criteria) this;
        }

        public Criteria andSignatureLike(String value) {
            addCriterion("SIGNATURE like", value, "signature");
            return (Criteria) this;
        }

        public Criteria andSignatureNotLike(String value) {
            addCriterion("SIGNATURE not like", value, "signature");
            return (Criteria) this;
        }

        public Criteria andSignatureIn(List<String> values) {
            addCriterion("SIGNATURE in", values, "signature");
            return (Criteria) this;
        }

        public Criteria andSignatureNotIn(List<String> values) {
            addCriterion("SIGNATURE not in", values, "signature");
            return (Criteria) this;
        }

        public Criteria andSignatureBetween(String value1, String value2) {
            addCriterion("SIGNATURE between", value1, value2, "signature");
            return (Criteria) this;
        }

        public Criteria andSignatureNotBetween(String value1, String value2) {
            addCriterion("SIGNATURE not between", value1, value2, "signature");
            return (Criteria) this;
        }

        public Criteria andSignatureTypeIsNull() {
            addCriterion("SIGNATURE_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andSignatureTypeIsNotNull() {
            addCriterion("SIGNATURE_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andSignatureTypeEqualTo(String value) {
            addCriterion("SIGNATURE_TYPE =", value, "signatureType");
            return (Criteria) this;
        }

        public Criteria andSignatureTypeNotEqualTo(String value) {
            addCriterion("SIGNATURE_TYPE <>", value, "signatureType");
            return (Criteria) this;
        }

        public Criteria andSignatureTypeGreaterThan(String value) {
            addCriterion("SIGNATURE_TYPE >", value, "signatureType");
            return (Criteria) this;
        }

        public Criteria andSignatureTypeGreaterThanOrEqualTo(String value) {
            addCriterion("SIGNATURE_TYPE >=", value, "signatureType");
            return (Criteria) this;
        }

        public Criteria andSignatureTypeLessThan(String value) {
            addCriterion("SIGNATURE_TYPE <", value, "signatureType");
            return (Criteria) this;
        }

        public Criteria andSignatureTypeLessThanOrEqualTo(String value) {
            addCriterion("SIGNATURE_TYPE <=", value, "signatureType");
            return (Criteria) this;
        }

        public Criteria andSignatureTypeLike(String value) {
            addCriterion("SIGNATURE_TYPE like", value, "signatureType");
            return (Criteria) this;
        }

        public Criteria andSignatureTypeNotLike(String value) {
            addCriterion("SIGNATURE_TYPE not like", value, "signatureType");
            return (Criteria) this;
        }

        public Criteria andSignatureTypeIn(List<String> values) {
            addCriterion("SIGNATURE_TYPE in", values, "signatureType");
            return (Criteria) this;
        }

        public Criteria andSignatureTypeNotIn(List<String> values) {
            addCriterion("SIGNATURE_TYPE not in", values, "signatureType");
            return (Criteria) this;
        }

        public Criteria andSignatureTypeBetween(String value1, String value2) {
            addCriterion("SIGNATURE_TYPE between", value1, value2, "signatureType");
            return (Criteria) this;
        }

        public Criteria andSignatureTypeNotBetween(String value1, String value2) {
            addCriterion("SIGNATURE_TYPE not between", value1, value2, "signatureType");
            return (Criteria) this;
        }

        public Criteria andBusiTransTypeIsNull() {
            addCriterion("BUSI_TRANS_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andBusiTransTypeIsNotNull() {
            addCriterion("BUSI_TRANS_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andBusiTransTypeEqualTo(String value) {
            addCriterion("BUSI_TRANS_TYPE =", value, "busiTransType");
            return (Criteria) this;
        }

        public Criteria andBusiTransTypeNotEqualTo(String value) {
            addCriterion("BUSI_TRANS_TYPE <>", value, "busiTransType");
            return (Criteria) this;
        }

        public Criteria andBusiTransTypeGreaterThan(String value) {
            addCriterion("BUSI_TRANS_TYPE >", value, "busiTransType");
            return (Criteria) this;
        }

        public Criteria andBusiTransTypeGreaterThanOrEqualTo(String value) {
            addCriterion("BUSI_TRANS_TYPE >=", value, "busiTransType");
            return (Criteria) this;
        }

        public Criteria andBusiTransTypeLessThan(String value) {
            addCriterion("BUSI_TRANS_TYPE <", value, "busiTransType");
            return (Criteria) this;
        }

        public Criteria andBusiTransTypeLessThanOrEqualTo(String value) {
            addCriterion("BUSI_TRANS_TYPE <=", value, "busiTransType");
            return (Criteria) this;
        }

        public Criteria andBusiTransTypeLike(String value) {
            addCriterion("BUSI_TRANS_TYPE like", value, "busiTransType");
            return (Criteria) this;
        }

        public Criteria andBusiTransTypeNotLike(String value) {
            addCriterion("BUSI_TRANS_TYPE not like", value, "busiTransType");
            return (Criteria) this;
        }

        public Criteria andBusiTransTypeIn(List<String> values) {
            addCriterion("BUSI_TRANS_TYPE in", values, "busiTransType");
            return (Criteria) this;
        }

        public Criteria andBusiTransTypeNotIn(List<String> values) {
            addCriterion("BUSI_TRANS_TYPE not in", values, "busiTransType");
            return (Criteria) this;
        }

        public Criteria andBusiTransTypeBetween(String value1, String value2) {
            addCriterion("BUSI_TRANS_TYPE between", value1, value2, "busiTransType");
            return (Criteria) this;
        }

        public Criteria andBusiTransTypeNotBetween(String value1, String value2) {
            addCriterion("BUSI_TRANS_TYPE not between", value1, value2, "busiTransType");
            return (Criteria) this;
        }

        public Criteria andBusiMercIdIsNull() {
            addCriterion("BUSI_MERC_ID is null");
            return (Criteria) this;
        }

        public Criteria andBusiMercIdIsNotNull() {
            addCriterion("BUSI_MERC_ID is not null");
            return (Criteria) this;
        }

        public Criteria andBusiMercIdEqualTo(String value) {
            addCriterion("BUSI_MERC_ID =", value, "busiMercId");
            return (Criteria) this;
        }

        public Criteria andBusiMercIdNotEqualTo(String value) {
            addCriterion("BUSI_MERC_ID <>", value, "busiMercId");
            return (Criteria) this;
        }

        public Criteria andBusiMercIdGreaterThan(String value) {
            addCriterion("BUSI_MERC_ID >", value, "busiMercId");
            return (Criteria) this;
        }

        public Criteria andBusiMercIdGreaterThanOrEqualTo(String value) {
            addCriterion("BUSI_MERC_ID >=", value, "busiMercId");
            return (Criteria) this;
        }

        public Criteria andBusiMercIdLessThan(String value) {
            addCriterion("BUSI_MERC_ID <", value, "busiMercId");
            return (Criteria) this;
        }

        public Criteria andBusiMercIdLessThanOrEqualTo(String value) {
            addCriterion("BUSI_MERC_ID <=", value, "busiMercId");
            return (Criteria) this;
        }

        public Criteria andBusiMercIdLike(String value) {
            addCriterion("BUSI_MERC_ID like", value, "busiMercId");
            return (Criteria) this;
        }

        public Criteria andBusiMercIdNotLike(String value) {
            addCriterion("BUSI_MERC_ID not like", value, "busiMercId");
            return (Criteria) this;
        }

        public Criteria andBusiMercIdIn(List<String> values) {
            addCriterion("BUSI_MERC_ID in", values, "busiMercId");
            return (Criteria) this;
        }

        public Criteria andBusiMercIdNotIn(List<String> values) {
            addCriterion("BUSI_MERC_ID not in", values, "busiMercId");
            return (Criteria) this;
        }

        public Criteria andBusiMercIdBetween(String value1, String value2) {
            addCriterion("BUSI_MERC_ID between", value1, value2, "busiMercId");
            return (Criteria) this;
        }

        public Criteria andBusiMercIdNotBetween(String value1, String value2) {
            addCriterion("BUSI_MERC_ID not between", value1, value2, "busiMercId");
            return (Criteria) this;
        }

        public Criteria andBusiAmtIsNull() {
            addCriterion("BUSI_AMT is null");
            return (Criteria) this;
        }

        public Criteria andBusiAmtIsNotNull() {
            addCriterion("BUSI_AMT is not null");
            return (Criteria) this;
        }

        public Criteria andBusiAmtEqualTo(BigDecimal value) {
            addCriterion("BUSI_AMT =", value, "busiAmt");
            return (Criteria) this;
        }

        public Criteria andBusiAmtNotEqualTo(BigDecimal value) {
            addCriterion("BUSI_AMT <>", value, "busiAmt");
            return (Criteria) this;
        }

        public Criteria andBusiAmtGreaterThan(BigDecimal value) {
            addCriterion("BUSI_AMT >", value, "busiAmt");
            return (Criteria) this;
        }

        public Criteria andBusiAmtGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("BUSI_AMT >=", value, "busiAmt");
            return (Criteria) this;
        }

        public Criteria andBusiAmtLessThan(BigDecimal value) {
            addCriterion("BUSI_AMT <", value, "busiAmt");
            return (Criteria) this;
        }

        public Criteria andBusiAmtLessThanOrEqualTo(BigDecimal value) {
            addCriterion("BUSI_AMT <=", value, "busiAmt");
            return (Criteria) this;
        }

        public Criteria andBusiAmtIn(List<BigDecimal> values) {
            addCriterion("BUSI_AMT in", values, "busiAmt");
            return (Criteria) this;
        }

        public Criteria andBusiAmtNotIn(List<BigDecimal> values) {
            addCriterion("BUSI_AMT not in", values, "busiAmt");
            return (Criteria) this;
        }

        public Criteria andBusiAmtBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("BUSI_AMT between", value1, value2, "busiAmt");
            return (Criteria) this;
        }

        public Criteria andBusiAmtNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("BUSI_AMT not between", value1, value2, "busiAmt");
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

        public Criteria andPayFlagIsNull() {
            addCriterion("pay_flag is null");
            return (Criteria) this;
        }

        public Criteria andPayFlagIsNotNull() {
            addCriterion("pay_flag is not null");
            return (Criteria) this;
        }

        public Criteria andPayFlagEqualTo(Integer value) {
            addCriterion("pay_flag =", value, "payFlag");
            return (Criteria) this;
        }

        public Criteria andPayFlagNotEqualTo(Integer value) {
            addCriterion("pay_flag <>", value, "payFlag");
            return (Criteria) this;
        }

        public Criteria andPayFlagGreaterThan(Integer value) {
            addCriterion("pay_flag >", value, "payFlag");
            return (Criteria) this;
        }

        public Criteria andPayFlagGreaterThanOrEqualTo(Integer value) {
            addCriterion("pay_flag >=", value, "payFlag");
            return (Criteria) this;
        }

        public Criteria andPayFlagLessThan(Integer value) {
            addCriterion("pay_flag <", value, "payFlag");
            return (Criteria) this;
        }

        public Criteria andPayFlagLessThanOrEqualTo(Integer value) {
            addCriterion("pay_flag <=", value, "payFlag");
            return (Criteria) this;
        }

        public Criteria andPayFlagIn(List<Integer> values) {
            addCriterion("pay_flag in", values, "payFlag");
            return (Criteria) this;
        }

        public Criteria andPayFlagNotIn(List<Integer> values) {
            addCriterion("pay_flag not in", values, "payFlag");
            return (Criteria) this;
        }

        public Criteria andPayFlagBetween(Integer value1, Integer value2) {
            addCriterion("pay_flag between", value1, value2, "payFlag");
            return (Criteria) this;
        }

        public Criteria andPayFlagNotBetween(Integer value1, Integer value2) {
            addCriterion("pay_flag not between", value1, value2, "payFlag");
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