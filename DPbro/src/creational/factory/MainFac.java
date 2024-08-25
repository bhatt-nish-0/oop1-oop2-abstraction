package creational.factory;

interface Burger {
    public abstract void prepare();
}

class BeefBurger implements Burger {

    @Override
    public void prepare() {
        System.out.println("preparing beef burger");
    }
}

class VeggieBurger implements Burger {

    @Override
    public void prepare() {
        System.out.println("preparing veggie burger");
    }
}

class SimpleBurgerFactory {
    public Burger createBurger(String req) {
        Burger burger = null;
        if (req.equals("BEEF")){
            burger = new BeefBurger();
        } else if (req.equals("VEGGIE")){
            burger = new VeggieBurger();
        }
        return burger;
    }
}

class Restaurant {

    public Burger orderBurger(String req) {
        SimpleBurgerFactory simpleBurgerFactory = new SimpleBurgerFactory();
        Burger burger = simpleBurgerFactory.createBurger(req);
        burger.prepare();
        return burger;
    }

}

public class MainFac {
    public static void main(String[] args) {
        Restaurant restaurant = new Restaurant();
        Burger veggie = restaurant.orderBurger("VEGGIE");
        Burger beef = restaurant.orderBurger("BEEF");

        if (veggie instanceof VeggieBurger) {
            System.out.println("veggie burger");
        }

        if (beef instanceof BeefBurger) {
            System.out.println("beef burger");
        }
    }
}
