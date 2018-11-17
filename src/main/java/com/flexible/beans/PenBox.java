package com.flexible.beans;

public class PenBox {

private String markName;

private String description;

    public PenBox() {
    }

    public String getMarkName() {
        return markName;
    }

    public void setMarkName(String markName) {
        this.markName = markName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "PenBox{" +
                "markName='" + markName + '\'' +
                ", description='" + description + '\'' +
                '}';
    }
}
