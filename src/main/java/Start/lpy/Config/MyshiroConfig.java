package Start.lpy.Config;

import org.apache.shiro.spring.web.ShiroFilterFactoryBean;
import org.apache.shiro.web.mgt.DefaultWebSecurityManager;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.LinkedHashMap;
import java.util.Map;

/**
 * @Author:刘平远
 * @Date：2019/11/4 14:52
 * @verson 1.0
 **/
@Configuration
public class MyshiroConfig {

    @Bean
    public ShiroLoginFilter shiroLoginFilter(){
        System.out.println("实例化了ajax请求");
        return new ShiroLoginFilter();
    }

    //创建shirofilterFactory
    @Bean
    public ShiroFilterFactoryBean getShiroFilterFactoryBean(@Qualifier("securityManager") DefaultWebSecurityManager securityManager){
        ShiroFilterFactoryBean shiroFilterFactoryBean=new ShiroFilterFactoryBean();
        //添加shiro内置过滤器，实现权限相关的拦截
            //anon：无需认证，就可以用访问
            //anthc：必须认证，才能访问
            //user：如果使用rememberme的功能可以直接访问
            //perms：必须授权才能访问
            //role：必须得到角色授权才能访问

        //添加需要拦截的路径，以及权限
        Map<String ,String > filtermap=new LinkedHashMap<>();
        filtermap.put("/api/register","authc");
        filtermap.put("/api/login","anon");
        //修改拦截后的跳转界面
        shiroFilterFactoryBean.setLoginUrl("/api/noAccess");
        //授权过滤器，即级别 对应的人才能访问对应的页面
        //当授权拦截后，shiro会跳转到未授权页面
        filtermap.put("/api/addnewfilm","perms[user:add]");
        shiroFilterFactoryBean.setUnauthorizedUrl("/api/NoAuthor");
        shiroFilterFactoryBean.setFilterChainDefinitionMap(filtermap);
        //设置一些参数 安全管理器
        shiroFilterFactoryBean.setSecurityManager(securityManager);
        System.out.println("111");
        return shiroFilterFactoryBean;
    }


    //创建 defaultweb securityManager
    @Bean(name = "securityManager")
    public DefaultWebSecurityManager getDefaultWebSecurityManager(
            @Qualifier("userRealm") UserRealm userRealm){
        DefaultWebSecurityManager securityManager=new DefaultWebSecurityManager();
        //需要关联realm
        securityManager.setRealm(userRealm);
        System.out.println("2222");
        return securityManager;
    }
    //创建realm
    @Bean(name = "userRealm")
    public  UserRealm getRealm(){
    System.out.println("3333");
        return new UserRealm();
    }


}
