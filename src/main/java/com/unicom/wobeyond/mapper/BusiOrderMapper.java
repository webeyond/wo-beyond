package com.unicom.wobeyond.mapper;

import com.unicom.wobeyond.model.BusiOrder;
import com.unicom.wobeyond.model.BusiOrderExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface BusiOrderMapper {
    int countByExample(BusiOrderExample example);

    int deleteByExample(BusiOrderExample example);

    int deleteByPrimaryKey(Integer busiCellno);

    int insert(BusiOrder record);

    int insertSelective(BusiOrder record);

    List<BusiOrder> selectByExample(BusiOrderExample example);

    BusiOrder selectByPrimaryKey(Integer busiCellno);

    int updateByExampleSelective(@Param("record") BusiOrder record, @Param("example") BusiOrderExample example);

    int updateByExample(@Param("record") BusiOrder record, @Param("example") BusiOrderExample example);

    int updateByPrimaryKeySelective(BusiOrder record);

    int updateByPrimaryKey(BusiOrder record);
}