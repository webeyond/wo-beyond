package com.unicom.wobeyond.controller;

import com.unicom.wobeyond.constant.ApplicationConstant;
import com.unicom.wobeyond.service.StatisticsService;
import com.unicom.wobeyond.vo.PaginaionVO;
import com.unicom.wobeyond.vo.statistics.OrderVO;
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

@Controller
@RequestMapping(value = "statistics")
@Api(value = "StatisticsController",description = "统计接口")
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


}

