package com.mytests.spring.spring62injectionchanges.testing;

/**
 * *
 * <p>Created by irina on 9/19/2024.</p>
 * *
 */
public class FirstBeanToOverride {
    public String getId() {
        return id;
    }

    private final String id;

    public FirstBeanToOverride(String id) {
        this.id = id;
    }
}
