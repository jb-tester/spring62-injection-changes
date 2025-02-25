package com.mytests.spring.spring62injectionchanges.testing;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class TestingConfig {

    @Bean
    public ZeroBeanToOverride zeroBeanToOverride() {
        return new ZeroBeanToOverride("dev");
    }
    @Bean
    public FirstBeanToOverride firstBeanToOverride1() {
        return new FirstBeanToOverride("dev");
    }

    @Bean
    public FirstBeanToOverride firstBeanToOverride2() {
        return new FirstBeanToOverride("dev");
    }

    @Bean
    public SecondBeanToOverride secondBeanToOverride() {
        return new SecondBeanToOverride("dev");
    }

    @Bean
    public ThirdBeanToOverride thirdBeanToOverride() {
        return new ThirdBeanToOverride("dev");
    }

    @Bean
    public FourthBeanToOverride fourthBeanToOverride() {
        return new FourthBeanToOverride("dev");
    }
}
