package creational.builder;
class Phone {
    private String name;
    private String age;

    public Phone(String name, String age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Phone{" +
                "name='" + name + '\'' +
                ", age='" + age + '\'' +
                '}';
    }
}
class PhoneBuilder {

    private String name;
    private String age;

    public PhoneBuilder setName(String name) {
        this.name = name;
        return this;
    }

    public PhoneBuilder setAge(String age) {
        this.age = age;
        return this;
    }

    public Phone getPhone() {
        return new Phone(this.name,this.age);
    }
}

public class Client {
    public static void main(String[] args) {
        Phone hey = new PhoneBuilder().setAge("23").setName("hey").getPhone();
        System.out.println(hey);

        Phone hey2 = new PhoneBuilder().setName("hey").getPhone();
        System.out.println(hey2);
    }
}
