package com.unicom.wobeyond.model;

import java.math.BigDecimal;

public class Serial {
    private Integer serialId;

    private String serialNumber;

    private String serialProvince;

    private String serialCity;

    private String businessType;

    private BigDecimal advanceLimit;

    private BigDecimal monthfeeLimit;

    private Integer monthLimit;

    private Integer niceRuleTag;

    private String featureType;

    private String featureName;

    private String goodType;

    private Integer highlightNums;

    private Integer topHighlightNums;

    public Integer getSerialId() {
        return serialId;
    }

    public void setSerialId(Integer serialId) {
        this.serialId = serialId;
    }

    public String getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber == null ? null : serialNumber.trim();
    }

    public String getSerialProvince() {
        return serialProvince;
    }

    public void setSerialProvince(String serialProvince) {
        this.serialProvince = serialProvince == null ? null : serialProvince.trim();
    }

    public String getSerialCity() {
        return serialCity;
    }

    public void setSerialCity(String serialCity) {
        this.serialCity = serialCity == null ? null : serialCity.trim();
    }

    public String getBusinessType() {
        return businessType;
    }

    public void setBusinessType(String businessType) {
        this.businessType = businessType == null ? null : businessType.trim();
    }

    public BigDecimal getAdvanceLimit() {
        return advanceLimit;
    }

    public void setAdvanceLimit(BigDecimal advanceLimit) {
        this.advanceLimit = advanceLimit;
    }

    public BigDecimal getMonthfeeLimit() {
        return monthfeeLimit;
    }

    public void setMonthfeeLimit(BigDecimal monthfeeLimit) {
        this.monthfeeLimit = monthfeeLimit;
    }

    public Integer getMonthLimit() {
        return monthLimit;
    }

    public void setMonthLimit(Integer monthLimit) {
        this.monthLimit = monthLimit;
    }

    public Integer getNiceRuleTag() {
        return niceRuleTag;
    }

    public void setNiceRuleTag(Integer niceRuleTag) {
        this.niceRuleTag = niceRuleTag;
    }

    public String getFeatureType() {
        return featureType;
    }

    public void setFeatureType(String featureType) {
        this.featureType = featureType == null ? null : featureType.trim();
    }

    public String getFeatureName() {
        return featureName;
    }

    public void setFeatureName(String featureName) {
        this.featureName = featureName == null ? null : featureName.trim();
    }

    public String getGoodType() {
        return goodType;
    }

    public void setGoodType(String goodType) {
        this.goodType = goodType == null ? null : goodType.trim();
    }

    public Integer getHighlightNums() {
        return highlightNums;
    }

    public void setHighlightNums(Integer highlightNums) {
        this.highlightNums = highlightNums;
    }

    public Integer getTopHighlightNums() {
        return topHighlightNums;
    }

    public void setTopHighlightNums(Integer topHighlightNums) {
        this.topHighlightNums = topHighlightNums;
    }
}