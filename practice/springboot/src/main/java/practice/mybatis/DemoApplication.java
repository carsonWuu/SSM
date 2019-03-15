package practice.mybatis;
 
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.context.annotation.Bean;

import test.filter.example.Filter_1;
import test.filter.example.Filter_2;
 

//@MapperScan("practice.mybatis.mapper") //扫描的mapper
@SpringBootApplication//(exclude = {DataSourceAutoConfiguration.class})

public class DemoApplication {
	@Bean
	public FilterRegistrationBean registerationFilterBean() {
		FilterRegistrationBean filterRegistrationBean = new FilterRegistrationBean();
		filterRegistrationBean.setFilter(new Filter_1());
		filterRegistrationBean.addUrlPatterns("/home/*");
		filterRegistrationBean.setOrder(3);
        filterRegistrationBean.setEnabled(true);
        return filterRegistrationBean;

	}
	
	@Bean
    public FilterRegistrationBean registrationBean(){
        FilterRegistrationBean filterRegistrationBean=new FilterRegistrationBean();
        filterRegistrationBean.setFilter(new Filter_2());
        filterRegistrationBean.addUrlPatterns("/home/*");
        filterRegistrationBean.setOrder(1);
        filterRegistrationBean.setEnabled(true);
        return filterRegistrationBean;
 
    }
	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}
}