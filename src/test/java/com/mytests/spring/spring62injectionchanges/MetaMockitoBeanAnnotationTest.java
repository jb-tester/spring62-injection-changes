package com.mytests.spring.spring62injectionchanges;

import com.mytests.spring.spring62injectionchanges.testing.ServiceToMock1;
import com.mytests.spring.spring62injectionchanges.testing.ServiceToMock2;
import com.mytests.spring.spring62injectionchanges.testing.ServiceToMock3;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertNull;

@SpringBootTest
@MyMockitoBeans
public class MetaMockitoBeanAnnotationTest {


    @Autowired
    private ServiceToMock1 serviceToMock1;

    @Autowired
    private ServiceToMock2 serviceToMock2;

    @Autowired
    private ServiceToMock3 mockedService;

    @Test
    void testMockedBeans() {
        assertNull(serviceToMock1.getId());
        assertNull(serviceToMock2.getId());
        assertNull(mockedService.getId());
    }
}
