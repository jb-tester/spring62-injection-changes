package com.mytests.spring.spring62injectionchanges.testing;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
public class ServiceToMock1 {

    @Value("dev")
    String id;

    public String getId() {
        return id;
    }
}
