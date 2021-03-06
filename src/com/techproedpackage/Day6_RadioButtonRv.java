package com.techproedpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

//  Bir class oluşturun  : RadioButton
//  Main method oluşturun ve aşağıdaki görevi  tamamlayın.
//  Facebook web sayfasına gidin.  https://www.facebook.com/
//  Radio button elementlerini locate edin.
//  Seçili değilse istediginiz radio buttonu  tıklayın.

public class Day6_RadioButtonRv {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "/Users/cevdettellioglu/Documents/selenium libraries/drivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.facebook.com");

        WebElement female = driver.findElement(By.cssSelector("#u_0_6"));
        if (!female.isSelected()) {
            female.click();
        } else {
            System.out.println("female button selected");
        }
        WebElement male = driver.findElement(By.cssSelector("#u_0_7"));
        if (!male.isSelected()) {
            male.click();
        } else {
            System.out.println("male button is selected");
        }

        WebElement custom = driver.findElement(By.cssSelector("#u_0_8"));
        if (!custom.isSelected()) {
            custom.click();
        } else {
            System.out.println("custom button is selected");
        }
    }

}

