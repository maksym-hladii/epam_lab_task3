package com.epam.training.student_maksym_hladii.task2.models;

import java.util.Objects;

public class ComputeEngineFormData {

    private String numberOfInstances;
    private String whatAreTheseInstancesFor;
    private String operatingSystem;
    private String provisioningModel;
    private String machineFamily;
    private String series;
    private String machineType;
    private String GPUType;
    private String numberOfGPUs;
    private String localSSD;
    private String datacenterLocation;
    private String committedUsage;

    public ComputeEngineFormData(String numberOfInstances, String whatAreTheseInstancesFor,
                                 String operatingSystem, String provisioningModel, String machineFamily,
                                 String series, String machineType, String GPUType, String numberOfGPUs,
                                 String localSSD, String datacenterLocation, String committedUsage) {
        this.numberOfInstances = numberOfInstances;
        this.whatAreTheseInstancesFor = whatAreTheseInstancesFor;
        this.operatingSystem = operatingSystem;
        this.provisioningModel = provisioningModel;
        this.machineFamily = machineFamily;
        this.series = series;
        this.machineType = machineType;
        this.GPUType = GPUType;
        this.numberOfGPUs = numberOfGPUs;
        this.localSSD = localSSD;
        this.datacenterLocation = datacenterLocation;
        this.committedUsage = committedUsage;
    }

    public String getNumberOfInstances() {
        return numberOfInstances;
    }

    public void setNumberOfInstances(String numberOfInstances) {
        this.numberOfInstances = numberOfInstances;
    }

    public String getWhatAreTheseInstancesFor() {
        return whatAreTheseInstancesFor;
    }

    public void setWhatAreTheseInstancesFor(String whatAreTheseInstancesFor) {
        this.whatAreTheseInstancesFor = whatAreTheseInstancesFor;
    }

    public String getOperatingSystem() {
        return operatingSystem;
    }

    public void setOperatingSystem(String operatingSystem) {
        this.operatingSystem = operatingSystem;
    }

    public String getProvisioningModel() {
        return provisioningModel;
    }

    public void setProvisioningModel(String provisioningModel) {
        this.provisioningModel = provisioningModel;
    }

    public String getMachineFamily() {
        return machineFamily;
    }

    public void setMachineFamily(String machineFamily) {
        this.machineFamily = machineFamily;
    }

    public String getSeries() {
        return series;
    }

    public void setSeries(String series) {
        this.series = series;
    }

    public String getMachineType() {
        return machineType;
    }

    public void setMachineType(String machineType) {
        this.machineType = machineType;
    }

    public String getGPUType() {
        return GPUType;
    }

    public void setGPUType(String GPUType) {
        this.GPUType = GPUType;
    }

    public String getNumberOfGPUs() {
        return numberOfGPUs;
    }

    public void setNumberOfGPUs(String numberOfGPUs) {
        this.numberOfGPUs = numberOfGPUs;
    }

    public String getLocalSSD() {
        return localSSD;
    }

    public void setLocalSSD(String localSSD) {
        this.localSSD = localSSD;
    }

    public String getDatacenterLocation() {
        return datacenterLocation;
    }

    public void setDatacenterLocation(String datacenterLocation) {
        this.datacenterLocation = datacenterLocation;
    }

    public String getCommittedUsage() {
        return committedUsage;
    }

    public void setCommittedUsage(String committedUsage) {
        this.committedUsage = committedUsage;
    }

    @Override
    public String toString() {
        return "\nCompute Engine Form Data:\n" +
                "> numberOfInstances = '" + numberOfInstances + "'\n" +
                "> whatAreTheseInstancesFor = '" + whatAreTheseInstancesFor + "'\n" +
                "> operatingSystem = '" + operatingSystem + "'\n" +
                "> provisioningModel = '" + provisioningModel + "'\n" +
                "> machineFamily = '" + machineFamily + "'\n" +
                "> series = '" + series + "'\n" +
                "> machineType = '" + machineType + "'\n" +
                "> GPUType = '" + GPUType + "'\n" +
                "> numberOfGPUs = '" + numberOfGPUs + "'\n" +
                "> localSSD = '" + localSSD + "'\n" +
                "> datacenterLocation = '" + datacenterLocation + "'\n" +
                "> committedUsage = '" + committedUsage + "'\n";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ComputeEngineFormData computeEngineFormData = (ComputeEngineFormData) o;
        return Objects.equals(numberOfInstances, computeEngineFormData.numberOfInstances) &&
                Objects.equals(whatAreTheseInstancesFor, computeEngineFormData.whatAreTheseInstancesFor) &&
                Objects.equals(operatingSystem, computeEngineFormData.operatingSystem) &&
                Objects.equals(provisioningModel, computeEngineFormData.provisioningModel) &&
                Objects.equals(machineFamily, computeEngineFormData.machineFamily) &&
                Objects.equals(series, computeEngineFormData.series) &&
                Objects.equals(machineType, computeEngineFormData.machineType) &&
                Objects.equals(GPUType, computeEngineFormData.GPUType) &&
                Objects.equals(numberOfGPUs, computeEngineFormData.numberOfGPUs) &&
                Objects.equals(localSSD, computeEngineFormData.localSSD) &&
                Objects.equals(datacenterLocation, computeEngineFormData.datacenterLocation) &&
                Objects.equals(committedUsage, computeEngineFormData.committedUsage);
    }

    @Override
    public int hashCode() {
        return Objects.hash(numberOfInstances, whatAreTheseInstancesFor,
                operatingSystem, provisioningModel, machineFamily,
                series, machineType, GPUType, numberOfGPUs,
                localSSD, datacenterLocation, committedUsage);
    }

}
