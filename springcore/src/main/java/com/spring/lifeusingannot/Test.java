package com.spring.lifeusingannot;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class Test
{
    public static void main( String[] args )
    {
        AbstractApplicationContext context=new ClassPathXmlApplicationContext("com/spring/lifeusingannot/config.xml");
        Example p1=(Example) context.getBean("example");
        System.out.println(p1);
        context.registerShutdownHook();
    }
}

