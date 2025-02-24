package com.mytests.spring.spring62injectionchanges.generics;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.List;

@Configuration
public class NestedGenericsConfig<T extends ServiceBar> {

    @Bean
    public List<T> barList(List<T> bars) {
        return bars;
    }
    @Bean
    public List<T> qualifiedBarList(@Qualifier("b_qualifier") List<T> bars) {
        return bars;
    }

}
