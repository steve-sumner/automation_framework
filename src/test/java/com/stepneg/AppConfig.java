package com.stepneg;


import org.springframework.beans.factory.config.YamlMapFactoryBean;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import java.util.List;

@Configuration
@ComponentScan(basePackages = "com.stepneg")
@ConfigurationProperties(prefix = "yaml")


// loads in automatically now need to test if i can instantiate objects using autowired etc...
//    and access them without a context - compare to something similar in landg framework

// Dont need this as picks up yaml be default although what happens if theres 2 files with different names
// but with the two value fields with the same name??
//@PropertySource(value = "classpath: env.config.yml", factory = YamlPropertySourceFactory.class)

public class AppConfig {
    private String name;

    private List<String> aliases;

}
