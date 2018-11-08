package com.flexible.factorymethod;

import com.flexible.beans.Person;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class FactoryMethodDemo {

    public static void main(String[] args) {
        //�Ǿ�̬�ķ�ʽ
        ApplicationContext ctx = new ClassPathXmlApplicationContext("classpath:iocdemo.xml");
        Person person = (Person) ctx.getBean("p3");
        System.out.println(person.toString());
        //��̬�ķ�ʽ

        Person person2 = (Person) ctx.getBean("p3");
        System.out.println(person2.toString());

    }
}
