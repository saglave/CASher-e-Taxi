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
			return "Post successfully modified";
		}
		else
			return "Modification unsuccessful";
	}
}
