package com.mytests.spring.spring62injectionchanges.spel;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class ConfigureSPEL {

    // this syntax is new in Spring 6.2
    @Value("#{@dataBean.myDataList?.[0].name}") // no completion/reference for 'name'
    String test1;

    @Value("#{@dataBean.strMap['key1']}")
    String test2;

    @Value("#{@dataBean.myData['name']}")  // no completion/reference for 'name'
    String test3;

    @Value("#{@dataBean.myStr[1]}")
    String test4;

    @Value("#{@dataBean.myDataMap['key1'].name}")  // no completion/reference for 'name'
    String test5;

    public void displayMethod() {
        System.out.println("====== SpEL indexing: =====");

        System.out.println(test1 + " " + test2 + " " + test3 + " " + test4 + " " + test5);
        System.out.println("===================");
    }

    ;
}
