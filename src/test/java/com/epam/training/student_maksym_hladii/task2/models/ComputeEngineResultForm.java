package com.epam.training.student_maksym_hladii.task2.models;

import java.util.Objects;

public class ComputeEngineResultForm {

    private final String region;
    private final String commitmentTerm;
    private final String provisioningModel;
    private final String instanceType;
    private final String operatingSystem;
    private final String localSSD;
    private final String totalEstimatedCost;

    public ComputeEngineResultForm(Builder builder) {
        this.region = builder.region;
        this.commitmentTerm = builder.commitmentTerm;
        this.provisioningModel = builder.provisioningModel;
        this.instanceType = builder.instanceType;
        this.operatingSystem = builder.operatingSystem;
        this.localSSD = builder.localSSD;
        this.totalEstimatedCost = builder.totalEstimatedCost;
    }

    public String getRegion() {
        return region;
    }

    public String getCommitmentTerm() {
        return commitmentTerm;
    }

    public String getProvisioningModel() {
        return provisioningModel;
    }

    public String getInstanceType() {
        return instanceType;
    }

    public String getOperatingSystem() {
        return operatingSystem;
    }

    public String getLocalSSD() {
        return localSSD;
    }

    public String getTotalEstimatedCost() {
        return totalEstimatedCost;
    }

    public static class Builder {
        private String region;
        private String commitmentTerm;
        private String provisioningModel;
        private String instanceType;
        private String operatingSystem;
        private String localSSD;
        private String totalEstimatedCost;

        public Builder region(String region) {
            this.region = region;
            return this;
        }

        public Builder commitmentTerm(String commitmentTerm) {
            this.commitmentTerm = commitmentTerm;
            return this;
        }

        public Builder provisioningModel(String provisioningModel) {
            this.provisioningModel = provisioningModel;
            return this;
        }

        public Builder instanceType(String instanceType) {
            this.instanceType = instanceType;
            return this;
        }

        public Builder operatingSystem(String operatingSystem) {
            this.operatingSystem = operatingSystem;
            return this;
        }

        public Builder localSSD(String localSSD) {
            this.localSSD = localSSD;
            return this;
        }

        public Builder totalEstimatedCost(String totalEstimatedCost) {
            this.totalEstimatedCost = totalEstimatedCost;
            return this;
        }

        public ComputeEngineResultForm build() {
            return new ComputeEngineResultForm(this);
        }
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
