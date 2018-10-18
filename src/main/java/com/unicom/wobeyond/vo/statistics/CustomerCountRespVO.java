package com.unicom.wobeyond.vo.statistics;

import com.unicom.wobeyond.vo.BaseRespVO;

import java.util.List;

public class CustomerCountRespVO extends BaseRespVO {

    private List<CustomerCountVO> list;

    public List<CustomerCountVO> getList() {
        return list;
    }

    public void setList(List<CustomerCountVO> list) {
        this.list = list;
    }
}
