package br.edu.infnet;

public class Student {
    private final String name;
    private final double gradeAV1;
    private final double gradeAV2;

    public Student(String name, double gradeAV1, double gradeAV2) {

        this.name = name;
        this.gradeAV1 = gradeAV1;
        this.gradeAV2 = gradeAV2;
    }

    public String getName() {
        return name;
    }

    public double getGradeAV1() {
        return gradeAV1;
    }

    public double getGradeAV2() {
        return gradeAV2;
    }
}
