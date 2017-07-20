package com.rightstart.objrepo;

import org.openqa.selenium.By;

public interface CreateAccountPageProeprty {

	By firstNameLocator=By.id("dwfrm_profile_customer_firstname");
	By lastNameLocator=By.id("dwfrm_profile_customer_lastname");
	By emailLocator=By.id("dwfrm_profile_customer_email");
	By confrimEmailLocator=By.id("dwfrm_profile_customer_emailconfirm");
	By passwordLocator=By.id("dwfrm_profile_login_password");
	By confirmPasswordLocator=By.id("dwfrm_profile_login_passwordconfirm");
	
	By submitButtonLocator=By.name("dwfrm_profile_confirm");
}
