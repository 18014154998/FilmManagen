package Start.lpy.Service;

import Start.lpy.exception.GetKeyException;
import Start.lpy.pojo.User;
import com.github.pagehelper.PageInfo;

import java.util.List;

/**
 * @Author:刘平远
 * @Date：2019/10/10 16:30
 * @verson 1.0
 **/
public interface UserService {
    //测试
    public List<User> findall();
    //分页测试
    public PageInfo<User> findAllbypage(Integer page,Integer size);

    //登陆
    public User  checkLogin(User user);
    //ajax验证账号是否存在
    public boolean  checkLogin1(User user);
    //注册
    public  boolean register(User user) throws GetKeyException;

    //按照用户名查询用户信息
    public List<User> findallbyname(User user);
    //按照uid删除用户
    public int deleteuserbyuid(User user);

    public int updateuserinfobyuid(User user);

    public List<User> findusergrade(User user);

    int updateusergrade(User user);
}
