package Start.lpy.Service;

import Start.lpy.Mapper.UserMapper;
import Start.lpy.exception.GetKeyException;
import Start.lpy.pojo.User;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

/**
 * @Author:刘平远
 * @Date：2019/10/10 16:30
 * @verson 1.0
 **/
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    UserMapper userMapper;

    @Override
    public List<User> findall() {
        List<User> users = userMapper.findall();
        return users;
    }
    //分页测试
    @Override
    public PageInfo<User> findAllbypage(Integer page, Integer size) {
        PageHelper.startPage(page,size);
        List<User> userList = userMapper.findall();
        PageInfo<User> pageInfo=new PageInfo<>(userList);
        return pageInfo;
    }

    //登陆
    @Override
    public User checkLogin(User user) {
     //   int i=userMapper.selectUser(user);
        User Loginuser=userMapper.selectUserInfo(user);
       return Loginuser;
    }

    //验证账号是否存在
    @Override
    public boolean checkLogin1(User user) {
       int i=userMapper.selectUser(user);
       if (i==1){
           return true;
       }else {
           return false;
       }
    }

    //注册
    @Transactional(rollbackFor = Exception.class)
    @Override
    public boolean register(User user) throws GetKeyException {
        int i=userMapper.insert1(user);//插入user表
        int key=userMapper.getInsertedKeyPrimary(); //获取插入的主键
        System.out.println("key"+key);
        if (key==0){
                throw new  GetKeyException("获取主键失败异常");
        }else {
            //判断用户的角色和会员的等级
            if(null!=user.getRoleId()){
                int roleid=user.getRoleId();
                int d1=userMapper.insertuser_role1(key,roleid);
                int k1=userMapper.insertuser_grade(key);//插入user_grade关系表
                if (i==d1&&d1==k1&&k1==1){
                    return true;
                }else {
                    return false;
                }
            }else {
                int j=userMapper.insertuser_role(key);//插入user_role关系表
                int k=userMapper.insertuser_grade(key);//插入user_grade关系表
                System.out.println(i+" "+j+" "+k+" "+key);
                if (i==j&&j==k&&k==1){
                    return true;
                }else {
                    return false;
                }
            }


        }
    }

    @Override
    public List<User> findallbyname(User user) {
        List<User> userList= userMapper.selectUserInfobyname(user);

        return userList;
    }

    @Override
    public int deleteuserbyuid(User user) {
        int i=userMapper.updateuserinfobyuid(user);
        return i;
    }

    @Transactional(rollbackFor = Exception.class)
    @Override
    public int updateuserinfobyuid(User user) {
        int j=userMapper.upadateuserrole(user.getUid(),user.getRoleId());
        int i= userMapper.updateByPrimaryKeySelective(user);
        return i;
    }

    @Override
    public List<User> findusergrade(User user) {
        List<User> userList=userMapper.finduserGrade(user);
        return userList;
    }

    @Transactional(rollbackFor = Exception.class)
    @Override
    public int updateusergrade(User user) {
        //先更新user表再跟新关系表
        int i=userMapper.updateSurplus(user);
        int j=userMapper.updatagrade_user(user);
        System.out.println("运行了"+i+" "+j);
        return 1;
    }


}
