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

    // for Bean1-type parameter the single candidate should be reported - the one that doesn't have the @Fallback annotation
    // for Bean2-type parameter the single candidate should be reported - the one annotated with @Primary
    // for Bean3-type parameter the single candidate should be reported - the one that has #defaultCandidate=true
    public InjectPrimaryBeans(Bean1 mybean1, Bean2 mybean2, Bean3 mybean3) {
        this.mybean1 = mybean1;
        this.mybean2 = mybean2;
        this.mybean3 = mybean3;
    }

    public void displayBeans() {
        System.out.println("fallback test: " + mybean1.getId()
                           + ", primary test: " + mybean2.getId()
                           + ", defaultCandidate test: " + mybean3.getId());

    }
}
