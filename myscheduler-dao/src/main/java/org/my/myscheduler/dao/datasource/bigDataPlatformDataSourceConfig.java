package org.my.myscheduler.dao.datasource;

import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.SqlSessionTemplate;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.autoconfigure.jdbc.DataSourceBuilder;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;

import javax.sql.DataSource;

/**
 * @Author: Aaron
 * @Desc:
 * @Date:
 * @Modified by
 */
@Configuration
@MapperScan(basePackages = "org.my.myscheduler.dao.mapper.bigDataPlatform", sqlSessionTemplateRef  = "bigDataPlatformSqlSessionTemplate")
public class bigDataPlatformDataSourceConfig {

    @Bean(name = "bigDataPlatformDataSource")
    @ConfigurationProperties(prefix = "spring.datasource.bigDataPlatform")
    @Primary
    public DataSource bigDataPlatformDataSource() {
        return DataSourceBuilder.create().build();
    }

    @Bean(name = "bigDataPlatformSqlSessionFactory")
    @Primary
    public SqlSessionFactory bigDataPlatformSqlSessionFactory(@Qualifier("bigDataPlatformDataSource") DataSource dataSource) throws Exception {
        SqlSessionFactoryBean bean = new SqlSessionFactoryBean();
        bean.setDataSource(dataSource);
        bean.setMapperLocations(new PathMatchingResourcePatternResolver().getResources("classpath*:mybatis/mapper/bigDataPlatform/*.xml"));
        return bean.getObject();
    }

    @Bean(name = "bigDataPlatformTransactionManager")
    @Primary
    public DataSourceTransactionManager bigDataPlatformTransactionManager(@Qualifier("bigDataPlatformDataSource") DataSource dataSource) {
        return new DataSourceTransactionManager(dataSource);
    }

    @Bean(name = "bigDataPlatformSqlSessionTemplate")
    @Primary
    public SqlSessionTemplate bigDataPlatformSqlSessionTemplate(@Qualifier("bigDataPlatformSqlSessionFactory") SqlSessionFactory sqlSessionFactory) throws Exception {
        return new SqlSessionTemplate(sqlSessionFactory);
    }
}
