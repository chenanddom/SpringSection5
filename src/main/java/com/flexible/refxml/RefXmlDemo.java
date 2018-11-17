package com.flexible.refxml;

import com.flexible.beans.PenBox;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class RefXmlDemo {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(RefXmlConfig.class);
        PenBox penBox = (PenBox) context.getBean("penBox");
        System.out.println(penBox.toString());
    }
}
