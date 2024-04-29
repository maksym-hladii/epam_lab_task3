package com.epam.training.student_maksym_hladii.task2.test;

import com.epam.training.student_maksym_hladii.task2.page.*;
import com.epam.training.student_maksym_hladii.task2.service.*;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class ComputeEngineFormTest extends AbstractTest {

    @BeforeAll
    public static void computeEngineFormTestScript() {
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
    }

    @Test
    public void computeEngineFormRegionTest() {
        Assertions.assertTrue(computeEngineResultForm.getRegion()
                .contains(TestDataReader.getTestData("testdata.datacenter.location")));
    }

    @Test
    public void computeEngineFormCommitmentTermTest() {
        Assertions.assertTrue(computeEngineResultForm.getCommitmentTerm()
                .contains(TestDataReader.getTestData("testdata.committed.usage")));
    }

    @Test
    public void computeEngineFormProvisioningModel() {
        Assertions.assertTrue(computeEngineResultForm.getProvisioningModel()
                .contains(TestDataReader.getTestData("testdata.provisioning.model")));
    }

    @Test
    public void computeEngineFormInstanceType() {
        Assertions.assertTrue(computeEngineResultForm.getInstanceType()
                .contains(TestDataReader.getTestData("testdata.machine.type")));
    }

    @Test
    public void computeEngineFormOperatingSystem() {
        Assertions.assertTrue(computeEngineResultForm.getOperatingSystem()
                .contains(TestDataReader.getTestData("testdata.operating.system")));
    }

    @Test
    public void computeEngineFormLocalSSDTest() {
        Assertions.assertTrue(computeEngineResultForm.getLocalSSD().contains("2x375 GiB"));
    }

}
