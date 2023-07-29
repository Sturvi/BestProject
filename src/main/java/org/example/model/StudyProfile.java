package org.example.model;

public enum StudyProfile {
    MEDICINE("Медицина"),
    ARTS("Искусство"),
    SCIENCE("Наука"),
    ENGINEERING("Инженерия"),
    TECHNOLOGY("Технологии"),
    ECONOMICS("Экономика");

    private final String profileName;

    StudyProfile(String profileName) {
        this.profileName = profileName;
    }

    public String getProfileName() {
        return profileName;
    }
}
