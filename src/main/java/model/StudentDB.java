package model;

public class StudentDB {

    private Student[] studentArray;

    public StudentDB(){
        Student student1 = new Student(1,"Albert","Einstein",143);
        Student student2 = new Student(2,"Albert2","Einstein2",144);
        Student student3 = new Student(3,"Albert3","Einstein3",145);
        this.studentArray = new Student[]{student1, student2, student3};
    }

    public Student[] getAllStudents(){
//        for(int i=0; i<this.studentArray.length; i++)
//            for (int j=0; j<this.studentArray[i].length; j++){
//                System.out.println(this.studentArray[i][j]);
//            }
        return this.studentArray;
    }

    @Override
    public String toString(){
        String students="";
        for(int i=0; i<this.studentArray.length; i++)
            {
                students += this.studentArray[i]+" \n";
            }
        return students;
    }

    public Student randomStudent(){
        return this.studentArray[(int) (Math.random() * this.studentArray.length)];
    }


}
