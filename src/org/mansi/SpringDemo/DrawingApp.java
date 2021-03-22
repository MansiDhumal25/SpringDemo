package org.mansi.SpringDemo;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.FileSystemResource;

public class DrawingApp {

	public static void main(String[] args) {
		//Triangle tri = new Triangle();
		//BeanFactory factory=new XmlBeanFactory(new FileSystemResource("NewFile.xml"));
		AbstractApplicationContext context= new ClassPathXmlApplicationContext("NewFile.xml");
		context.registerShutdownHook();
		//Triangle tri=(Triangle) context.getBean("triangle");
		//Circle cl=(Circle)context.getBean("circle");
		//tri.draw();
		//cl.draw();
		Shape shape=(Shape)context.getBean("circles");
		shape.draw();
	}

}
