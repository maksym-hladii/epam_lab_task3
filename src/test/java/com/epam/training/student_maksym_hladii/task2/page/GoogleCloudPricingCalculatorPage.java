package com.epam.training.student_maksym_hladii.task2.page;

import com.epam.training.student_maksym_hladii.task2.models.EmailEstimateFormData;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.ArrayList;
import java.util.List;

public class GoogleCloudPricingCalculatorPage extends AbstractPage {

    @FindBy(xpath = "//article[@id='cloud-site']/descendant::iframe")
    private WebElement outerFrame;

    @FindBy(id = "myFrame")
    private WebElement innerFrame;

    @FindBy(xpath = "//div[@title='Compute Engine']")
    private WebElement computeEngineButton;


    @FindBy(xpath = "//form[@name='ComputeEngineForm']/descendant::input[@name='quantity']")
    private WebElement numberOfInstancesField;

    @FindBy(xpath = "//form[@name='ComputeEngineForm']/descendant::input[@name='label']")
    private WebElement whatAreTheseInstancesForField;

    @FindBy(xpath = "//form[@name='ComputeEngineForm']" +
            "/descendant::md-select[starts-with(@aria-label, 'Operating System / Software')]")
    private WebElement operatingSystemDroplist;

    @FindBy(xpath = "//form[@name='ComputeEngineForm']" +
            "/descendant::md-select[starts-with(@aria-label, 'VM Class')]")
    private WebElement provisioningModelDroplist;

    @FindBy(xpath = "//form[@name='ComputeEngineForm']" +
            "/descendant::md-select[starts-with(@aria-label, 'Machine Family')]")
    private WebElement machineFamilyDroplist;

    @FindBy(xpath = "//form[@name='ComputeEngineForm']" +
            "/descendant::md-select[starts-with(@aria-label, 'Series')]")
    private WebElement seriesDroplist;

    @FindBy(xpath = "//form[@name='ComputeEngineForm']" +
            "/descendant::md-select[starts-with(@aria-label, 'Instance type')]")
    private WebElement machineTypeDroplist;

    @FindBy(xpath = "//form[@name='ComputeEngineForm']" +
            "/descendant::md-checkbox[starts-with(@aria-label, 'Add GPUs')]")
    private WebElement addGPUsCheckbox;

    @FindBy(xpath = "//form[@name='ComputeEngineForm']" +
            "/descendant::md-select[starts-with(@aria-label, 'GPU type')]")
    private WebElement GPUTypeDroplist;

    @FindBy(xpath = "//form[@name='ComputeEngineForm']" +
            "/descendant::md-select[starts-with(@aria-label, 'Number of GPUs')]")
    private WebElement numberOfGPUsDroplist;

    @FindBy(xpath = "//form[@name='ComputeEngineForm']" +
            "/descendant::md-select[starts-with(@aria-label, 'Local SSD')]")
    private WebElement localSSDDroplist;

    @FindBy(xpath = "//form[@name='ComputeEngineForm']" +
            "/descendant::md-select[contains(@aria-label, 'Datacenter location')]")
    private WebElement datacenterLocationDroplist;

    @FindBy(xpath = "//form[@name='ComputeEngineForm']" +
            "/descendant::md-select[starts-with(@aria-label, 'Committed usage')]")
    private WebElement committedUsageDroplist;

    private final String droplistOptionDefaultXPath =
            "//div[contains(@class, 'md-active')]/descendant::div[contains(text(), '%s')]";

    @FindBy(xpath = "//button[contains(text(), 'Add to Estimate')]")
    private WebElement addEstimateButton;


    @FindBy(xpath = "//md-list[@class='cartitem ng-scope']/md-list-item")
    private List<WebElement> computeEngineResultFormWebElements;

    @FindBy(xpath = "//div[@class='cpc-cart-total']/descendant::b")
    private WebElement totalEstimatedCostLabel;


    @FindBy(xpath = "//button[@title='Email Estimate']")
    private WebElement emailEstimateButton;

    @FindBy(xpath = "//form[@name='emailForm']/descendant::input[@type='email']")
    private WebElement emailField;

    @FindBy(xpath = "//button[contains(text(), 'Send Email')]")
    private WebElement sendEmailButton;


    public GoogleCloudPricingCalculatorPage(WebDriver driver) {
        super(driver);
    }

