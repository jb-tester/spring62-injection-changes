package com.mytests.spring.spring62injectionchanges.testing;

/**
 * *
 * <p>Created by irina on 9/19/2024.</p>
 * *
 */
public class ThirdBeanToOverride {
    public String getId() {
        return id;
    }

    private final String id;

    public ThirdBeanToOverride(String id) {
        this.id = id;
    }
    private String name = "third";

    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return this.name;
    }
}
