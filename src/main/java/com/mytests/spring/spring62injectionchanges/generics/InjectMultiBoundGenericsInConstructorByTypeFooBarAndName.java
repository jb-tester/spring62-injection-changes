package com.mytests.spring.spring62injectionchanges.generics;

import org.springframework.stereotype.Service;

// multiple bounds generics:

@Service
public class InjectMultiBoundGenericsInConstructorByTypeFooBarAndName<T extends ServiceFoo & ServiceBar> {

    final T service;

    // should navigate to fooBar1 - matching by type and parameter name; ok!
    public InjectMultiBoundGenericsInConstructorByTypeFooBarAndName(T fooBar1) {
        this.service = fooBar1;
    }

    public void displayMethod() {
        System.out.println("========== inject multiple bounds generic type component by type and parameter name: type is set in the class definition ==================================");
        System.out.println(service.foo() + " " + service.bar());
    }


}
