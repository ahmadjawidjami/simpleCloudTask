package com.cloudtask.demo.cloudtaksdemo;

import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * Created by ahmadjawid on 6/6/17.
 */

@ConfigurationProperties("simple")
public class SimpleTaskProperties {


    private String name = "Jawid";

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
