package testappatg;

import io.selendroid.SelendroidDriver; 
import io.selendroid.common.SelendroidCapabilities;
import io.selendroid.common.device.DeviceTargetPlatform;
import io.selendroid.standalone.SelendroidConfiguration;
import io.selendroid.standalone.SelendroidLauncher;

import org.openqa.selenium.By; 
import org.openqa.selenium.WebDriver; 
import org.openqa.selenium.WebElement; 

import org.testng.Assert; 
import org.testng.annotations.AfterSuite; 
import org.testng.annotations.BeforeSuite; 
import org.testng.annotations.Test;
public class sairam {
	
	private WebDriver driver;
	   
	   
    /**
     * Setup the environment before testing
     * @throws Exception
	     */
    @BeforeSuite
    
		public void setUp() throws Exception {
					

        SelendroidConfiguration config = new SelendroidConfiguration();
	        
     
        config.addSupportedApp("atgworldapk451.apk");
	        
         
        
        SelendroidLauncher selendroidServer = new SelendroidLauncher(config);
	        selendroidServer.launchSelendroid();
        
    
        SelendroidCapabilities capa = new SelendroidCapabilities();
	        

       // Specify to use selendroid's test app
        capa.setAut("com.ATG.World:1.19");
	       
       // Specify to use the Android device API 19
        capa.setPlatformVersion(DeviceTargetPlatform.ANDROID20);
	        
        //request simulator,don't use real device
        capa.setEmulator(true);
	        
 
        capa.wait(10000000);
        
        
        driver = new SelendroidDriver(capa);
			       
    }
    
    @Test
    
    public void selendroidTest() throws Exception { 
					        
        // Print the log 
        System.out.print("Start executing test");
			        
        // Find the input text field on screen
// The id of this text field was get from step 9
        WebElement button = driver.findElement(By.id(""));
        button.click();
        
        Thread.sleep(5);
        
        WebElement name = driver.findElement(By.id(""));
		        
        // Verify that the text field enabled so user can enter text
        Assert.assertEquals("true", name.getAttribute("enabled"));
			        
        // Enter a text to text field
        name.sendKeys("Koi");        
        
        
        WebElement last = driver.findElement(By.id(""));
        
        // Verify that the text field enabled so user can enter text
        Assert.assertEquals("true", last.getAttribute("enabled"));
			        
        // Enter a text to text field
        last.sendKeys("hai");
        
        
        WebElement email = driver.findElement(By.id(""));
        
        // Verify that the text field enabled so user can enter text
        Assert.assertEquals("true", email.getAttribute("enabled"));
			        
        // Enter a text to text field
        email.sendKeys("dhingrabhumika100100@gmail.com");
        
        
        
        WebElement password = driver.findElement(By.id(""));
        
        // Verify that the text field enabled so user can enter text
        Assert.assertEquals("true", password.getAttribute("enabled"));
			        
        // Enter a text to text field
        password.sendKeys("bhumi");
        
        
        
        WebElement repass = driver.findElement(By.id(""));
        
        // Verify that the text field enabled so user can enter text
        Assert.assertEquals("true", repass.getAttribute("enabled"));
			        
        // Enter a text to text field
        repass.sendKeys("bhumi");
        
        
        
     
	
 // click Show Text button
// The id of this button was get from step 9
        WebElement register = driver.findElement(By.id(""));
			        register.click();
        
        // Delay time to take effect
        Thread.sleep(50);
        
        //Find the label "Text Show Here" on screen
// The id of this label was get from step 9
        WebElement post = driver.findElement(By.id(""));
			        
        post.click();
        
        WebElement image = driver.findElement(By.id(""));
        
        image.click();
  // Choose image and upload... here I am pasting the link of the image I uploaded manually (https://www.atg.world/view-article/31136)

}
    @AfterSuite
    public void tearDown() {
			driver.quit();
	    }
	         
	}













	
	
	
	

