package Start.lpy.Config;

import Start.lpy.Service.UserService;
import Start.lpy.pojo.User;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.*;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.authz.SimpleAuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;
import org.apache.shiro.subject.Subject;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @Author:刘平远
 * @Date：2019/11/4 14:53
 * @verson 1.0
 **/
public class UserRealm extends AuthorizingRealm {

    @Autowired
    private UserService userService;

    //执行授权逻辑
    @Override
    protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principalCollection) {
        System.out.println("执行授权逻辑4444");
        //给资源授权
        SimpleAuthorizationInfo info=new SimpleAuthorizationInfo();
        //添加授权字符串
        info.addStringPermission("user:add");
        /*Subject subject = SecurityUtils.getSubject();
        User user= (User) subject.getPrincipal();*/
        return info;
    }

    //执行认证逻辑
    @Override
    protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken authenticationToken) throws AuthenticationException {
        System.out.println("执行认证逻辑5555");
        //在这里面写上用户验证账号密码的登陆逻辑
        //编写使用shiro判断逻辑，判断用户名和密码是否真确
        //1 获取传过来的token
        UsernamePasswordToken token= (UsernamePasswordToken) authenticationToken;
        //2 获取姓名和密码
        String name=token.getUsername();
        String  password= String.valueOf(token.getPassword());
        User user=new User();
        user.setUsername(name);
        user.setPassword(password);
        User loginuser= userService.checkLogin(user);


        //判断用户名称是否存在
        if (!name.equals(loginuser.getUsername())){
            return  null;//shiro底层会抛出UnknownAccountException异常
        }
        //判断密码 shiro自动的判断
        return new SimpleAuthenticationInfo(loginuser,loginuser.getPassword(),"");
    }
}
