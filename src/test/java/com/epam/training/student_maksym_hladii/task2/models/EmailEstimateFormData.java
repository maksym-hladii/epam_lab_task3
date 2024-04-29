package com.epam.training.student_maksym_hladii.task2.models;

import java.util.Objects;

public class EmailEstimateFormData {

    private String email;

    public EmailEstimateFormData(String email) {
        this.email = email;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "\nEmail Estimate Form Data:\n" + "> email = '" + email + "'\n";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        EmailEstimateFormData emailEstimateFormData = (EmailEstimateFormData) o;
        return Objects.equals(this.email, emailEstimateFormData.email);
    }

    @Override
    public int hashCode() {
        return Objects.hash(email);
    }

}
