package com.mytests.spring.spring62injectionchanges.optionalInjections;

import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.stereotype.Component;

@Component
@ConditionalOnProperty(name = "foo.bar")
public class OptionalServiceImpl implements OptionalService {
    @Override
    public String getId() {
        return "ok";
    }
}
