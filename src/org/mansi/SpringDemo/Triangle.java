package org.mansi.SpringDemo;

import java.util.List;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

//public class Triangle implements ApplicationContextAware,BeanNameAware,InitializingBean,DisposableBean{
public class Triangle implements Shape{

	//private  List<Point> points;

	
	
	  private Point pointA; private Point pointB; private Point pointC; private
	  ApplicationContext context=null;
	 



	public Point getPointA() { return pointA; }
	  
	  
	  public void setPointA(Point pointA) { this.pointA = pointA; }
	  
	  
	  public Point getPointB() { return pointB; }
	  
	  
	  public void setPointB(Point pointB) { this.pointB = pointB; }
	  
	  
	  public Point getPointC() { return pointC; }
	 
	  public void setPointC(Point pointC) { this.pointC = pointC; }
	 



	/*public List<Point> getPoints() {
		return points;
	}

	public void setPoints(List<Point> points) {
		this.points = points;
	}

	/*
	 * private String type; private int height;
	 * 
	 * public Triangle (int height) { this.height=height; } public Triangle (String
	 * type) { this.type=type; }
	 * 
	 * public Triangle(String type,int height) { this.type=type; this.height=height;
	 * } public String getType() { return type; } public int getHeight() { return
	 * height; }
	 * 
	 * public void setType(String type) { this.type = type; }
	 */
	public void draw() {
		
		  System.out.println("Point A=(" +getPointA().getX()+ " "+
		  getPointA().getY()+")"); 
		  System.out.println("Point B=(" +getPointB().getX()+
		  " "+ getPointB().getY()+")");
		  System.out.println("Point C=("+getPointC().getX()+ " "+ getPointC().getY()+")");
		  //System.out.println(getType() + "Drawing Triangle" + getHeight());
		 
		
		/*for (Point point: points) {
			System.out.println("Points ("+ point.getX()+"," + point.getY()+ ")");*/
		}


	/*@Override
	public void setApplicationContext(ApplicationContext context) throws BeansException {
		this.context=context;
		
	}


	@Override
	public void setBeanName(String beanName) {
		System.out.println("Bean Name is:"+beanName);
		
	}

	
	 * @Override public void afterPropertiesSet() throws Exception {
	 * System.out.println("InitializingBean init method");
	 * 
	 * }
	 * 
	 * 
	 * @Override public void destroy() throws Exception {
	 * System.out.println("DisposableBean destroy method");
	 * 
	 * }
	 */
	public void myInit() {
		System.out.println("My init method");
	}
	public void cleanup() {
		System.out.println("My clean up Method");
	}
}
