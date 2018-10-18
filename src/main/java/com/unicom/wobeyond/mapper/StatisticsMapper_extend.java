package com.unicom.wobeyond.mapper;


import com.unicom.wobeyond.vo.statistics.CustomerCountVO;
import com.unicom.wobeyond.vo.statistics.OrderVO;

import java.util.List;

/**
 * 
 * @ClassName: StatisticsMapper_extend
 * @Description: TODO (统计功能mapper)
 */
public interface StatisticsMapper_extend {
	
	List<OrderVO> selectOrderList();

    /**
     * 统计每个区签约用户人数
     * @return
     */
	List<CustomerCountVO> selectSignCustomerCount();


   
}