package com.cucumber.ecommerce.runner.login;


import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions(features = { "classpath:featurefile/login/login.feature" }, glue = {
		"classpath:com.cucumber.ecommerce.stepdefinition",
		"classpath:com.cucumber.ecommerce.support" }, plugin = {"html:target/cucumber-html-report"})
public class LoginRunner extends AbstractTestNGCucumberTests {

}
