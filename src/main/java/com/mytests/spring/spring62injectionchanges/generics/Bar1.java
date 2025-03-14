package com.mytests.spring.spring62injectionchanges.generics;

import org.springframework.stereotype.Component;

// no injection points detected - AutowiredIn list is empty, NavigateToAutowiredCandidates does nothing
@Component
public class Bar1 implements ServiceBar {
    @Override
    public String bar() {
        return "barOnly from Bar1";
    }


}
