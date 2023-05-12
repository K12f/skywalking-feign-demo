package com.example.demo;

import lombok.extern.slf4j.Slf4j;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

/**
 * Class Name: LogSchedule
 * Package: com.example.demo
 * Description:
 *
 * @author murphy.z
 * @date 2023/5/8 15:04
 * Version: 1.0
 */
@Slf4j
@Component
public class LogSchedule {

    @Scheduled(fixedDelay = 1000)
    public void print(){

        log.info("info test2");
        log.debug("debug test2");
        log.warn("warn test2");
    }
}
