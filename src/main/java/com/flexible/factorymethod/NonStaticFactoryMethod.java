package com.flexible.factorymethod;

import com.flexible.beans.Person;

/**
 * ʹ�÷Ǿ�̬�Ĺ���
 */
public class NonStaticFactoryMethod {
    /**
     * �����Ĵ�������
     * @return
     */
    public Person createPerson(){
    Person p = new Person();
    p.setUserName("lisi");
    p.setUserAge(20);
    return p;
}
}
