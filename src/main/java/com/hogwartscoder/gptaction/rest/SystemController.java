package com.hogwartscoder.gptaction.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SystemController {
    @GetMapping("/health/check")
    public String healthcheck() {
        return "ok\n";
    }
}
