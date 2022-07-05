package model;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.net.Authenticator;

import static org.junit.jupiter.api.Assertions.*;

class StudentTest {

    @Test
    @DisplayName("toString Test")
    public void toStringTest(){
        //given
        Student testStudent = new Student(1,"Albert","Einstein", 143);

        //When
        String actual = testStudent.toString();

        //Then
        String expected = "Student ID: 1, First Name: Albert, Last Name: Einstein, Age: 143";
        Assertions.assertEquals(expected, actual);
    }
}