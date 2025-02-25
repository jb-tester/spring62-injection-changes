package com.mytests.spring.spring62injectionchanges.testing;

/**
 * *
 * <p>Created by irina on 9/19/2024.</p>
 * *
 */
public class SecondBeanToOverride {
    public String getId() {
        return id;
    }

    private final String id;

    public SecondBeanToOverride(String id) {
        this.id = id;
    }

    public String getName() {
        return "second";
    }
}
