package com.mytests.spring.spring62injectionchanges;

import com.mytests.spring.spring62injectionchanges.testing.FirstBeanToOverride;
import com.mytests.spring.spring62injectionchanges.testing.FourthBeanToOverride;
import com.mytests.spring.spring62injectionchanges.testing.SecondBeanToOverride;
import com.mytests.spring.spring62injectionchanges.testing.ThirdBeanToOverride;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.bean.override.mockito.MockitoBean;
import org.springframework.test.context.bean.override.mockito.MockitoSpyBean;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.junit.jupiter.api.Assertions.assertNull;

@SpringBootTest
@MockitoSpyBean(types = ThirdBeanToOverride.class)
@MockitoSpyBean(name = "fourthBeanToOverride", types = FourthBeanToOverride.class)
public class MockitoSpyBeanAnnotationTests {

    @MockitoSpyBean @Qualifier("firstBeanToOverride1")
    private FirstBeanToOverride bean1;

    @Test
    void testFirstBeanMocking() {
        Mockito.doReturn("mockedValue").when(bean1).getName();
        Assertions.assertThat(bean1.getName()).isEqualTo("mockedValue");
        Assertions.assertThat(bean1.getId()).isEqualTo("dev");
    }

    @MockitoSpyBean(name = "secondBeanToOverride")
    private SecondBeanToOverride bean2;

    @Test
    void testSecondBeanMocking() {
        Mockito.doReturn("mockedValue").when(bean2).getName();
        Assertions.assertThat(bean2.getName()).isEqualTo("mockedValue");
        Assertions.assertThat(bean2.getId()).isEqualTo("dev");
    }

    @Autowired
    private ThirdBeanToOverride thirdBeanToOverride;

    @Test
    void testThirdBeanMocking() {
        Mockito.doReturn("mockedValue").when(thirdBeanToOverride).getName();
        Assertions.assertThat(thirdBeanToOverride.getName()).isEqualTo("mockedValue");
        Assertions.assertThat(thirdBeanToOverride.getId()).isEqualTo("dev");
    }

    @Autowired
    private FourthBeanToOverride fourthBeanToOverride;

    @Test
    void testFourthBeanMocking() {
        Mockito.doReturn("mockedValue").when(fourthBeanToOverride).getName();
        Assertions.assertThat(fourthBeanToOverride.getName()).isEqualTo("mockedValue");
        Assertions.assertThat(fourthBeanToOverride.getId()).isEqualTo("dev");
    }
}
