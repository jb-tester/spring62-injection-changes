package com.mytests.spring.spring62injectionchanges;

import com.mytests.spring.spring62injectionchanges.testing.*;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.bean.override.mockito.MockitoBean;

import static org.junit.jupiter.api.Assertions.assertNull;

@SpringBootTest
public class MockitoBeanAnnotationForSuperTypesTests {

    @MockitoBean
    OverriddenInterface dummy;

    @MockitoBean
    OverriddenInterface firstOverriddenBean;

    @MockitoBean("secondOverriddenBean")
    OverriddenInterface secondOverriddenBean;

    @MockitoBean(name = "firstOverriddenBean")
    OverriddenInterface dummy2;

    @MockitoBean(types = FirstOverriddenBean.class)
    OverriddenInterface dummy3;

    }
