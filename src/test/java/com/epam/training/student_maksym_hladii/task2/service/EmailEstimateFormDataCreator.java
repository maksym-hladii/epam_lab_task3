package com.epam.training.student_maksym_hladii.task2.service;

import com.epam.training.student_maksym_hladii.task2.models.EmailEstimateFormData;

public class EmailEstimateFormDataCreator {

    public static EmailEstimateFormData createEmailEstimateFormData(String email) {
        return new EmailEstimateFormData(email);
    }

}
