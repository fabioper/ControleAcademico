package br.edu.infnet;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class AcademicControlTest {
    private AcademicControl academicControl = new AcademicControl();

    @Test
    public void shouldRegisterStudentGrades() {
        var student = new Student("Fulano", 9.5, 7.5);
        var studentCode = academicControl.registerStudent(student);
        assertEquals(student.getName(), academicControl.getStudentName(studentCode));
    }

    @Test
    public void shouldReturnStudentReportCard() {
        var student = new Student("Fulano", 9.5, 7.5);
        var studentCode = academicControl.registerStudent(student);
    }

    @Test
    public void shouldThrowAnErrorWhenTryingToCreateNewRecordWhenAllPositionsAreOccupied() {
        for (var i = 0; i < 100; i++) {
            var placeholder = new Student("Fulano", 9.3, 6.6);
            academicControl.registerStudent(placeholder);
        }

        var student = new Student("Fulano1", 9.2, 4.2);
        assertThrows(IndexOutOfBoundsException.class, () -> academicControl.registerStudent(student));
    }
}