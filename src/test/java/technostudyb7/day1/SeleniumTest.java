package technostudyb7.day1;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumTest {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.google.com/");

        System.out.println("title of google.com=" + driver.getTitle());
        System.out.println("url of  google.com=" + driver.getCurrentUrl());
        driver.navigate().to("https://techno.study");


        String expectedTitle = "Join the best coding bootcamp online and get IT training in US ";
        String actualTitle = driver.getTitle();

        if (expectedTitle.equals(actualTitle)) {
            System.out.println("verification is done :PASS");
            System.out.println("actual title=" + actualTitle);
        } else {
            System.out.println("verification is FAILED");
            System.out.println("actual title=" + actualTitle);
        }
    }
}



