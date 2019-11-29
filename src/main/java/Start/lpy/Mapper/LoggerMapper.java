package Start.lpy.Mapper;

import Start.lpy.pojo.Logger;
import Start.lpy.pojo.LoggerExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface LoggerMapper {
    int countByExample(LoggerExample example);

    int deleteByExample(LoggerExample example);

    int deleteByPrimaryKey(Integer lid);

    int insert(Logger record);

    int insertSelective(Logger record);

    List<Logger> selectByExample(LoggerExample example);

    Logger selectByPrimaryKey(Integer lid);

    int updateByExampleSelective(@Param("record") Logger record, @Param("example") LoggerExample example);

    int updateByExample(@Param("record") Logger record, @Param("example") LoggerExample example);

    int updateByPrimaryKeySelective(Logger record);

    int updateByPrimaryKey(Logger record);
}