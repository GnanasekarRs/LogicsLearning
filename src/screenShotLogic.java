import netscape.security.UserTarget;
import org.apache.commons.io.FileUtils;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.Random;

public class screenShotLogic extends main {

    static String filename = null;

    @Test
    public void screenshotCode() throws IOException {

        randomStringGenerator();
        String directory = System.getProperty("user.dir")+"\\screenshot\\"+filename;

        File sourceFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(sourceFile ,new File(directory));
    }

    @Test
    public void robotClassScreenshot() throws IOException, AWTException {

      try {
          randomStringGenerator();
          driver.findElement(By.xpath("/html/body/table[3]/tbody/tr[1]/td[2]/table/tbody/tr/td/div[4]/form/input")).click();
          String directory = System.getProperty("user.dir")+"\\screenshot\\"+filename;
          BufferedImage image = new Robot().createScreenCapture(new Rectangle(Toolkit.getDefaultToolkit().getScreenSize()));
          ImageIO.write(image, "png", new File(directory));
          wait(5);
          driver.switchTo().alert().accept();
          //driver.switchTo().alert().dismiss();
      }
      catch (Exception e)
      {
          driver.switchTo().alert().accept();
      }

    }

    public static String randomStringGenerator()
    {
        StringBuilder builder = new StringBuilder();
        String character = "abcdefg1234ABCDEFG";
        for(int i =0; i<character.length();i++)
        {
            int index = (int)(Math.random() * character.length());
            builder.append(character.charAt(index));
        }

         filename = builder.toString()+".png";
        return filename;
    }
}
