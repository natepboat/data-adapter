package com.th.example.datadapter.config;

import com.ibm.as400.access.AS400JDBCDataSource;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;

import javax.sql.DataSource;

@Configuration
public class DatasourceConfig {

    @Bean
    public DataSource dataSource() {
        AS400JDBCDataSource ds = new AS400JDBCDataSource();
        ds.setServerName("jdbc:as400://xxx/xxx");
        ds.setTranslateBinary(true);
        ds.setUser("");
        ds.setPassword("".toCharArray());

        return ds;
    }
}
