package club.inger.dao;

import club.inger.entity.Recommendations;
import club.inger.entity.RecommendationsExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface RecommendationsMapper {
    int countByExample(RecommendationsExample example);

    int deleteByExample(RecommendationsExample example);

    int deleteByPrimaryKey(Long id);

    int insert(Recommendations record);

    int insertSelective(Recommendations record);

    List<Recommendations> selectByExample(RecommendationsExample example);

    Recommendations selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") Recommendations record, @Param("example") RecommendationsExample example);

    int updateByExample(@Param("record") Recommendations record, @Param("example") RecommendationsExample example);

    int updateByPrimaryKeySelective(Recommendations record);

    int updateByPrimaryKey(Recommendations record);
}