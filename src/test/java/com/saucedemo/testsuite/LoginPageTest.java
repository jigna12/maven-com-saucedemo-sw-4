package com.saucedemo.testsuite;

import com.saucedemo.pages.LoginPage;
import com.saucedemo.testbase.TestBase;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginPageTest extends TestBase {
    LoginPage loginPage = new LoginPage();
    @Test
    public void userSholdLoginSuccessfullyWithValidCredentials() {
        loginPage.usernameField("standard_user");
        loginPage.passwordField("secret_sauce");
        loginPage.clickOnLoginButton();
        String expectedErrorMessage = "PRODUCTS";
        String actualErrorMessage = loginPage.verifyTheProductMssage();
        Assert.assertEquals(expectedErrorMessage, actualErrorMessage, "Error message displayed");
    }
    @Test
    public void verifyThatSixProductsAreDisplayedOnPage(){
        loginPage.usernameField("standard_user");
        loginPage.passwordField("secret_sauce");
        loginPage.clickOnLoginButton();
        loginPage.getproductList();
    }
}
