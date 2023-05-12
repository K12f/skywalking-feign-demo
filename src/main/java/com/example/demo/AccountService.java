package com.example.demo;

import org.springframework.cloud.openfeign.FeignAutoConfiguration;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.cloud.openfeign.FeignClientsConfiguration;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Class Name: AccountService
 * Package: com.example.demo
 * Description:
 *
 * @author murphy.z
 * @date 2023/5/12 15:16
 * Version: 1.0
 */
@FeignClient(
        value = "account-service",
        url = "http://127.0.0.1:9401",
        path="/account",
        configuration = FeignClientsConfiguration.class
)
@Service
public interface AccountService {
    @RequestMapping(value = "/rpcTest", method = RequestMethod.GET)
    AccountVo getRpc(@RequestParam("id") Integer id);

}
