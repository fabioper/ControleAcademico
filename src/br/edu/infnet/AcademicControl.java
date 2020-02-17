package br.edu.infnet;

public class AcademicControl {
    private String[] students;
    private double[] gradesAV1;
    private double[] gradesAV2;
    private int nextEmptyPosition;

    public AcademicControl() {
        students = new String[100];
        gradesAV1 = new double[100];
        gradesAV2 = new double[100];
        nextEmptyPosition = 0;
    }

    public int registerStudent(Student student) {
        students[nextEmptyPosition] = student.getName();
        gradesAV1[nextEmptyPosition] = student.getGradeAV1();
        gradesAV2[nextEmptyPosition] = student.getGradeAV2();
        return nextEmptyPosition++;
    }

    public String getStudentName(int studentCode) {
        return students[studentCode];
    }

    public double getFinalAverage(int studentCode) {
        return (getStudentAV1(studentCode) + getStudentAV2(studentCode)) / 2;
    }

    public String getResult(double average) {
        if ((average > 4) && (average < 7))
            return "Prova final";
        else if (average >= 7)
            return "Aprovado";

        return "Reprovado";
    }

    public void printReportFor(int studentCode) {
        var average = getFinalAverage(studentCode);
        System.out.println("\tNome do aluno.......... " + getStudentName(studentCode));
        System.out.println("\tNota da AV1............ " + getStudentAV1(studentCode));
        System.out.println("\tNota da AV2............ " + getStudentAV2(studentCode));
        System.out.println("\tMédia final............ " + average);
        System.out.println("\tSituação final......... " + getResult(average));
    }

    private double getStudentAV1(int studentCode) {
        return gradesAV1[studentCode];
    }

    private double getStudentAV2(int studentCode) {
        return gradesAV2[studentCode];
    }

    public void printReportForAll() {
        for (var studentCode = 0; studentCode < students.length; studentCode++) {
            printReportFor(studentCode);
        }
    }
}
