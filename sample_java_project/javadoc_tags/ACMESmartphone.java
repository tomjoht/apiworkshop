package javadoc_tags;

import java.io.IOException;

/**
 * Works like a regular smartphone but also tracks roadrunners.
 * <p>
 * The ACME Smartphone can perform similar functions as other smartphones, such
 * as making phone calls, sending text messages, and browsing the web. However,
 * the ACME Smartphone also enables GPS tracking on roadrunners. You can monitor
 * the location of all roadrunners within a 20 mile radius using the RoadRunner
 * Tracker app.
 * <p>
 * Note that the RoadRunner Tracker app requires you to be connected to wifi. It
 * will not work on cellular data.
 * 
 * @author Tom Johnson
 * @version 2.0
 * @since 1.3
 * @see Dynamite
  */
public class ACMESmartphone {
	
	/**
	 * The coordinates where the nearest roadrunner is located.
	 */
	
	public String LongLat = "Longitude = 39.2334, Latitude = 41.4899"; // hard-coded for simplicity's sake.
	
	
	double model;
	String license;
	
	/**
	 * Creates and initializes a new ACME_Smartphone with the appropriate model and license number. 
	 * 
	 * Note that if your license is invalid or if the model is deprecated, the zapping controls on the
	 * phone will backfire.
	 * 
	 * @param model  The model of the ACME Smartphone you are initializing.
	 * @param license  The license associated with your ACME Smartphone.
	 */
	public ACMESmartphone(double model, String license) {
		this.model = model;
		this.license = license;
		System.out.println("model" + this.model + " now initialized for license " + license );
	}
	
	/**
	 * Gets the geocoordinates of roadrunners based on your city and state.
	 * 
	 * @param city the city you want to browse for roadrunners
	 * @param state the state you want to browse for roadrunners
	 * @return the coordinates of the roadrunner in your area
	 * @throws IOException if you put integers instead of strings
	 */
	public String findRoadRunner(String city, String state) throws IOException {
			
		System.out.println("location: " + city + ", " + state);
		System.out.println("getting geocoordinates of roadrunner.... ");
		System.out.println("roadrunner located at " + LongLat);
		return LongLat;
		
	}
	
	/**
	 * Zaps the roadrunner with the amount of volts you specify. 
	 * <p>
	 * Do not exceed more than 30 volts or the zap function will backfire. 
	 * For another way to kill a roadrunner, see the {@link Dynamite#blowDynamiteLoudBang} method.
	 * 
	 * @throws IOException if you don't enter an integer data type amount for the voltage 
	 * @param voltage  the number of volts you want to send into the roadrunner's body
	 * @see #findRoadRunner 
	 * @see Dynamite#blowDynamiteLoudBang and Dynamite#blowDynamiteSilentBang
	 */
	public void zapRoadRunner(int voltage) throws IOException {
		if (voltage < 31) {
			System.out.println("Zapping roadrunner with " + voltage + " volts!!!!");
		}
		else {
			System.out.println("Backfire!!! zapping coyote with 1,000,000 volts!!!!");
		}
	}

}
