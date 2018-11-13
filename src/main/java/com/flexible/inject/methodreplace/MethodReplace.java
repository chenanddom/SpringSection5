package com.flexible.inject.methodreplace;

import org.springframework.beans.factory.FactoryBean;
import org.springframework.beans.factory.config.CustomScopeConfigurer;
import org.springframework.beans.factory.config.Scope;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created with IntelliJ IDEA.
 * Description:使用了方法替换
 * User: chendom
 * Date: 2018-11-12
 * Time: 13:02
 */
public class MethodReplace {

    public static void main(String[] args) {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("classpath:iocdemo.xml");
        Boss boss = (Boss) ctx.getBean("boss1");
        System.out.println(boss.getHouse());
//        Scope
//        CustomScopeConfigurer
//        FactoryBean
    }
}
