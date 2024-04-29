package com.epam.training.student_maksym_hladii.task2.models;

import java.util.Objects;

public class ComputeEngineResultForm {

    private String region;
    private String commitmentTerm;
    private String provisioningModel;
    private String instanceType;
    private String operatingSystem;
    private String localSSD;
    private String totalEstimatedCost;

    public ComputeEngineResultForm(String region, String commitmentTerm, String provisioningModel, String instanceType,
                                   String operatingSystem, String localSSD, String totalEstimatedCost) {
        this.region = region;
        this.commitmentTerm = commitmentTerm;
        this.provisioningModel = provisioningModel;
        this.instanceType = instanceType;
        this.operatingSystem = operatingSystem;
        this.localSSD = localSSD;
        this.totalEstimatedCost = totalEstimatedCost;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public String getCommitmentTerm() {
        return commitmentTerm;
    }

    public void setCommitmentTerm(String commitmentTerm) {
        this.commitmentTerm = commitmentTerm;
    }

    public String getProvisioningModel() {
        return provisioningModel;
    }

    public void setProvisioningModel(String provisioningModel) {
        this.provisioningModel = provisioningModel;
    }

    public String getInstanceType() {
        return instanceType;
    }

    public void setInstanceType(String instanceType) {
        this.instanceType = instanceType;
    }

    public String getOperatingSystem() {
        return operatingSystem;
    }

    public void setOperatingSystem(String operatingSystem) {
        this.operatingSystem = operatingSystem;
    }

    public String getLocalSSD() {
        return localSSD;
    }

    public void setLocalSSD(String localSSD) {
        this.localSSD = localSSD;
    }

    public String getTotalEstimatedCost() {
        return totalEstimatedCost;
    }

    public void setTotalEstimatedCost(String totalEstimatedCost) {
        this.totalEstimatedCost = totalEstimatedCost;
    }

    @Override
    public String toString() {
        return "\nCompute Engine Result Form:\n" +
                "> region = '" + region + "'\n" +
                "> commitmentTerm = '" + commitmentTerm + "'\n" +
                "> provisioningModel = '" + provisioningModel + "'\n" +
                "> instanceType = '" + instanceType + "'\n" +
                "> operatingSystem = '" + operatingSystem + "'\n" +
                "> localSSD = '" + localSSD + "'\n" +
                "> totalEstimatedCost = '" + totalEstimatedCost + "'\n";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ComputeEngineResultForm computeEngineResultForm = (ComputeEngineResultForm) o;
        return Objects.equals(region, computeEngineResultForm.region) &&
                Objects.equals(commitmentTerm, computeEngineResultForm.commitmentTerm) &&
                Objects.equals(provisioningModel, computeEngineResultForm.provisioningModel) &&
                Objects.equals(instanceType, computeEngineResultForm.instanceType) &&
                Objects.equals(operatingSystem, computeEngineResultForm.operatingSystem) &&
                Objects.equals(localSSD, computeEngineResultForm.localSSD) &&
                Objects.equals(totalEstimatedCost, computeEngineResultForm.totalEstimatedCost);
    }

    @Override
    public int hashCode() {
        return Objects.hash(region, commitmentTerm, provisioningModel, instanceType,
                operatingSystem, localSSD, totalEstimatedCost);
    }

}
