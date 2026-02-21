package com.codertruf.myAppSpring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Dormant {
    private Awakened monster1;
    public void rise(){
         System.out.println("Awakening the dormant BEAST .......");
    }

    @Autowired
    public void setAwakened(Awakened monster1){
        this.monster1= monster1;
    }


    public void evolve(){
        monster1.isEvolved();
    }
}
