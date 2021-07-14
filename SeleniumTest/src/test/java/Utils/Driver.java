package Utils;

import org.apache.commons.lang3.SystemUtils;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Driver {

	private static WebDriver driver;

	public static WebDriver getDriver(String browserType) {

		if (browserType.equalsIgnoreCase("Chrome")) {
			if (SystemUtils.IS_OS_MAC) {
				String driverPath = "src/test/java/Utils/drivers/chromedriver_mac_91";
				System.setProperty("webdriver.chrome.driver", driverPath);
			} else if (SystemUtils.IS_OS_WINDOWS) {
				String driverPath = "src/test/java/Utils/drivers/chromedriver_windows_91.exe";
				System.setProperty("webdriver.chrome.driver", driverPath);
			} else if (SystemUtils.IS_OS_LINUX) {
				String driverPath = "src/test/java/Utils/drivers/chromedriver_linux_245";
				System.setProperty("webdriver.chrome.driver", driverPath);
			} else {
				System.out.println("************** OS Not supported **************");
			}

			driver = new ChromeDriver();
		} else if (browserType.equalsIgnoreCase("Firefox")) {

			if (SystemUtils.IS_OS_MAC) {
				String driverPath = "src/test/java/Utils/drivers/geckodriver_mac";
				System.setProperty("webdriver.gecko.driver", driverPath);
			} else if (SystemUtils.IS_OS_WINDOWS) {
				String driverPath = "src/test/java/Utils/drivers/geckodriver_windows.exe";
				System.setProperty("webdriver.gecko.driver", driverPath);
			} else if (SystemUtils.IS_OS_LINUX) {
				String driverPath = "src/test/java/Utils/drivers/geckodriver_linux";
				System.setProperty("webdriver.gecko.driver", driverPath);
			} else {
				System.out.println("************** OS Not supported **************");
			}

			driver = new FirefoxDriver();
		}

		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		return driver;
	}
}
