package com.example.demo;

import lombok.extern.slf4j.Slf4j;
import org.apache.skywalking.apm.toolkit.trace.Trace;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * Class Name: LogControlle
 * Package: com.example.demo
 * Description:
 *
 * @author murphy.z
 * @date 2023/5/12 14:50
 * Version: 1.0
 */
@RestController
@ResponseBody
@RequestMapping()
@Slf4j
public class LogController {
    @Resource
    AccountService accountService;

    @GetMapping("/log")
    @Trace(operationName = "mall order rpc")
    public String log() {
        log.info("some");
        return "world";
    }

    @GetMapping("/rpcLog")
    @Trace(operationName = "mocha rpc log")
    public String rpcLog(@RequestParam Integer id) {

        log.info(accountService.getRpc(id).toString());
        return "world";
    }
}
