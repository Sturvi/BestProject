package org.example;

import org.example.model.Student;
import org.example.model.StudyProfile;
import org.example.model.University;

public class Main {
    public static void main(String[] args) {

        University university = new University()
                .setId("1")
                .setFullName("Московский государственный университет")
                .setShortName("МГУ")
                .setYearOfFoundation(1755)
                .setMainProfile(StudyProfile.MEDICINE);

        Student student = new Student()
                .setFullName("Иванов Иван Иванович")
                .setUniversityId("1")
                .setCurrentCourseNumber(3)
                .setAvgExamScore(4.5f);

        System.out.println(university);
        System.out.println(student);
    }
}