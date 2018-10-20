package com.unicom.wobeyond.vo.statistics;

import com.unicom.wobeyond.vo.BaseRespVO;

import java.util.List;

public class SerialHeatAnalysisRespVO extends BaseRespVO {

    List<StringArrayArrayVO> list;

    public List<StringArrayArrayVO> getList() {
        return list;
    }

    public void setList(List<StringArrayArrayVO> list) {
        this.list = list;
    }
}
