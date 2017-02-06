package com.lyh.util;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;
/**
 * 拦截器
 * @author Seven
 *
 */
@Configuration
public class WebMvcConfigurer extends WebMvcConfigurerAdapter{

	 public void addInterceptors(InterceptorRegistry registry) {
		 registry.addInterceptor(new HandlerInterceptorAdapter() {

			@Override
			public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
					throws Exception {
				System.out.println(handler);
				System.out.println("interceptor====222");
				return true;
			}
			 
		 }).addPathPatterns("/**");
	 }
	 
	 public void addThrowsAdvice(RuntimeException  throwable){
		 
	 }
}
