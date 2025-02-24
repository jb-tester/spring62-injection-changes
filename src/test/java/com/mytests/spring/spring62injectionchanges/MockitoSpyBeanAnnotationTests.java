package com.mytests.spring.spring62injectionchanges;

import com.mytests.spring.spring62injectionchanges.testing.FirstBeanToOverride;
import com.mytests.spring.spring62injectionchanges.testing.FourthBeanToOverride;
import com.mytests.spring.spring62injectionchanges.testing.SecondBeanToOverride;
import com.mytests.spring.spring62injectionchanges.testing.ThirdBeanToOverride;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.bean.override.mockito.MockitoBean;
import org.springframework.test.context.bean.override.mockito.MockitoSpyBean;

import static org.junit.jupiter.api.Assertions.assertNull;

@SpringBootTest
@MockitoSpyBean(types = ThirdBeanToOverride.class)
@MockitoSpyBean(name = "fourthBeanToOverride", types = FourthBeanToOverride.class)
public class MockitoSpyBeanAnnotationTests {

    @MockitoSpyBean @Qualifier("firstBeanToOverride1")
    private FirstBeanToOverride bean1;

    @Test
    void testFirstBeanMocking() {
        assertNull(bean1.getId());
    }

    @MockitoSpyBean(name = "secondBeanToOverride")
    private SecondBeanToOverride bean2;

    @Test
    void testSecondBeanMocking() {
        assertNull(bean2.getId());
    }

    @Autowired
    private ThirdBeanToOverride thirdBeanToOverride;

    @Test
    void testThirdBeanMocking() {
        assertNull(thirdBeanToOverride.getId());
    }

    @Autowired
    private FourthBeanToOverride fourthBeanToOverride;

    @Test
    void testFourthBeanMocking() {
        assertNull(fourthBeanToOverride.getId());
    }
}
