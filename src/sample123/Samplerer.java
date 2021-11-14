package sample123;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Samplerer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Anvesh is an Awesome guy");
		System.setProperty("webdriver.chrome.driver", "/home/anvesh/eclipse-workspace/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
	}
	// I am a disco dancer


}
