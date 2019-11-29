package Start.lpy.Config;

import Start.lpy.Untils.PrecessionIntecept;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * @Author:刘平远
 * @Date：2019/11/3 16:39
 * @verson 1.0
 *
 * springboot拦截器配置的三种方式：1继承WebMvcConfigurerAdapter 被废弃
 * 2 继承WebMvcConfigurersupport
 * 3 实现WebMvcConfigurer  https://www.jianshu.com/p/ca7c3aa3b5ca
 * 4 本片博客说明了3这的关系 https://segmentfault.com/a/1190000018904390?utm_source=tag-newest
 **/
@Configuration
public class InterceptorConfig  implements WebMvcConfigurer {

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(new PrecessionIntecept()).addPathPatterns("/**");
    }



}
