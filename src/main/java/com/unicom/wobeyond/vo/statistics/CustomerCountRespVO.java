package com.unicom.wobeyond.vo.statistics;

import com.unicom.wobeyond.vo.BaseRespVO;

import java.util.List;

public class CustomerCountRespVO extends BaseRespVO {

    private List<StringIntegerVO> list;

    public List<StringIntegerVO> getList() {
        return list;
    }

    public void setList(List<StringIntegerVO> list) {
        this.list = list;
    }
}
