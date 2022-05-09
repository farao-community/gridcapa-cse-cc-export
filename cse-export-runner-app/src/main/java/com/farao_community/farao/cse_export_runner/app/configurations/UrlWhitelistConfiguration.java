package com.farao_community.farao.cse_export_runner.app.configurations;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Configuration;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Amira Kahya {@literal <amira.kahya at rte-france.com>}
 */
@Configuration
@EnableConfigurationProperties
@ConfigurationProperties("cse-cc-runner")
public class UrlWhitelistConfiguration {
    private final List<String> whitelist = new ArrayList<>();

    public List<String> getWhitelist() {
        return whitelist;
    }
}
