package com.face.pageFactory;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;

import core.generic.StepBase2;
import core.generic.Utilities;
import core.generic.WrapperFunctions;

public class PPlusDailyPage {
	public static String initialText = "test";
	public static String initialText1 = "test";
	public static String finalText = "test";

	static boolean para1 = false;
	static boolean para2 = false;
	static boolean para3 = false;
	static boolean para4 = false;
	static boolean para5 = false;

	// Local variables
	private WrapperFunctions objWrapperFunctions = new WrapperFunctions();
	private Utilities objUtilities = new Utilities();
	private StepBase2 objStepBase2 = new StepBase2();
	// Login
	By loginpplus = By.id("com.hp.pregnancy.lite:id/btn_login");
	By inputUserName = By.id("com.hp.pregnancy.lite:id/et_email");
	By inputUserPassword = By.id("com.hp.pregnancy.lite:id/et_password");
	By continuebutton = By.id("com.hp.pregnancy.lite:id/btn_login");

	// Profile
	By profilepicture = By.id("com.hp.pregnancy.lite:id/iv_hp_logo_bg");

	// App setting
	By appsetting = By
			.xpath("//android.widget.TextView[contains(@resource-id,'com.hp.pregnancy.lite:id/tc_menu_title')]");
	By reminderbutton = By.id("com.hp.pregnancy.lite:id/sw_reminder");
	By lengthunits = By.id("com.hp.pregnancy.lite:id/tv_length_units");
	By selectlengthunit = By.xpath(
			"/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ListView/android.widget.TextView[2]");

	By weightunits = By.xpath(
			"/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.View/android.widget.FrameLayout/android.view.View/android.widget.Spinner[2]/android.widget.TextView");
	By selectweighthunit = By.xpath(
			"/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ListView/android.widget.TextView[2]");

	By btnClickCm = By.xpath(
			"/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ListView/android.widget.TextView[2]");

	// Account
	By textfirstName = By.xpath(
			"/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.View/android.widget.FrameLayout/android.view.View/androidx.recyclerview.widget.RecyclerView/android.view.View[5]/android.widget.EditText");
	By textlastName = By.xpath(
			"/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.View/android.widget.FrameLayout/android.view.View/androidx.recyclerview.widget.RecyclerView/android.view.View[6]/android.widget.EditText");
	By dropdownRelation = By.xpath(
			"/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.View/android.widget.FrameLayout/android.view.View/androidx.recyclerview.widget.RecyclerView/android.view.View[8]/android.widget.Spinner/android.widget.TextView");
	By dropdownLocation = By.xpath(
			"/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.View/android.widget.FrameLayout/android.view.View/androidx.recyclerview.widget.RecyclerView/android.view.View[7]/android.widget.Spinner/android.widget.TextView");
	By btnsignOut = By.id("com.hp.pregnancy.lite:id/btn_signout");

	// Buttons
	By btnProfile = By.id("com.hp.pregnancy.lite:id/iv_hp_logo_bg");
	By btnSave = By.id("com.hp.pregnancy.lite:id/savebtn");
	By btnClickNo = By.id("android:id/button2");
	By btnYesPopup = By.id("android:id/button1");
	By btnDismissPopup = By.id("android:id/button1");
	By btnPregnancyLoss = By.id("com.hp.pregnancy.lite:id/sw_menu");
	By btnBabyBorn = By.xpath(
			"/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[8]/android.widget.Switch");
	By btnDateOfBirth = By.id("com.hp.pregnancy.lite:id/tv_dob");
	By btnSignOut = By.id("com.hp.pregnancy.lite:id/btn_signout");

	By btnWeekly = By.xpath(
			"/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.support.v4.widget.DrawerLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/android.widget.RelativeLayout/android.widget.TableLayout/android.widget.TableRow[1]/android.widget.RelativeLayout[2]");
	// DropDown's
	By drpdwnBabyGender = By.id("com.hp.pregnancy.lite:id/menuItem");
	By drpdwnWeek = By.id("com.hp.pregnancy.lite:id/sw_menu");

