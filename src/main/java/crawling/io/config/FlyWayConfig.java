package crawling.io.config;

import org.flywaydb.core.Flyway;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class FlyWayConfig {
    @Bean(initMethod = "migrate")
    public Flyway flyway(){
        Flyway flyway = Flyway.configure()
                .dataSource(
                        "jdbc:postgresql://localhost:5432/example",
                        "postgres",
                        "postgres"
                )
                .baselineVersion("0")
                .baselineOnMigrate(true)
                .locations("classpath:db/migration")
                .load();
        flyway.migrate();
        return flyway;
    }
}