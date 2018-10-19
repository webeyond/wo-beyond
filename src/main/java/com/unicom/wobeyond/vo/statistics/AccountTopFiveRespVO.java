package com.unicom.wobeyond.vo.statistics;

import com.unicom.wobeyond.vo.BaseRespVO;

import java.util.List;

public class AccountTopFiveRespVO extends BaseRespVO {

    private List<AccountTopFiveVO> list;

    public List<AccountTopFiveVO> getList() {
        return list;
    }

    public void setList(List<AccountTopFiveVO> list) {
        this.list = list;
    }
}
