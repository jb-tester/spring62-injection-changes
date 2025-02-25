package com.mytests.spring.spring62injectionchanges.testing;


public class FifthBeanToOverride {
    public String getId() {
        return id;
    }

    private final String id;

    public FifthBeanToOverride(String id) {
        this.id = id;
    }
}
