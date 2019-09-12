package com.tmc.config.repository.test$config;

import com.tmc.config.model.test$config.TestConfigDev;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TestConfigRepositoryDev extends JpaRepository<TestConfigDev, String> {

}
