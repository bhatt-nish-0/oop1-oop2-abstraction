import java.util.HashSet;

public class Main {
    public static void main(String[] args) {
        Student s = new Student();
        s.setName("test");
        s.setId(23);

        Student s1 = new Student();
        s1.setName("test");
        s1.setId(23);

        HashSet<Student> s3 = new HashSet<>();
        s3.add(s);
        s3.add(s1);

        Student s4 = new Student();
        s4.setId(27);
        s4.setName("test");

        s3.add(s4);

        Student s5 = new Student();
        s5.setId(27);
        s5.setName("aaaa");

        s3.add(s5);

        for (Student s8 : s3) {
            System.out.println(s8.getId());
        }
    }
}
