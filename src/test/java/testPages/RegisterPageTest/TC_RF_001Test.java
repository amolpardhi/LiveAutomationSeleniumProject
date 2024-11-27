package testPages.RegisterPageTest;

import base.BasePage;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.RegisterPage.TC_RF_001;

public class TC_RF_001Test extends BasePage {
    TC_RF_001 tcRf001;

    public TC_RF_001Test() {
        super();
    } 

    @BeforeMethod
    public void setUp(){
        initialization();
        tcRf001 = new TC_RF_001();
    }

    @Test
    public void RegisterWithMandatoryFieldsTest(){
        tcRf001.RegisterClick();
        //Filling Details
        tcRf001.RegisterWithMandatoryFields();
        String expected = "Your Account Has Been Created!";
        Assert.assertEquals(tcRf001.actualText.getText(), expected);
    }

    @AfterMethod
    public void tearDown() throws Exception{
        Thread.sleep(2000);
        driver.quit();
    }
}
