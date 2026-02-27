package com.codertruf.myAppSpring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Fallen {
    @Autowired
    private Dormant beast1;
    public Fallen(Dormant beast1){ //Constructor Injection
        this.beast1 = beast1;
    }

    private Dev dev;
    @Autowired
    public void setDev(Dev  dev){ //Setter Injection
        this.dev = dev;
    }


    public void corrupt(){
        beast1.rise();
        System.out.println("The corruption is initiating.... ... .. .");
        beast1.evolve();
    }

    public void develop(){
        dev.build();
    }




}
