package com.mytests.spring.spring62injectionchanges.fallbacks;

import com.mytests.spring.spring62injectionchanges.fallbacks.beans.Bean1;
import com.mytests.spring.spring62injectionchanges.fallbacks.beans.Bean2;
import com.mytests.spring.spring62injectionchanges.fallbacks.beans.Bean3;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class InjectPrimaryBeans {


    private final Bean1 mybean1;
    private final Bean2 mybean2;
    private final Bean3 mybean3;
    private final Bean3 mybean33;
    private final Bean1 mybean11;
    private final Bean2 mybean20;

    // for Bean1-type parameter the single candidate should be reported - the one that doesn't have the @Fallback annotation
    // for Bean2-type parameter the single candidate should be reported - the one annotated with @Primary
    // for Bean3-type parameter the single candidate should be reported - the one that has #defaultCandidate=true
    // for Bean1-type parameter that has the matching name 'mybean11' autowiring by name should be performed, though this bean has @Fallback annotation (!!! No !!! Spring uses defaults!!!)
    // for Bean2-type parameter that has the matching name 'mybean20' autowiring by name should be performed, though this bean doesn't have @Primary annotation (!!! No !!! Spring uses defaults!!!)
    // for Bean3-type parameter that has the matching name 'mybean33' autowiring by name should be performed, though this bean has #defaultCandidate = false (!!! No !!! Spring uses defaults!!!)
    public InjectPrimaryBeans(Bean1 mybean1, Bean2 mybean2, Bean3 mybean3, Bean1 mybean11, Bean2 mybean20, Bean3 mybean33) {
        // primary/defaults:
        this.mybean1 = mybean1; // ok, navigates to 'mybean13' that doesn't have @Fallback
        this.mybean2 = mybean2; // ok, navigates to 'mybean21' bean that is @Primary-annotated
        this.mybean3 = mybean3; // ok, navigates to 'mybean32' bean that has #defaultCandidate = true
        // by name:
        this.mybean11 = mybean11; // navigates to `mybean11`
        this.mybean20 = mybean20; // no error, navigates to default (mybean21) bean that is @Primary-annotated
        this.mybean33 = mybean33; // false autowiring error is shown

    }

    public void displayDefaultBeans() {
        System.out.println("fallback test: " + mybean1.getId()
                           + ", primary test: " + mybean2.getId()
                           + ", defaultCandidate test: " + mybean3.getId());

    }
    public void displayByNameBeans() {
        System.out.println("fallback test: " + mybean11.getId()
                           + ", primary test: " + mybean20.getId()
                           + ", defaultCandidate test: " + mybean33.getId());
    }
}
