package com.mytests.spring.spring62injectionchanges.fallbacks.beans;

/**
 * *
 * <p>Created by irina on 8/21/2024.</p>
 * *
 */
public class Bean1 {

    String id;

    public String getId() {
        return this.id;
    }

    public Bean1(String id) {
        this.id = id;
    }
}    