package Start.lpy.Mapper;

import Start.lpy.pojo.User;
import Start.lpy.pojo.UserExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.stereotype.Repository;
//@Mapper
@Repository
public interface UserMapper {

    List<User> findall();

    int countByExample(UserExample example);

    int deleteByExample(UserExample example);

    int deleteByPrimaryKey(Integer uid);

    int insert(User record);

    int insert1(User record);

    int insertSelective(User record);

    List<User> selectByExample(UserExample example);

    User selectByPrimaryKey(Integer uid);

    int updateByExampleSelective(@Param("record") User record, @Param("example") UserExample example);

    int updateByExample(@Param("record") User record, @Param("example") UserExample example);

    int updateByPrimaryKeySelective(User record);

    int updateByPrimaryKey(User record);

    int selectUser(User user);

    int getInsertedKeyPrimary();

    int insertuser_role(int key);

    int insertuser_grade(int key);

    User selectUserInfo(User user);

    List<User> selectUserInfobyname(User user);

    int updateuserinfobyuid(User user);

    int insertuser_role1(Integer key, Integer roleId);

    int upadateuserrole(Integer uid, Integer roleId);

    List<User> finduserGrade(User user);

    int updateSurplus(User user);

    int updatagrade_user(User user);

    int updateuserSurplus(Integer uid, Double orderPrice);
}