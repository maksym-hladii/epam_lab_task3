package com.epam.training.student_maksym_hladii.task2.service;

import com.epam.training.student_maksym_hladii.task2.models.ComputeEngineResultForm;
import com.epam.training.student_maksym_hladii.task2.util.StringUtils;

import java.util.List;

public class ComputeEngineResultFormCreator {

    public static ComputeEngineResultForm createComputeEngineResultForm(List<String> resultFormElements,
                                                                        String totalEstimatedCost) {
        return new ComputeEngineResultForm.Builder()
                .region(StringUtils.findElementInList(resultFormElements, "Region"))
                .commitmentTerm(StringUtils.findElementInList(resultFormElements, "Commitment term"))
                .provisioningModel(StringUtils.findElementInList(resultFormElements, "Provisioning model"))
                .instanceType(StringUtils.findElementInList(resultFormElements, "Instance type"))
                .operatingSystem(StringUtils.findElementInList(resultFormElements, "Operating System"))
                .localSSD(StringUtils.findElementInList(resultFormElements, "Local SSD"))
                .totalEstimatedCost(totalEstimatedCost)
                .build();
    }

}
