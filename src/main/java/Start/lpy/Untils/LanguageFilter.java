package Start.lpy.Untils;

import org.springframework.stereotype.Component;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletRequestWrapper;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @Author:刘平远
 * @Date：2019/10/31 11:02
 * @verson 1.0
 * 过滤敏感字符
 **/
/*@Component
@WebFilter(urlPatterns = "/api/addreview",filterName = "LanguageFilter")*/
public class LanguageFilter implements Filter {
    public void destroy() {
    }

    public void doFilter(ServletRequest req, ServletResponse resp, FilterChain chain) throws ServletException, IOException {
        HttpServletRequest request= (HttpServletRequest) req;
        HttpServletResponse response= (HttpServletResponse) resp;
        String review=request.getParameter("review");
        System.out.println("调用了过滤器 影评："+review);
        // 创建脏话过滤规则
        ParameterRequestWrapper parmsrequest = new ParameterRequestWrapper(request);

        chain.doFilter(parmsrequest, response);
    }

    public void init(FilterConfig config) throws ServletException {
    }

    // 内部类脏话过滤规则
  /*  class DirtyWordsHttpServletRequest extends HttpServletRequestWrapper {
        // 脏话字典、可以直接搜索脏话字典，然后通过io流进行读取和过滤
        private String[] words = {"tmd", "垃圾", "畜"};
        // 够脏方法
        public DirtyWordsHttpServletRequest(HttpServletRequest request) {
            super(request);
        }
        // 重写getParameter方法
        @Override
        public String getParameter(String name) {
            // 获取传来的参数值
            String value = super.getParameter(name);
            // 判断
            if (value == null) return "没有值";
            // 执行脏话转换
            if (value.contains("tmd")){
                System.out.println("包含了tmd");
                value.replace("tmd","**");
            }
            // 返回过滤有的值
            return value;
        }
    }*/

}
