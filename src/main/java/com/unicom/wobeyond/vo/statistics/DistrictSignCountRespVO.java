package com.unicom.wobeyond.vo.statistics;

import com.unicom.wobeyond.vo.BaseRespVO;

import java.util.Map;

public class DistrictSignCountRespVO extends BaseRespVO {

    private Map<String, int[]> map;

    public Map<String, int[]> getMap() {
        return map;
    }

    public void setMap(Map<String, int[]> map) {
        this.map = map;
    }
}
