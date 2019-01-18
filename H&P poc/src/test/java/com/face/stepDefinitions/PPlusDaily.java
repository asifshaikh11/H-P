package com.face.stepDefinitions;

import java.io.IOException;

import org.junit.Assert;
import org.openqa.selenium.By;

import com.face.pageFactory.PPlusDailyPage;

import core.generic.Utilities;
import core.generic.WrapperFunctions;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;


public class PPlusDaily {
	// Local variables

	private Utilities objUtilities = new Utilities();
	private WrapperFunctions objWrapperFunctions = new WrapperFunctions();

	private PPlusDailyPage objPPlusDailyPage = new PPlusDailyPage();

	@Given("^Click on no i will join later button$")
	public void clickOnNoIWillJoinLaterButton() {

		Assert.assertTrue(objPPlusDailyPage.clickOnNoIWillJoinLaterButton());
	}

	@Then("^Enter the User Name (.*)$")
	public void enterUserName(String userName) {
		Assert.assertTrue(objPPlusDailyPage.setUserName(userName));

	}

	@Then("^Click on done button$")
	public void clickOnDoneButton() throws InterruptedException {
		Thread.sleep(2000);
		Assert.assertTrue(objPPlusDailyPage.clickOnDoneButton());
	}

	@Then("^Click on I agree$")
	public void clickOnIAgree() {
		Assert.assertTrue(objPPlusDailyPage.clickOnIAgree());
	}

	@Then("^Click on Baby tab$")
	public void clickOnBabyTab() {
		Assert.assertTrue(objPPlusDailyPage.clickOnBabyTab());
	}

	@Then("^Click on daily tab$")
	public void clickOnDailyTab() throws InterruptedException {
		Assert.assertTrue(objPPlusDailyPage.clickOnDailyTab());
	}

	@Then("^Get text to verify$")
	public void thenGetTextToVerify() throws InterruptedException, IOException {
		Assert.assertTrue(objPPlusDailyPage.GetTextToVerify());
	}

	@Then("^Click on weekly tab$")
	public void clickOnWeeklyTab() throws InterruptedException {
		Assert.assertTrue(objPPlusDailyPage.clickOnWeeklyTab());
	}
	
	@Then("^Get text to verify weekly pages$")
	public void getTextToVerifyWeeklyPages() throws InterruptedException, IOException {
		Assert.assertTrue(objPPlusDailyPage.getTextToVerifyWeeklyPages());
	}
}
