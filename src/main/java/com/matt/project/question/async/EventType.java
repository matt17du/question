package com.matt.project.question.async;

/**
 * @author matt
 * @create 2021-01-13 10:50
 */
public enum EventType {

    LIKE(0),
    COMMENT(1),
    LOGIN(2),
    MAIL(3),
    FOLLOW(4),
    REG(5);

    private int value;

    private void setValue(int value){
        this.value = value;
    }

    public int getValue(){
        return this.value;
    }

    private EventType(int value) {
        this.value = value;
    }

}
