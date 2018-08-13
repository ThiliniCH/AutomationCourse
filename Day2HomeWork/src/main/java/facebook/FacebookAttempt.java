package facebook;

import org.openqa.selenium.By;
import utils.Common;
import utils.PropertyFileReader;

public class FacebookAttempt {

    PropertyFileReader prop = new PropertyFileReader();
    String attempt = prop.getProperty("attempt","attempt");


    public FacebookAttempt attempt() {
        Common.getInstance().getDriver().findElement(By.xpath(attempt));
        return new FacebookAttempt();
    }

}
