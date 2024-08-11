package todemonstratepackageaccess;

//Train has no access modifier - hence it has package private access by default.
class Train {
    private int something;
    int anotherVar;

    public int getSomething() {
        return something;
    }

    public void setSomething(int something) {
        this.something = something;
    }

    public int getAnotherVar() {
        return anotherVar;
    }

    public void setAnotherVar(int anotherVar) {
        this.anotherVar = anotherVar;
    }
}

public class Bus {
}
