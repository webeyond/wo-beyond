package com.unicom.wobeyond.vo.statistics;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.util.Date;

public class OrderVO {

    //------------------------------Account表-------------------------------

    private String province;

    private String city;

    private String district;

    private String operatorname;

    //------------------------------busi_order表-----------------------------
    @JsonFormat(timezone = "GMT+8", pattern = "yyyy-MM-dd HH:mm:ss") //出参
    private Date busiOrderDate;

    private Integer payFlag;

    //------------------------------customer表-------------------------------

    private String customername;

    //------------------------------prod表-----------------------------------

    private String prodName;

    //------------------------------serial表---------------------------------

    private String serialNumber;  //手机号

    //------------------------------其它--------------------------------------

    private String payFlagName;

    public String getPayFlagName() {
        return payFlagName;
    }

    public void setPayFlagName(String payFlagName) {
        this.payFlagName = payFlagName;
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getDistrict() {
        return district;
    }

    public void setDistrict(String district) {
        this.district = district;
    }

    public String getOperatorname() {
        return operatorname;
    }

    public void setOperatorname(String operatorname) {
        this.operatorname = operatorname;
    }

    public Date getBusiOrderDate() {
        return busiOrderDate;
    }

    public void setBusiOrderDate(Date busiOrderDate) {
        this.busiOrderDate = busiOrderDate;
    }

    public String getCustomername() {
        return customername;
    }

    public void setCustomername(String customername) {
        this.customername = customername;
    }

    public String getProdName() {
        return prodName;
    }

    public void setProdName(String prodName) {
        this.prodName = prodName;
    }

    public String getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }

    public Integer getPayFlag() {
        return payFlag;
    }

    public void setPayFlag(Integer payFlag) {
        this.payFlag = payFlag;
    }
}
