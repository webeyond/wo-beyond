package com.unicom.wobeyond.controller;

import com.unicom.wobeyond.constant.ApplicationConstant;
import com.unicom.wobeyond.service.StatisticsService;
import com.unicom.wobeyond.vo.PaginaionVO;
import com.unicom.wobeyond.vo.statistics.*;
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
    @ApiOperation(value="查询订单列表", response = PaginaionVO.class)
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
    @ApiOperation(value="统计每个区签约用户数量", response = CustomerCountRespVO.class)
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
    @ApiOperation(value="统计签约漏斗图", response = SignFunnelCountRespVO.class)
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

    /**
     * @return AccountTopFiveRespVO
     * @Title: selectAccountTopFive
     * @Description: 统计地推员前五名销售数量
     */
    @ResponseBody
    @RequestMapping(value = "v1/selectAccountTopFive", method= RequestMethod.POST)
    @ApiOperation(value="统计地推员前五名销售数量", response = AccountTopFiveRespVO.class)
    public AccountTopFiveRespVO selectAccountTopFive() {
        try {
            return statisticsService.selectAccountTopFive();
        } catch (Exception e) {
            e.printStackTrace();
            AccountTopFiveRespVO respVO = new AccountTopFiveRespVO();
            respVO.setMsg(e.getMessage());
            respVO.setResult(ApplicationConstant.RESULT_FALTURE);
            logger.error(respVO.getMsg());
            return respVO;
        }
    }

    /**
     * @return DistrictSignCountRespVO
     * @Title: selectDistrictSignCount
     * @Description: 统计区县签约数量
     */
    @ResponseBody
    @RequestMapping(value = "v1/selectDistrictSignCount", method= RequestMethod.POST)
    @ApiOperation(value="统计区县签约数量", response = DistrictSignCountRespVO.class)
    public DistrictSignCountRespVO selectDistrictSignCount() {
        try {
            return statisticsService.selectDistrictSignCount();
        } catch (Exception e) {
            e.printStackTrace();
            DistrictSignCountRespVO respVO = new DistrictSignCountRespVO();
            respVO.setMsg(e.getMessage());
            respVO.setResult(ApplicationConstant.RESULT_FALTURE);
            logger.error(respVO.getMsg());
            return respVO;
        }
    }

    /**
     * @return ProdTopFiveRespVO
     * @Title: selectProdTopFive
     * @Description: 统计手机卡产品前五名销售数量
     */
    @ResponseBody
    @RequestMapping(value = "v1/selectProdTopFive", method= RequestMethod.POST)
    @ApiOperation(value="统计手机卡产品前五名销售数量", response = ProdTopFiveRespVO.class)
    public ProdTopFiveRespVO selectProdTopFive() {
        try {
            return statisticsService.selectProdTopFive();
        } catch (Exception e) {
            e.printStackTrace();
            ProdTopFiveRespVO respVO = new ProdTopFiveRespVO();
            respVO.setMsg(e.getMessage());
            respVO.setResult(ApplicationConstant.RESULT_FALTURE);
            logger.error(respVO.getMsg());
            return respVO;
        }
    }


}

