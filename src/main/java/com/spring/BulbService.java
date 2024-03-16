package com.spring;

import com.spring.Bulb;
import com.spring.LGBulb;
import com.spring.SuryaBulb;

public class BulbService  {
	
	
  private Bulb bulb;
  
  public BulbService() {
	 System.out.println("Bulb Service"); 
}

	
	public String askForBulb()
	{
		return bulb.getBulb();
	}


	public Bulb getBulb() {
		return bulb;
	}


	public void setBulb(Bulb bulb) {
		this.bulb = bulb;
	}
	
	
}
