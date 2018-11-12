package com.flexible.inject.methodreplace;

import com.flexible.beans.House;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: chendom
 * Date: 2018-11-12
 * Time: 13:08
 */
public class Boss {
public House getHouse(){
House house = new House();
house.setHeight(1.0);
house.setLength(2.0);
house.setLength(3.0);
house.setWidth(4.0);
return house;
}
}
