package com.day14;

import com.utilities.ConfigurationReader;
import org.testng.annotations.Test;
public class LoginTests extends TestBase {

    Loginpage loginPage = new Loginpage();
​

    @Test
    public void loginTests1() {
        String username = ConfigurationReader.getProperty("username");
        String password = ConfigurationReader.getProperty("password");
        loginPage.login(username, password);
    }
}