package org.example.service;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.reflect.TypeToken;
import org.example.model.Student;
import org.example.model.University;

import java.util.List;

public class JsonUtil {
    private static final Gson gson = new GsonBuilder().setPrettyPrinting().create();

    private JsonUtil() {
        throw new AssertionError("This class cannot be instantiated.");
    }

    public static String serializeStudent(Student student) {
        return gson.toJson(student);
    }

    public static Student deserializeStudent(String json) {
        return gson.fromJson(json, Student.class);
    }

    public static String serializeUniversity(University university) {
        return gson.toJson(university);
    }

    public static University deserializeUniversity(String json) {
        return gson.fromJson(json, University.class);
    }

    public static String serializeStudentList(List<Student> students) {
        return gson.toJson(students);
    }

    public static List<Student> deserializeStudentList(String json) {
        return gson.fromJson(json, new TypeToken<List<Student>>() {}.getType());
    }

    public static String serializeUniversityList(List<University> universities) {
        return gson.toJson(universities);
    }

    public static List<University> deserializeUniversityList(String json) {
        return gson.fromJson(json, new TypeToken<List<University>>() {}.getType());
    }
}
