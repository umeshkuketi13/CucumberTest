package com.cucumber.ecommerce.runner.productCategory;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions(features = { "classpath:featurefile/productCategory/TestTotalNumberOfWomenDressProductRunner.feature" }, glue = {
		"classpath:com.cucumber.ecommerce.stepdefinition",
		"classpath:com.cucumber.ecommerce.support" }, plugin = {"html:target/cucumber-html-report"})
public class TestTotalNumberOfWomenDressProductRunner extends AbstractTestNGCucumberTests {

}
