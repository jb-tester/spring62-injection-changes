package com.mytests.spring.spring62injectionchanges.generics;

import org.springframework.stereotype.Component;


@Component
public class Foo2 implements ServiceFoo {


    @Override
    public String foo() {
       return "fooOnly - 2";
    }
}
