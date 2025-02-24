package com.mytests.spring.spring62injectionchanges.generics;

import org.springframework.stereotype.Service;

@Service
public class InjectSingleBoundGenericInConstructorByTypeFooAndName<T extends ServiceFoo> {

    final T fooService;

    public InjectSingleBoundGenericInConstructorByTypeFooAndName(final T foo1) {
        this.fooService = foo1;
    }
    public void displayMethod() {
        System.out.println("============ inject single-bound generic type component by type + parameter name: =============");
        System.out.println(fooService.foo());
    }
}
