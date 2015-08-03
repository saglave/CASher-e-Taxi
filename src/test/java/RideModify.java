package test.java;

import main.java.Ride;

public class RideModify {
	public String SaveRide(Ride ride){
		if(ride!=null)
		{
			if(ride.authUser.equals("0"))
			{
				return "Invalid User";
			}
			if(ride.destination.isEmpty())
			{
				return "Destination cannot be blank";
			}
			if(ride.source.isEmpty())
			{
				return "Source cannot be blank";
			}
			if(ride.startTime.isEmpty() || !ride.startTime.matches("([01]?[0-9]|2[0-3]):[0-5][0-9]"))
			{
				return "StartTime invalid";
			}
			return "Post successfully modified";
		}
		else
			return "Modification unsuccessful";
	}
}
