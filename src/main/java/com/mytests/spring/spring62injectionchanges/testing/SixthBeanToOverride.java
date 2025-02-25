package com.mytests.spring.spring62injectionchanges.testing;


public class SixthBeanToOverride {
    public String getId() {
        return id;
    }

    private final String id;

    public SixthBeanToOverride(String id) {
        this.id = id;
    }
}
