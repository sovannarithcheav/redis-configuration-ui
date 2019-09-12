package com.tmc.config;

import com.tmc.config.model.SysMessage;
import com.tmc.config.model.test$2$config.Test2ConfigDev;
import com.tmc.config.model.test$config.TestConfigDev;
import com.tmc.config.model.test$config.TestConfigQa;
import com.tmc.config.repository.SysMessageRepository;
import com.tmc.config.repository.test$2$config.Test2ConfigRepositoryDev;
import com.tmc.config.repository.test$2$config.Test2ConfigRepositoryQa;
import com.tmc.config.repository.test$config.TestConfigRepositoryDev;
import com.tmc.config.repository.test$config.TestConfigRepositoryQa;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ConfigApplicationTests {

    @Autowired
    private SysMessageRepository repo;

    @Autowired
    private TestConfigRepositoryDev testRepoDev;

    @Autowired
    private TestConfigRepositoryQa testRepoQa;

    @Autowired
    private Test2ConfigRepositoryDev test2RepoDev;

    @Autowired
    private Test2ConfigRepositoryQa test2RepoQa;


    @Test
    public void contextLoads() {
        /*TestConfigDev default$ = new TestConfigDev("lele", "lolo");
        TestConfigQa lo = new TestConfigQa("lele", "lol");
        test2RepoDev.save(new Test2ConfigDev("ping1", "pong1"));
        testRepoDev.save(default$);
        testRepoQa.save(lo);
        */

        SysMessage sysMessage = new SysMessage("S00001", "success", "success", "success.img");
        repo.save(sysMessage);
        repo.findById("E00001");
    }

}
