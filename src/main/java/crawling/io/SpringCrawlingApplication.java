package crawling.io;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;

//@SpringBootApplication
@ComponentScan
@EnableAutoConfiguration(
        exclude = DataSourceAutoConfiguration.class
)
@SpringBootConfiguration
public class SpringCrawlingApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringCrawlingApplication.class, args);
    }

}
