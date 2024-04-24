package hw.gs.mapper;

import hw.gs.entity.Videos;
import hw.gs.entity.VideosExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface VideosMapper {
    long countByExample(VideosExample example);

    int deleteByExample(VideosExample example);

    int deleteByPrimaryKey(Long id);

    int insert(Videos row);

    int insertSelective(Videos row);

    List<Videos> selectByExampleWithBLOBs(VideosExample example);

    List<Videos> selectByExample(VideosExample example);

    Videos selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("row") Videos row, @Param("example") VideosExample example);

    int updateByExampleWithBLOBs(@Param("row") Videos row, @Param("example") VideosExample example);

    int updateByExample(@Param("row") Videos row, @Param("example") VideosExample example);

    int updateByPrimaryKeySelective(Videos row);

    int updateByPrimaryKeyWithBLOBs(Videos row);

    int updateByPrimaryKey(Videos row);
}