    public GoogleCloudPricingCalculatorPage switchToFormIFrame() {
        driver.switchTo().frame(outerFrame);
        driver.switchTo().frame(innerFrame);
        return this;
    }

    public GoogleCloudPricingCalculatorPage clickComputeEngine() {
        computeEngineButton.click();
        return this;
    }

    public GoogleCloudPricingCalculatorPage enterNumberOfInstances(String numberOfInstances) {
        numberOfInstancesField.clear();
        numberOfInstancesField.sendKeys(numberOfInstances);
        return this;
    }

    public GoogleCloudPricingCalculatorPage enterWhatAreTheseInstancesFor(String whatAreTheseInstancesFor) {
        whatAreTheseInstancesForField.clear();
        whatAreTheseInstancesForField.sendKeys(whatAreTheseInstancesFor);
        return this;
    }

    public GoogleCloudPricingCalculatorPage setOperatingSystem(String operatingSystem) {
        operatingSystemDroplist.click();
        selectDroplistOption(droplistOptionDefaultXPath, operatingSystem);
        return this;
    }

    public GoogleCloudPricingCalculatorPage setProvisioningModel(String provisioningModel) {
        provisioningModelDroplist.click();
        selectDroplistOption(droplistOptionDefaultXPath, provisioningModel);
        return this;
    }

    public GoogleCloudPricingCalculatorPage setMachineFamily(String machineFamily) {
        machineFamilyDroplist.click();
        selectDroplistOption(droplistOptionDefaultXPath, machineFamily);
        return this;
    }

    public GoogleCloudPricingCalculatorPage setSeries(String series) {
        seriesDroplist.click();
        selectDroplistOption(droplistOptionDefaultXPath, series);
        return this;
    }

    public GoogleCloudPricingCalculatorPage setMachineType(String machineType) {
        machineTypeDroplist.click();
        selectDroplistOption(droplistOptionDefaultXPath, machineType);
        return this;
    }

    public GoogleCloudPricingCalculatorPage checkAddGPUs() {
        addGPUsCheckbox.click();
        return this;
    }

    public GoogleCloudPricingCalculatorPage setGPUType(String GPUType) {
        GPUTypeDroplist.click();
        selectDroplistOption(droplistOptionDefaultXPath, GPUType);
        return this;
    }

    public GoogleCloudPricingCalculatorPage setNumberOfGPUs(String numberOfGPUs) {
        numberOfGPUsDroplist.click();
        selectDroplistOption(droplistOptionDefaultXPath, numberOfGPUs);
        return this;
    }

    public GoogleCloudPricingCalculatorPage setLocalSSD(String localSSD) {
        localSSDDroplist.click();
        selectDroplistOption(droplistOptionDefaultXPath, localSSD);
        return this;
    }

    public GoogleCloudPricingCalculatorPage setDatacenterLocation(String datacenterLocation) {
        datacenterLocationDroplist.click();
        selectDroplistOption(droplistOptionDefaultXPath, datacenterLocation);
        return this;
    }

    public GoogleCloudPricingCalculatorPage setCommittedUsage(String committedUsage) {
        committedUsageDroplist.click();
        selectDroplistOption(droplistOptionDefaultXPath, committedUsage);
        return this;
    }

    public GoogleCloudPricingCalculatorPage clickAddEstimate() {
        addEstimateButton.click();
        return this;
    }


    public List<String> getComputeEngineResultForm() {
        List<String> computeEngineResultFormElements = new ArrayList<>();
        for (WebElement webElement : computeEngineResultFormWebElements) {
            computeEngineResultFormElements.add(webElement.getText());
        }
        return computeEngineResultFormElements;
    }

    public String getTotalEstimatedCost() {
        return totalEstimatedCostLabel.getText();
    }


    public GoogleCloudPricingCalculatorPage clickEmailEstimate() {
        emailEstimateButton.click();
        return this;
    }

    public GoogleCloudPricingCalculatorPage enterEmail(EmailEstimateFormData emailEstimateFormData) {
        emailField.clear();
        emailField.sendKeys(emailEstimateFormData.getEmail());
        return this;
    }

    public GoogleCloudPricingCalculatorPage clickSendEmail() {
        sendEmailButton.click();
        return this;
    }

}
