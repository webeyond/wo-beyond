package com.unicom.wobeyond.model;

import java.math.BigDecimal;

public class Prod {
    private Integer prodId;

    private Integer prodType;

    private String prodName;

    private BigDecimal comboFee;

    private Integer promiseTime;

    private BigDecimal prePayFee;

    private String desPic;

    public Integer getProdId() {
        return prodId;
    }

    public void setProdId(Integer prodId) {
        this.prodId = prodId;
    }

    public Integer getProdType() {
        return prodType;
    }

    public void setProdType(Integer prodType) {
        this.prodType = prodType;
    }

    public String getProdName() {
        return prodName;
    }

    public void setProdName(String prodName) {
        this.prodName = prodName == null ? null : prodName.trim();
    }

    public BigDecimal getComboFee() {
        return comboFee;
    }

    public void setComboFee(BigDecimal comboFee) {
        this.comboFee = comboFee;
    }

    public Integer getPromiseTime() {
        return promiseTime;
    }

    public void setPromiseTime(Integer promiseTime) {
        this.promiseTime = promiseTime;
    }

    public BigDecimal getPrePayFee() {
        return prePayFee;
    }

    public void setPrePayFee(BigDecimal prePayFee) {
        this.prePayFee = prePayFee;
    }

    public String getDesPic() {
        return desPic;
    }

    public void setDesPic(String desPic) {
        this.desPic = desPic == null ? null : desPic.trim();
    }
}