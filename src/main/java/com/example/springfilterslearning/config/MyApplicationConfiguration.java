package com.example.springfilterslearning.config;

import com.example.springfilterslearning.filter.HeadersLoggingFilter;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.Collections;

@Configuration
public class MyApplicationConfiguration {

    @Bean
    FilterRegistrationBean<HeadersLoggingFilter> headersLoggingFilterFilterRegistrationBean()
    {
        final FilterRegistrationBean<HeadersLoggingFilter> registrationBean = new FilterRegistrationBean<>();

        registrationBean.setFilter(new HeadersLoggingFilter());
        registrationBean.setOrder(-1);
        registrationBean.setName("fooBar");
        registrationBean.setUrlPatterns(Collections.singleton("/test/*"));

        return registrationBean;
    }
}
