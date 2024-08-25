package structural.facade;

public class Customer {
    public static void main(String[] args) {

        Ingredient ingredient = new Ingredient();
        Food paste = new Pasta();
        String pasteItems = ingredient.getPastaItems();
        paste.prepareFood(pasteItems);
        System.out.println(paste.deliverFood());

        Food pizza = new Pizza();
        String pizzaItems = ingredient.getPizzaItems();
        pizza.prepareFood(pizzaItems);
        System.out.println(pizza.deliverFood());


        System.out.println("using facade");
        //using facade


        System.out.println(Waiter.deliverFood("pizza"));
        System.out.println(Waiter.deliverFood("pasta"));


    }
}

interface Food {
    public void prepareFood(String itemsRequired);
    public String deliverFood();
}

class Pizza implements Food {

    public String preparedItems;


    @Override
    public void prepareFood(String itemsRequired) {
        preparedItems = "Thin Crush pizza with ingredients - " + itemsRequired;
    }

    @Override
    public String deliverFood() {
        return preparedItems;
    }
}

class Pasta implements Food {

    public String preparedItems;


    @Override
    public void prepareFood(String itemsRequired) {
        preparedItems = "Tomato pasta with ingredients - " + itemsRequired;
    }

    @Override
    public String deliverFood() {
        return preparedItems;
    }
}

class Ingredient {
    public String getPizzaItems() {
        return "dough, pizza sauce, Mozzarella Cheese";
    }

    public String getPastaItems() {
        return "onions, what else";
    }
}

class Waiter {

    public static String deliverFood(String foodType) {
        Ingredient ingredient = new Ingredient();

        if (foodType.equals("pizza")){
            Food pizza = new Pizza();
            String pizzaItems = ingredient.getPizzaItems();
            pizza.prepareFood(pizzaItems);
            return pizza.deliverFood();
        }else {
            Food pasta = new Pasta();
            String pastaItems = ingredient.getPastaItems();
            pasta.prepareFood(pastaItems);
            return pasta.deliverFood();
        }


    }
}


