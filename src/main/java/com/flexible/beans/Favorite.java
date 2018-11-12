package com.flexible.beans;

import java.util.*;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: chendom
 * Date: 2018-11-12
 * Time: 8:21
 */
public class Favorite {
    /**
     * List集合
     */
    private List<String> favoties = new ArrayList<>();
    /**
     * map集合
     */
    private Map<String,String> map = new HashMap<>();

    /**
     *property,看作是特殊的map
     */
    private Properties properties = new Properties();
    public Favorite() {
    }

    public List<String> getFavoties() {
        return favoties;
    }

    public void setFavoties(List<String> favoties) {
        this.favoties = favoties;
    }

    public Map<String, String> getMap() {
        return map;
    }

    public void setMap(Map<String, String> map) {
        this.map = map;
    }

    public Properties getProperties() {
        return properties;
    }

    public void setProperties(Properties properties) {
        this.properties = properties;
    }

    @Override
    public String toString() {
        return "Favorite{" +
                "favoties=" + favoties +
                ", map=" + map +
                ", properties=" + properties +
                '}';
    }
}
