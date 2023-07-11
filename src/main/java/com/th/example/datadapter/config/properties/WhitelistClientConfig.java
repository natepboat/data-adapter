package com.th.example.datadapter.config.properties;

import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

import java.util.List;

@ConfigurationProperties(prefix = "whitelist.client")
@Configuration
@Setter
@Getter
public class WhitelistClientConfig {
    private List<String> id;
}
