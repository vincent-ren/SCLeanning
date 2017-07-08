package com.scleanning.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

import java.util.Map;

/**
 * Created by vincent on 17-7-8.
 */
@Configuration
@ConfigurationProperties(prefix = "mail")
@Data
public class MailProperties {

    @Data
    public static class Smtp {
        private boolean auth;
        private boolean starttlsEnable;
    }
    private String host;
    private int port;
    private String from;
    private Map<String, String> username;
    private Map<String, String> password;
    private Smtp smtp;
}
