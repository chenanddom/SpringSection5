package com.flexible.refxml;

import com.flexible.beans.PenBox;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;

@Configuration
@ImportResource("classpath:iocdemo2.xml")
public class RefXmlConfig {
@Bean
@Autowired
public PenBox getPenBox(PenBox penBox){
    return penBox;
}
}
