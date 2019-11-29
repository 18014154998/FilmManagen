package com.lpyspringboottest.film;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class FilmApplicationTests {
    //记录器
    Logger logger = LoggerFactory.getLogger(getClass());
    @Test
    public void contextLoads() {
        //日志的级别trace<debug<info<error
        //可以调整输出日志的级别，日志就会在这个级别以后输出
        logger.trace("这是trace日志");
        logger.debug("这是debug日志");
        //springboot默认输出的是info级别的。
        //在配置文件中输入：logging.level.com.atguigu=trace
        logger.info("这是info日志");
        logger.warn("这是warning日志");
        logger.error("这是erroe日志");
    }

}
