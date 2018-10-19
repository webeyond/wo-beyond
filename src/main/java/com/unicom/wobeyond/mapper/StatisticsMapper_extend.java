package com.unicom.wobeyond.mapper;


import com.unicom.wobeyond.vo.statistics.AccountTopFiveVO;
import com.unicom.wobeyond.vo.statistics.CustomerCountVO;
import com.unicom.wobeyond.vo.statistics.OrderVO;
import com.unicom.wobeyond.vo.statistics.SignFunnelCountVO;

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

	/**
	 * 统计签约漏斗图
	 * @return
	 */
	List<SignFunnelCountVO> selectSignFunnelCount();

	/**
	 * 统计地推员前五名销售数量
	 * @return
	 */
	List<AccountTopFiveVO> selectAccountTopFive();


   
}