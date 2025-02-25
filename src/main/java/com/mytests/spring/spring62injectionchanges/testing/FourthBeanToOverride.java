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
    private String name = "fourth";

    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return this.name;
    }
    public FourthBeanToOverride(String id) {
        this.id = id;
    }


}
