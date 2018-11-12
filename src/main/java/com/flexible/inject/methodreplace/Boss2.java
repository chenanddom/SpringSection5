package com.flexible.inject.methodreplace;

import com.flexible.beans.House;
import org.springframework.beans.factory.support.MethodReplacer;

import java.lang.reflect.Method;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: chendom
 * Date: 2018-11-12
 * Time: 13:08
 */
public class Boss2 implements MethodReplacer{

    @Override
    public Object reimplement(Object obj, Method method, Object[] args) throws Throwable {
        House house = new House();
        house.setHeight(1.01);
        house.setLength(2.01);
        house.setLength(3.01);
        house.setWidth(4.01);
        return house;
    }
}
