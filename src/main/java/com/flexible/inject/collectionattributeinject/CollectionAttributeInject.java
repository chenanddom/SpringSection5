package com.flexible.inject.collectionattributeinject;

import com.flexible.beans.Favorite;
import com.flexible.beans.House;
import org.springframework.beans.factory.support.MethodReplacer;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: chendom
 * Date: 2018-11-12
 * Time: 8:19
 */
public class CollectionAttributeInject {

    public static void main(String[] args) {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("classpath:iocdemo.xml");
        Favorite favorite = (Favorite) ctx.getBean("favorities");
        System.out.println(favorite.toString());
        Favorite childFavorities = (Favorite) ctx.getBean("childFavorities");
        System.out.println(childFavorities.toString());
//        MethodReplacer
    }
}
