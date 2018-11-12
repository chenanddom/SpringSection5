package com.flexible.beans;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: chendom
 * Date: 2018-11-09
 * Time: 21:39
 */
public class Car {

    Person person = new Person();

    public Car() {
    }

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }

    @Override
    public String toString() {
        return "Car{" +
                "person=" + person +
                '}';
    }
}
