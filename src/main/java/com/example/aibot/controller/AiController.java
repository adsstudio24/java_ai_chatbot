package com.example.aibot.controller;

import com.example.aibot.service.AiService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/chat")
public class AiController {
    private final AiService aiService;

    public AiController(AiService aiService) {
        this.aiService = aiService;
    }

    @PostMapping
    public String chatWithAi(@RequestBody String userInput) {
        return aiService.getResponse(userInput);
    }
}
