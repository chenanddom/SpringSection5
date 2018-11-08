package com.flexible.factorymethod;

import com.flexible.beans.Person;

/**
 * 使用非静态的工厂
 */
public class NonStaticFactoryMethod {
    /**
     * 工厂的创建方法
     * @return
     */
    public Person createPerson(){
    Person p = new Person();
    p.setUserName("lisi");
    p.setUserAge(20);
    return p;
}
}
