package com.unicom.wobeyond.vo.statistics;

import com.unicom.wobeyond.vo.BaseRespVO;

import java.util.List;

public class DistrictSignCountRespVO extends BaseRespVO {

    private List<DistrictSignCountVO> list;

    public List<DistrictSignCountVO> getList() {
        return list;
    }

    public void setList(List<DistrictSignCountVO> list) {
        this.list = list;
    }
}
