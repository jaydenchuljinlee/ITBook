package com.example.ITBook.configure;

import com.example.ITBook.resolver.UserArgumentResolver;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.method.support.HandlerMethodArgumentResolver;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import java.lang.annotation.Annotation;
import java.util.List;

@Configuration
public class WebMvcConfig implements WebMvcConfigurer {
    private UserArgumentResolver userArgumentResolver;

    public WebMvcConfig(UserArgumentResolver userArgumentResolver) {
        this.userArgumentResolver = userArgumentResolver;
    }

    @Override
    public void addArgumentResolvers(List<HandlerMethodArgumentResolver> resolvers) {
        resolvers.add(userArgumentResolver);
    }
}
