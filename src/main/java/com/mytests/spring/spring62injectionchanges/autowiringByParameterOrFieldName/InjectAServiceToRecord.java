package com.mytests.spring.spring62injectionchanges.autowiringByParameterOrFieldName;

import jakarta.inject.Named;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public record InjectAServiceToRecord(@Qualifier("firstAService") AService s1,
                                     AService secondAService,
                                     AService thirdAService,
                                     AService fourthAService,
                                     @Named("fifthAService") AService s5
                                     ) {
    public void displayMethod() {
        System.out.println("===========injection to the record:===============");
        System.out.println(s1.getId());
        System.out.println(secondAService.getId());
        System.out.println(thirdAService().getId());
        System.out.println(fourthAService.getId());
        System.out.println(s5.getId());
        System.out.println("==========================");
    }
}
