package com.mytests.spring.spring62injectionchanges.generics;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;


// no injection points detected - AutowiredIn list is empty, NavigateToAutowiredCandidates does nothing
@Component
@Qualifier("b_qualifier")
public class FooBar2 implements ServiceFoo, ServiceBar {
    @Override
    public String bar() {
       return "bar2 from FooBar2";
    }

    @Override
    public String foo() {
        return "foo2 from FooBar2";
    }
}
