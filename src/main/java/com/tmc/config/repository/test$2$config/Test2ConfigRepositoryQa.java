package com.tmc.config.repository.test$2$config;

import com.tmc.config.model.test$2$config.Test2ConfigQa;
import com.tmc.config.model.test$config.TestConfigQa;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface Test2ConfigRepositoryQa extends JpaRepository<Test2ConfigQa, String> {

}
