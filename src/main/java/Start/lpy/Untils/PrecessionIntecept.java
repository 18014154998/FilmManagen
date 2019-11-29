package Start.lpy.Untils;

import org.springframework.lang.Nullable;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * @Author:刘平远
 * @Date：2019/10/31 16:00
 * @verson 1.0
 * 后台登陆拦截器  适用于前后端在一起的项目，
 * 前后端分离的项目不建议这么写
 **/
@Component
public class PrecessionIntecept implements HandlerInterceptor {
    @Override
   public   boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        //获取session
        HttpSession session=request.getSession();
        String url=session.getServletContext().getRequestCharacterEncoding();
        String url2=request.getServletPath();//  /api/listfilms
        String url3=request.getRequestURI();// /api/listfilms
        String url1=request.getRequestURL().toString();//   http://localhost:8080/api/listfilms
      //  System.out.println(url2+" yrl     "+url1+"  "+url3);
        if (url1.contains("admin")){
            if (null!=session.getAttribute("user")){
                System.out.println("兰机器运行了,是登陆用户");
                return true;
            }else {
                System.out.println("拦截器运行了，回到登陆界面");
                response.sendRedirect("login");
                return false;
            }
        }else {
           // System.out.println("直接方向了");
            return true;
        }
    }
    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, @Nullable ModelAndView modelAndView) throws Exception {
    }
    @Override
   public   void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, @Nullable Exception ex) throws Exception {
    }


}
