package com.flexible.beans;

import org.springframework.beans.factory.FactoryBean;

import javax.annotation.PostConstruct;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: chendom
 * Date: 2018-11-13
 * Time: 21:05
 */
public class HouseFactoryBean implements FactoryBean<House> {
   Person person;

    public Person getPerson() {
        return person;
    }
    //接受参数
    public void setPerson(Person person) {
        this.person = person;
    }
    //实例化bean
    @Override
    public House getObject() throws Exception {
       House house = new House();
       house.setLength(1.0);
       house.setWidth(2.0);
       house.setHeight(3.0);
       house.setPerson(person);
        return house;
    }
    //返回Hourse类型
    @Override
    public Class<House> getObjectType() {
        return House.class;
    }
    //比闹事通FactoryBean返回的Bean是singleton
    @Override
    public boolean isSingleton() {
        return false;
    }

    @Override
    public String toString() {
        return "HouseFactoryBean{" +
                "person=" + person +
                '}';
    }
/*    @PostConstruct
    public void printInfo(){
        System.out.println("Hello world");
    }*/
}
