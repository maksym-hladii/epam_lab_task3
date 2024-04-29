package com.epam.training.student_maksym_hladii.task2.service;

import com.epam.training.student_maksym_hladii.task2.models.ComputeEngineFormData;

public class ComputeEngineFormDataCreator {

    public static final String NUMBER_OF_INSTANCES = "testdata.number.of.instances";
    public static final String WHAT_ARE_THESE_INSTANCES_FOR = "testdata.what.are.these.instances.for";
    public static final String OPERATING_SYSTEM = "testdata.operating.system";
    public static final String PROVISIONING_MODEL = "testdata.provisioning.model";
    public static final String MACHINE_FAMILY = "testdata.machine.family";
    public static final String SERIES = "testdata.series";
    public static final String MACHINE_TYPE = "testdata.machine.type";
    public static final String GPU_TYPE = "testdata.gpu.type";
    public static final String NUMBER_OF_GPUs = "testdata.number.of.gpus";
    public static final String LOCAL_SSD = "testdata.local.ssd";
    public static final String DATACENTER_LOCATION = "testdata.datacenter.location";
    public static final String COMMITTED_USAGE = "testdata.committed.usage";

    public static ComputeEngineFormData createComputeEngineFormData() {
        return new ComputeEngineFormData(
                TestDataReader.getTestData(NUMBER_OF_INSTANCES),
                TestDataReader.getTestData(WHAT_ARE_THESE_INSTANCES_FOR),
                TestDataReader.getTestData(OPERATING_SYSTEM),
                TestDataReader.getTestData(PROVISIONING_MODEL),
                TestDataReader.getTestData(MACHINE_FAMILY),
                TestDataReader.getTestData(SERIES),
                TestDataReader.getTestData(MACHINE_TYPE),
                TestDataReader.getTestData(GPU_TYPE),
                TestDataReader.getTestData(NUMBER_OF_GPUs),
                TestDataReader.getTestData(LOCAL_SSD),
                TestDataReader.getTestData(DATACENTER_LOCATION),
                TestDataReader.getTestData(COMMITTED_USAGE)
        );
    }

}
