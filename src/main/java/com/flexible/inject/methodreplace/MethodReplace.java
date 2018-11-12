package com.flexible.inject.methodreplace;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: chendom
 * Date: 2018-11-12
 * Time: 13:02
 */
public class MethodReplace {

    public static void main(String[] args) {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("classpath:iocdemo.xml");
        Boss boss = (Boss) ctx.getBean("boss1");
        System.out.println(boss.getHouse());
    }
}
