package com.mytests.spring.spring62injectionchanges.generics;

import org.springframework.stereotype.Component;


@Component
public class Bar1 implements ServiceBar {
    @Override
    public String bar() {
        return "barOnly - 1";
    }


}
