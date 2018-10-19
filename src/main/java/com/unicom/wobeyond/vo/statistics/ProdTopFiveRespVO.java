package com.unicom.wobeyond.vo.statistics;

import com.unicom.wobeyond.vo.BaseRespVO;

import java.util.List;

public class ProdTopFiveRespVO extends BaseRespVO {

    private List<ProdTopFiveVO> list;

    public List<ProdTopFiveVO> getList() {
        return list;
    }

    public void setList(List<ProdTopFiveVO> list) {
        this.list = list;
    }
}
