package com.mytests.spring.spring62injectionchanges.optionalInjections;

import org.springframework.beans.factory.ObjectProvider;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.lang.Nullable;
import org.springframework.stereotype.Component;

@Component
public class OptionalConstructorInjection2 {

    private final OptionalService myService;

    @Autowired
    public OptionalConstructorInjection2(ObjectProvider<OptionalService> myService) {
        this.myService = myService.getIfAvailable();
    }
}
