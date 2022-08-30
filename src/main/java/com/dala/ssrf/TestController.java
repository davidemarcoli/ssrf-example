package com.dala.ssrf;

import lombok.SneakyThrows;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @Autowired
    TestService testService;

    @GetMapping("/request")
    public String fetch(@RequestBody String location) throws Exception {
        return testService.fetchRemoteObject(location);
    }

    @GetMapping("/exec")
    public String execute(@RequestBody String command) {
        return testService.runCommand(command);
    }
}