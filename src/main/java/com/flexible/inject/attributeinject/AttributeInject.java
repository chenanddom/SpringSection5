package com.flexible.inject.attributeinject;

import com.flexible.beans.Person;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: chendom
 * Date: 2018-11-08
 * Time: 12:43
 */
public class AttributeInject {
    public static void main(String[] args) {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("classpath:iocdemo.xml");
        Person person = (Person) ctx.getBean("person");
        System.out.println(person.toString());
    }
}
