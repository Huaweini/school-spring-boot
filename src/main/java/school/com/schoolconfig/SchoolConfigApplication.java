package school.com.schoolconfig;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@MapperScan("school.com.schoolconfig.dao")
@SpringBootApplication
public class SchoolConfigApplication {

    public static void main(String[] args) {
        SpringApplication.run(SchoolConfigApplication.class, args);
    }

}
