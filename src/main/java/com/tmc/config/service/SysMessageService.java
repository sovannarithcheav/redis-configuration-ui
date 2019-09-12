package com.tmc.config.service;

import com.tmc.config.model.SysMessage;
import com.tmc.config.repository.SysMessageRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class SysMessageService {

    @Autowired
    private SysMessageRepository sysMessageRepository;

    public List<SysMessage> getAll() {
        return sysMessageRepository.findAll();
    }

    public SysMessage getByCode(String code) {
        Optional<SysMessage> sysMessage = sysMessageRepository.findById(code);
        return sysMessage.orElse(new SysMessage());
    }

    public SysMessage save(SysMessage sysMessage) {
        return sysMessageRepository.save(sysMessage);
    }

    public boolean delete(String code) {
        Optional<SysMessage> sysMessage = sysMessageRepository.findById(code);
        if (sysMessage.isPresent()) {
            sysMessageRepository.delete(sysMessage.get());
            return true;
        }
        return false;
    }
}
