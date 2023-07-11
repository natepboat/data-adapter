package com.th.example.datadapter.config;

import com.th.example.datadapter.interceptor.ApiKeyInterceptor;
import com.th.example.datadapter.service.ApikeyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class WebConfig implements WebMvcConfigurer {
    @Autowired
    private ApikeyService apikeyService;

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(new ApiKeyInterceptor(apikeyService));
    }
}