	// PickDate
	By datePicker = By.xpath(
			"/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[4]/android.widget.TextView");
	By dateCalculator = By.xpath(
			"/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[5]/android.view.ViewGroup/android.widget.TextView");

	By btnIwillJoinLater = By.xpath(
			"/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.TextView[2]");
	By txtUserName = By.xpath(
			"/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.FrameLayout/android.widget.ScrollView/android.widget.RelativeLayout/android.widget.TableLayout/android.widget.TableRow[1]/android.widget.EditText");
	By btnDone = By.xpath(
			"/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.FrameLayout/android.widget.ScrollView/android.widget.RelativeLayout/android.widget.RelativeLayout[2]/android.widget.Button");
	By btnIAgree = By.xpath(
			"/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.FrameLayout/android.widget.ScrollView/android.widget.RelativeLayout/android.widget.Button");
	By btnBaby = By.xpath("//*[@text='baby']");
	// By btnGotIt =
	// By.id("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.RelativeLayout/android.widget.Button");
	// By btnGotIt = By.id("Got it");
	By btnGotIt = By.xpath(
			"/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.RelativeLayout/android.widget.Button");
	By btnDaily = By.xpath(
			"/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.support.v4.widget.DrawerLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/android.widget.RelativeLayout/android.widget.TableLayout/android.widget.TableRow[1]/android.widget.RelativeLayout[1]");

	By txtDailyPage = By.xpath(
			"/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.support.v4.widget.DrawerLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/android.widget.RelativeLayout/android.support.v4.view.ViewPager/android.widget.RelativeLayout/android.widget.ScrollView/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.RelativeLayout[2]/android.widget.RelativeLayout/android.widget.TextView[3]");

	String txtDailyPage1 = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.support.v4.widget.DrawerLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/android.widget.RelativeLayout/android.support.v4.view.ViewPager/android.widget.RelativeLayout/android.widget.ScrollView/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.RelativeLayout[2]/android.widget.RelativeLayout/android.widget.TextView[3]";

	// String txtWeeklyPara1 =
	// "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.support.v4.widget.DrawerLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/android.widget.RelativeLayout/android.support.v4.view.ViewPager/android.widget.RelativeLayout/android.widget.ScrollView/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.RelativeLayout/android.widget.TextView[2]";

	String txtWeeklyPara1 = "//*[contains(@resource-id,'com.hp.pregnancy:id/descText1')]";
	String txtWeeklyPara2 = "//*[contains(@resource-id,'com.hp.pregnancy:id/descText2')]";

	String txtWeeklyPara3 = "//*[contains(@resource-id,'com.hp.pregnancy:id/descText3')]";
	String txtWeeklyPara4 = "//*[contains(@resource-id,'com.hp.pregnancy:id/descText4')]";
	String txtWeeklyPara5 = "//*[contains(@resource-id,'com.hp.pregnancy:id/descText5')]";

	public boolean clickOnNoIWillJoinLaterButton() {
		return objWrapperFunctions.mobileClick(btnIwillJoinLater);
	}

	public boolean firstName(String firstName) {
		return objWrapperFunctions.mobileSetText(textfirstName, firstName);

	}

	public boolean lastName(String lastName) {
		return objWrapperFunctions.mobileSetText(textlastName, lastName);

	}

	public boolean selectrelationDropdown(String relationDropDown) {
		return objWrapperFunctions.mobileDropDownOption(dropdownRelation, relationDropDown, "Text");
	}

	public boolean selectlocationDropdown(String locationDropDown) {
		return objWrapperFunctions.mobileDropDownOption(dropdownLocation, locationDropDown, "Text");
	}

	public boolean clickSignoutButton() {
		return objWrapperFunctions.mobileClick(btnsignOut);
	}

	public boolean clickLoginButton() {
		return objWrapperFunctions.mobileClick(loginpplus);
	}

	public boolean setUserName(String userName) {
		objWrapperFunctions.mobileSetText(txtUserName, userName);
		objStepBase2.getDriver().navigate().back();
		return true;
	}

