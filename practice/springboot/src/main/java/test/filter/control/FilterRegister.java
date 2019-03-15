package test.filter.control;

import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import test.filter.example.Filter_1;
import test.filter.example.Filter_2;

@Configuration
public class FilterRegister {
//	@Bean
//	public FilterRegistrationBean registerationFilterBean() {
//		FilterRegistrationBean filterRegistrationBean = new FilterRegistrationBean();
//		filterRegistrationBean.setFilter(new Filter_1());
//		filterRegistrationBean.addUrlPatterns("home/*");
//		filterRegistrationBean.setOrder(3);
//        filterRegistrationBean.setEnabled(true);
//        return filterRegistrationBean;
//
//	}
//	
//	@Bean
//    public FilterRegistrationBean registrationBean(){
//        FilterRegistrationBean filterRegistrationBean=new FilterRegistrationBean();
//        filterRegistrationBean.setFilter(new Filter_2());
//        filterRegistrationBean.addUrlPatterns("/home/*");
//        filterRegistrationBean.setOrder(1);
//        filterRegistrationBean.setEnabled(true);
//        return filterRegistrationBean;
// 
//    }


}
