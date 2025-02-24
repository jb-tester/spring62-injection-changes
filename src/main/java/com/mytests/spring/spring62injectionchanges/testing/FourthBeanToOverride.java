package com.mytests.spring.spring62injectionchanges.testing;

/**
 * *
 * <p>Created by irina on 9/19/2024.</p>
 * *
 */
public class FourthBeanToOverride {
    public String getId() {
        return id;
    }

    private final String id;

    public FourthBeanToOverride(String id) {
        this.id = id;
    }
}