	public boolean clickOnDoneButton() {
		return objWrapperFunctions.mobileClick(btnDone);
	}

	public boolean clickOnIAgree() {

		return objWrapperFunctions.mobileClick(btnIAgree);
	}

	public boolean clickOnBabyTab() {
		// Thread.sleep(5000);
		return objWrapperFunctions.mobileClick(btnBaby);
	}

	public boolean clickOnDailyTab() {
		return objWrapperFunctions.mobileClick(btnDaily);

	}

	public boolean GetTextToVerify() throws IOException, InterruptedException {
		/**
		 * @author Martin D'souza
		 * @desc Read excel file and compare with the html pages from device. Created on
		 *       : 07-09-2018 Modified on:
		 */

		objWrapperFunctions.swipeHorizontal(278, 352, 100, 352, 1000);

		// Reading data from XL
		System.out.println("Reading Excel sheet");
		FileInputStream file = new FileInputStream("D:\\daily.xlsx");
		XSSFWorkbook workbook = new XSSFWorkbook(file);
		XSSFSheet sheet = workbook.getSheet("daily");

		Iterator itr = sheet.iterator();
		Row rowitr = (Row) itr.next();
		Iterator cellitr = rowitr.cellIterator();
		int rowCount = sheet.getLastRowNum();
		System.out.println("Total no of pages: " + rowCount);

		for (int i = 0; i <= rowCount; i++) {
			initialText = objStepBase2.getDriver().findElement(By.xpath(txtDailyPage1)).getText();
			String finalText = initialText.trim();
//			 System.out.println("Device:" + finalText);

			String cellValue = sheet.getRow(i).getCell(3).getStringCellValue();
//			 System.out.println(i);
//			 System.out.println(cellValue);
			
			 String re1 = "<([^>]+)>"; // Tag 1
		        String re2 = "([^<]*)"; // Variable Name 1
		        String re3 = re1;

		        StringBuffer sbuff = new StringBuffer();
		        Pattern p = Pattern.compile(re1 + re2 + re3, Pattern.CASE_INSENSITIVE | Pattern.DOTALL);
		        Matcher m = p.matcher(cellValue);

		        while (m.find()) {
		            String var1 = m.group(2);
		            m.appendReplacement(sbuff,var1.toString().trim());
		        }
		        m.appendTail(sbuff);
		        String finalCellValue = sbuff.toString();
//		        System.out.println(sbuff.toString());

			if (finalText.equals(finalCellValue)) {
				System.out.println(i + " :Pass");
			} else {
				System.out.println(i + " :Fail");
			}
			Thread.sleep(2000);
			objWrapperFunctions.swipeHorizontal(1370, 1400, 100, 1400, 500);
			Thread.sleep(1000);
		}

		return true;
	}

	public boolean clickOnWeeklyTab() {

		return objWrapperFunctions.mobileClick(btnWeekly);

	}

