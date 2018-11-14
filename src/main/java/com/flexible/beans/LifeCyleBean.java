package com.flexible.beans;

import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: chendom
 * Date: 2018-11-14
 * Time: 8:27
 */
@Component
public class LifeCyleBean {
    private String info;
    @PostConstruct
    public void initMethod(){
        System.out.println(".....this is initMethod....");
    }
    @PreDestroy
    public void destroyMethod(){
        System.out.println(".....this is destroyMethod....");
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }
}
