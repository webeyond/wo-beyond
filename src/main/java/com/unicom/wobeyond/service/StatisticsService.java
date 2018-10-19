package com.unicom.wobeyond.service;

import com.unicom.wobeyond.vo.PaginaionVO;
import com.unicom.wobeyond.vo.statistics.CustomerCountRespVO;
import com.unicom.wobeyond.vo.statistics.OrderVO;
import com.unicom.wobeyond.vo.statistics.SignFunnelCountRespVO;

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
}
