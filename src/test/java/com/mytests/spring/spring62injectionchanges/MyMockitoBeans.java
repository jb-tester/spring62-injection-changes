package com.mytests.spring.spring62injectionchanges;

import com.mytests.spring.spring62injectionchanges.testing.ServiceToMock1;
import com.mytests.spring.spring62injectionchanges.testing.ServiceToMock2;
import com.mytests.spring.spring62injectionchanges.testing.ServiceToMock3;
import org.springframework.test.context.bean.override.mockito.MockitoBean;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@MockitoBean(types = {ServiceToMock1.class, ServiceToMock2.class})
@MockitoBean(name = "mockedService", types = ServiceToMock3.class)
public @interface MyMockitoBeans {
}