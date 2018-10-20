package com.unicom.wobeyond.vo.statistics;

import com.unicom.wobeyond.vo.BaseRespVO;

import java.util.List;

public class DistrictSignCountRespVO extends BaseRespVO {

    private List<StringArrayVO> list;

    public List<StringArrayVO> getList() {
        return list;
    }

    public void setList(List<StringArrayVO> list) {
        this.list = list;
    }
}
