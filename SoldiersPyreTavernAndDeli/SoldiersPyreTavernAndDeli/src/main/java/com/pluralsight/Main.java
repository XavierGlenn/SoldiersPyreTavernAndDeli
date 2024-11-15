import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Scanner;

public static void main() {

    MainMenu(); scanner.close(); }

private static final Scanner scanner = new Scanner(System.in);
private static final ArrayList<String> receiptItems = new ArrayList<>();
private static double totalPrice = 0.0;

public static void MainMenu() {
    while (true) {
        System.out.println("˖⁺‧₊˚-˚₊‧⁺˖˖⁺‧₊˚-˚₊‧⁺˖˖⁺‧₊˚-˚₊‧⁺˖˖⁺‧₊˚-˚₊‧⁺˖˖⁺‧₊˚-˚₊‧⁺˖˖⁺‧₊˚-˚₊‧⁺˖˖⁺‧₊˚-˚₊‧⁺˖˖⁺‧₊˚-˚₊‧⁺˖˖⁺‧₊˚-˚₊‧⁺˖˖⁺‧₊˚-˚₊‧⁺˖˖⁺‧₊˚-˚₊‧⁺˖˖⁺‧₊˚-˚₊‧⁺˖˖⁺‧₊˚-˚₊‧⁺˖˖⁺‧₊˚-˚₊‧⁺˖");
        System.out.println("\uD83D\uDD25 \uD83D\uDCA5 Attention! Welcome to the Soldier's Pyre Tavern and Deli. Could you go for a good meal? I've got you soldier. \uD83D\uDCA5 \uD83D\uDD25");
        System.out.println("1. New Order");
        System.out.println("0. Exit the Menu.");
        System.out.println("˖⁺‧₊˚-˚₊‧⁺˖˖⁺‧₊˚-˚₊‧⁺˖˖⁺‧₊˚-˚₊‧⁺˖˖⁺‧₊˚-˚₊‧⁺˖˖⁺‧₊˚-˚₊‧⁺˖˖⁺‧₊˚-˚₊‧⁺˖˖⁺‧₊˚-˚₊‧⁺˖˖⁺‧₊˚-˚₊‧⁺˖˖⁺‧₊˚-˚₊‧⁺˖˖⁺‧₊˚-˚₊‧⁺˖˖⁺‧₊˚-˚₊‧⁺˖˖⁺‧₊˚-˚₊‧⁺˖˖⁺‧₊˚-˚₊‧⁺˖˖⁺‧₊˚-˚₊‧⁺˖");
        System.out.print("Count on me. I can put you to rights. Enter your choice here: ");
        int choice = scanner.nextInt();
        scanner.nextLine(); // scanner eater line

        if (choice == 1) {
            startOrder(); }
        else if (choice == 0) {
            System.out.println("˖⁺‧₊˚-˚₊‧⁺˖˖⁺‧₊˚-˚₊‧⁺˖˖⁺‧₊˚-˚₊‧⁺˖˖⁺‧₊˚-˚₊‧⁺˖˖⁺‧₊˚-˚₊‧⁺˖˖⁺‧₊");
            break; } else {
            System.out.println("˖⁺‧₊˚-˚₊‧⁺˖˖⁺‧₊˚-˚₊‧⁺˖˖⁺‧₊˚-˚₊‧⁺˖˖⁺‧₊˚-˚₊‧⁺˖˖⁺‧₊˚-˚₊‧⁺˖˖⁺‧₊˚-˚₊‧⁺˖˖⁺‧₊˚-˚₊‧⁺˖˖⁺‧₊˚-˚₊‧⁺˖˖⁺‧₊˚-˚₊‧⁺˖˖⁺‧₊");
            System.out.println("Heads up! That choice was invalid. Let me help. Sending you back to the menu..."); }
        System.out.println("˖⁺‧₊˚-˚₊‧⁺˖˖⁺‧₊˚-˚₊‧⁺˖˖⁺‧₊˚-˚₊‧⁺˖˖⁺‧₊˚-˚₊‧⁺˖˖⁺‧₊˚-˚₊‧⁺˖˖⁺‧₊˚-˚₊‧⁺˖˖⁺‧₊˚-˚₊‧⁺˖˖⁺‧₊˚-˚₊‧⁺˖˖⁺‧₊˚-˚₊‧⁺˖˖⁺‧₊");
    }
}

