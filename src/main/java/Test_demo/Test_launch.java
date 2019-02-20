package Test_demo;

import java.io.FileInputStream;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test_launch {
	public static WebDriver driver;
	public static Properties prop;
	public Test_launch()
	{
		try
		{
			FileInputStream ip=new FileInputStream("F:\\eclipse\\com.maven\\src\\main\\java\\config\\configure.properties");
					prop=new Properties();
			prop.load(ip);
			
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
	}
	public static void initialization()
	{
		String browserName=prop.getProperty("browser");
		System.out.println(browserName);
		if(browserName.equals("chrome"));
		{
			System.setProperty(prop.getProperty("systemproperty_1"),prop.getProperty("systemproperty_2"));
			driver=new ChromeDriver();
		}
		//driver.manage().window().maximize();
		//driver.manage().deleteAllCookies();
		//driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS );
		driver.get(prop.getProperty("url"));
		
	}

}
