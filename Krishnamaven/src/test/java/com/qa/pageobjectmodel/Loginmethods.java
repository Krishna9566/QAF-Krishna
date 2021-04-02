package com.qa.pageobjectmodel;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Loginmethods {
	
@FindBy(className="login")
public static WebElement loginbutton;
@FindBy(id="email")
public static WebElement username;
@FindBy(id="passwd")
public static WebElement password;
@FindBy(id="SubmitLogin")
public static WebElement submitbutton;

}