private static void startOrder() {
    receiptItems.clear();
    totalPrice = 0.0;

    while (true) {
        System.out.println("˖⁺‧₊˚-˚₊‧⁺˖˖⁺‧₊˚-˚₊‧⁺˖˖⁺‧₊˚-˚₊‧⁺˖˖⁺‧₊˚-˚₊‧⁺˖˖⁺‧₊˚-˚₊‧⁺˖˖⁺‧₊");
        System.out.println("Hey you! Tell me what you need to fuel up.");
        System.out.println("1. Add Sandwich");
        System.out.println("2. Add Drink");
        System.out.println("3. Add Chips");
        System.out.println("4. Checkout");
        System.out.println("5. Cancel Order");
        System.out.print("Enter your choice: ");
        System.out.println("˖⁺‧₊˚-˚₊‧⁺˖˖⁺‧₊˚-˚₊‧⁺˖˖⁺‧₊˚-˚₊‧⁺˖˖⁺‧₊˚-˚₊‧⁺˖˖⁺‧₊˚-˚₊‧⁺˖˖⁺‧₊");
        int choice = scanner.nextInt();
        System.out.println("Let's cook with fire!");
        System.out.println("˖⁺‧₊˚-˚₊‧⁺˖˖⁺‧₊˚-˚₊‧⁺˖˖⁺‧₊˚-˚₊‧⁺˖˖⁺‧₊˚-˚₊‧⁺˖˖⁺‧₊˚-˚₊‧⁺˖˖⁺‧₊");
        scanner.nextLine(); // scanner eater line

        switch (choice) {
            case 1 -> addSandwich();
            case 2 -> addDrink();
            case 3 -> addChips();
            case 4 -> {
                checkout();
                return; }
            default -> System.out.println("Heads up! That choice was invalid. Let me help. Sending you back to the menu..."); }
    }
}

