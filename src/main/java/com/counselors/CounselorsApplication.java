package com.counselors;

import javax.sql.DataSource;

import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean; 
import org.springframework.core.io.Resource;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;
import org.springframework.web.filter.HiddenHttpMethodFilter;

@SpringBootApplication
@MapperScan("com.counselors.mapper")
public class CounselorsApplication {

	public static void main(String[] args) {
		SpringApplication.run(CounselorsApplication.class, args);
	}
	
	
	// JDBC DataSource를  받아와서 sql문 호출
	@Bean
	public SqlSessionFactory sqlsessionFactory(DataSource source) throws Exception{
		SqlSessionFactoryBean sessionFactory = new SqlSessionFactoryBean();
		sessionFactory.setDataSource(source);
		
		Resource[] res = new PathMatchingResourcePatternResolver().getResources("classpath:mapper/*Mapper.xml");
		sessionFactory.setMapperLocations(res);
		return sessionFactory.getObject();
	}
	
	
	  @Bean
	  public HiddenHttpMethodFilter hiddenHttpMethodFilter() {
		  HiddenHttpMethodFilter filter = new HiddenHttpMethodFilter();
		  return filter;
	  }
}
