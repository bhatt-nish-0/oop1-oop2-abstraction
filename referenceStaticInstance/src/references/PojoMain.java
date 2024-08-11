package references;

record Student (String name, String id) {
//record is immutable!
}


public class PojoMain {
    public static void main(String[] args) {

        for (int i =0; i< 5; i++) {
            Pojo p = new Pojo("S92300" + i,
                    switch (i) {
                        case 0 -> "Mary";
                        case 1 -> "andra";
                        case 2 -> "nish";
                        case 3 -> "bib";
                        case 4 -> "alan varick";
                        default -> "anonymous";
                    },
                    "223344","Jave Masterclass");
            System.out.println(p);
        }


        Student student = new Student("nish","223");
        Student student1 = new Student("andy ong kah song","456");

        System.out.println();
        System.out.println(student);
        System.out.println(student1);
    }
}