private static void addSandwich() {

    //Size choice menu:
    System.out.println("˖⁺‧₊˚-˚₊‧⁺˖˖⁺‧₊˚-˚₊‧⁺˖˖⁺‧₊˚-˚₊‧⁺˖˖⁺‧₊˚-˚₊‧⁺˖˖⁺‧₊˚-˚₊‧⁺˖˖⁺‧₊");
    System.out.println("Aye aye! You can count on me. What size sandwich would you like?");
    String[] sizeChoices = {"four", "eight", "twelve"};
    double[] sizePrices = {5.50, 7.00, 8.50};
    double[] meatQuantity = {1.00, 2.00, 3.00};
    System.out.println("˖⁺‧₊˚-˚₊‧⁺˖˖⁺‧₊˚-˚₊‧⁺˖˖⁺‧₊˚-˚₊‧⁺˖˖⁺‧₊˚-˚₊‧⁺˖˖⁺‧₊˚-˚₊‧⁺˖˖⁺‧₊");
    System.out.println("1.) 4 inch sandwich |$" + sizePrices[0]);
    System.out.println("2.) 8 inch sandwich |$" + sizePrices[1]);
    System.out.println("3.) 12 inch sandwich |$" + sizePrices[2]);
    System.out.println("˖⁺‧₊˚-˚₊‧⁺˖˖⁺‧₊˚-˚₊‧⁺˖˖⁺‧₊˚-˚₊‧⁺˖˖⁺‧₊˚-˚₊‧⁺˖˖⁺‧₊˚-˚₊‧⁺˖˖⁺‧₊");
    scanner.nextInt();
    scanner.nextLine(); // scanner eater line

    //Bread choice menu:
    String[] breadChoices = {"White Bread", "Wheat Bread", "Rye Bread", "Tortilla Wrap"};
    System.out.println("˖⁺‧₊˚-˚₊‧⁺˖˖⁺‧₊˚-˚₊‧⁺˖˖⁺‧₊˚-˚₊‧⁺˖˖⁺‧₊˚-˚₊‧⁺˖˖⁺‧₊˚-˚₊‧⁺˖˖⁺‧₊");
    System.out.println("Let's march! What flavor of bread would you like?");
    System.out.println("1.)" +  breadChoices[0]);
    System.out.println("2.)" + breadChoices[1]);
    System.out.println("3.)" + breadChoices[2]);
    System.out.println("4.)" + breadChoices[3]);
    System.out.println("˖⁺‧₊˚-˚₊‧⁺˖˖⁺‧₊˚-˚₊‧⁺˖˖⁺‧₊˚-˚₊‧⁺˖˖⁺‧₊˚-˚₊‧⁺˖˖⁺‧₊˚-˚₊‧⁺˖˖⁺‧₊");
    scanner.nextInt();
    scanner.nextLine(); // scanner eater line

    //Meat choice menu:
    String[] meatChoices = {"Steak", "Ham", "Salami", "Roast Beef", "Chicken", "Bacon", "None"};
    double[] meatPrices = {1.00, 2.00, 3.00, 0.00};
    System.out.println("˖⁺‧₊˚-˚₊‧⁺˖˖⁺‧₊˚-˚₊‧⁺˖˖⁺‧₊˚-˚₊‧⁺˖˖⁺‧₊˚-˚₊‧⁺˖˖⁺‧₊˚-˚₊‧⁺˖˖⁺‧₊");
    System.out.println("Let's go! What meat would you like?");
    System.out.println("1.)" + meatChoices[0]);
    System.out.println("2.)" + meatChoices[1]);
    System.out.println("3.)" + meatChoices[2]);
    System.out.println("4.)" + meatChoices[3]);
    System.out.println("5.)" + meatChoices[4]);
    System.out.println("6.)" + meatChoices[5]);
    System.out.println("7.)" + meatChoices[6]);
    System.out.println("˖⁺‧₊˚-˚₊‧⁺˖˖⁺‧₊˚-˚₊‧⁺˖˖⁺‧₊˚-˚₊‧⁺˖˖⁺‧₊˚-˚₊‧⁺˖˖⁺‧₊˚-˚₊‧⁺˖˖⁺‧₊");
    scanner.nextInt();
    scanner.nextLine(); // scanner eater line

    //Extra meat choice menu:
    String[] extraMeatChoices = {"Steak", "Ham", "Salami", "Roast Beef", "Chicken", "Bacon", "None"};
    double[] extraMeatPrices = {0.50, 1.00, 1.50, 0.00};
    System.out.println("˖⁺‧₊˚-˚₊‧⁺˖˖⁺‧₊˚-˚₊‧⁺˖˖⁺‧₊˚-˚₊‧⁺˖˖⁺‧₊˚-˚₊‧⁺˖˖⁺‧₊˚-˚₊‧⁺˖˖⁺‧₊");
    System.out.println("Hey-ho! Do you want any extra meats?");
    System.out.println("1.)" + extraMeatChoices[0]);
    System.out.println("2.)" + extraMeatChoices[1]);
    System.out.println("3.)" + extraMeatChoices[2]);
    System.out.println("4.)" + extraMeatChoices[3]);
    System.out.println("5.)" + extraMeatChoices[4]);
    System.out.println("6.)" + extraMeatChoices[5]);
    System.out.println("7.)" + extraMeatChoices[6]);
    System.out.println("˖⁺‧₊˚-˚₊‧⁺˖˖⁺‧₊˚-˚₊‧⁺˖˖⁺‧₊˚-˚₊‧⁺˖˖⁺‧₊˚-˚₊‧⁺˖˖⁺‧₊˚-˚₊‧⁺˖˖⁺‧₊");
    scanner.nextInt();
    scanner.nextLine(); // scanner eater line

    //Cheese choice menu:
    String[] cheeseChoices = {"American", "Provolone", "Cheddar", "Swiss", "None"};
    double[] cheesePrices = {0.75, 1.50, 2.25, 1.75, 0.00};
    System.out.println("˖⁺‧₊˚-˚₊‧⁺˖˖⁺‧₊˚-˚₊‧⁺˖˖⁺‧₊˚-˚₊‧⁺˖˖⁺‧₊˚-˚₊‧⁺˖˖⁺‧₊˚-˚₊‧⁺˖˖⁺‧₊");
    System.out.println("Got it. Now what cheese would you like?");
    System.out.println("1.)" + cheeseChoices[0]);
    System.out.println("2.)" + cheeseChoices[1]);
    System.out.println("3.)" + cheeseChoices[2]);
    System.out.println("4.)" + cheeseChoices[3]);
    System.out.println("5.)" + cheeseChoices[4]);
    System.out.println("˖⁺‧₊˚-˚₊‧⁺˖˖⁺‧₊˚-˚₊‧⁺˖˖⁺‧₊˚-˚₊‧⁺˖˖⁺‧₊˚-˚₊‧⁺˖˖⁺‧₊˚-˚₊‧⁺˖˖⁺‧₊");
    scanner.nextInt();
    scanner.nextLine(); // scanner eater line

    //Extra cheese choice menu:
    String[] extraCheeseChoices = {"American", "Provolone", "Cheddar", "Swiss", "None"};
    double[] extraCheesePrices = {0.75, 1.50, 2.25, 1.75, 0.00};
    System.out.println("˖⁺‧₊˚-˚₊‧⁺˖˖⁺‧₊˚-˚₊‧⁺˖˖⁺‧₊˚-˚₊‧⁺˖˖⁺‧₊˚-˚₊‧⁺˖˖⁺‧₊˚-˚₊‧⁺˖˖⁺‧₊");
    System.out.println("Hup hup! Now what cheese would you like?");
    System.out.println("1.)" + extraCheeseChoices[0]);
    System.out.println("2.)" + extraCheeseChoices[1]);
    System.out.println("3.)" + extraCheeseChoices[2]);
    System.out.println("4.)" + extraCheeseChoices[3]);
    System.out.println("5.)" + extraCheeseChoices[4]);
    System.out.println("˖⁺‧₊˚-˚₊‧⁺˖˖⁺‧₊˚-˚₊‧⁺˖˖⁺‧₊˚-˚₊‧⁺˖˖⁺‧₊˚-˚₊‧⁺˖˖⁺‧₊˚-˚₊‧⁺˖˖⁺‧₊");
    scanner.nextInt();
    scanner.nextLine(); // scanner eater line

    //Topping choice menu:
    String[] toppingChoices = {"Lettuce", "Peppers", "Onions", "Tomatoes", "Jalapenos", "Cucumbers", "Guacamole", "Mushrooms", "None"};
    double[] toppingPrices = {0.00, 0.00, 0.00, 0.00, 0.00, 0.00, 0.00, 0.00, 0.00};
    System.out.println("˖⁺‧₊˚-˚₊‧⁺˖˖⁺‧₊˚-˚₊‧⁺˖˖⁺‧₊˚-˚₊‧⁺˖˖⁺‧₊˚-˚₊‧⁺˖˖⁺‧₊˚-˚₊‧⁺˖˖⁺‧₊˚-˚₊‧⁺˖˖⁺‧₊˚-˚₊‧⁺˖˖⁺‧₊˚-˚₊‧⁺˖˖⁺‧₊˚-˚₊‧⁺");
    System.out.println("On it. What toppings are you hungry for? And surprise! All of these are free!");
    System.out.println("1.)" + toppingChoices[0]);
    System.out.println("2.)" + toppingChoices[1]);
    System.out.println("3.)" + toppingChoices[2]);
    System.out.println("4.)" + toppingChoices[3]);
    System.out.println("5.)" + toppingChoices[4]);
    System.out.println("6.)" + toppingChoices[5]);
    System.out.println("7.)" + toppingChoices[6]);
    System.out.println("8.)" + toppingChoices[7]);
    System.out.println("9.)" + toppingChoices[8]);
    System.out.println("˖⁺‧₊˚-˚₊‧⁺˖˖⁺‧₊˚-˚₊‧⁺˖˖⁺‧₊˚-˚₊‧⁺˖˖⁺‧₊˚-˚₊‧⁺˖˖⁺‧₊˚-˚₊‧⁺˖˖⁺‧₊˚-˚₊‧⁺˖˖⁺‧₊˚-˚₊‧⁺˖˖⁺‧₊˚-˚₊‧⁺˖˖⁺‧₊˚-˚₊‧⁺");
    scanner.nextInt();
    scanner.nextLine(); // scanner eater line

    //Condiments choice menu:
    double[] condimentPrices = {0.00, 0.00, 0.00, 0.00, 0.00, 0.00};
    String[] condimentChoices = {"Mayonnaise", "Mustard", "Ketchup", "Ranch", "Thousand Island", "Vinaigrette"};
    System.out.println("˖⁺‧₊˚-˚₊‧⁺˖˖⁺‧₊˚-˚₊‧⁺˖˖⁺‧₊˚-˚₊‧⁺˖˖⁺‧₊˚-˚₊‧⁺˖˖⁺‧₊˚-˚₊‧⁺˖˖⁺‧₊˚-˚₊‧⁺˖˖⁺‧₊˚-˚₊‧⁺˖˖⁺‧₊˚-˚₊‧⁺˖˖⁺‧₊˚-˚₊‧⁺");
    System.out.println("Hang on. Did you want any condiments on that?");
    System.out.println("1.)" + condimentChoices[0]);
    System.out.println("2.)" + condimentChoices[1]);
    System.out.println("3.)" + condimentChoices[2]);
    System.out.println("4.)" + condimentChoices[3]);
    System.out.println("5.)" + condimentChoices[4]);
    System.out.println("6.)" + toppingChoices[5]);
    System.out.println("˖⁺‧₊˚-˚₊‧⁺˖˖⁺‧₊˚-˚₊‧⁺˖˖⁺‧₊˚-˚₊‧⁺˖˖⁺‧₊˚-˚₊‧⁺˖˖⁺‧₊˚-˚₊‧⁺˖˖⁺‧₊˚-˚₊‧⁺˖˖⁺‧₊˚-˚₊‧⁺˖˖⁺‧₊˚-˚₊‧⁺˖˖⁺‧₊˚-˚₊‧⁺");
    scanner.nextInt();
    scanner.nextLine(); // scanner eater line

    //Side choice menu:
    String[] sidesChoices = {"Au Jus", "Special Sauce"};
    double[] sidesPrices = {0.00, 0.00};
    System.out.println("˖⁺‧₊˚-˚₊‧⁺˖˖⁺‧₊˚-˚₊‧⁺˖˖⁺‧₊˚-˚₊‧⁺");
    System.out.println("Incoming! Now did you want anything else on the side? Don't worry, I won't leave you hanging. These are free too!");
    System.out.println("1.)" + sidesChoices[0]);
    System.out.println("2.)" + sidesChoices[1]);
    System.out.println("˖⁺‧₊˚-˚₊‧⁺˖˖⁺‧₊˚-˚₊‧⁺˖˖⁺‧₊˚-˚₊‧⁺");

    scanner.nextInt();
    scanner.nextLine(); // scanner eater line

    // Choose size:
    String size = chooseOption("Size: ", sizeChoices, sizePrices);
    double sizePrice = getPrice(size, sizeChoices, sizePrices);
    scanner.nextInt();

    //Choose bread:
    String bread = ("Bread: ");

    // Choose meat:
    String meat = chooseOption("Meat: ", meatChoices, meatPrices);
    double meatPrice = getPrice(meat, meatChoices, meatPrices);

    // Choose extra meat option:
    System.out.print("Hup hup! Would you like extra meat for any extra hunger? (yes/no): ");
    String extraMeat = chooseOption("Extra Meat: ", meatChoices, meatPrices);
    scanner.nextLine(); // scanner eater line

    // Choose cheese:
    String cheese = chooseOption("Cheese: ", cheeseChoices, cheesePrices);
    double cheesePrice = getPrice(cheese, cheeseChoices, cheesePrices);

    // Choose extra cheese option:
    System.out.print("Tactical! Would you like extra cheese for any extra hunger? (yes/no): ");
    String extraCheese = chooseOption("Extra Cheese: ", extraCheeseChoices, extraCheesePrices);
    scanner.nextLine(); // scanner eater line

    // Choose topping:
    String topping = chooseOption("Topping: ", toppingChoices, toppingPrices);

    // Choose condiment:
    String condiment = chooseOption("Condiment: ", condimentChoices, condimentPrices);

    // Choose side:
    String side = chooseOption("Side: ", sidesChoices, sidesPrices);

    // Toasted option:
    System.out.print("Steady now... Would you like your sandwich toasted? (yes/no): ");
    boolean toasted = scanner.nextLine().equalsIgnoreCase("yes");
    scanner.nextLine(); // scanner eater line

    // Add to receipt:
    String sandwichDetails = size + "Size: " + bread + " Bread: " + toasted + "Toasted: " + meat + " Meat: " + extraMeat + "Extra Meat: " + cheese + " Cheese: " + extraCheese + "Extra Cheese: " + topping + "Topping: " + condiment + "Condiment: " + side + "Sides: ";
    receiptItems.add("Sandwich: " + sandwichDetails);
    totalPrice += sizePrice + meatPrice + cheesePrice;
    System.out.println("Added: " + sandwichDetails + " ($" + totalPrice + ")"); }

