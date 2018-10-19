package com.unicom.wobeyond.service;

import com.unicom.wobeyond.vo.PaginaionVO;
import com.unicom.wobeyond.vo.statistics.*;

public interface StatisticsService {

    PaginaionVO<OrderVO> selectOrderList(OrderVO reqVO, int page, int pageSize) throws Exception;

    /**
     * 统计每个区签约用户人数
     * @return
     */
    CustomerCountRespVO selectSignCustomerCount() throws Exception;

    /**
     * 统计签约漏斗图
     * @return
     */
    SignFunnelCountRespVO selectSignFunnelCount() throws Exception;

    /**
     * 统计地推员前五名销售数量
     * @return
     */
    AccountTopFiveRespVO selectAccountTopFive() throws Exception;

    /**
     * 统计区县签约数量
     * @return
     */
    DistrictSignCountRespVO selectDistrictSignCount() throws Exception;
}
