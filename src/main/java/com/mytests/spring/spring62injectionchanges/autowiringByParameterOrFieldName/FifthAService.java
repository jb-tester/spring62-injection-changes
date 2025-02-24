package com.mytests.spring.spring62injectionchanges.autowiringByParameterOrFieldName;

@org.springframework.stereotype.Service
class FifthAService implements AService {

    @Override
    public String getId() {
        return "AService_5";
    }
}