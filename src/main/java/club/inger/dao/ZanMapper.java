package club.inger.dao;

import club.inger.entity.Zan;
import club.inger.entity.ZanExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface ZanMapper {
    int countByExample(ZanExample example);

    int deleteByExample(ZanExample example);

    int deleteByPrimaryKey(Long id);

    int insert(Zan record);

    int insertSelective(Zan record);

    List<Zan> selectByExample(ZanExample example);

    Zan selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") Zan record, @Param("example") ZanExample example);

    int updateByExample(@Param("record") Zan record, @Param("example") ZanExample example);

    int updateByPrimaryKeySelective(Zan record);

    int updateByPrimaryKey(Zan record);
}