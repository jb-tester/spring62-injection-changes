package com.mytests.spring.spring62injectionchanges;

import com.mytests.spring.spring62injectionchanges.fallbacks.beans.Bean3;
import com.mytests.spring.spring62injectionchanges.testing.*;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.bean.override.convention.TestBean;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
public class TestBeanAnnotationTests {

    // navigation to the bean with the specified type should be provided;
    // navigation to instantiating method should be provided
    @TestBean
    ZeroBeanToOverride testBean0;

    // reported as not used
    private static ZeroBeanToOverride testBean0(){
        return new ZeroBeanToOverride("test");
    };

    @Test
    void testTestBeanOverrideByType() {
        assertThat(testBean0.getId()).isEqualTo("test");
    }

    // here we should report the ambiguous candidates if qualifier is absent
    @TestBean @Qualifier("firstBeanToOverride1")
    FirstBeanToOverride testBean1;

    private static FirstBeanToOverride testBean1(){
        return new FirstBeanToOverride("test");
    };

    @Test
    void testTestBeanOverrideByTypeWithQualifier() {
        assertThat(testBean0.getId()).isEqualTo("test");
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

    // no bean to override exists - the test bean is created
    // Spring Debugger doesn't find its DeclaredIn source ("Auto Configuration" is displayed)
    @TestBean(enforceOverride = false)
    FifthBeanToOverride testBean5;

    static FifthBeanToOverride testBean5(){
        return new FifthBeanToOverride("test");
    }
    @Test
    void testTestBeanOverrideEnforceOverride() {
        assertThat(testBean5.getId()).isEqualTo("test");
    }

    // static method that overrides bean is located in the external class
  @TestBean(methodName = "com.mytests.spring.spring62injectionchanges.testing.SixthBeanOverriding#testBean6")
  SixthBeanToOverride testBean6;

  @Test
   void testTestBeanOverrideMethodName() {
     assertThat(testBean6.getId()).isEqualTo("test");
   }
}
