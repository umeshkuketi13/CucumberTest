package com.cucumber.ecommerce.support.readerconfig;

import com.cucumber.ecommerce.support.browserconfig.BrowserType;

public interface ConfigReader {
	public String getUserName();
	public String getPassword();
	public String getWebsite();
	public int getPageLoadTimeOut();
	public int getImplicitWait();
	public int getExplicitWait();
	public BrowserType getBrowser();
}
