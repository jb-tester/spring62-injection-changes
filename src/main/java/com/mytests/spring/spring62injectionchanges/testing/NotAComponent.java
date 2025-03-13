package com.mytests.spring.spring62injectionchanges.testing;


import org.springframework.beans.factory.annotation.Value;

public class NotAComponent {

    @Value("nn")
    String id;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}
