

	package searchYoutube;
	import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
	//comment the above line and uncomment below line to use Chrome
	//import org.openqa.selenium.chrome.ChromeDriver;
	public class MyClass {


	    public static void main(String[] args) {
	        // declaration and instantiation of objects/variables

			System.setProperty("webdriver.chrome.driver", "D:\\Automation - Selenium\\Automation Projects\\Drivers\\chromedriver.exe");
			
			WebDriver driver = new ChromeDriver();
			driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS) ;
	    	
	        String baseUrl = "https://www.youtube.com/";
	        String expectedTitle = "YouTube";
	        String actualTitle = "";

	        // launch ChromeDriver and direct it to the Base URL
	        driver.get(baseUrl);

	        // get the actual value of the title
	        actualTitle = driver.getTitle();
	        
	        
	        driver.manage().window().maximize();

	        /*
	         * compare the actual title of the page with the expected one and print
	         * the result as "Passed" or "Failed"
	         */
	       System.out.println(actualTitle);
	        
	        if (actualTitle.contentEquals(expectedTitle)){
	            System.out.println("Test Passed!");
	        } else {
	            System.out.println("Test Failed");
	        }
	       
	        
	        driver.findElement(By.id("search")).sendKeys("Nora Pepeta");
	        
	        driver.findElement(By.id("search-icon-legacy")).click();
	        driver.findElement(By.xpath("//*[contains(@title, 'Pepeta | Melvin Louis Ft. Nora Fatehi')]")).click();
	        driver.findElement(By.xpath("//button[@title='Full screen (f)']")).click();
	        
	        //close Fire fox
	       // driver.close();
	       
	    }

	}
	

