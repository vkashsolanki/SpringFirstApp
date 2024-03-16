package com.spring;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
         try
         {
       	
        ApplicationContext applicationContext=new ClassPathXmlApplicationContext("com/spring/applicationContext.xml");
       	
        BulbService bulbService=(BulbService)applicationContext.getBean("bulbService");
        BulbService bulbService1=(BulbService)applicationContext.getBean("bulbService");
        
        System.out.println(bulbService);
        System.out.println(bulbService1);
        
       	
       	// 	System.out.println(bulbService.askForBulb());
       
        
        
        	// Resource resource=new ClassPathResource("com/spring/applicationContext.xml");
        	 
        	// BeanFactory beanFactory=new XmlBeanFactory(resource);
        	
        	 // beanFactory.getBean("lgbulb");
       
        	//BulbService bulbService=(BulbService)beanFactory.getBean("bulbService");
        	
        	 //System.out.println(bulbService.askForBulb());
        	 
       	
       	
        	 
         }
         
         catch (Exception e) {
        	  
         e.printStackTrace();
         }
    	
    	
    }
}
