package com.mytests.spring.spring62injectionchanges;

import com.mytests.spring.spring62injectionchanges.testing.NotAComponent;
import com.mytests.spring.spring62injectionchanges.testing.NotAComponentToo;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.bean.override.mockito.MockitoBean;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

@SpringBootTest
@MockitoBean(types = NotAComponentToo.class)
public class MockitoBeanAnnotationForAbsentBeansTest {

    @MockitoBean("dummy")
    NotAComponent notAComponent;

    // error is shown - https://youtrack.jetbrains.com/issue/IDEA-369168/Autowiring-error-for-class-level-MockitoBean-annotation-for-absent-bean
    @Autowired
    NotAComponentToo notAComponentToo;

    @Test
    void testNotAComponent() {
        assertThat(notAComponent).isNotNull();
        assertThat(notAComponent.getId()).isNull();
    }
    @Test
    void testNotAComponentToo() {
        assertThat(notAComponentToo).isNotNull();
        assertThat(notAComponentToo.getId()).isNull();
    }
}
