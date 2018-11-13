package com.flexible.relationbetweenbean;

import com.flexible.beans.Parent;
import com.flexible.inject.methodreplace.Boss;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class RelationBean {

    public static void main(String[] args) {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("classpath:iocdemo.xml");
        Parent parent = (Parent) ctx.getBean("child");
        System.out.println(parent.toString());
    }
}
