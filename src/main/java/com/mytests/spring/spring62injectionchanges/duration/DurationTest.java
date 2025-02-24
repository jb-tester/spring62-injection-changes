package com.mytests.spring.spring62injectionchanges.duration;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.format.annotation.DurationFormat;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.time.Duration;

@Component
@ConfigurationProperties(prefix = "duration")
public class DurationTest {

    @DurationFormat(defaultUnit = DurationFormat.Unit.NANOS, style = DurationFormat.Style.COMPOSITE)
    private Duration test1;
    @DurationFormat(style = DurationFormat.Style.COMPOSITE)
    private Duration test2;
    @DurationFormat(style = DurationFormat.Style.COMPOSITE)
    private Duration test3;
    @DurationFormat(style = DurationFormat.Style.COMPOSITE)
    private Duration test4;
    @DurationFormat(style = DurationFormat.Style.COMPOSITE)
    private Duration test5;
    @DurationFormat(style = DurationFormat.Style.COMPOSITE)
    private Duration test6;

    public Duration getTest1() {
        return test1;
    }

    public void setTest1(Duration test1) {
        this.test1 = test1;
    }

    public Duration getTest2() {
        return test2;
    }

    public void setTest2(Duration test2) {
        this.test2 = test2;
    }

    public Duration getTest3() {
        return test3;
    }

    public void setTest3(Duration test3) {
        this.test3 = test3;
    }

    public Duration getTest4() {
        return test4;
    }

    public void setTest4(Duration test4) {
        this.test4 = test4;
    }

    public Duration getTest5() {
        return test5;
    }

    public void setTest5(Duration test5) {
        this.test5 = test5;
    }

    public Duration getTest6() {
        return test6;
    }

    public void setTest6(Duration test6) {
        this.test6 = test6;
    }
}
