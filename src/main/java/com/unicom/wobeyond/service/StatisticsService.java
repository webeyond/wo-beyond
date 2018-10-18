package com.unicom.wobeyond.service;

import com.unicom.wobeyond.vo.PaginaionVO;
import com.unicom.wobeyond.vo.statistics.OrderVO;

public interface StatisticsService {

    PaginaionVO<OrderVO> selectOrderList(OrderVO reqVO, int page, int pageSize) throws Exception;
}
