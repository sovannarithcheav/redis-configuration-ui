package com.tmc.config.repository.test$config;

import com.tmc.config.model.test$config.TestConfigQa;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TestConfigRepositoryQa extends JpaRepository<TestConfigQa, String> {

    List<TestConfigQa> findAllByKeyContaining(String key);

}
