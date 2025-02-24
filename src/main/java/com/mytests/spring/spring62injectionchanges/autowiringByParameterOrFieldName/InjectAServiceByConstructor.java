package com.mytests.spring.spring62injectionchanges.autowiringByParameterOrFieldName;

import jakarta.inject.Named;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class InjectAServiceByConstructor {

    final AService s1;
    final AService secondAService;
    final AService s5;

    public InjectAServiceByConstructor(@Qualifier("firstAService") AService s1, AService secondAService, @Named("fifthAService") AService s5) {
        this.s1 = s1;
        this.secondAService = secondAService;
        this.s5 = s5;
    }

    public void displayMethod() {
        System.out.println("===========injection by constructor:===============");
        System.out.println(s1.getId());
        System.out.println(secondAService.getId());
        System.out.println(s5.getId());
        System.out.println("==========================");
    }
}
