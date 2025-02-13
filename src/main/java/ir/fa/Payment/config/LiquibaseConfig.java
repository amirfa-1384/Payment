package ir.fa.Payment.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import liquibase.integration.spring.SpringLiquibase;
import javax.sql.DataSource;

@Configuration
public class LiquibaseConfig {

    private final Dashboard dashboard;
    private final DataSource dataSource;

    @Autowired
    public LiquibaseConfig(Dashboard dashboard, DataSource dataSource) {
        this.dashboard = dashboard;
        this.dataSource = dataSource;
    }

    @Bean
    public SpringLiquibase liquibase() {
        SpringLiquibase liquibase = new SpringLiquibase();
        liquibase.setDataSource(dataSource);
        liquibase.setChangeLog(dashboard.getConfigValue("LIQUIBASE_CHANGELOG"));
        return liquibase;
    }
}
