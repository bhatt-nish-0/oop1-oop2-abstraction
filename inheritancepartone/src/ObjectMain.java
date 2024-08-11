public class ObjectMain /*extends Object*/{
    public static void main(String[] args) {

        ObjectMain objectMain = new ObjectMain();
        int y = objectMain.hashCode();
        System.out.println(y);

        ObjectMain objectMain1 = new ObjectMain();
        int y1 = objectMain1.hashCode();
        System.out.println(y1);


        Student student = new Student("tim",29);
        System.out.println(student);

        PrimarySchoolStudent j = new PrimarySchoolStudent("jim",8,"carol");
        System.out.println(j);

        //stopped at overloading vs overriding.
    }

}

class Student {
    private String name;
    private int age;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    //run time polymorphism
    @Override
    public String toString() {

        return name + " is " + age;
//        return "Student{" +
//                "name='" + name + '\'' +
//                ", age=" + age +
//                '}';
    }
}

class PrimarySchoolStudent extends Student{

    private String parentName;

    public PrimarySchoolStudent(String name, int age, String parentName) {
        super(name,age);
        this.parentName = parentName;
    }

    @Override
    public String toString() {
        return parentName + "'s kid, " + super.toString();
    }
}
