public class Student {

    private int id;
    private String name;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int hashCode() {
        System.out.println("calling hashcode");
        return id;
    }

    public boolean equals(Object o) {
        System.out.println("calling eaquals");
        System.out.println(this.name.equals(((Student)o).getName()));
        if (this.name.equals(((Student)o).getName())) {
            System.out.println("no need to add");
        }else {
            System.out.println("adding");
        }
        return this.name.equals(((Student)o).getName());
    }
}
