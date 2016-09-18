package Collections;

import java.util.ArrayList;
import java.util.HashMap;

public class RouteFinder {
	HashMap<String,String> routeTable = new HashMap<String,String>();
	public RouteFinder()
	{
		routeTable.put("trichy","banglore");
		routeTable.put("banglore","chennai");
		routeTable.put("chennai","madurai");
		routeTable.put("kovai","nellai");
		routeTable.put("nellai", "kanyakumari");
		routeTable.put("kanyakumari", "kashmir");
		routeTable.put("kashmir", "goa");
	}
	public boolean addRoute(String Source, String Destination)
	{
		return (routeTable.put(Source,Destination)==null)?false:true;
	}
	public ArrayList<String> getRoute(String source, String Destination)
	{
		String 	sTemp = "";	
		source = source.toLowerCase();
		Destination = Destination.toLowerCase();
		ArrayList<String> route = new ArrayList<String>();
		route.add(source);
		while(true)
		{
			 sTemp = routeTable.get(source);
			 if(sTemp != null)
			 {
				  source = sTemp;
				  route.add(sTemp);
				  if(sTemp.equalsIgnoreCase(Destination))
				  {
					  sTemp = sTemp + " -> " + Destination;
					  break;
				  }
				   
			 }
			 else
			 {
				 route = null;
				 break;
			 }
		}
		return route;
	}
	
}
