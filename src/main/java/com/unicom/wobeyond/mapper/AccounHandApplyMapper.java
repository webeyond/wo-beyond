package com.unicom.wobeyond.mapper;

import com.unicom.wobeyond.model.AccounHandApply;
import com.unicom.wobeyond.model.AccounHandApplyExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface AccounHandApplyMapper {
    int countByExample(AccounHandApplyExample example);

    int deleteByExample(AccounHandApplyExample example);

    int deleteByPrimaryKey(Integer accountHandApplyId);

    int insert(AccounHandApply record);

    int insertSelective(AccounHandApply record);

    List<AccounHandApply> selectByExample(AccounHandApplyExample example);

    AccounHandApply selectByPrimaryKey(Integer accountHandApplyId);

    int updateByExampleSelective(@Param("record") AccounHandApply record, @Param("example") AccounHandApplyExample example);

    int updateByExample(@Param("record") AccounHandApply record, @Param("example") AccounHandApplyExample example);

    int updateByPrimaryKeySelective(AccounHandApply record);

    int updateByPrimaryKey(AccounHandApply record);
}