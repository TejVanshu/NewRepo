package package5;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * Hello world!
 *
 */
public class TestPropertiesClass 
{
    public static void main( String[] args ) throws FileNotFoundException, IOException
    {
        System.out.println( "Hello World!" );
        Properties prop=new Properties();
        prop.load(new FileInputStream(new File("Properties/configFile.properties")));
        System.out.println(prop.getProperty("server_host"));
        System.out.println(prop.getProperty("db_host"));
    	System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
		WebDriver d=new ChromeDriver();
    	d.get("https://www.google.com");
        String Title=d.getTitle();
        System.out.println("Title is "+Title );
        d.quit();
        System.out.println("Bye Bye");
    }
}
