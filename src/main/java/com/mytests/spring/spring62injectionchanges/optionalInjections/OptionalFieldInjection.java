package com.mytests.spring.spring62injectionchanges.optionalInjections;

import org.springframework.beans.factory.ObjectProvider;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.lang.Nullable;
import org.springframework.stereotype.Component;

import java.util.Optional;

@Component
public class OptionalFieldInjection {


    @Autowired(required = false)
    private OptionalService myService0;

    @Autowired
    private Optional<OptionalService> myService1;

    @Autowired
    private ObjectProvider<OptionalService> myService2;

    @Autowired @Nullable
    private OptionalService myService3;


}
