public  class Student implements Study {

    private String  name;
    private String surname;
    private String gender;
    private String localDate;     //студент кайсыл жылы окуп баштаганы
    private String educationCenter;

    public Student(String name, String surname, String gender, String localDate, String educationCenter) {
        this.name = name;
        this.surname = surname;
        this.gender = gender;
        this.localDate = localDate;
        this.educationCenter = educationCenter;
    }



    @Override
    public void getStudentsEducationCenter() {
        System.out.println("Student:"+name+", "+surname+" ,"+gender);
    }

    @Override
    public void getStudentsStudyingYear() {
        System.out.println("year:  "+name+ ", " +localDate+", "+educationCenter);

    }
    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", gender='" + gender + '\'' +
                ", localDate='" + localDate + '\'' +
                ", educationCenter='" + educationCenter + '\'' +
                '}';
    }
}
