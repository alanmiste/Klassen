package model;

import java.util.ArrayList;
import java.util.HashMap;

public class StudentDB {

    private HashMap<Integer, ArrayList<Student>> studentArray;

    public StudentDB(){
        Student student1 = new Student(1,"Albert","Einstein",143);
        Student student2 = new Student(2,"Albert2","Einstein2",144);
        Student student3 = new Student(3,"Albert3","Einstein3",145);
        this.studentArray = new HashMap<>();
        this.studentArray.put(student1.getId(),student1);
//        this.studentArray.put(student2.getId(),student2);
//        this.studentArray.put(student3.getId(),student3);
    }

    public HashMap<Integer, Student> getAllStudents(){
//        for(int i=0; i<this.studentArray.length; i++)
//            for (int j=0; j<this.studentArray[i].length; j++){
//                System.out.println(this.studentArray[i][j]);
//            }
        return this.studentArray;
    }

    @Override
    public String toString(){
        String students="";
        for(int i=0; i<this.studentArray.size(); i++)
            {
                students += this.studentArray.get(i)+" \n";
            }
        return students;
    }

    public Student randomStudent(){
        return this.studentArray.get((int) (Math.random() * this.studentArray.size()));
    }


}
