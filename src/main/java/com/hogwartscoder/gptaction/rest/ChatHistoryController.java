package com.hogwartscoder.gptaction.rest;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ChatHistoryController {
    @PostMapping("/send_history")
    public String healthcheck(String history) {
        System.out.println(history);
        return "got your history!";
    }
}
