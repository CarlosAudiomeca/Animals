package com.cjimenezro.animals;

import javax.xml.ws.soap.AddressingFeature;

public class Whale implements Animals {

    private String name;

    private Integer age;


    @Override
    public String getName() {
        return name;
    }

    @Override
    public Integer getAge() {
        return age;
    }

    @Override
    public void setName(String name) {
        this.name=name;

    }

    @Override
    public void setAge(Integer age) {
        this.age=age;
    }
}