private static void addDrink() {
    System.out.println("Add A Drink to Cool Off Your Engine?");
    String[] drinkSize = {"1.) Small", "2.) Medium", "3.) Large"};
    int choice = scanner.nextInt();
    String drinkSizeChoice = drinkSize [choice -1];
    String[] drinkChoices = {"Cola", "Diet Cola", "Root Beer", "Lemon-Lime", "Orange", "Grape"};
    double[] drinkPrices = {2.00, 2.50, 3.00};
    String size = chooseOption("Drink Size: ", drinkSize, drinkPrices);
    double price = getPrice(drinkSizeChoice, drinkChoices, drinkPrices);
    receiptItems.add("Drink: " + size + " - $" + price);
    totalPrice += price;
    System.out.println("Added: " + size + " Drink ($" + price + ")");
    scanner.nextInt();
    scanner.nextLine(); } // scanner eater line

private static void addChips() {
    System.out.println("Ready for more? How about some chips to go with your sandwich?");
    String[] chipOptions = {"Original", "Barbecue", "Sour Cream and Onion", "Flaming Hot"};
    double chipPrice = 1.50;
    String chips = chooseOption("Chips", chipOptions, null);
    receiptItems.add("Chips: " + chips + " - $" + chipPrice);
    totalPrice += chipPrice;
    System.out.println("Added: Chips - " + chips + " ($1.50)");
    scanner.nextInt();
    scanner.nextLine(); } // scanner eater line

