package com.tmc.config.repository;

import com.tmc.config.model.SysMessage;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface SysMessageRepository extends JpaRepository<SysMessage, String> {

    List<SysMessage> findAllByCodeContaining(String code);

}