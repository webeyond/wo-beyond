package com.unicom.wobeyond.controller;

import com.unicom.wobeyond.constant.ApplicationConstant;
import com.unicom.wobeyond.service.StatisticsService;
import com.unicom.wobeyond.vo.PaginaionVO;
import com.unicom.wobeyond.vo.statistics.CustomerCountRespVO;
import com.unicom.wobeyond.vo.statistics.OrderVO;
import com.unicom.wobeyond.vo.statistics.SignFunnelCountRespVO;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Map;

@Controller
@RequestMapping(value = "statistics")
@Api(value = "StatisticsController",description = "统计模块")
public class StatisticsController {

    private static Logger logger = LoggerFactory.getLogger(StatisticsController.class);

    @Autowired
    private StatisticsService statisticsService;


    /**
     * @param req
     * @param page
     * @param pageSize
     * @return PaginaionVO<OrderVO>
     * @Title: selectOrderList
     * @Description: 查询订单列表
     */
    @ResponseBody
    @RequestMapping(value = "v1/selectOrderList", method= RequestMethod.POST)
    @ApiImplicitParam(name = "req", value = "查询订单列表入参", dataType = "OrderVO")
    @ApiOperation(value="查询订单列表接口", response = PaginaionVO.class)
    public PaginaionVO<OrderVO> selectOrderList(@RequestBody OrderVO req, int page, int pageSize) {
        try {
            return statisticsService.selectOrderList(req, page, pageSize);
        } catch (Exception e) {
            e.printStackTrace();
            PaginaionVO<OrderVO> paginaionVO = new PaginaionVO<OrderVO>();
            paginaionVO.setMsg(e.getMessage());
            paginaionVO.setResult(ApplicationConstant.RESULT_FALTURE);
            logger.error(paginaionVO.getMsg());
            return paginaionVO;
        }
    }

    /**
     * @return CustomerCountRespVO
     * @Title: selectSignCustomerCount
     * @Description: 统计每个区签约用户数量
     */
    @ResponseBody
    @RequestMapping(value = "v1/selectSignCustomerCount", method= RequestMethod.POST)
    @ApiOperation(value="统计每个区签约用户数量接口", response = CustomerCountRespVO.class)
    public CustomerCountRespVO selectSignCustomerCount() {
        try {
            return statisticsService.selectSignCustomerCount();
        } catch (Exception e) {
            e.printStackTrace();
            CustomerCountRespVO respVO = new CustomerCountRespVO();
            respVO.setMsg(e.getMessage());
            respVO.setResult(ApplicationConstant.RESULT_FALTURE);
            logger.error(respVO.getMsg());
            return respVO;
        }
    }

    /**
     * @return SignFunnelCountRespVO
     * @Title: selectSignFunnelCount
     * @Description: 统计签约漏斗图
     */
    @ResponseBody
    @RequestMapping(value = "v1/selectSignFunnelCount", method= RequestMethod.POST)
    @ApiOperation(value="统计签约漏斗图接口", response = SignFunnelCountRespVO.class)
    public SignFunnelCountRespVO selectSignFunnelCount() {
        try {
            return statisticsService.selectSignFunnelCount();
        } catch (Exception e) {
            e.printStackTrace();
            SignFunnelCountRespVO respVO = new SignFunnelCountRespVO();
            respVO.setMsg(e.getMessage());
            respVO.setResult(ApplicationConstant.RESULT_FALTURE);
            logger.error(respVO.getMsg());
            return respVO;
        }
    }


}

