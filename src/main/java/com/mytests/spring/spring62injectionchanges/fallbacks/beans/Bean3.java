package com.mytests.spring.spring62injectionchanges.fallbacks.beans;


public class Bean3 {
    public String getId() {
        return id;
    }

    private final String id;

    public Bean3(String id) {
        this.id = id;
    }
}
