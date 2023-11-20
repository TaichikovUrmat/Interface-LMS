import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        int count = 0;
        Student student1 =new Student("Urmat","Taichikov","mujik","2011","17- kula");
        Student student2= new Student("Jigit","Turunbekov","mujik","2010","10-Orto mektebi");
        Student student3 = new Student("Aliaskar","Temirbekov","mujik","2010","12-Orto mektebi");
        Student student4 = new Student("Muxammet","Medetov","mujik","2011","7-Orto mektebi");
        Student student5 = new Student("Ajybek","Sadykov","mujik","2014","2-Orto mektebi");

        Student[] students  =new Student[]{student1,student2,student3,student4,student5};
        System.out.print(Arrays.toString(students));

           StudentArray(students);
    }

    public static void StudentArray(Student[] students){

        for (int i = 0; i < students.length; i++) {
            students[i].getStudentsEducationCenter();

        }
        for (int i = 0; i < students.length; i++) {
            students[i].getStudentsStudyingYear();

        }
    }
}