package Start.lpy.Mapper;

import Start.lpy.pojo.Userhistory;
import Start.lpy.pojo.UserhistoryExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface UserhistoryMapper {
    int countByExample(UserhistoryExample example);

    int deleteByExample(UserhistoryExample example);

    int deleteByPrimaryKey(Integer historyid);

    int insert(Userhistory record);

    int insertSelective(Userhistory record);

    List<Userhistory> selectByExample(UserhistoryExample example);

    Userhistory selectByPrimaryKey(Integer historyid);

    int updateByExampleSelective(@Param("record") Userhistory record, @Param("example") UserhistoryExample example);

    int updateByExample(@Param("record") Userhistory record, @Param("example") UserhistoryExample example);

    int updateByPrimaryKeySelective(Userhistory record);

    int updateByPrimaryKey(Userhistory record);

    List<Userhistory> selectByUid(Integer uid);
}