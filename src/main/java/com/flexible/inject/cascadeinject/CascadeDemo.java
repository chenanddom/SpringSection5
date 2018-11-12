package com.flexible.inject.cascadeinject;

import com.flexible.beans.Car;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: chendom
 * Date: 2018-11-09
 * Time: 21:42
 */
public class CascadeDemo {

    public static void main(String[] args) {

        ApplicationContext ctx = new ClassPathXmlApplicationContext("classpath:iocdemo.xml");
        Car car = (Car) ctx.getBean("car");
        System.out.println(car.toString());
    }
}
