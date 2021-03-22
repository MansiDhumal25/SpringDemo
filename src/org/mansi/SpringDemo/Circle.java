package org.mansi.SpringDemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Required;
import org.springframework.web.portlet.bind.annotation.ResourceMapping;

public class Circle implements Shape{

	private Point center;
	public Point getCenter() {
		return center;
	}
	//@Autowired
	//@Qualifier("circleRelated")
	//@Resource(name="pointC")
	public void setCenter(Point center) {
		this.center = center;
	}
	@Override
	public void draw() {
		System.out.println("Drawing circle"); 
		System.out.println("Point is:("+ center.getX()+" "+ center.getY()+")");
		
	}
	/*
	 * @PostConstruct public void initializeCircle() {
	 * System.out.println(" Intializing Circle"); }
	 * 
	 * @PreDestroy public void destroyCircle() {
	 * System.out.println(" Destroying Circle"); }
	 */
}
