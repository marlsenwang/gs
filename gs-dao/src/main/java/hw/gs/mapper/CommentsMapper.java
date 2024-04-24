package hw.gs.mapper;

import hw.gs.entity.Comments;
import hw.gs.entity.CommentsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CommentsMapper {
    long countByExample(CommentsExample example);

    int deleteByExample(CommentsExample example);

    int deleteByPrimaryKey(Long id);

    int insert(Comments row);

    int insertSelective(Comments row);

    List<Comments> selectByExampleWithBLOBs(CommentsExample example);

    List<Comments> selectByExample(CommentsExample example);

    Comments selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("row") Comments row, @Param("example") CommentsExample example);

    int updateByExampleWithBLOBs(@Param("row") Comments row, @Param("example") CommentsExample example);

    int updateByExample(@Param("row") Comments row, @Param("example") CommentsExample example);

    int updateByPrimaryKeySelective(Comments row);

    int updateByPrimaryKeyWithBLOBs(Comments row);

    int updateByPrimaryKey(Comments row);
}