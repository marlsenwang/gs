package hw.gs.mapper;

import hw.gs.entity.UsersFans;
import hw.gs.entity.UsersFansExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UsersFansMapper {
    long countByExample(UsersFansExample example);

    int deleteByExample(UsersFansExample example);

    int deleteByPrimaryKey(Long id);

    int insert(UsersFans row);

    int insertSelective(UsersFans row);

    List<UsersFans> selectByExample(UsersFansExample example);

    UsersFans selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("row") UsersFans row, @Param("example") UsersFansExample example);

    int updateByExample(@Param("row") UsersFans row, @Param("example") UsersFansExample example);

    int updateByPrimaryKeySelective(UsersFans row);

    int updateByPrimaryKey(UsersFans row);
}