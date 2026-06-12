package activities;

public class Activity3 {

	public static void main(String[] args) {
		 String result1 = adjustDevice("Thermostat", 41);
		 System.out.println(result1);
		 
		 String result2 = adjustDevice("Thermostat", 25);
		 System.out.println(result2);
		 
		 String result3 = adjustDevice("LIGHT", 50);
		 System.out.println(result3);
		 
		 String result4 = adjustDevice("fan", 35);
		 System.out.println(result4);
	}
	
	public static String adjustDevice(String device,int value)
	{
		String result = "";
		switch(device) {
		case "Thermostat":
			if(value > 40) {
				result= "Warning: Temperature is too high!";
				break;
			}
			else if(value < 40) {
				result= "[Thermostat] Temperature is set to " + value + " degrees.";
				break;
			}
			case "LIGHT":
				result= "[Light] Adjusting brightness to " + value + "%.";
				break;
				
				
				default:
					result= "Unknown device Type ";
				
				
		}
		return result;
	}

}
