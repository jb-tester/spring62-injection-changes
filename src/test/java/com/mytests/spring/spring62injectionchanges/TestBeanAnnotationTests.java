package com.mytests.spring.spring62injectionchanges;

import com.mytests.spring.spring62injectionchanges.testing.FirstBeanToOverride;
import com.mytests.spring.spring62injectionchanges.testing.SecondBeanToOverride;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.bean.override.convention.TestBean;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
public class TestBeanAnnotationTests {

    // navigation to the bean with the specified type should be provided;
    // navigation to instantiating method should be provided
    @TestBean
    FirstBeanToOverride testBean1;

    // reported as not used
    private static FirstBeanToOverride testBean1(){
        return new FirstBeanToOverride("test");
    };

    @Test
    void testTestBeanOverrideByType() {
        assertThat(testBean1.getId()).isEqualTo("test");
    }

    // navigation to the bean with the specified name should be provided;
    // navigation to instantiating method should be provided
    @TestBean(methodName = "testBean2", name = "secondBeanToOverride")
    SecondBeanToOverride bean2;

    // reported as not used - fixed
    private static SecondBeanToOverride testBean2(){
        return new SecondBeanToOverride("test");
    }
    @Test
    void testTestBeanOverrideByName() {
        assertThat(bean2.getId()).isEqualTo("test");
    }
}
