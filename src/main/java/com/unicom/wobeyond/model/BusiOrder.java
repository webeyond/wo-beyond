package com.unicom.wobeyond.model;

import java.math.BigDecimal;
import java.util.Date;

public class BusiOrder {
    private Integer busiCellno;

    private Date busiOrderDate;

    private String provinceCode;

    private String eparchyCode;

    private String cityCode;

    private String channelId;

    private Integer operId;

    private String busiOrderId;

    private String signature;

    private String signatureType;

    private String busiTransType;

    private String busiMercId;

    private BigDecimal busiAmt;

    private Integer custid;

    private Integer serialId;

    private Integer prodId;

    private String payinfo;

    private String paytype;

    private String payorg;

    private String paynum;

    private Integer payFlag;

    public Integer getBusiCellno() {
        return busiCellno;
    }

    public void setBusiCellno(Integer busiCellno) {
        this.busiCellno = busiCellno;
    }

    public Date getBusiOrderDate() {
        return busiOrderDate;
    }

    public void setBusiOrderDate(Date busiOrderDate) {
        this.busiOrderDate = busiOrderDate;
    }

    public String getProvinceCode() {
        return provinceCode;
    }

    public void setProvinceCode(String provinceCode) {
        this.provinceCode = provinceCode == null ? null : provinceCode.trim();
    }

    public String getEparchyCode() {
        return eparchyCode;
    }

    public void setEparchyCode(String eparchyCode) {
        this.eparchyCode = eparchyCode == null ? null : eparchyCode.trim();
    }

    public String getCityCode() {
        return cityCode;
    }

    public void setCityCode(String cityCode) {
        this.cityCode = cityCode == null ? null : cityCode.trim();
    }

    public String getChannelId() {
        return channelId;
    }

    public void setChannelId(String channelId) {
        this.channelId = channelId == null ? null : channelId.trim();
    }

    public Integer getOperId() {
        return operId;
    }

    public void setOperId(Integer operId) {
        this.operId = operId;
    }

    public String getBusiOrderId() {
        return busiOrderId;
    }

    public void setBusiOrderId(String busiOrderId) {
        this.busiOrderId = busiOrderId == null ? null : busiOrderId.trim();
    }

    public String getSignature() {
        return signature;
    }

    public void setSignature(String signature) {
        this.signature = signature == null ? null : signature.trim();
    }

    public String getSignatureType() {
        return signatureType;
    }

    public void setSignatureType(String signatureType) {
        this.signatureType = signatureType == null ? null : signatureType.trim();
    }

    public String getBusiTransType() {
        return busiTransType;
    }

    public void setBusiTransType(String busiTransType) {
        this.busiTransType = busiTransType == null ? null : busiTransType.trim();
    }

    public String getBusiMercId() {
        return busiMercId;
    }

    public void setBusiMercId(String busiMercId) {
        this.busiMercId = busiMercId == null ? null : busiMercId.trim();
    }

    public BigDecimal getBusiAmt() {
        return busiAmt;
    }

    public void setBusiAmt(BigDecimal busiAmt) {
        this.busiAmt = busiAmt;
    }

    public Integer getCustid() {
        return custid;
    }

    public void setCustid(Integer custid) {
        this.custid = custid;
    }

    public Integer getSerialId() {
        return serialId;
    }

    public void setSerialId(Integer serialId) {
        this.serialId = serialId;
    }

    public Integer getProdId() {
        return prodId;
    }

    public void setProdId(Integer prodId) {
        this.prodId = prodId;
    }

    public String getPayinfo() {
        return payinfo;
    }

    public void setPayinfo(String payinfo) {
        this.payinfo = payinfo == null ? null : payinfo.trim();
    }

    public String getPaytype() {
        return paytype;
    }

    public void setPaytype(String paytype) {
        this.paytype = paytype == null ? null : paytype.trim();
    }

    public String getPayorg() {
        return payorg;
    }

    public void setPayorg(String payorg) {
        this.payorg = payorg == null ? null : payorg.trim();
    }

    public String getPaynum() {
        return paynum;
    }

    public void setPaynum(String paynum) {
        this.paynum = paynum == null ? null : paynum.trim();
    }

    public Integer getPayFlag() {
        return payFlag;
    }

    public void setPayFlag(Integer payFlag) {
        this.payFlag = payFlag;
    }
}