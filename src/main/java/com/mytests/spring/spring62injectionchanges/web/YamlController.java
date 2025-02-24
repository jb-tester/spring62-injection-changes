package com.mytests.spring.spring62injectionchanges.web;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.core.JsonProcessingException;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * *
 * <p>Created by irina on 9/2/2024.</p>
 * *
 */
@RestController
@RequestMapping("/")
public class YamlController {

    @GetMapping(path ="/test1", produces = "application/yaml")
    public MyWebData test1() {
        return new MyWebData("aaa", List.of("bbb", "ccc"), new MyWebData.Nested("ddd"));
    }

    @PostMapping(value = "/test2", consumes = {"application/yaml", "application/yml"})
    public String test2(@RequestBody MyWebData data) throws JsonProcessingException {

        return data.toString();
    }
}
class MyWebData{

    String propOne;
    List<String> propTwo;
    Nested nested;

    public MyWebData(String propOne, List<String> propTwo, Nested nested) {
        this.propOne = propOne;
        this.propTwo = propTwo;
        this.nested = nested;
    }

    public String getPropOne() {
        return propOne;
    }

    public void setPropOne(String propOne) {
        this.propOne = propOne;
    }

    public List<String> getPropsTwo() {
        return propTwo;
    }

    public void setPropsTwo(List<String> propsTwo) {
        this.propTwo = propsTwo;
    }

    public Nested getNested() {
        return nested;
    }

    public void setNested(Nested nested) {
        this.nested = nested;
    }

    static class Nested{
        String propThree;

        public Nested(@JsonProperty("propThree")String propThree) {
            this.propThree = propThree;
        }

        public String getPropThree() {
            return propThree;
        }

        public void setPropThree(String propThree) {
            this.propThree = propThree;
        }
    }

    @Override
    public String toString() {
        return "MyWebData{" +
               "propOne='" + propOne + '\'' +
               ", propTwo=" + propTwo +
               ", nested=" + nested.getPropThree() +
               '}';
    }
}