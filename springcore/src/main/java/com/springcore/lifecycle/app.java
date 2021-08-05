package com.springcore.lifecycle;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class app 
{
    public static void main( String[] args )
    {
        AbstractApplicationContext context=new ClassPathXmlApplicationContext("com/springcore//lifecycle/config.xml");
        Pepsi p1=(Pepsi) context.getBean("p1");
        System.out.println(p1);
        context.registerShutdownHook();
    }
}

