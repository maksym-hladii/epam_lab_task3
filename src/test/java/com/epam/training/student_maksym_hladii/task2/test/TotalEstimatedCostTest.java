package com.epam.training.student_maksym_hladii.task2.test;

import com.epam.training.student_maksym_hladii.task2.page.*;
import com.epam.training.student_maksym_hladii.task2.service.*;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WindowType;

public class TotalEstimatedCostTest extends AbstractTest {

    @Test
    public void totalEstimatedCostTest() {
        GoogleCloudHomePage googleCloudHomePage = new GoogleCloudHomePage(driver).openPage();
        GoogleCloudSearchResultsPage googleCloudSearchResultsPage =
                googleCloudHomePage.clickSearchIcon().searchFor(TestDataReader.getTestData(SEARCH_INPUT));
        GoogleCloudPricingCalculatorPage googleCloudPricingCalculatorPage =
                googleCloudSearchResultsPage.clickSearchResult(TestDataReader.getTestData(SEARCH_RESULT));

        computeEngineFormData = ComputeEngineFormDataCreator.createComputeEngineFormData();
        googleCloudPricingCalculatorPage.switchToFormIFrame().clickComputeEngine()
                .enterNumberOfInstances(computeEngineFormData.getNumberOfInstances())
                .enterWhatAreTheseInstancesFor(computeEngineFormData.getWhatAreTheseInstancesFor())
                .setOperatingSystem(computeEngineFormData.getOperatingSystem())
                .setProvisioningModel(computeEngineFormData.getProvisioningModel())
                .setMachineFamily(computeEngineFormData.getMachineFamily())
                .setSeries(computeEngineFormData.getSeries())
                .setMachineType(computeEngineFormData.getMachineType())
                .checkAddGPUs()
                .setGPUType(computeEngineFormData.getGPUType())
                .setNumberOfGPUs(computeEngineFormData.getNumberOfGPUs())
                .setLocalSSD(computeEngineFormData.getLocalSSD())
                .setDatacenterLocation(computeEngineFormData.getDatacenterLocation())
                .setCommittedUsage(computeEngineFormData.getCommittedUsage())
                .clickAddEstimate();
        computeEngineResultForm = ComputeEngineResultFormCreator.createComputeEngineResultForm(
                googleCloudPricingCalculatorPage.getComputeEngineResultForm(),
                googleCloudPricingCalculatorPage.getTotalEstimatedCost()
        );
        String totalEstimatedCostFromForm = computeEngineResultForm.getTotalEstimatedCost();

        logger.info(computeEngineFormData);
        logger.info("\n>> Total Estimated Cost (Form):\n" + totalEstimatedCostFromForm + "\n");

        String googleCloudPricingCalculatorWindow = driver.getWindowHandle();
        driver.switchTo().newWindow(WindowType.TAB);

        YOPmailHomePage yopmailHomePage = new YOPmailHomePage(driver).openPage();
        YOPmailEmailGeneratorPage yopmailEmailGeneratorPage = yopmailHomePage.generateRandomEmail();
        emailEstimateFormData =
                EmailEstimateFormDataCreator.createEmailEstimateFormData(yopmailEmailGeneratorPage.getEmail());
        YOPmailInboxPage yopmailInboxPage = yopmailEmailGeneratorPage.clickCheckInbox();

        String yopmailWindow = driver.getWindowHandle();
        driver.switchTo().window(googleCloudPricingCalculatorWindow);

        googleCloudPricingCalculatorPage.switchToFormIFrame()
                .clickEmailEstimate()
                .enterEmail(emailEstimateFormData)
                .clickSendEmail();

        driver.switchTo().window(yopmailWindow);
        String totalEstimatedCostFromEmail = yopmailInboxPage.refreshInbox().getTotalEstimatedCost();

        logger.info(emailEstimateFormData);
        logger.info("\n>> Total Estimated Cost (Email):\n" + totalEstimatedCostFromEmail + "\n");

        Assertions.assertTrue(totalEstimatedCostFromForm.contains(totalEstimatedCostFromEmail));
    }

}
