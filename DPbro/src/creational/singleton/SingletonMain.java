package creational.singleton;

public class SingletonMain {
    public static void main(String[] args) {
        Singleton instance = Singleton.getInstance("2334");
        Singleton instance2 = Singleton.getInstance("894");

        System.out.println(instance);
        System.out.println(instance2);
    }
}

class Singleton {
   private static Singleton instance;

   private String data;

   private Singleton(String data) {
       this.data = data;
   }

   public static Singleton getInstance(String data) {
       if (instance == null) {
           instance = new Singleton(data);
       }
       return instance;
   }

}
