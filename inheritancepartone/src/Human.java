public class Human {

    private int age;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Number talkAlotOrLittle() {
        System.out.println("talking...");
        return 3;
    }
}

class Girl extends Human {

    @Override
    public Integer talkAlotOrLittle() {
        System.out.println("talking... a lot");
        return 7;
    }

}

class Boy extends Human {

    @Override
    public Double talkAlotOrLittle() {
        System.out.println("talking... even more");
        return 3.2;
    }

    public String getSomething() {

        return "default";
    }

    public String getSomething(int i) {
        return "default" + i;
    }


}
