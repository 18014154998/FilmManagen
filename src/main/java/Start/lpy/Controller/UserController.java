package Start.lpy.Controller;

import Start.lpy.Service.UserService;
import Start.lpy.exception.GetKeyException;
import Start.lpy.pojo.User;
import com.github.pagehelper.PageInfo;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.IncorrectCredentialsException;
import org.apache.shiro.authc.UnknownAccountException;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.subject.Subject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.util.DigestUtils;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpSession;
import java.util.List;

/**
 * @Author:刘平远
 * @Date：2019/10/10 14:44
 * @verson 1.0
 **/
@Controller
@ResponseBody
@CrossOrigin
public class UserController {

    @Autowired
    private UserService userService;

    //处理没有权限的操作,回到登陆操作
    @RequestMapping("/api/noAccess")
    public String name48oo(){
        return "NOAccess";
    }
    //处理权限不足，提示您的等级还不够
    @RequestMapping("/api/NoAuthor")
    public String name1sxj(){
        return "NOAuthor";
    }
    //使用shiro来进行登陆验证
    @RequestMapping("/api/loginshiro")
    public String name42fs(@RequestBody User user){
        //使用shiro编写认证操作
        //1 获取subject
        Subject subject=SecurityUtils.getSubject();
        //2 封装用户数据
        UsernamePasswordToken token=new UsernamePasswordToken(user.getUsername(),user.getPassword());
        //3 执行登陆方法
        try {
            subject.login(token);//交个shiro来判断用户的登陆成功与失败
            //就是执行userRealm里面的认证逻辑方法
            //判断的结果有2个：用户名不存在或者密码错误--使用异常来处理结果
            return "OK";
        }catch (UnknownAccountException e){
            return "nouser";
        }catch (IncorrectCredentialsException e){
            return "passworderr";
        }
    }



    //登陆
    @RequestMapping("/api/login")
    public User name2(@RequestBody  User user, HttpSession session){
        System.out.println("用户信息"+user.toString()+user.getUsername());
        //md5加密方式，使用springboot自带的加密方式

        String md5Password = DigestUtils.md5DigestAsHex(user.getPassword().getBytes());
        user.setPassword(md5Password);
        User Loginuser=userService.checkLogin(user);
        if (null!=Loginuser&&!"".equals(Loginuser.getUsername())){
            System.out.println("登陆成功，跳转到welcome主界面");
            session.setAttribute("user",Loginuser);
            return Loginuser;
        }
        else {
            System.out.println("密码错误，登陆失败，还在登陆页面");
           // ModelAndView mav=new ModelAndView();
            return  Loginuser;
        }

    }
    //姓名验证
@ResponseBody
@RequestMapping("/api/usernamechecked")
public String name4(@RequestBody User user){
    boolean b=userService.checkLogin1(user);
    if (b){
        return "用户名已存在";
    }else {
        return "可以使用";
    }
}
    //注册
    @RequestMapping("/api/register")
    public String name3(@RequestBody User user){
        System.out.println("注册用户信息"+user.toString());
        String md5Password = DigestUtils.md5DigestAsHex(user.getPassword().getBytes());
        System.out.println(md5Password);
        user.setPassword(md5Password);

        boolean b= false;
        try {
            b = userService.register(user);
        } catch (GetKeyException e) {
            e.printStackTrace();
        }
        if (b){
            System.out.println("注册成功");
            return "ok";
        }else {
            System.out.println("出现错误，注册失败");
            return "error";
        }
    }

    //测试springboot配置
    @RequestMapping("/welcome")
    public String name(){

        List<User> user = userService.findall();
        for (User user1 : user) {
            System.out.println(user1);
        }
        return "welcome";
    }
    //查询用户信息
    @RequestMapping("/api/findalluser")
    public List<User> name1233(@RequestBody User user){
        List<User> userList=null;
        System.out.println(" queryname:"+user);
        if (null==user.getUsername()||"".equals(user.getUsername())){
            userList=userService.findall();
            return userList;
        }
        else {
            userList=userService.findallbyname(user);
            return userList;
        }
    }
    //删除用户
    @RequestMapping("/api/deleteuserbyuid")
    public String  name123233(@RequestBody User user){
        System.out.println(" queryname:"+user);
        if (null!=user.getUid()){
            int i=userService.deleteuserbyuid(user);
            if (i>0){
                return "ok";
            }
            else {
                return "error1";
            }
        }
        else {
            return "error";
        }
    }
    //修改用户信息
    @RequestMapping("/api/changeuserinfo")
    public String name6454(@RequestBody User user){
        System.out.println("user" + user);
        int i =userService.updateuserinfobyuid(user);
        if (i==1){
            return "ok";
        }
        else
            return "error";
    }

    //查询用户会员等级
    @RequestMapping("/api/selectvipinfo")
    public List<User> name565(@RequestBody User user){
        List<User> userList= userService.findusergrade(user);
        return userList;
    }
    //充钱
    @RequestMapping("/api/addmoney")
    public String name(@RequestBody User user){
        System.out.println(user);
        //2张表的跟新  user和关系表
        int i=userService.updateusergrade(user);
        if (i==1){
            return "ok";
        }else
        {
            return "error";
        }

    }

    //测试pageinfo的分页查询
    @RequestMapping("/testpageinfo")
    public String name123(){
        PageInfo<User> allbypage = userService.findAllbypage(1, 2);
        System.out.println(allbypage.toString());

        return null;
    }


    //测试jpa分页信息
   /* @Autowired
    UsertestService2 usertestService2;
    @GetMapping("/testpageinfo")
    public  String  name666(Integer pageNum,Model model){
        Pageable pageable=new PageRequest(pageNum-1,2);
        Page<User> users = usertestService2.findAll(pageable);
        System.out.println("记录总数为"+users.getTotalElements());
        List<User> userlist = users.getContent();
        for (User user : userlist) {
            System.out.println(user.toString());
        }
        return null;
    }*/


}
