import org.junit.Test;
import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class javascriptExecutoeLogic extends main {

    public static JavascriptExecutor js;


    @Test
    public void textbox() {
        // js.executeScript("window.location = 'https://www.gmail.com';");
        js = (JavascriptExecutor) driver;
        WebElement x = (WebElement) js.executeScript("return document.getElementById('identifierId');");
        x.sendKeys("Poda vena");

    }

    @Test
    public void scrollToTheElement() throws InterruptedException {
        boolean elementPresentStatus = false;
        driverwaitlogic();

    }


    public void scroll() throws InterruptedException {
        try {
            js.executeScript("window.scrollBy(0,900);");
        } catch (Exception e) {
            e.printStackTrace();
        }
        //wait(2);
    }

    public boolean driverwaitlogic() {
        boolean status = false;
        try {

///Working
            WebElement Image = driver.findElement(By.xpath("//*[@id='title' and text()='Trending']"));
            ((JavascriptExecutor)

                    driver).executeScript("arguments[0].scrollIntoView(true);", Image);


            ///////////
            Point point = Image.getLocation();
            int x_coordinate = point.getX();
            int y_coordinate = point.getY();
            ((JavascriptExecutor) driver).executeScript("window.scrollBy(0,0)");
            JavascriptExecutor javScriptExecutor = (JavascriptExecutor) driver;
            javScriptExecutor.executeScript("window.scrollBy(" + x_coordinate + ", " + y_coordinate + ");");
//

        } catch (Exception e) {
            e.printStackTrace();
        }
        return status;
    }
}

