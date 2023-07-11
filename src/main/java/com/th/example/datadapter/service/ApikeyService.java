package com.th.example.datadapter.service;

public interface ApikeyService {
    String generateKey(String clientId);
    boolean isValidKey(String key);
}
