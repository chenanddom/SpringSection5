package com.flexible.factorymethod;

import com.flexible.beans.Person;

public class StaticMethod {

    /**
     * �����Ĵ�������
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
