package com.epam.training.student_maksym_hladii.task2.models;

import java.util.Objects;

public class ComputeEngineFormData {

    private final String numberOfInstances;
    private final String whatAreTheseInstancesFor;
    private final String operatingSystem;
    private final String provisioningModel;
    private final String machineFamily;
    private final String series;
    private final String machineType;
    private final String gpuType;
    private final String numberOfGPUs;
    private final String localSSD;
    private final String datacenterLocation;
    private final String committedUsage;

    public ComputeEngineFormData(Builder builder) {
        this.numberOfInstances = builder.numberOfInstances;
        this.whatAreTheseInstancesFor = builder.whatAreTheseInstancesFor;
        this.operatingSystem = builder.operatingSystem;
        this.provisioningModel = builder.provisioningModel;
        this.machineFamily = builder.machineFamily;
        this.series = builder.series;
        this.machineType = builder.machineType;
        this.gpuType = builder.gpuType;
        this.numberOfGPUs = builder.numberOfGPUs;
        this.localSSD = builder.localSSD;
        this.datacenterLocation = builder.datacenterLocation;
        this.committedUsage = builder.committedUsage;
    }

    public String getNumberOfInstances() {
        return numberOfInstances;
    }

    public String getWhatAreTheseInstancesFor() {
        return whatAreTheseInstancesFor;
    }

    public String getOperatingSystem() {
        return operatingSystem;
    }

    public String getProvisioningModel() {
        return provisioningModel;
    }

    public String getMachineFamily() {
        return machineFamily;
    }

    public String getSeries() {
        return series;
    }

    public String getMachineType() {
        return machineType;
    }

    public String getGPUType() {
        return gpuType;
    }

    public String getNumberOfGPUs() {
        return numberOfGPUs;
    }

    public String getLocalSSD() {
        return localSSD;
    }

    public String getDatacenterLocation() {
        return datacenterLocation;
    }

    public String getCommittedUsage() {
        return committedUsage;
    }

    public static class Builder {
        private String numberOfInstances;
        private String whatAreTheseInstancesFor;
        private String operatingSystem;
        private String provisioningModel;
        private String machineFamily;
        private String series;
        private String machineType;
        private String gpuType;
        private String numberOfGPUs;
        private String localSSD;
        private String datacenterLocation;
        private String committedUsage;

        public Builder numberOfInstances(String numberOfInstances) {
            this.numberOfInstances = numberOfInstances;
            return this;
        }

        public Builder whatAreTheseInstancesFor(String whatAreTheseInstancesFor) {
            this.whatAreTheseInstancesFor = whatAreTheseInstancesFor;
            return this;
        }

        public Builder operatingSystem(String operatingSystem) {
            this.operatingSystem = operatingSystem;
            return this;
        }

        public Builder provisioningModel(String provisioningModel) {
            this.provisioningModel = provisioningModel;
            return this;
        }

        public Builder machineFamily(String machineFamily) {
            this.machineFamily = machineFamily;
            return this;
        }

        public Builder series(String series) {
            this.series = series;
            return this;
        }

        public Builder machineType(String machineType) {
            this.machineType = machineType;
            return this;
        }

        public Builder gpuType(String gpuType) {
            this.gpuType = gpuType;
            return this;
        }

        public Builder numberOfGPUs(String numberOfGPUs) {
            this.numberOfGPUs = numberOfGPUs;
            return this;
        }

        public Builder localSSD(String localSSD) {
            this.localSSD = localSSD;
            return this;
        }

        public Builder datacenterLocation(String datacenterLocation) {
            this.datacenterLocation = datacenterLocation;
            return this;
        }

        public Builder committedUsage(String committedUsage) {
            this.committedUsage = committedUsage;
            return this;
        }

        public ComputeEngineFormData build() {
            return new ComputeEngineFormData(this);
        }
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
                "> GPUType = '" + gpuType + "'\n" +
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
                Objects.equals(gpuType, computeEngineFormData.gpuType) &&
                Objects.equals(numberOfGPUs, computeEngineFormData.numberOfGPUs) &&
                Objects.equals(localSSD, computeEngineFormData.localSSD) &&
                Objects.equals(datacenterLocation, computeEngineFormData.datacenterLocation) &&
                Objects.equals(committedUsage, computeEngineFormData.committedUsage);
    }

    @Override
    public int hashCode() {
        return Objects.hash(numberOfInstances, whatAreTheseInstancesFor,
                operatingSystem, provisioningModel, machineFamily,
                series, machineType, gpuType, numberOfGPUs,
                localSSD, datacenterLocation, committedUsage);
    }

}
