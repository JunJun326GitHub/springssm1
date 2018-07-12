package com.ssm.mapper;

import com.ssm.domain.TbScore;
import com.ssm.domain.TbScoreExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface TbScoreMapper {
    int countByExample(TbScoreExample example);

    int deleteByExample(TbScoreExample example);

    int deleteByPrimaryKey(Integer bh);

    int insert(TbScore record);

    int insertSelective(TbScore record);

    List<TbScore> selectByExample(TbScoreExample example);

    TbScore selectByPrimaryKey(Integer bh);

    int updateByExampleSelective(@Param("record") TbScore record, @Param("example") TbScoreExample example);

    int updateByExample(@Param("record") TbScore record, @Param("example") TbScoreExample example);

    int updateByPrimaryKeySelective(TbScore record);

    int updateByPrimaryKey(TbScore record);
    List<TbScore> selectScore();

}