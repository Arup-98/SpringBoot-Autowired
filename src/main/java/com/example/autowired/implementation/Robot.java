package com.example.autowired.implementation;

public class Robot {
    private String thinking;
    private String emotion;
    private String memory;

    public Human(){
        System.out.println("Human have doing anything");
    }

    public Human(String thinking,String emotion,String memory){
        this.thinking=thinking;
        this.emotion=emotion;
        this.memory=memory;
        System.out.println("Human is the best Creature in the world");
    }
}
