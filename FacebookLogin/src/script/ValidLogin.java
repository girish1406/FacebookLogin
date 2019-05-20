package script;

import org.testng.annotations.Test;

import generic.BaseTest;
import generic.XL;
import pages.LoginPage;

public class ValidLogin extends BaseTest {
	   @Test
       public void testValidLogin() {
		   String un = XL.getData(XL_PATH,"ValidLogin", 1, 0);
		   String pw = XL.getData(XL_PATH, "ValidLogin", 1, 1);
		   LoginPage lp=new LoginPage(driver);
		   lp.setUN(un);
		   lp.setPW(pw);
		   lp.clickLogin();
	   }
}
