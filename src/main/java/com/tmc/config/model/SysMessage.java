package com.tmc.config.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.springframework.data.annotation.Id;
import org.springframework.data.redis.core.RedisHash;

import java.io.Serializable;

@RedisHash("sys_messages_v2")
public class SysMessage implements Serializable, Cloneable {

    private static final long serialVersionUID = -1783151201812291838L;

    @Id
    private String code;
    private String message;
    private String messageKh;
    private String image;

    public SysMessage() {
    }

    public SysMessage(String code, String message, String messageKh, String image) {
        this.code = code;
        this.message = message;
        this.messageKh = messageKh;
        this.image = image;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getMessageKh() {
        return messageKh;
    }

    public void setMessageKh(String messageKh) {
        this.messageKh = messageKh;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

}
