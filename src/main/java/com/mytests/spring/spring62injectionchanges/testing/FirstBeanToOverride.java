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
    private String name = "first";

    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return this.name;
    }
}
