package com.codertruf.myAppSpring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class MyAppSpringApplication {

	public static void main(String[] args) {

        ApplicationContext context =  SpringApplication.run(MyAppSpringApplication.class, args);

        Fallen mare =context.getBean(Fallen.class);

       mare.corrupt();
        System.out.println("--------------------------");
       mare.develop();

	}

}
