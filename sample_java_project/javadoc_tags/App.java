package javadoc_tags;

import java.io.IOException;

public class App {

	public static void main(String[] args) throws IOException {
		
		// First initialize your smartphone using the model number and license key.
		ACMESmartphone myACMESmartphone = new ACMESmartphone(2.0, "398978fdskj");
		
		// Locate the roadrunner.
		myACMESmartphone.findRoadRunner("Santa Clara","California");
		
		// Zap the roadrunner with the amount of voltage you want.
		myACMESmartphone.zapRoadRunner(40);

	}

}
