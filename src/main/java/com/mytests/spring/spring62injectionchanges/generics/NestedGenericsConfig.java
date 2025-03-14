package com.mytests.spring.spring62injectionchanges.generics;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.List;

@Configuration
public class NestedGenericsConfig<T extends ServiceBar> {

    // injected beans are found (ok!)
    // navigation to bean injection point doesn't work
    @Bean
    public List<T> barList(List<T> bars) {
        return bars;
    }

    // no injected beans found
    // navigation to bean injection point doesn't work
    @Bean
    public List<T> qualifiedBarList(@Qualifier("b_qualifier") List<T> bars) {
        return bars;
    }

}
