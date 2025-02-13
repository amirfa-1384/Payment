package ir.fa.Payment.config;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import javax.sql.DataSource;

@Configuration
public class PersistConfig {
    private final Dashboard dashboard;

    @Autowired
    public PersistConfig(Dashboard dashboard) {
        this.dashboard = dashboard;
    }

    @Bean
    public DataSource dataSource() {
        DriverManagerDataSource dataSource = new DriverManagerDataSource();
        dataSource.setUrl(dashboard.getConfigValue("DB_URL"));
        dataSource.setUsername(dashboard.getConfigValue("DB_USERNAME"));
        dataSource.setPassword(dashboard.getConfigValue("DB_PASSWORD"));
        dataSource.setDriverClassName(dashboard.getConfigValue("Driver_Class_Name"));
        return dataSource;
    }
}

