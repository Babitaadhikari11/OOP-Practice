package Polymorphism;

abstract class MenuItem {
    protected String name;

    public MenuItem(String name) {
        this.name = name;
    }

    abstract void prepare();
    abstract void serve();
}


class Appetizer extends MenuItem {

    public Appetizer(String name) {
        super(name);
    }

    @Override
    void prepare() {
        System.out.println("Preparing appetizer: " + name + " (chopping and plating small portions)");
    }

    @Override
    void serve() {
        System.out.println("Serving appetizer: " + name + " with dipping sauce.");
    }
}


class MainCourse extends MenuItem {

    public MainCourse(String name) {
        super(name);
    }

    @Override
    void prepare() {
        System.out.println("Cooking main course: " + name + " (includes boiling, grilling, and seasoning)");
    }

    @Override
    void serve() {
        System.out.println("Serving main course: " + name + " with side dish.");
    }
}


class Beverage extends MenuItem {

    public Beverage(String name) {
        super(name);
    }

    @Override
    void prepare() {
        System.out.println("Pouring beverage: " + name + " (chilled or hot)");
    }

    @Override
    void serve() {
        System.out.println("Serving beverage: " + name + " in a glass.");
    }
}
public class RestaurantOrderSystem {
    public static void main(String[] args) {
        MenuItem item1 = new Appetizer("Spring Rolls");
        MenuItem item2 = new MainCourse("Grilled Chicken");
        MenuItem item3 = new Beverage("Lemonade");

       
        item1.prepare();
        item1.serve();

        item2.prepare();
        item2.serve();

        item3.prepare();
        item3.serve();
    }
}