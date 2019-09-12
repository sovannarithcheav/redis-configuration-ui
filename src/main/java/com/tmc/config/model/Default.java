package com.tmc.config.model;

import org.springframework.data.annotation.Id;

import java.io.Serializable;

public abstract class Default implements Serializable, Cloneable {

    private static final long serialVersionUID = 1185324998955170270L;

    @Id
    private String key;

    private String value;

    public Default(String key, String value) {
        this.key = key;
        this.value = value;
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

}
