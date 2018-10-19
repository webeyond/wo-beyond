package com.unicom.wobeyond.vo.statistics;

import com.unicom.wobeyond.vo.BaseRespVO;

import java.util.List;

public class SignFunnelCountRespVO extends BaseRespVO {

    private List<SignFunnelCountVO> list;

    public List<SignFunnelCountVO> getList() {
        return list;
    }

    public void setList(List<SignFunnelCountVO> list) {
        this.list = list;
    }
}
