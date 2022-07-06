package model;

import java.util.ArrayList;
import java.util.HashMap;

public class StudentDB {

    private HashMap<Integer, ArrayList<Student>> studentArray;
/*
*    public StudentDB(){
        Student student1 = new Student(1,"Albert","Einstein",143);
        Student student2 = new Student(2,"Albert2","Einstein2",144);
        Student student3 = new Student(3,"Albert3","Einstein3",145);
        this.studentArray = new ArrayList();
        this.studentArray.add(student1);
        this.studentArray.add(student2);
        this.studentArray.add(student3);
    }
*/
    public StudentDB(){
        Student student1 = new Student(1,"Albert","Einstein",143);
        Student student2 = new Student(2,"Albert2","Einstein2",144);
        Student student3 = new Student(3,"Albert3","Einstein3",145);

        this.studentArray = new HashMap<>();

        ArrayList listStudent1 = new ArrayList<>();
        listStudent1.add(student1);
        ArrayList listStudent2 = new ArrayList<>();
        listStudent2.add(student2);
        ArrayList listStudent3 = new ArrayList<>();
        listStudent3.add(student3);

        this.studentArray.put(student1.getId(),listStudent1);
        this.studentArray.put(student2.getId(),listStudent2);
        this.studentArray.put(student3.getId(),listStudent3);
    }

    public HashMap<Integer, ArrayList<Student>> getAllStudents(){
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

    public ArrayList<Student> randomStudent(){
        return this.studentArray.get((int) (Math.random() * this.studentArray.size()+1));
    }


}
