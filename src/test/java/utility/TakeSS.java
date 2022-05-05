package utility;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;


import io.cucumber.java.Scenario;
import io.cucumber.java.Status;
import reusableComponent.WebDriverHelper;

public class TakeSS {

static WebDriver driver=null;
public static String getScreenShot(Scenario result) {

  driver = WebDriverHelper.getDriver();

  // System.out.println(driver);
TakesScreenshot tk = (TakesScreenshot)driver;
File source = tk.getScreenshotAs(OutputType.FILE);


String path = null;
File des =null;
// SimpleDateFormat f = new SimpleDateFormat("dd-MM-yyyy-hh-mm-ss");
// String date = f.format(new Date());

//System.out.println(result.getStatus());

if(result.getStatus()==Status.PASSED)
         path = ".//screenShots//pass//" + result.getName()+ ".png";
else if(result.getStatus()==Status.FAILED)
path = ".//screenShots//fail//" + result.getName()+".png";    

try {

des = new File(path);
FileUtils.copyFile(source, des);
} catch (IOException e) {
e.printStackTrace();
}

return path;
}
}
