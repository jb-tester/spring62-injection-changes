package com.mytests.spring.spring62injectionchanges.optionalInjections;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.lang.Nullable;
import org.springframework.stereotype.Component;

@Component
public class OptionalConstructorInjection1 {

    private final OptionalService myService;

    @Autowired
    public OptionalConstructorInjection1(@Nullable OptionalService myService) {
        this.myService = myService;
    }
}
