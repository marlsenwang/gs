package hw.gs.mapper;

import hw.gs.entity.UsersLikeVideos;
import hw.gs.entity.UsersLikeVideosExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UsersLikeVideosMapper {
    long countByExample(UsersLikeVideosExample example);

    int deleteByExample(UsersLikeVideosExample example);

    int deleteByPrimaryKey(Long id);

    int insert(UsersLikeVideos row);

    int insertSelective(UsersLikeVideos row);

    List<UsersLikeVideos> selectByExample(UsersLikeVideosExample example);

    UsersLikeVideos selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("row") UsersLikeVideos row, @Param("example") UsersLikeVideosExample example);

    int updateByExample(@Param("row") UsersLikeVideos row, @Param("example") UsersLikeVideosExample example);

    int updateByPrimaryKeySelective(UsersLikeVideos row);

    int updateByPrimaryKey(UsersLikeVideos row);
}