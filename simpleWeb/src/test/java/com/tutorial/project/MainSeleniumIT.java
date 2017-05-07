package com.tutorial.project;

/*
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.thoughtworks.selenium.DefaultSelenium;
import com.thoughtworks.selenium.Selenium;
import com.thoughtworks.selenium.SeleniumException;
*/

public class MainSeleniumIT {

/*
  private Selenium selenium;

  @BeforeClass
  public void startSelenium() {
    this.selenium = new DefaultSelenium("localhost", 8080, "*firefox",
        "http://localhost:8080/simple-webapp/");
    this.selenium.start();
  }

  @Test
  public void testTwitter() {
    try {
      //selenium.open("http://localhost:8080/simple-webapp/");
      //selenium.waitForPageToLoad("3000");
      //assert(selenium.isTextPresent("World"));
      assert(true);
    } catch (SeleniumException e) {
      throw e;
    }
  }

  @AfterClass(alwaysRun = true)
  public void stopSelenium() {
    this.selenium.stop();
  }
*/

}

/*
import com.thoughtworks.selenium.SeleneseTestCase;

public class MainSeleniumIT extends SeleneseTestCase {

    public void setUp() throws Exception {
	String jettyPort = System.getProperty("jetty.port", "8080");
	System.out.println("*** jetty port: "+jettyPort);
 	String url = String.format("http://localhost:%s/simple-webapp/",jettyPort);
	System.out.println("*** url: "+url);
 	//setUp(url,"*firefox /usr/lib/firefox/firefox");
    }

    public void testUserShouldLogInByEnteringUsername() throws Exception {
        //selenium.open("/simple-webapp/simple/countMe");
	//System.out.println("*** tbc");

        assertThat(selenium.getTitle(), is("Tweeter - the art of meaningless utterances"));
        assertTrue(selenium.isTextPresent("Join the conversation"));
        assertFalse(selenium.isTextPresent("Logout"));

        selenium.type("username", "scott");
        selenium.type("password", "tiger");

        selenium.click("signin");

        selenium.waitForPageToLoad("5000");

        assertTrue(selenium.isTextPresent("Hi scott!"));
        assertTrue(selenium.isElementPresent("logout"));

	assertTrue(true);
    }

}

*/
