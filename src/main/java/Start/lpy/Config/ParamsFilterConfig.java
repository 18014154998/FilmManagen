package Start.lpy.Config;

import Start.lpy.Untils.LanguageFilter;
import org.springframework.boot.web.servlet.DispatcherType;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @Author:刘平远
 * @Date：2019/11/1 8:58
 * @verson 1.0
 * 参数过滤器配置类
 **/
/*@Configuration*/
public class ParamsFilterConfig {

    //@Bean
    public FilterRegistrationBean paramsFilterRegistration() {
        FilterRegistrationBean registration = new FilterRegistrationBean();
       // registration.setDispatcherTypes(DispatcherType.REQUEST);
        registration.setFilter(new LanguageFilter());
        registration.addUrlPatterns("/api/addreview");
        registration.setName("LanguageFilter");
        registration.setOrder(Integer.MAX_VALUE-1);
        return registration;
    }
}
