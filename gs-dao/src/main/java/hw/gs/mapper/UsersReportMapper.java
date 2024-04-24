package hw.gs.mapper;

import hw.gs.entity.UsersReport;
import hw.gs.entity.UsersReportExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UsersReportMapper {
    long countByExample(UsersReportExample example);

    int deleteByExample(UsersReportExample example);

    int deleteByPrimaryKey(Long id);

    int insert(UsersReport row);

    int insertSelective(UsersReport row);

    List<UsersReport> selectByExample(UsersReportExample example);

    UsersReport selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("row") UsersReport row, @Param("example") UsersReportExample example);

    int updateByExample(@Param("row") UsersReport row, @Param("example") UsersReportExample example);

    int updateByPrimaryKeySelective(UsersReport row);

    int updateByPrimaryKey(UsersReport row);
}