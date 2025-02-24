package com.mytests.spring.spring62injectionchanges;

import com.mytests.spring.spring62injectionchanges.testing.FirstBeanToOverride;
import com.mytests.spring.spring62injectionchanges.testing.SecondBeanToOverride;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.format.datetime.standard.DurationFormatterUtils;
import org.springframework.test.context.bean.override.convention.TestBean;

import java.time.Duration;

import static org.assertj.core.api.Assertions.assertThat;
import static org.springframework.format.annotation.DurationFormat.Style.COMPOSITE;

@SpringBootTest
class Spring62InjectionChangesApplicationTests {

    @Test
    void contextLoads() {
    }
    @Test
    void parseComposite() {
        Duration duration = DurationFormatterUtils.parse("1d2h34m57s28ms3us2ns", COMPOSITE);
        System.out.println(duration.toDays());
        System.out.println(duration.toHours());
        System.out.println(duration.toMinutes());
        System.out.println(duration.toSeconds());
        System.out.println(duration.toMillis());
        assertThat(duration)
                .isEqualTo(Duration.ofDays(1).plusHours(2)
                        .plusMinutes(34).plusSeconds(57)
                        .plusMillis(28).plusNanos(3002));
    }



}
