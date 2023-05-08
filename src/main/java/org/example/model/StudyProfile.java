package org.example.model;

public enum StudyProfile {
    MEDICINE("Медицина"),
    ENGINEERING("Инженерия"),
    ECONOMICS("Экономика");

    private final String profileName;

    StudyProfile(String profileName) {
        this.profileName = profileName;
    }
}

