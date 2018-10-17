package com.unicom.wobeyond.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class CustomerExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CustomerExample() {
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

        public Criteria andCertexpiredateIsNull() {
            addCriterion("CERTEXPIREDATE is null");
            return (Criteria) this;
        }

        public Criteria andCertexpiredateIsNotNull() {
            addCriterion("CERTEXPIREDATE is not null");
            return (Criteria) this;
        }

        public Criteria andCertexpiredateEqualTo(Date value) {
            addCriterion("CERTEXPIREDATE =", value, "certexpiredate");
            return (Criteria) this;
        }

        public Criteria andCertexpiredateNotEqualTo(Date value) {
            addCriterion("CERTEXPIREDATE <>", value, "certexpiredate");
            return (Criteria) this;
        }

        public Criteria andCertexpiredateGreaterThan(Date value) {
            addCriterion("CERTEXPIREDATE >", value, "certexpiredate");
            return (Criteria) this;
        }

        public Criteria andCertexpiredateGreaterThanOrEqualTo(Date value) {
            addCriterion("CERTEXPIREDATE >=", value, "certexpiredate");
            return (Criteria) this;
        }

        public Criteria andCertexpiredateLessThan(Date value) {
            addCriterion("CERTEXPIREDATE <", value, "certexpiredate");
            return (Criteria) this;
        }

        public Criteria andCertexpiredateLessThanOrEqualTo(Date value) {
            addCriterion("CERTEXPIREDATE <=", value, "certexpiredate");
            return (Criteria) this;
        }

        public Criteria andCertexpiredateIn(List<Date> values) {
            addCriterion("CERTEXPIREDATE in", values, "certexpiredate");
            return (Criteria) this;
        }

        public Criteria andCertexpiredateNotIn(List<Date> values) {
            addCriterion("CERTEXPIREDATE not in", values, "certexpiredate");
            return (Criteria) this;
        }

        public Criteria andCertexpiredateBetween(Date value1, Date value2) {
            addCriterion("CERTEXPIREDATE between", value1, value2, "certexpiredate");
            return (Criteria) this;
        }

        public Criteria andCertexpiredateNotBetween(Date value1, Date value2) {
            addCriterion("CERTEXPIREDATE not between", value1, value2, "certexpiredate");
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

        public Criteria andContactpersonIsNull() {
            addCriterion("CONTACTPERSON is null");
            return (Criteria) this;
        }

        public Criteria andContactpersonIsNotNull() {
            addCriterion("CONTACTPERSON is not null");
            return (Criteria) this;
        }

        public Criteria andContactpersonEqualTo(String value) {
            addCriterion("CONTACTPERSON =", value, "contactperson");
            return (Criteria) this;
        }

        public Criteria andContactpersonNotEqualTo(String value) {
            addCriterion("CONTACTPERSON <>", value, "contactperson");
            return (Criteria) this;
        }

        public Criteria andContactpersonGreaterThan(String value) {
            addCriterion("CONTACTPERSON >", value, "contactperson");
            return (Criteria) this;
        }

        public Criteria andContactpersonGreaterThanOrEqualTo(String value) {
            addCriterion("CONTACTPERSON >=", value, "contactperson");
            return (Criteria) this;
        }

        public Criteria andContactpersonLessThan(String value) {
            addCriterion("CONTACTPERSON <", value, "contactperson");
            return (Criteria) this;
        }

        public Criteria andContactpersonLessThanOrEqualTo(String value) {
            addCriterion("CONTACTPERSON <=", value, "contactperson");
            return (Criteria) this;
        }

        public Criteria andContactpersonLike(String value) {
            addCriterion("CONTACTPERSON like", value, "contactperson");
            return (Criteria) this;
        }

        public Criteria andContactpersonNotLike(String value) {
            addCriterion("CONTACTPERSON not like", value, "contactperson");
            return (Criteria) this;
        }

        public Criteria andContactpersonIn(List<String> values) {
            addCriterion("CONTACTPERSON in", values, "contactperson");
            return (Criteria) this;
        }

        public Criteria andContactpersonNotIn(List<String> values) {
            addCriterion("CONTACTPERSON not in", values, "contactperson");
            return (Criteria) this;
        }

        public Criteria andContactpersonBetween(String value1, String value2) {
            addCriterion("CONTACTPERSON between", value1, value2, "contactperson");
            return (Criteria) this;
        }

        public Criteria andContactpersonNotBetween(String value1, String value2) {
            addCriterion("CONTACTPERSON not between", value1, value2, "contactperson");
            return (Criteria) this;
        }

        public Criteria andContactphoneIsNull() {
            addCriterion("CONTACTPHONE is null");
            return (Criteria) this;
        }

        public Criteria andContactphoneIsNotNull() {
            addCriterion("CONTACTPHONE is not null");
            return (Criteria) this;
        }

        public Criteria andContactphoneEqualTo(String value) {
            addCriterion("CONTACTPHONE =", value, "contactphone");
            return (Criteria) this;
        }

        public Criteria andContactphoneNotEqualTo(String value) {
            addCriterion("CONTACTPHONE <>", value, "contactphone");
            return (Criteria) this;
        }

        public Criteria andContactphoneGreaterThan(String value) {
            addCriterion("CONTACTPHONE >", value, "contactphone");
            return (Criteria) this;
        }

        public Criteria andContactphoneGreaterThanOrEqualTo(String value) {
            addCriterion("CONTACTPHONE >=", value, "contactphone");
            return (Criteria) this;
        }

        public Criteria andContactphoneLessThan(String value) {
            addCriterion("CONTACTPHONE <", value, "contactphone");
            return (Criteria) this;
        }

        public Criteria andContactphoneLessThanOrEqualTo(String value) {
            addCriterion("CONTACTPHONE <=", value, "contactphone");
            return (Criteria) this;
        }

        public Criteria andContactphoneLike(String value) {
            addCriterion("CONTACTPHONE like", value, "contactphone");
            return (Criteria) this;
        }

        public Criteria andContactphoneNotLike(String value) {
            addCriterion("CONTACTPHONE not like", value, "contactphone");
            return (Criteria) this;
        }

        public Criteria andContactphoneIn(List<String> values) {
            addCriterion("CONTACTPHONE in", values, "contactphone");
            return (Criteria) this;
        }

        public Criteria andContactphoneNotIn(List<String> values) {
            addCriterion("CONTACTPHONE not in", values, "contactphone");
            return (Criteria) this;
        }

        public Criteria andContactphoneBetween(String value1, String value2) {
            addCriterion("CONTACTPHONE between", value1, value2, "contactphone");
            return (Criteria) this;
        }

        public Criteria andContactphoneNotBetween(String value1, String value2) {
            addCriterion("CONTACTPHONE not between", value1, value2, "contactphone");
            return (Criteria) this;
        }

        public Criteria andContactaddressIsNull() {
            addCriterion("CONTACTADDRESS is null");
            return (Criteria) this;
        }

        public Criteria andContactaddressIsNotNull() {
            addCriterion("CONTACTADDRESS is not null");
            return (Criteria) this;
        }

        public Criteria andContactaddressEqualTo(String value) {
            addCriterion("CONTACTADDRESS =", value, "contactaddress");
            return (Criteria) this;
        }

        public Criteria andContactaddressNotEqualTo(String value) {
            addCriterion("CONTACTADDRESS <>", value, "contactaddress");
            return (Criteria) this;
        }

        public Criteria andContactaddressGreaterThan(String value) {
            addCriterion("CONTACTADDRESS >", value, "contactaddress");
            return (Criteria) this;
        }

        public Criteria andContactaddressGreaterThanOrEqualTo(String value) {
            addCriterion("CONTACTADDRESS >=", value, "contactaddress");
            return (Criteria) this;
        }

        public Criteria andContactaddressLessThan(String value) {
            addCriterion("CONTACTADDRESS <", value, "contactaddress");
            return (Criteria) this;
        }

        public Criteria andContactaddressLessThanOrEqualTo(String value) {
            addCriterion("CONTACTADDRESS <=", value, "contactaddress");
            return (Criteria) this;
        }

        public Criteria andContactaddressLike(String value) {
            addCriterion("CONTACTADDRESS like", value, "contactaddress");
            return (Criteria) this;
        }

        public Criteria andContactaddressNotLike(String value) {
            addCriterion("CONTACTADDRESS not like", value, "contactaddress");
            return (Criteria) this;
        }

        public Criteria andContactaddressIn(List<String> values) {
            addCriterion("CONTACTADDRESS in", values, "contactaddress");
            return (Criteria) this;
        }

        public Criteria andContactaddressNotIn(List<String> values) {
            addCriterion("CONTACTADDRESS not in", values, "contactaddress");
            return (Criteria) this;
        }

        public Criteria andContactaddressBetween(String value1, String value2) {
            addCriterion("CONTACTADDRESS between", value1, value2, "contactaddress");
            return (Criteria) this;
        }

        public Criteria andContactaddressNotBetween(String value1, String value2) {
            addCriterion("CONTACTADDRESS not between", value1, value2, "contactaddress");
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

        public Criteria andIssuesnumberIsNull() {
            addCriterion("ISSUESNUMBER is null");
            return (Criteria) this;
        }

        public Criteria andIssuesnumberIsNotNull() {
            addCriterion("ISSUESNUMBER is not null");
            return (Criteria) this;
        }

        public Criteria andIssuesnumberEqualTo(Integer value) {
            addCriterion("ISSUESNUMBER =", value, "issuesnumber");
            return (Criteria) this;
        }

        public Criteria andIssuesnumberNotEqualTo(Integer value) {
            addCriterion("ISSUESNUMBER <>", value, "issuesnumber");
            return (Criteria) this;
        }

        public Criteria andIssuesnumberGreaterThan(Integer value) {
            addCriterion("ISSUESNUMBER >", value, "issuesnumber");
            return (Criteria) this;
        }

        public Criteria andIssuesnumberGreaterThanOrEqualTo(Integer value) {
            addCriterion("ISSUESNUMBER >=", value, "issuesnumber");
            return (Criteria) this;
        }

        public Criteria andIssuesnumberLessThan(Integer value) {
            addCriterion("ISSUESNUMBER <", value, "issuesnumber");
            return (Criteria) this;
        }

        public Criteria andIssuesnumberLessThanOrEqualTo(Integer value) {
            addCriterion("ISSUESNUMBER <=", value, "issuesnumber");
            return (Criteria) this;
        }

        public Criteria andIssuesnumberIn(List<Integer> values) {
            addCriterion("ISSUESNUMBER in", values, "issuesnumber");
            return (Criteria) this;
        }

        public Criteria andIssuesnumberNotIn(List<Integer> values) {
            addCriterion("ISSUESNUMBER not in", values, "issuesnumber");
            return (Criteria) this;
        }

        public Criteria andIssuesnumberBetween(Integer value1, Integer value2) {
            addCriterion("ISSUESNUMBER between", value1, value2, "issuesnumber");
            return (Criteria) this;
        }

        public Criteria andIssuesnumberNotBetween(Integer value1, Integer value2) {
            addCriterion("ISSUESNUMBER not between", value1, value2, "issuesnumber");
            return (Criteria) this;
        }

        public Criteria andPsptauthorityIsNull() {
            addCriterion("PSPTAUTHORITY is null");
            return (Criteria) this;
        }

        public Criteria andPsptauthorityIsNotNull() {
            addCriterion("PSPTAUTHORITY is not null");
            return (Criteria) this;
        }

        public Criteria andPsptauthorityEqualTo(String value) {
            addCriterion("PSPTAUTHORITY =", value, "psptauthority");
            return (Criteria) this;
        }

        public Criteria andPsptauthorityNotEqualTo(String value) {
            addCriterion("PSPTAUTHORITY <>", value, "psptauthority");
            return (Criteria) this;
        }

        public Criteria andPsptauthorityGreaterThan(String value) {
            addCriterion("PSPTAUTHORITY >", value, "psptauthority");
            return (Criteria) this;
        }

        public Criteria andPsptauthorityGreaterThanOrEqualTo(String value) {
            addCriterion("PSPTAUTHORITY >=", value, "psptauthority");
            return (Criteria) this;
        }

        public Criteria andPsptauthorityLessThan(String value) {
            addCriterion("PSPTAUTHORITY <", value, "psptauthority");
            return (Criteria) this;
        }

        public Criteria andPsptauthorityLessThanOrEqualTo(String value) {
            addCriterion("PSPTAUTHORITY <=", value, "psptauthority");
            return (Criteria) this;
        }

        public Criteria andPsptauthorityLike(String value) {
            addCriterion("PSPTAUTHORITY like", value, "psptauthority");
            return (Criteria) this;
        }

        public Criteria andPsptauthorityNotLike(String value) {
            addCriterion("PSPTAUTHORITY not like", value, "psptauthority");
            return (Criteria) this;
        }

        public Criteria andPsptauthorityIn(List<String> values) {
            addCriterion("PSPTAUTHORITY in", values, "psptauthority");
            return (Criteria) this;
        }

        public Criteria andPsptauthorityNotIn(List<String> values) {
            addCriterion("PSPTAUTHORITY not in", values, "psptauthority");
            return (Criteria) this;
        }

        public Criteria andPsptauthorityBetween(String value1, String value2) {
            addCriterion("PSPTAUTHORITY between", value1, value2, "psptauthority");
            return (Criteria) this;
        }

        public Criteria andPsptauthorityNotBetween(String value1, String value2) {
            addCriterion("PSPTAUTHORITY not between", value1, value2, "psptauthority");
            return (Criteria) this;
        }

        public Criteria andPsptstartdateIsNull() {
            addCriterion("PSPTSTARTDATE is null");
            return (Criteria) this;
        }

        public Criteria andPsptstartdateIsNotNull() {
            addCriterion("PSPTSTARTDATE is not null");
            return (Criteria) this;
        }

        public Criteria andPsptstartdateEqualTo(Date value) {
            addCriterion("PSPTSTARTDATE =", value, "psptstartdate");
            return (Criteria) this;
        }

        public Criteria andPsptstartdateNotEqualTo(Date value) {
            addCriterion("PSPTSTARTDATE <>", value, "psptstartdate");
            return (Criteria) this;
        }

        public Criteria andPsptstartdateGreaterThan(Date value) {
            addCriterion("PSPTSTARTDATE >", value, "psptstartdate");
            return (Criteria) this;
        }

        public Criteria andPsptstartdateGreaterThanOrEqualTo(Date value) {
            addCriterion("PSPTSTARTDATE >=", value, "psptstartdate");
            return (Criteria) this;
        }

        public Criteria andPsptstartdateLessThan(Date value) {
            addCriterion("PSPTSTARTDATE <", value, "psptstartdate");
            return (Criteria) this;
        }

        public Criteria andPsptstartdateLessThanOrEqualTo(Date value) {
            addCriterion("PSPTSTARTDATE <=", value, "psptstartdate");
            return (Criteria) this;
        }

        public Criteria andPsptstartdateIn(List<Date> values) {
            addCriterion("PSPTSTARTDATE in", values, "psptstartdate");
            return (Criteria) this;
        }

        public Criteria andPsptstartdateNotIn(List<Date> values) {
            addCriterion("PSPTSTARTDATE not in", values, "psptstartdate");
            return (Criteria) this;
        }

        public Criteria andPsptstartdateBetween(Date value1, Date value2) {
            addCriterion("PSPTSTARTDATE between", value1, value2, "psptstartdate");
            return (Criteria) this;
        }

        public Criteria andPsptstartdateNotBetween(Date value1, Date value2) {
            addCriterion("PSPTSTARTDATE not between", value1, value2, "psptstartdate");
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

        public Criteria andCustomerremarkIsNull() {
            addCriterion("CUSTOMERREMARK is null");
            return (Criteria) this;
        }

        public Criteria andCustomerremarkIsNotNull() {
            addCriterion("CUSTOMERREMARK is not null");
            return (Criteria) this;
        }

        public Criteria andCustomerremarkEqualTo(String value) {
            addCriterion("CUSTOMERREMARK =", value, "customerremark");
            return (Criteria) this;
        }

        public Criteria andCustomerremarkNotEqualTo(String value) {
            addCriterion("CUSTOMERREMARK <>", value, "customerremark");
            return (Criteria) this;
        }

        public Criteria andCustomerremarkGreaterThan(String value) {
            addCriterion("CUSTOMERREMARK >", value, "customerremark");
            return (Criteria) this;
        }

        public Criteria andCustomerremarkGreaterThanOrEqualTo(String value) {
            addCriterion("CUSTOMERREMARK >=", value, "customerremark");
            return (Criteria) this;
        }

        public Criteria andCustomerremarkLessThan(String value) {
            addCriterion("CUSTOMERREMARK <", value, "customerremark");
            return (Criteria) this;
        }

        public Criteria andCustomerremarkLessThanOrEqualTo(String value) {
            addCriterion("CUSTOMERREMARK <=", value, "customerremark");
            return (Criteria) this;
        }

        public Criteria andCustomerremarkLike(String value) {
            addCriterion("CUSTOMERREMARK like", value, "customerremark");
            return (Criteria) this;
        }

        public Criteria andCustomerremarkNotLike(String value) {
            addCriterion("CUSTOMERREMARK not like", value, "customerremark");
            return (Criteria) this;
        }

        public Criteria andCustomerremarkIn(List<String> values) {
            addCriterion("CUSTOMERREMARK in", values, "customerremark");
            return (Criteria) this;
        }

        public Criteria andCustomerremarkNotIn(List<String> values) {
            addCriterion("CUSTOMERREMARK not in", values, "customerremark");
            return (Criteria) this;
        }

        public Criteria andCustomerremarkBetween(String value1, String value2) {
            addCriterion("CUSTOMERREMARK between", value1, value2, "customerremark");
            return (Criteria) this;
        }

        public Criteria andCustomerremarkNotBetween(String value1, String value2) {
            addCriterion("CUSTOMERREMARK not between", value1, value2, "customerremark");
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