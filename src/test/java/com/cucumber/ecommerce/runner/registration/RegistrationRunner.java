package com.cucumber.ecommerce.runner.registration;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions(features = { "classpath:featurefile/registration/Registration.feature" }, glue = {
		"classpath:com.cucumber.ecommerece.stepdefinition",
		"classpath:com.cucumber.ecommerce.support" }, plugin = {"html:target/cucumber-html-report"})
public class RegistrationRunner  extends AbstractTestNGCucumberTests {

}
