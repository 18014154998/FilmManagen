package Start.lpy.Config;

import org.apache.shiro.web.filter.authc.FormAuthenticationFilter;

import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @Author:刘平远
 * @Date：2019/11/5 9:14
 * @verson 1.0
 * 还没有实现：前后端分离前台来请求的都是ajax请求，后台只负责将数据返回给前台。
 * 在使用shiro的时候，用户访问没有权限的资源的的时候，后台就会进行重定向，而重定向后的地址是后台的地址。
 * 所以说现在的目标是：不需要后台进行重定向，
 * 而是将需要重定向的地方的数据都转化为json数据传到前台，由前台来对页面的跳转进行控制，后台只需要进行数据的传输
 **/
public class ShiroLoginFilter extends FormAuthenticationFilter {

    @Override
    protected boolean onAccessDenied(ServletRequest request, ServletResponse response) throws Exception {
        HttpServletResponse response1= (HttpServletResponse) response;
        if (isajax(request)){
            response1.setCharacterEncoding("UTF-8");
            response1.setContentType("application/json");
            String  message="NOAccess";
            response1.getWriter().write(message);
        }
       return false;
    }
    //判断是否是ajax请求
    private boolean isajax(ServletRequest request){
        String header = ((HttpServletRequest) request).getHeader("X-Requested-With");
        if ("XMLHttpRequest".equalsIgnoreCase(header)){
            return Boolean.TRUE;
        }
        return Boolean.FALSE;
    }

}
