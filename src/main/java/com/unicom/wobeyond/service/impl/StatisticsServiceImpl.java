package com.unicom.wobeyond.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.unicom.wobeyond.constant.ApplicationConstant;
import com.unicom.wobeyond.mapper.StatisticsMapper_extend;
import com.unicom.wobeyond.service.StatisticsService;
import com.unicom.wobeyond.vo.PaginaionVO;
import com.unicom.wobeyond.vo.statistics.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class StatisticsServiceImpl implements StatisticsService {

    private Logger logger = LoggerFactory.getLogger(StatisticsServiceImpl.class);

    @Autowired
    private StatisticsMapper_extend statisticsMapper_extend;


    @Override
    public PaginaionVO<OrderVO> selectOrderList(OrderVO req, int page, int pageSize) throws Exception {
        PaginaionVO<OrderVO> respVO = new PaginaionVO<OrderVO>();
        if(req == null){
            respVO.setResult(ApplicationConstant.RESULT_FALTURE);
            respVO.setMsg("请求参数为空！");
            logger.error(respVO.getMsg());
            return respVO;
        }
        PageHelper.startPage(page, pageSize);

        List<OrderVO> list = statisticsMapper_extend.selectOrderList();
        PageInfo<OrderVO> pageInfo = new PageInfo<OrderVO>(list);

        respVO.setTotalPage(pageInfo.getPages());
        respVO.setTotal((int) pageInfo.getTotal());
        respVO.setCurrPage(page);
        respVO.setPageSize(pageSize);
        respVO.setRows(list);
        respVO.setResult(ApplicationConstant.RESULT_SUCCESS);
        respVO.setMsg("获取订单列表成功！");
        return respVO;
    }

    @Override
    public CustomerCountRespVO selectSignCustomerCount() throws Exception {

        CustomerCountRespVO respVO = new CustomerCountRespVO();
        List<StringIntegerVO> list = statisticsMapper_extend.selectSignCustomerCount();
        respVO.setList(list);
        respVO.setResult(ApplicationConstant.RESULT_SUCCESS);
        respVO.setMsg("获取每个区签约用户数量成功！");
        return respVO;
    }

    @Override
    public SignFunnelCountRespVO selectSignFunnelCount() throws Exception {
        SignFunnelCountRespVO respVO = new SignFunnelCountRespVO();
        List<SignFunnelCountVO> list = statisticsMapper_extend.selectSignFunnelCount();
        respVO.setList(list);
        respVO.setResult(ApplicationConstant.RESULT_SUCCESS);
        respVO.setMsg("获取签约情况漏斗统计成功！");
        return respVO;
    }

    @Override
    public AccountTopFiveRespVO selectAccountTopFive() throws Exception {
        AccountTopFiveRespVO respVO = new AccountTopFiveRespVO();
        List<AccountTopFiveVO> list = statisticsMapper_extend.selectAccountTopFive();
        respVO.setList(list);
        respVO.setResult(ApplicationConstant.RESULT_SUCCESS);
        respVO.setMsg("获取地推员前五名销售数量成功！");
        return respVO;
    }

    @Override
    public DistrictSignCountRespVO selectDistrictSignCount() throws Exception {

        DistrictSignCountRespVO respVO = new DistrictSignCountRespVO();
        //先定义map结构，把数据格式化到map里
        Map<String, int[]> map = new HashMap<>();
        map.put("北区", new int[10]);
        map.put("嘉定", new int[10]);
        map.put("宝山", new int[10]);
        map.put("闵行", new int[10]);
        map.put("松江", new int[10]);
        map.put("西区", new int[10]);
        map.put("奉贤", new int[10]);
        map.put("崇明", new int[10]);
        map.put("青浦", new int[10]);
        map.put("东区", new int[10]);

        List<DistrictSignCountVO> list = statisticsMapper_extend.selectDistrictSignCount();
        for (DistrictSignCountVO vo : list) {
            String district = vo.getDistrict();
            if (map.containsKey(district)) {
                int[] ints = map.get(district);
                ints[vo.getMonths() - 1] = vo.getCounts();
                map.replace(district, ints);
            }
        }

        //把map中的数据转成返回格式
        List<StringArrayVO> respList = new ArrayList<>();
        Set<Map.Entry<String, int[]>> entries = map.entrySet();
        for (Map.Entry<String, int[]> entry : entries) {
            respList.add(new StringArrayVO(entry.getKey(), entry.getValue()));
        }

        respVO.setList(respList);
        respVO.setResult(ApplicationConstant.RESULT_SUCCESS);
        respVO.setMsg("获取区县近十个月签约数量成功！");
        return respVO;
    }

    @Override
    public ProdTopFiveRespVO selectProdTopFive() throws Exception {
        ProdTopFiveRespVO respVO = new ProdTopFiveRespVO();
        List<StringIntegerVO> list = statisticsMapper_extend.selectProdTopFive();
        respVO.setList(list);
        respVO.setResult(ApplicationConstant.RESULT_SUCCESS);
        respVO.setMsg("获取手机卡产品前五名销售数量成功！");
        return respVO;
    }


}
