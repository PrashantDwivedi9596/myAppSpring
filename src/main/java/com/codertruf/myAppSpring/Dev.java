package com.codertruf.myAppSpring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Dev {


    private Computer comp;

    public Dev(Computer comp){
        this.comp = comp;
    }

    public void build(){
        System.out.println("Build a good program.....");
        System.out.println("Love to build new projects.....");

        comp.run();
    }
}
