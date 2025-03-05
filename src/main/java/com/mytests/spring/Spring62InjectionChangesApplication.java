package com.mytests.spring;

import com.mytests.spring.spring62injectionchanges.autowiringByParameterOrFieldName.InjectAServiceByConstructor;
import com.mytests.spring.spring62injectionchanges.autowiringByParameterOrFieldName.InjectAServiceByField;
import com.mytests.spring.spring62injectionchanges.autowiringByParameterOrFieldName.InjectAServiceToRecord;
import com.mytests.spring.spring62injectionchanges.fallbacks.InjectPrimaryBeans;
import com.mytests.spring.spring62injectionchanges.generics.*;
import com.mytests.spring.spring62injectionchanges.spel.ConfigureSPEL;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class Spring62InjectionChangesApplication {

    public static void main(String[] args) {
        SpringApplication.run(Spring62InjectionChangesApplication.class, args);
    }

        @Bean
        public CommandLineRunner commandLineRunner(InjectAServiceByField injectAServiceByField,
                                                   InjectAServiceByConstructor injectAServiceByConstructor,
                                                   InjectMultiBoundGenericsListInConstructor injectGenericsListInConstructor,
                                                   InjectMultiBoundGenericsInConstructorByTypeFooBarAndName injectGenericsInConstructor,
                                                   InjectFewSingleBoundGenericsInConstructorByTypesFooAndBarAndName injectGenericsInConstructor2,
                                                   InjectAServiceToRecord injectAServiceToRecord,
                                                   InjectPrimaryBeans injectPrimaryBeans, InjectSingleBoundGenericInConstructorByTypeFooAndName injectSingleBoundGenericInConstructorByTypeFooAndName, InjectListOfSingleBoundGenericInConstructorByTypeBar injectListOfSingleBoundGenericInConstructorByTypeBar, InjectListOfListOfBoundedTypes injectListOfListOfGenerics, ConfigureSPEL configureSPEL) {
            return args -> {
                System.out.println("--------------------------------------");
                injectAServiceByField.displayMethod();
                injectAServiceByConstructor.displayMethod();
                injectAServiceToRecord.displayMethod();
                System.out.println("-- generics: ");
                injectGenericsListInConstructor.displayMethod();
                injectGenericsInConstructor.displayMethod();
                injectGenericsInConstructor2.displayMethod();
                injectSingleBoundGenericInConstructorByTypeFooAndName.displayMethod();
                injectListOfSingleBoundGenericInConstructorByTypeBar.displayMethod();
                injectListOfListOfGenerics.displayMethod();
                System.out.println("-- primary/fallback/defaultCandidate: ");
                System.out.println("non-qualified injection (use defaults):");
                injectPrimaryBeans.displayDefaultBeans();
                System.out.println("injection by name (use specific beans instead of defaults) ");
                injectPrimaryBeans.displayByNameBeans();
                System.out.println(" -- SpEL indexing: ");
                configureSPEL.displayMethod();
                System.out.println("--------------------------------------");
            };
        }
}
