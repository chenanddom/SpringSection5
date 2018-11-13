package com.flexible.beanfactory;

import com.flexible.beans.House;
import com.flexible.beans.HouseFactoryBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: chendom
 * Date: 2018-11-13
 * Time: 21:03
 */
public class BeanFactoryDemo {


    public static void main(String[] args) throws Exception {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("classpath:iocdemo.xml");
        House house = (House) ctx.getBean("hoursebean");
        System.out.println(house.toString());
        //如果想拿到HouseFactoryBean实例，就需要 &hoursebean
        HouseFactoryBean houseFactoryBean = (HouseFactoryBean) ctx.getBean("&hoursebean");
        System.out.println(houseFactoryBean.toString());
        House object = houseFactoryBean.getObject();
        System.out.println(object.toString());
    }


}
