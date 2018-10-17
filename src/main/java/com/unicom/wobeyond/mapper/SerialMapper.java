package com.unicom.wobeyond.mapper;

import com.unicom.wobeyond.model.Serial;
import com.unicom.wobeyond.model.SerialExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SerialMapper {
    int countByExample(SerialExample example);

    int deleteByExample(SerialExample example);

    int deleteByPrimaryKey(Integer serialId);

    int insert(Serial record);

    int insertSelective(Serial record);

    List<Serial> selectByExample(SerialExample example);

    Serial selectByPrimaryKey(Integer serialId);

    int updateByExampleSelective(@Param("record") Serial record, @Param("example") SerialExample example);

    int updateByExample(@Param("record") Serial record, @Param("example") SerialExample example);

    int updateByPrimaryKeySelective(Serial record);

    int updateByPrimaryKey(Serial record);
}