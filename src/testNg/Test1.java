package testNg;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Test1 {

	@Test(priority=-1,invocationCount = 4)
	public void calls() {
		Reporter.log("Calls", true);
	}

	@Test(priority=-2 ,enabled = false)
	public void VideoCAll() {
		Reporter.log("Video Calls", true);
	}

	@Test
	public void setting() {
		Reporter.log("Settings", true);
	}
}
