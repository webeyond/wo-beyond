package com.unicom.wobeyond.mapper;

import com.unicom.wobeyond.model.OrderSend;
import com.unicom.wobeyond.model.OrderSendExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface OrderSendMapper {
    int countByExample(OrderSendExample example);

    int deleteByExample(OrderSendExample example);

    int deleteByPrimaryKey(Integer deliNo);

    int insert(OrderSend record);

    int insertSelective(OrderSend record);

    List<OrderSend> selectByExample(OrderSendExample example);

    OrderSend selectByPrimaryKey(Integer deliNo);

    int updateByExampleSelective(@Param("record") OrderSend record, @Param("example") OrderSendExample example);

    int updateByExample(@Param("record") OrderSend record, @Param("example") OrderSendExample example);

    int updateByPrimaryKeySelective(OrderSend record);

    int updateByPrimaryKey(OrderSend record);
}