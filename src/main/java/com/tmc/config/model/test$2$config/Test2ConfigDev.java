package com.tmc.config.model.test$2$config;

import com.tmc.config.model.Default;
import org.springframework.data.annotation.Id;
import org.springframework.data.redis.core.RedisHash;
import org.springframework.data.redis.core.index.Indexed;

@RedisHash(KeyHash.DEV)
public class Test2ConfigDev extends Default {

    private static final long serialVersionUID = -3899628143757818630L;

    public Test2ConfigDev(String key, String value) {
        super(key, value);
    }

    @Override
    @Id
    public void setKey(String key) {
        super.setKey(key);
    }
}