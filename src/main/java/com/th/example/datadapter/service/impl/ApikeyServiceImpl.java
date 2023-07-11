package com.th.example.datadapter.service.impl;

import com.th.example.datadapter.service.ApikeyService;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
public class ApikeyServiceImpl implements ApikeyService {
    @Setter(onMethod_ = @Autowired, onParam_ = @Value("${application.env}"))
    private String env;
    @Setter(onMethod_ = @Autowired, onParam_ = @Value("${spring.application.name}"))
    private String applicationName;

    @Override
    public String generateKey(String clientId) {
        return null;
    }

    @Override
    public boolean isValidKey(String key) {
        return false;
    }
}
