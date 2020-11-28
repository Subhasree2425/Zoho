package steps;

import cucumber.api.java.Before;

public class Hooks extends ProjectSpecificMethods{
	
	
	@Before
	public void preCondition() {
		openLeafTapsApp();
	}

	
	public void postCondition() {
		closeBrowser();
	}
}
