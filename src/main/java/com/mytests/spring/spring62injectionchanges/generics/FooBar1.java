package com.mytests.spring.spring62injectionchanges.generics;

import org.springframework.stereotype.Component;

// no injection points detected - AutowiredIn list is empty, NavigateToAutowiredCandidates does nothing
@Component
public class FooBar1 implements ServiceFoo, ServiceBar {
    @Override
    public String bar() {
       return "bar1 from FooBar1";
    }

    @Override
    public String foo() {
        return "foo1 from FooBar1";
    }
}
