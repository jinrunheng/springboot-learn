package com.github.propertysourcedemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.env.EnvironmentPostProcessor;
import org.springframework.boot.env.PropertiesPropertySourceLoader;
import org.springframework.core.env.ConfigurableEnvironment;
import org.springframework.core.env.MutablePropertySources;
import org.springframework.core.env.PropertySource;
import org.springframework.core.io.ClassPathResource;

import java.io.IOException;

public class MyEnvironmentPostProcessor implements EnvironmentPostProcessor {

    private PropertiesPropertySourceLoader loader = new PropertiesPropertySourceLoader();

    @Override
    public void postProcessEnvironment(ConfigurableEnvironment environment, SpringApplication application) {
        MutablePropertySources propertySources = environment.getPropertySources();
        ClassPathResource resource = new ClassPathResource("/config/my.properties");
        try {
            PropertySource ps = loader.load("my", resource).get(0);
            propertySources.addLast(ps);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
