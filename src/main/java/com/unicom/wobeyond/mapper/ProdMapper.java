package com.unicom.wobeyond.mapper;

import com.unicom.wobeyond.model.Prod;
import com.unicom.wobeyond.model.ProdExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ProdMapper {
    int countByExample(ProdExample example);

    int deleteByExample(ProdExample example);

    int deleteByPrimaryKey(Integer prodId);

    int insert(Prod record);

    int insertSelective(Prod record);

    List<Prod> selectByExample(ProdExample example);

    Prod selectByPrimaryKey(Integer prodId);

    int updateByExampleSelective(@Param("record") Prod record, @Param("example") ProdExample example);

    int updateByExample(@Param("record") Prod record, @Param("example") ProdExample example);

    int updateByPrimaryKeySelective(Prod record);

    int updateByPrimaryKey(Prod record);
}