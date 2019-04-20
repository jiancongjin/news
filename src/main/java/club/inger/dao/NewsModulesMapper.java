package club.inger.dao;

import club.inger.entity.NewsModules;
import club.inger.entity.NewsModulesExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface NewsModulesMapper {
    int countByExample(NewsModulesExample example);

    int deleteByExample(NewsModulesExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(NewsModules record);

    int insertSelective(NewsModules record);

    List<NewsModules> selectByExampleWithBLOBs(NewsModulesExample example);

    List<NewsModules> selectByExample(NewsModulesExample example);

    NewsModules selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") NewsModules record, @Param("example") NewsModulesExample example);

    int updateByExampleWithBLOBs(@Param("record") NewsModules record, @Param("example") NewsModulesExample example);

    int updateByExample(@Param("record") NewsModules record, @Param("example") NewsModulesExample example);

    int updateByPrimaryKeySelective(NewsModules record);

    int updateByPrimaryKeyWithBLOBs(NewsModules record);
}