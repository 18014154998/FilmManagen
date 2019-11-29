package Start;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@EnableTransactionManagement
@MapperScan("Start.lpy.Mapper")
@SpringBootApplication
@ServletComponentScan("Start.lpy.Untils")
public class FilmApplication {
    public static void main(String[] args) {
        SpringApplication.run(FilmApplication.class, args);
    }
}
