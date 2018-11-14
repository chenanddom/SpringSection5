package com.flexible.config;

import com.flexible.beans.Car;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Base64;

/**
 * Created with IntelliJ IDEA.
 * Description:测试spring的configuration
 * User: chendom
 * Date: 2018-11-14
 * Time: 9:09
 */
public class ConfigDemo {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        Car car = (Car) context.getBean(Car.class);
        System.out.println(car.toString());
        System.out.println(Base64.getEncoder().encodeToString("61a1c7730916af527700255aa07581cd".getBytes()));
        System.out.println(System.currentTimeMillis());
    }
}
