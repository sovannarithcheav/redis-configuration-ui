package com.tmc.config.model.test$config;

import com.tmc.config.model.Default;
import org.springframework.data.annotation.Id;
import org.springframework.data.redis.core.RedisHash;

@RedisHash(KeyHash.QA)
public class TestConfigQa extends Default {

    private static final long serialVersionUID = -3899628143757818630L;

    public TestConfigQa(String key, String value) {
        super(key, value);
    }

    @Override
    @Id
    public void setKey(String key) {
        super.setKey(key);
    }
}