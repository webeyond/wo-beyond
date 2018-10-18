package com.unicom.wobeyond.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.unicom.wobeyond.constant.ApplicationConstant;
import com.unicom.wobeyond.mapper.ProdMapper;
import com.unicom.wobeyond.mapper.StatisticsMapper_extend;
import com.unicom.wobeyond.model.AccountExample;
import com.unicom.wobeyond.model.Prod;
import com.unicom.wobeyond.service.FileUploadService;
import com.unicom.wobeyond.service.StatisticsService;
import com.unicom.wobeyond.util.WoBeyondUtil;
import com.unicom.wobeyond.vo.PaginaionVO;
import com.unicom.wobeyond.vo.statistics.OrderVO;
import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.StandardCopyOption;
import java.util.List;
import java.util.UUID;

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
}
