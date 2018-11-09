package com.flexible.inject.beaninject;

import com.flexible.beans.House;
import com.flexible.beans.Person;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: chendom
 * Date: 2018-11-09
 * Time: 8:50
 */
public class BeanInjectDemo {

    public static void main(String[] args) {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("classpath:iocdemo.xml");
        House house = (House) ctx.getBean("h1");
        System.out.println(house.toString());
    }
}
