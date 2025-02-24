package com.mytests.spring.spring62injectionchanges.generics;

import org.springframework.stereotype.Component;


@Component
public class FooBar1 implements ServiceFoo, ServiceBar {
    @Override
    public String bar() {
       return "bar1";
    }

    @Override
    public String foo() {
        return "foo1";
    }
}
