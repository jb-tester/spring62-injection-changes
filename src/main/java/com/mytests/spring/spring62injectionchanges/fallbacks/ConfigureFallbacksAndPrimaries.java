package com.mytests.spring.spring62injectionchanges.fallbacks;

import com.mytests.spring.spring62injectionchanges.fallbacks.beans.Bean2;
import com.mytests.spring.spring62injectionchanges.fallbacks.beans.Bean3;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import com.mytests.spring.spring62injectionchanges.fallbacks.beans.Bean1;
import org.springframework.context.annotation.Fallback;
import org.springframework.context.annotation.Primary;


@Configuration
public class ConfigureFallbacksAndPrimaries {

    // @Fallback beans test:

    @Bean//(name = "bean1")
    @Fallback
    public Bean1  mybean11 () {
        return new Bean1(" mybean11: i have @Fallback annotation ");
    }
    @Bean//(name = "bean1")
    @Fallback
    public Bean1 mybean12() {
        return new Bean1("mybean12: i have @Fallback annotation");
    }

    @Bean//(name = "bean1")
    public Bean1 mybean13() {
        return new Bean1("mybean13: i don't have @Fallback annotation");
    }

    @Bean//(name = "bean1")
    @Fallback
    public Bean1 mybean14() {
        return new Bean1("mybean14: i have @Fallback annotation");
    }

    // @Primary beans test:


    @Bean//(name = "bean2")
    public Bean2 mybean20() {
        return new Bean2("mybean20: i don't have @Primary annotation");
    }

    @Bean//(name = "bean2")
    @Primary
    public Bean2 mybean21() {
        return new Bean2("mybean21: i have @Primary annotation");
    }

    @Bean//(name = "bean2")
    public Bean2 mybean22() {
        return new Bean2("mybean22: i don't have @Primary annotation");
    }

    // defaultCandidate test:

    @Bean(defaultCandidate = false)
    public Bean3 mybean31() {
        return new Bean3("mybean31: i have #defaultCandidate = false");
    }

    @Bean
    public Bean3 mybean32() {
        return new Bean3("mybean32: i'm default");
    }

    @Bean(defaultCandidate = false)
    public Bean3 mybean33() {
        return new Bean3("mybean33: i have defaultCandidate = false");
    }

}
