package com.github.myautoconfiguration;

import com.github.test.TestApplicationRunner;
import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@ConditionalOnClass(TestApplicationRunner.class)
public class MyAutoConfiguration {

    @Bean
    @ConditionalOnMissingBean(TestApplicationRunner.class)
    @ConditionalOnProperty(name = "test", havingValue = "true", matchIfMissing = true)
    public TestApplicationRunner testApplicationRunner() {
        return new TestApplicationRunner();
    }
}
