package com.mytests.spring.spring62injectionchanges.spel;

import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Map;

@Component
public class DataBean {

    List<MyData> myDataList = List.of(new MyData("aaa"), new MyData("bbb"), new MyData("ccc"));
    String myStr = "myStr";
    Map<String,String> strMap = Map.of("key1", "value1", "key2", "value2");
    Map<String, MyData> myDataMap = Map.of("key1", new MyData("value1"), "key2", new MyData("value2"));
    MyData myData = new MyData("myData");

    public List<MyData> getMyDataList() {
        return myDataList;
    }

    public String getMyStr() {
        return myStr;
    }

    public Map<String, String> getStrMap() {
        return strMap;
    }

    public Map<String, MyData> getMyDataMap() {
        return myDataMap;
    }

    public MyData getMyData() {
        return myData;
    }
}
class MyData {
    String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public MyData(String name) {
        this.name = name;
    }
}