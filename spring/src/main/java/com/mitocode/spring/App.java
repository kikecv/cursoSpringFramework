package com.mitocode.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.mitocode.beans.AppConfig;
import com.mitocode.beans.AppConfig2;
import com.mitocode.beans.Mundo;

public class App {
	
	public static void main(String[] args) {
		
		//ApplicationContext appContext = new ClassPathXmlApplicationContext("com/mitocode/xml/beans.xml");
		//ApplicationContext appContext = new AnnotationConfigApplicationContext(AppConfig2.class);
		AnnotationConfigApplicationContext appContext = new AnnotationConfigApplicationContext();
		appContext.register(AppConfig.class);
		appContext.register(AppConfig2.class);
		appContext.refresh();
		
		Mundo m = (Mundo) appContext.getBean("marte");
		
		System.out.println(m.getSaludo());
		
	}

}
