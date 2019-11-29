package Start.lpy.aspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

/**
 * @Author:刘平远
 * @Date：2019/10/31 15:06
 * @verson 1.0
 **/
@Aspect
@Component
public class LanguageAspect {

    @Pointcut("execution(public int Start.lpy.Service.FilmReviewServiceImpl.addnewreview(..))")
    public void pc(){
        System.out.println("进入了切面方法");
    }

    @Before("pc()")
    public void name(){
        System.out.println("过滤我真的不会，太难顶了");
    }
    @Around("pc()")
    public Object name2jf(ProceedingJoinPoint pjp) {
        Object o= null;
        try {
            o = pjp.proceed();
        } catch (Throwable throwable) {
            throwable.printStackTrace();
        }
        System.out.println("周围");
        return o;
    }
    @After("pc()")
    public void name2o(){
        System.out.println("切面结束了");

    }




}
