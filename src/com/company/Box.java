package com.company;


public class Box<T, T1> {
 private T value1;
 private T1 value;

    public Box(T value1, T1 value) {
        this.value1 = value1;
        this.value = value;
    }

        public static Box generic(){
        Box<Integer, Integer>box=new Box<>(10, 50);
        return box;
    }

    @Override
    public String toString() {
        return
                "value1:" + value1;
    }
}
