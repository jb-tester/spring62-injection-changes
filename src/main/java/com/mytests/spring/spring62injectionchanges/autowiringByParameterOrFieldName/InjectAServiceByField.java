package com.mytests.spring.spring62injectionchanges.autowiringByParameterOrFieldName;

import jakarta.annotation.Resource;
import jakarta.inject.Inject;
import jakarta.inject.Named;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class InjectAServiceByField {

    @Autowired @Qualifier("firstAService") AService s1;
    @Autowired AService secondAService;
    @Resource(name = "thirdAService") AService s3;
    @Inject AService fourthAService;
    @Inject @Named("fifthAService") AService s5;

    //@Autowired AService aService;

    public void displayMethod() {
        System.out.println("=============Injection by field:=============");
        System.out.println(s1.getId());
        System.out.println(secondAService.getId());
        System.out.println(s3.getId());
        System.out.println(fourthAService.getId());
        System.out.println(s5.getId());
        System.out.println("==========================");
    }

    ;
}
