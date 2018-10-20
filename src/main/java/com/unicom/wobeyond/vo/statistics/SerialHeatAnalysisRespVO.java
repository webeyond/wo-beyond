package com.unicom.wobeyond.vo.statistics;

import com.unicom.wobeyond.vo.BaseRespVO;

import java.util.List;

public class SerialHeatAnalysisRespVO extends BaseRespVO {

    List<SerialHeatAnalysisVO> list;

    public List<SerialHeatAnalysisVO> getList() {
        return list;
    }

    public void setList(List<SerialHeatAnalysisVO> list) {
        this.list = list;
    }
}
