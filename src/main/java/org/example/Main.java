package org.example;

import org.example.model.Student;
import org.example.model.StudyProfile;
import org.example.model.University;
import org.example.service.JsonUtil;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        var students = generateStudents();
        var universities = generateUniversities();

        students.stream()
                .filter(student -> student.getUniversityId().equals("2"))
                .map(JsonUtil::serializeStudent)
                .map(student -> {
                    System.out.println(student);
                    return student;
                })
                .map(JsonUtil::deserializeStudent)
                .forEach(System.err::println);

        universities.stream()
                .filter(university -> university.getShortName().equals("МГУ"))
                .map(JsonUtil::serializeUniversity)
                .map(university -> {
                    System.out.println(university);
                    return university;
                })
                .map(JsonUtil::deserializeUniversity)
                .forEach(System.err::println);
    }

    public static List<Student> generateStudents() {
        List<Student> students = new ArrayList<>();

        students.add(new Student().setFullName("Иванов Иван Иванович").setUniversityId("1").setCurrentCourseNumber(3).setAvgExamScore(4.5f));
        students.add(new Student().setFullName("Петров Петр Петрович").setUniversityId("2").setCurrentCourseNumber(2).setAvgExamScore(3.7f));
        students.add(new Student().setFullName("Сидоров Сидор Сидорович").setUniversityId("3").setCurrentCourseNumber(1).setAvgExamScore(4.1f));
        students.add(new Student().setFullName("Алексеев Алексей Алексеевич").setUniversityId("4").setCurrentCourseNumber(4).setAvgExamScore(4.9f));
        students.add(new Student().setFullName("Михайлов Михаил Михайлович").setUniversityId("5").setCurrentCourseNumber(5).setAvgExamScore(4.3f));
        students.add(new Student().setFullName("Федоров Федор Федорович").setUniversityId("1").setCurrentCourseNumber(2).setAvgExamScore(3.8f));
        students.add(new Student().setFullName("Сергеев Сергей Сергеевич").setUniversityId("2").setCurrentCourseNumber(3).setAvgExamScore(4.2f));
        students.add(new Student().setFullName("Андреев Андрей Андреевич").setUniversityId("3").setCurrentCourseNumber(4).setAvgExamScore(4.7f));
        students.add(new Student().setFullName("Александров Александр Александрович").setUniversityId("4").setCurrentCourseNumber(1).setAvgExamScore(3.9f));
        students.add(new Student().setFullName("Васильев Василий Васильевич").setUniversityId("5").setCurrentCourseNumber(5).setAvgExamScore(4.0f));

        return students;
    }

    public static List<University> generateUniversities() {
        List<University> universities = new ArrayList<>();

        universities.add(new University().setId("1").setFullName("Московский государственный университет").setShortName("МГУ").setYearOfFoundation(1755).setMainProfile(StudyProfile.MEDICINE));
        universities.add(new University().setId("2").setFullName("Санкт-Петербургский государственный университет").setShortName("СПбГУ").setYearOfFoundation(1724).setMainProfile(StudyProfile.ARTS));
        universities.add(new University().setId("3").setFullName("Новосибирский государственный университет").setShortName("НГУ").setYearOfFoundation(1959).setMainProfile(StudyProfile.SCIENCE));
        universities.add(new University().setId("4").setFullName("Уральский федеральный университет").setShortName("УрФУ").setYearOfFoundation(1920).setMainProfile(StudyProfile.ENGINEERING));
        universities.add(new University().setId("5").setFullName("Национальный исследовательский ядерный университет").setShortName("МИФИ").setYearOfFoundation(1942).setMainProfile(StudyProfile.TECHNOLOGY));

        return universities;
    }
}