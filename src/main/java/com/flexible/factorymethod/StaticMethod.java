package com.flexible.factorymethod;

import com.flexible.beans.Person;

public class StaticMethod {

    /**
     * 工厂的创建方法
     *
     * @return
     */
    public static Person createPerson() {
        Person p = new Person();
        p.setUserName("lisi");
        p.setUserAge(20);
        return p;
    }
}
