package activities;

import java.util.Arrays;
import java.util.Date;

public class Plane {
	private String[] passengers;
	private int maxPassengers;
	private Date lastTimeTookOf;
	private Date lastTimeLanded;
	
	public Plane(int maxPassengers) {
		this.maxPassengers = maxPassengers;
		this.passengers = new String[maxPassengers];
		
		
	}
	
	public void OnBoard(String[] PassengerName)
	{
	    if(PassengerName.length <= maxPassengers)
	    {
	        for(int i = 0; i < PassengerName.length; i++)
	        {
	            passengers[i] = PassengerName[i];
	        }
	    }
	    else
	    {
	        System.out.println("Plane is full");
	    }
	}
	
	public Date takeOff()
	{
		this.lastTimeTookOf = new Date();
		return lastTimeTookOf;
	}
	
	public void land()
	{
		this.lastTimeLanded=new Date();
		Arrays.fill(passengers, null);
	}
	
	public Date getLastTimeLanded()
	{
		return lastTimeLanded;
	}
	
	public void getPassengers()
	{
		for(int i=0;i<passengers.length;i++)
		{
			System.out.print(passengers[i] + " ");
		}
		
	}
	

}
