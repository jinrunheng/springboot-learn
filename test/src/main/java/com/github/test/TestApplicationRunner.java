package com.github.test;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;

@Slf4j
public class TestApplicationRunner implements ApplicationRunner {

    public TestApplicationRunner(){
        log.info("Initializing TestApplicationRunner");
    }

    @Override
    public void run(ApplicationArguments args) throws Exception {
        log.info("hello");
    }
}
