package com.flexible.lifecycle;

import com.flexible.beans.LifeCyleBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created with IntelliJ IDEA.
 * Description:使用Bean的生命周期函数
 * User: chendom
 * Date: 2018-11-14
 * Time: 8:21
 */
public class LifeCycleDemo {

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("classpath:iocdemo.xml");
        ((ClassPathXmlApplicationContext)context).destroy();

    }
}
