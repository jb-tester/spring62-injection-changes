package com.mytests.spring.spring62injectionchanges.generics;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

// no injection points detected - AutowiredIn list is empty, NavigateToAutowiredCandidates does nothing
@Component
@Qualifier("b_qualifier")
public class Bar2 implements ServiceBar {
    @Override
    public String bar() {
        return "barOnly from Bar2";
    }


}
