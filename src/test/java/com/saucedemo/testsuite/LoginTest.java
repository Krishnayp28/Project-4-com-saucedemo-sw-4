package com.saucedemo.testsuite;

import com.saucedemo.pages.LoginPage;
import com.saucedemo.pages.ProductPage;
import com.saucedemo.testbase.BaseTest;
import org.testng.annotations.Test;

public class LoginTest extends BaseTest {
    LoginPage loginPage = new LoginPage();
    ProductPage productPage = new ProductPage();

    @Test
    public void userShouldLoginSuccessfullyWithValidCredentials() {
        loginPage.enterUserName("standard_user");
        loginPage.enterPassword("secret_sauce");
        loginPage.clickOnLoginButton();
        productPage.getProductText("Products");

    }
        @Test
        public void verifyThatSixProductsAreDisplayedOnPage(){
            loginPage.enterUserName("standard_user");
            loginPage.enterPassword("secret_sauce");
            loginPage.clickOnLoginButton();
            productPage.numberOfProducts(6);


        }

}
