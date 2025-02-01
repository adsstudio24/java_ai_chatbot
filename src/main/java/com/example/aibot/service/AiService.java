package com.example.aibot.service;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import org.json.JSONObject;

@Service
public class AiService {
    @Value("${openai.api.key}")
    private String apiKey;

    private static final String OPENAI_URL = "https://api.openai.com/v1/completions";

    public String getResponse(String userMessage) {
        RestTemplate restTemplate = new RestTemplate();

        JSONObject requestBody = new JSONObject();
        requestBody.put("model", "text-davinci-003");
        requestBody.put("prompt", userMessage);
        requestBody.put("max_tokens", 100);

        org.springframework.http.HttpHeaders headers = new org.springframework.http.HttpHeaders();
        headers.set("Content-Type", "application/json");
        headers.set("Authorization", "Bearer " + apiKey);

        org.springframework.http.HttpEntity<String> entity = new org.springframework.http.HttpEntity<>(requestBody.toString(), headers);
        String response = restTemplate.postForObject(OPENAI_URL, entity, String.class);

        JSONObject jsonResponse = new JSONObject(response);
        return jsonResponse.getJSONArray("choices").getJSONObject(0).getString("text").trim();
    }
}
