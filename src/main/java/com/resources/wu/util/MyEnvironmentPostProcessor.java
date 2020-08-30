package com.resources.wu.util;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.env.EnvironmentPostProcessor;
import org.springframework.core.env.ConfigurableEnvironment;
import org.springframework.core.env.PropertiesPropertySource;
import org.springframework.stereotype.Component;

import java.util.Properties;
/**
 * Demo class
 *
 * @author keriezhang
 * @date 2016/10/31
 */
@Component
public class MyEnvironmentPostProcessor implements EnvironmentPostProcessor {
    @Override
    public void postProcessEnvironment(ConfigurableEnvironment environment, SpringApplication application) {
        //MapPropertySource
        Properties properties = new Properties();
        properties.put("server.port", ServerPortUtils.getAvailablePort());
        System.out.println(properties.get("server.port"));
        PropertiesPropertySource source = new PropertiesPropertySource("myCustom", properties);
        environment.getPropertySources().addLast(source);
        //environment.getPropertySources().addAfter();
    }

}
