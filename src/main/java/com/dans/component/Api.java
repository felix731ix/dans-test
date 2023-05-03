package com.dans.component;

import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Component
public class Api {
    private final RestTemplate restTemplate = new RestTemplate();

    public String getJobsDataAsString(String url) {
        String jsonData = restTemplate.getForObject(url, String.class);
        return jsonData;
    }
}
