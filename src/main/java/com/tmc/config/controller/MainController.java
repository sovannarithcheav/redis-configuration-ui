package com.tmc.config.controller;

import com.tmc.config.model.SysMessage;
import com.tmc.config.service.SysMessageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/messages")
public class MainController {

    @Autowired
    private SysMessageService sysMessageService;

    @GetMapping("")
    public List<SysMessage> getAllMessages() {
        return sysMessageService.getAll();
    }

    @GetMapping("/{code}")
    public SysMessage getMessage(@PathVariable String code) {
        return sysMessageService.getByCode(code);
    }

    @PostMapping("")
    public SysMessage saveMessage(@RequestBody SysMessage sysMessage) {
        return sysMessageService.save(sysMessage);
    }

    @DeleteMapping("/{code}")
    public boolean deleteMessage(@PathVariable String code) {
        return sysMessageService.delete(code);
    }
}
