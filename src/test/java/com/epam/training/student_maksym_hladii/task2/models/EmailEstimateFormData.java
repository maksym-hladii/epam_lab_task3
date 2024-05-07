package com.epam.training.student_maksym_hladii.task2.models;

import java.util.Objects;

public class EmailEstimateFormData {

    private final String email;

    public EmailEstimateFormData(Builder builder) {
        this.email = builder.email;
    }

    public String getEmail() {
        return email;
    }

    public static class Builder {
        private String email;

        public Builder email(String email) {
            this.email = email;
            return this;
        }

        public EmailEstimateFormData build() {
            return new EmailEstimateFormData(this);
        }
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