	public boolean getTextToVerifyWeeklyPages() throws IOException, InterruptedException {
		/**
		 * @author Martin D'souza
		 * @desc Read excel file and compare with the html pages from device. Created on
		 *       : 20-09-2018 Modified on:
		 */
		// Thread.sleep(2000);
		try {
			objWrapperFunctions.mobileClick(btnGotIt);
		} catch (Exception e) {
			System.out.println("Could not find");
			Thread.sleep(2000);
		}

		// Reading data from XL
		System.out.println("Reading Excel sheet");
		FileInputStream file = new FileInputStream("C:\\Users\\user\\Documents\\weeks.xlsx");
		XSSFWorkbook workbook = new XSSFWorkbook(file);
		XSSFSheet sheet = workbook.getSheet("weeks");

		Iterator itr = sheet.iterator();
		Row rowitr = (Row) itr.next();
		Iterator cellitr = rowitr.cellIterator();
		int rowCount = sheet.getLastRowNum();
		System.out.println("Total no of pages: " + rowCount);

		objWrapperFunctions.swipeHorizontal(278, 352, 100, 352, 1000);
		// Thread.sleep(2000);
		// objWrapperFunctions.swipeHorizontal(183, 347, 930, 347, 1000);

		for (int i = 0; i <= rowCount; i++) {

		//para1
			Thread.sleep(2000);
			try {
				String initialText1 = objStepBase2.getDriver().findElement(By.xpath(txtWeeklyPara1)).getText();
				String finalText1 = initialText1.trim();
				System.out.println("Device:" + finalText1);

				String cellValue11 = sheet.getRow(i).getCell(2).getStringCellValue();
				String cellValue1 = cellValue11.trim();
				System.out.println(cellValue1);
				if (finalText1.equals(cellValue1)) {
					System.out.println(i + " :Pass");
				} else {
					System.out.println(i + " :Fail");
				}
			} catch (Exception e3) {
				// TODO Auto-generated catch block
				System.out.println("Para 1 not found");
			}

			//para2
			objWrapperFunctions.swipeVerticle(700, 2000, 400, 700, 100);
			Thread.sleep(2000);
			try {
				String initialText2 = objStepBase2.getDriver().findElement(By.xpath(txtWeeklyPara2)).getText();
				System.out.println("para2  " + initialText2);
				String finalText2 = initialText2.trim();
				System.out.println("Device:" + finalText2);

				String cellValue22 = sheet.getRow(i).getCell(4).getStringCellValue();
				String cellValue2 = cellValue22.trim();
				if (finalText2.equals(cellValue2)) {
					System.out.println(i + " :Pass");
				} else {
					System.out.println(i + " :Fail");
				}
			} catch (Exception e2) {
				// TODO Auto-generated catch block
				System.out.println("Para 2 not found");
			}

			//para3
			objWrapperFunctions.swipeVerticle(700, 2000, 400, 700, 750);
			Thread.sleep(2000);
			try {
				String initialText3 = objStepBase2.getDriver().findElement(By.xpath(txtWeeklyPara3)).getText();
				System.out.println("para3  " + initialText3);
				String finalText3 = initialText3.trim();
				System.out.println("Device:" + finalText3);

				String cellValue33 = sheet.getRow(i).getCell(6).getStringCellValue();
				String cellValue3 = cellValue33.trim();
				if (finalText3.equals(cellValue3)) {
					System.out.println(i + " :Pass");
				} else {
					System.out.println(i + " :Fail");
				}
			} catch (Exception e2) {
				// TODO Auto-generated catch block
				System.out.println("Para 3 not found");
			}

			//para4
			objWrapperFunctions.swipeVerticle(700, 2000, 400, 700, 750);
			Thread.sleep(2000);
			try {
				String initialText4 = objStepBase2.getDriver().findElement(By.xpath(txtWeeklyPara4)).getText();
				System.out.println("para4  " + initialText4);
				String finalText4 = initialText4.trim();
				System.out.println("Device:" + finalText4);
				String cellValue44 = sheet.getRow(i).getCell(8).getStringCellValue();
				String cellValue4 = cellValue44.trim();
				if (finalText4.equals(cellValue4)) {
					System.out.println(i + " :Pass");
				} else {
					System.out.println(i + " :Fail");
				}
			} catch (Exception e1) {
				// TODO Auto-generated catch block
				System.out.println("Para 4 not found");
			}

			//para5
			objWrapperFunctions.swipeVerticle(700, 2000, 400, 700, 750);
			Thread.sleep(2000);
			try {
				String initialText5 = objStepBase2.getDriver().findElement(By.xpath(txtWeeklyPara5)).getText();
				System.out.println("para5" + initialText5);
				String finalText5 = initialText5.trim();
				System.out.println("Device:" + finalText5);
				String cellValue55 = sheet.getRow(i).getCell(10).getStringCellValue();
				String cellValue5 = cellValue55.trim();
				if (finalText5.equals(cellValue5)) {
					System.out.println(i + " :Pass");
				} else {
					System.out.println(i + " :Fail");
				}
			} catch (Exception e) {
				System.out.println("Para5 not found");
			}

			Thread.sleep(1000);
			objWrapperFunctions.swipeHorizontal(1370, 1400, 100, 1400, 500);
		}
		return true;
	}
}