private static void checkout() {
    System.out.println("Let me take a look at what you've chosen and see what we have on this receipt: ");
    for (String item : receiptItems) {
        System.out.println(item); }

    System.out.printf("Total Price: $%.2f\n", totalPrice);
    System.out.print("Done? (yes/no): ");
    if (scanner.nextLine().equalsIgnoreCase("yes")) {
        saveReceipt();
        System.out.println("All better now. Well done. I'll be on my way with your food soon!"); }
    else {
        System.out.println("Order canceled."); }
}

//Receipt logic stuff:
private static void saveReceipt() {
    String timestamp = LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyyMMdd-HHmmss"));
    String fileName = "C:/Users/Student/OneDrive - Year Up- BOS/Desktop/Year Up Courses/PluralSight/Year Up United Projects/LearnToCode_Capstones/SandwichShopCapstone" + timestamp + ".txt";

    try (FileWriter writer = new FileWriter(fileName, true)) {
        writer.write("Let me take a look at what you've chosen and see what we have on this receipt: ");

        for (String item : receiptItems) {
            writer.write(item + "\n"); }

        writer.write(String.format("Total Price: $%.2f\n", totalPrice));
        writer.write("Soldier's Pyre Tavern and Deli: Eyes on victory, tummy on dinner.");
        writer.write("~This is my happy place~");
        System.out.println("Receipt saved under: " + fileName);

    } catch (IOException e) {
        System.out.println("Failed to save receipt: " + e.getMessage()); }
}

//math functions here that hurt my brain, but they're needed:
private static String chooseOption(String category, String[] options, double[] prices) {
    System.out.println("Choose " + category + ":");
    for (int i = 0; i < options.length; i++) {
        System.out.printf("%d. %s", i + 1, options[i]);
        if (prices != null) {
            System.out.printf(" ($%.2f)", prices[i]); }
        System.out.println(); }

    System.out.print("Enter your choice: ");
    int choice = scanner.nextInt();
    scanner.nextLine(); //to make sure the scanner doesn't eat anything
    return options[choice - 1]; }

private static double getPrice(String item, String[] options, double[] prices) {
    for (int i = 0; i < options.length; i++) {
        if (options[i].equalsIgnoreCase(item)) {
            return prices != null ? prices[i] : 0.0;
        }
    }
    return 0.0;
}