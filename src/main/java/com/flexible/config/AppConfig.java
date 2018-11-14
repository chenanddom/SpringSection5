package com.flexible.config;

import com.flexible.beans.Car;
import com.flexible.beans.Person;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: chendom
 * Date: 2018-11-14
 * Time: 9:03
 */
//将一个POJO标注为定义Bean的配置类
@Configuration
public class AppConfig {

//@Bean(name = "car")
@Bean
public Car getCar(){
    Car car = new Car();
    car.setPerson(getPerson());
    return car;
}
@Bean
public Person getPerson(){
     Person person = new Person();
     person.setUserName("王八");
     person.setUserAge(28);
     return person;
}

}
