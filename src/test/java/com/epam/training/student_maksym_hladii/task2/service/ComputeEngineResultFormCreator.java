package com.epam.training.student_maksym_hladii.task2.service;

import com.epam.training.student_maksym_hladii.task2.models.ComputeEngineResultForm;
import com.epam.training.student_maksym_hladii.task2.util.StringUtils;

import java.util.List;

public class ComputeEngineResultFormCreator {

    public static ComputeEngineResultForm createComputeEngineResultForm(List<String> resultFormElements,
                                                                        String totalEstimatedCost) {
        return new ComputeEngineResultForm(
                StringUtils.findElementInList(resultFormElements, "Region"),
                StringUtils.findElementInList(resultFormElements, "Commitment term"),
                StringUtils.findElementInList(resultFormElements, "Provisioning model"),
                StringUtils.findElementInList(resultFormElements, "Instance type"),
                StringUtils.findElementInList(resultFormElements, "Operating System"),
                StringUtils.findElementInList(resultFormElements, "Local SSD"),
                totalEstimatedCost);
    }

}
