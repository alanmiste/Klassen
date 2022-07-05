package model;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StudentDBTest {



    @Test
    void testToString() {
        //Given
        StudentDB student = new StudentDB();
        //When
        String actual = student.toString();
        //Then
        String expected = "Student ID: 1, First Name: Albert, Last Name: Einstein, Age: 143 \n" +
                "Student ID: 2, First Name: Albert2, Last Name: Einstein2, Age: 144 \n" +
                "Student ID: 3, First Name: Albert3, Last Name: Einstein3, Age: 145 \n";
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void randomStudent() {
        //Wie kann man randomStudent testen?!
        //Given
        //When
        //Then
    }
}