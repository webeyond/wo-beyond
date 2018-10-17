package com.unicom.wobeyond.model;

public class OrderSend {
    private Integer deliNo;

    private Integer operId;

    private Integer custid;

    private Integer serialId;

    private Integer prodId;

    private Integer accountHandApplyId;

    private String contactaddress;

    public Integer getDeliNo() {
        return deliNo;
    }

    public void setDeliNo(Integer deliNo) {
        this.deliNo = deliNo;
    }

    public Integer getOperId() {
        return operId;
    }

    public void setOperId(Integer operId) {
        this.operId = operId;
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

    public Integer getAccountHandApplyId() {
        return accountHandApplyId;
    }

    public void setAccountHandApplyId(Integer accountHandApplyId) {
        this.accountHandApplyId = accountHandApplyId;
    }

    public String getContactaddress() {
        return contactaddress;
    }

    public void setContactaddress(String contactaddress) {
        this.contactaddress = contactaddress == null ? null : contactaddress.trim();
    }
}