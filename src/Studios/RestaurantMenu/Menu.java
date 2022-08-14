package Studios.RestaurantMenu;
import java.util.Date;

public class Menu {
    public static void main(String[] args) {

        // Appetizers
        MenuItems horseSalad = new MenuItems("Horse Salad", "Yes", "Appetizer", "Classic Horse salad with" +
                "romaine lettuce, homemade Asiago cheese croutons, shaved Parmesan, red onion, and tangy Horsey dressing.", 7.99);

        MenuItems pretzelBites = new MenuItems("Bavarian Pretzel Bites", "No", "Appetizer", "Bavarian" +
                "pretzel bites from our friends at the Philly Pretzel Factory. Baked to perfection and served withspicy mustard and" +
                "cheddar cheese dippers.", 5.99);
        MenuItems fullyLoadedNachos = new MenuItems("Fully Loaded Nachos", "Appetizer", "No", "One rule: " +
                "If you get this item to share, one person can't eat all of the fully loaded ones with all of the meat and cheese on them.", 8.99);

// Main Courses
        MenuItems theLarryDavid = new MenuItems("The Larry David Sandwich", "No", "Main Course", "Whitefish, sable, capers," +
                "red onions, and cream cheese. Served with a side of waffle fries.", 13.99);

        MenuItems theCharlieDay = new MenuItems("The Charlie Day", "No", "Main Course", "Rum ham, " +
                "cheddar cheese, pickles, and spicy mustard. Served with a side of cat food.", 14.99);
        MenuItems theTimRobinson = new MenuItems("The Tim Robinson", "Yes", "Main Course", "A hot " +
                "dog you can fit in the sleeve of your shirt in case you need to discreetly eat in the event your boss tries to make you work" +
                "through lunch. Served with a side of waffle fries.", 10.99);

        //Desserts
        MenuItems theMichaelScott = new MenuItems("Michael Scott's Tiramisu", "No", "Dessert", "Tiramisy made" +
                "by the boss himself, Michael Scott. There's lots of cinnamon powder on top, so make sure you don't breahe in when you take" +
                "a bite or you might end up coughin.", 4.99);
        MenuItems theHomer = new MenuItems("The Homer Donut", "No", "Dessert", "Vanilla coke D'oh-nut with pink" +
                "frosting and sprinkles.", 1.99);
        MenuItems theCookieMonster = new MenuItems("Cookie Monster's Monster Cookies", "Yes", "Dessert", "Two" +
                "monsterous chocolate chip cookies served with a class of milk.", 2.99);

    }

}