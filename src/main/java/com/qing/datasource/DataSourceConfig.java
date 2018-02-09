package com.qing.datasource;

import org.springframework.boot.autoconfigure.jdbc.DataSourceBuilder;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;
import java.util.HashMap;
import java.util.Map;

@Configuration
public class DataSourceConfig {

    @Bean(name = "w")
    @ConfigurationProperties(prefix = "spring.datasource.write") // application.properteis中对应属性的前缀
    public DataSource dataSource1() {
        return DataSourceBuilder.create().build();
    }




    @Bean(name = "r")
    @ConfigurationProperties(prefix = "spring.datasource.read") // application.properteis中对应属性的前缀
    public DataSource dataSource2() {
        return DataSourceBuilder.create().build();
    }


    /**
     * 动态数据源: 通过AOP在不同数据源之间动态切换
     * @return ds
     */
    @Bean(name = "dynamicDS1")
    public DataSource dataSource() {
        DynamicDataSource dynamicDataSource = new DynamicDataSource();
        // 默认数据源
        dynamicDataSource.setDefaultTargetDataSource(dataSource1());

        // 配置多数据源
        Map<Object, Object> dsMap = new HashMap(5);
        dsMap.put("w", dataSource1());
        dsMap.put("r", dataSource2());

        dynamicDataSource.setTargetDataSources(dsMap);

        return dynamicDataSource;
    }
}