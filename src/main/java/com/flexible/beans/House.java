package com.flexible.beans;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: chendom
 * Date: 2018-11-09
 * Time: 8:52
 */
public class House {

    private Double length;

    private Double width;

    private Double height;

    private Person person;
    public House() {
    }

    public Double getLength() {
        return length;
    }

    public void setLength(Double length) {
        this.length = length;
    }

    public Double getWidth() {
        return width;
    }

    public void setWidth(Double width) {
        this.width = width;
    }

    public Double getHeight() {
        return height;
    }

    public void setHeight(Double height) {
        this.height = height;
    }

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }

    @Override
    public String toString() {
        return "House{" +
                "length=" + length +
                ", width=" + width +
                ", height=" + height +
                ", person=" + person +
                '}';
    }
}
