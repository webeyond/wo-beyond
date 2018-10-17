package com.unicom.wobeyond.model;

import java.util.Date;

public class Customer {
    private Integer custid;

    private Integer realnametype;

    private Integer custtype;

    private Integer refcustid;

    private Integer certtype;

    private String certnum;

    private String certadress;

    private String customername;

    private Date certexpiredate;

    private String sex;

    private String tmpphone;

    private String contactperson;

    private String contactphone;

    private String contactaddress;

    private String custtype1;

    private Integer issuesnumber;

    private String psptauthority;

    private Date psptstartdate;

    private String psptnumber;

    private String customerremark;

    public Integer getCustid() {
        return custid;
    }

    public void setCustid(Integer custid) {
        this.custid = custid;
    }

    public Integer getRealnametype() {
        return realnametype;
    }

    public void setRealnametype(Integer realnametype) {
        this.realnametype = realnametype;
    }

    public Integer getCusttype() {
        return custtype;
    }

    public void setCusttype(Integer custtype) {
        this.custtype = custtype;
    }

    public Integer getRefcustid() {
        return refcustid;
    }

    public void setRefcustid(Integer refcustid) {
        this.refcustid = refcustid;
    }

    public Integer getCerttype() {
        return certtype;
    }

    public void setCerttype(Integer certtype) {
        this.certtype = certtype;
    }

    public String getCertnum() {
        return certnum;
    }

    public void setCertnum(String certnum) {
        this.certnum = certnum == null ? null : certnum.trim();
    }

    public String getCertadress() {
        return certadress;
    }

    public void setCertadress(String certadress) {
        this.certadress = certadress == null ? null : certadress.trim();
    }

    public String getCustomername() {
        return customername;
    }

    public void setCustomername(String customername) {
        this.customername = customername == null ? null : customername.trim();
    }

    public Date getCertexpiredate() {
        return certexpiredate;
    }

    public void setCertexpiredate(Date certexpiredate) {
        this.certexpiredate = certexpiredate;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex == null ? null : sex.trim();
    }

    public String getTmpphone() {
        return tmpphone;
    }

    public void setTmpphone(String tmpphone) {
        this.tmpphone = tmpphone == null ? null : tmpphone.trim();
    }

    public String getContactperson() {
        return contactperson;
    }

    public void setContactperson(String contactperson) {
        this.contactperson = contactperson == null ? null : contactperson.trim();
    }

    public String getContactphone() {
        return contactphone;
    }

    public void setContactphone(String contactphone) {
        this.contactphone = contactphone == null ? null : contactphone.trim();
    }

    public String getContactaddress() {
        return contactaddress;
    }

    public void setContactaddress(String contactaddress) {
        this.contactaddress = contactaddress == null ? null : contactaddress.trim();
    }

    public String getCusttype1() {
        return custtype1;
    }

    public void setCusttype1(String custtype1) {
        this.custtype1 = custtype1 == null ? null : custtype1.trim();
    }

    public Integer getIssuesnumber() {
        return issuesnumber;
    }

    public void setIssuesnumber(Integer issuesnumber) {
        this.issuesnumber = issuesnumber;
    }

    public String getPsptauthority() {
        return psptauthority;
    }

    public void setPsptauthority(String psptauthority) {
        this.psptauthority = psptauthority == null ? null : psptauthority.trim();
    }

    public Date getPsptstartdate() {
        return psptstartdate;
    }

    public void setPsptstartdate(Date psptstartdate) {
        this.psptstartdate = psptstartdate;
    }

    public String getPsptnumber() {
        return psptnumber;
    }

    public void setPsptnumber(String psptnumber) {
        this.psptnumber = psptnumber == null ? null : psptnumber.trim();
    }

    public String getCustomerremark() {
        return customerremark;
    }

    public void setCustomerremark(String customerremark) {
        this.customerremark = customerremark == null ? null : customerremark.trim();
    }
}