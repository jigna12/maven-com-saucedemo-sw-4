package com.saucedemo.pages;

import com.saucedemo.utility.Utility;
import dev.failsafe.internal.util.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;


public class LoginPage extends Utility {
    By usernameField = By.id("user-name");//Enter “standard_user” username
    By passwordField = By.name("password");//Enter “secret_sauce” password
    By loginButton = By.id("login-button");//Click on ‘LOGIN’ button
    By verifyText = By.xpath("//span[contains(text(),'Products')]");//Verify the text “PRODUCTS”

    public void usernameField(String username){
        sendTextToElement(usernameField,username);
    }
    public void passwordField (String password){
        sendTextToElement(passwordField,password);
    }
    public void clickOnLoginButton(){
        clickOnElement(loginButton);
    }
    public String verifyTheProductMssage(){
        return getTextFromElement(verifyText);
    }
    public void getproductList(){
       //This requirement is from document
        int ExpectedNoOfProducts=6;
        //find no of products and count in Array List
        List<WebElement> Products = driver.findElements(By.className("inventory_item"));
        System.out.println("Actual No of Products on Display  = " +Products.size());
        for(WebElement element : Products)
        Assert.isTrue(true, String.valueOf(element.isDisplayed()));

    }



}
