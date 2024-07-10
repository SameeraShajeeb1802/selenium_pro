package books;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;
import com.tricentis.genericutility.BaseClass;
import com.tricentis.genericutility.ListenersUtility;
@Listeners(ListenersUtility.class)
public class TC_DWS_005_Test extends BaseClass{
	@Test
	public void clickOnBooks() throws EncryptedDocumentException, IOException {
		 hp.getBooksLink().click();
		String expectedTitle = eLib.getStringDataFromExcel("Books", 1, 0);
		//Assert.assertEquals(driver.getTitle(), expectedTitle,"Books is not Displayed");
		Assert.assertEquals(driver.getTitle(), "books","Books is not Displayed");
		//Reporter.log("Books page is displayed",true);
		test.log(Status.PASS, "Books page is displayed");
	}

}
