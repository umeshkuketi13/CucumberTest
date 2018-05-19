package com.cucumber.ecommerce.runner.login;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;


@CucumberOptions(plugin = { "html:target/cucumber-html-report" }, features = {
				"classpath:featurefile/login/login.feature" }, glue = {
						"classpath:com.cucumber.ecommerce.stepdefinition", "classpath:com.cucumber.ecommerce.support" })
public class LoginRunner extends AbstractTestNGCucumberTests {

}
