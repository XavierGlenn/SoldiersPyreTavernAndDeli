package com.pluralsight;

import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Scanner;

public class main {

    private static final Scanner scanner = new Scanner(System.in);
    private static final ArrayList<String> receiptItems = new ArrayList<>();
    private static double totalPrice = 0.0;

    public static void MainMenu(String[] args) {
        while (true) {
            System.out.println("\n Attention! Welcome to the Soldier's Pyre Tavern and Deli. Could you go for a good meal? I've got you soldier.");
            System.out.println("1. New Sandwich Order");
            System.out.println("0. Exit the Menu.");
            System.out.print("Count on me. I can put you to rights. Enter your choice here: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); //To make sure the menu logic continues

            if (choice == 1) {
                startOrder(); }
            else if (choice == 0) {
                System.out.println("Don't burn yourself. Be careful out there, soldier.");
                break; } else {
                System.out.println("Heads up! That choice was invalid. Let me help. Sending you back to the menu..."); }
        }
    }

    private static void startOrder() {
        receiptItems.clear();
        totalPrice = 0.0;

        while (true) {
            System.out.println("\nHey you! We're in this together. Tell me what you need to fuel up.");
            System.out.println("1. Add Sandwich");
            System.out.println("2. Add Drink");
            System.out.println("3. Add Chips");
            System.out.println("4. Checkout");
            System.out.println("0. Cancel Order");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            System.out.println("Let's cook with fire!");
            scanner.nextLine(); // Consume newline

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
        //Size
        System.out.println("Aye aye! You can count on me. What size sandwich would you like?");
        int[] sizeChoices = {4, 8, 12};
        double[] sizePrices = {5.50, 7.00, 8.50};

        //Bread
        System.out.println("Let's march! What flavor of bread would you like?");
        String[] breadChoices = {"White", "Wheat", "Rye", "Wrap"};

        //Meat
        System.out.println("Let's go! What meat would you like?");
        String[] meatChoices = {"Steak", "Ham", "Salami", "Roast Beef", "Chicken", "Bacon", "None"};
        double[] meatPrices = {1.00, 2.00, 3.00, 3.50, 2.50, 1.75, 0.00}; //help how to do extra meat? can I make it loop? I forgot.

        //Cheese
        System.out.println("Got it. Now what cheese would you like?");
        String[] cheeseOptions = {"American", "Provolone", "Cheddar", "Swiss", "None"};
        double[] cheesePrices = {0.75, 1.50, 2.25, 1.75, 0.00}; //help how to do extra cheese? can I make it loop? I forgot.

        //Topping
        System.out.println("On it.What toppings are you hungry for? And surprise! All of these are free!");
        String[] toppingOptions = {"Lettuce", "Peppers", "Onions", "Tomatoes", "Jalapenos", "Cucumbers", "Guacamole", "Mushrooms", "None"};
        double[] toppingPrices = {0.00, 0.00, 0.00, 0.00, 0.00, 0.00, 0.00, 0.00, 0.00};

        //Condiments
        System.out.println("Hang on. Did you want any condiments on that?");
        String[] condimentOptions = {"Mayonnaise", "Mustard", "Ketchup", "Ranch", "Thousand Island", "Vinaigrette"};
        double[] condimentPrices = {0.00, 0.00, 0.00, 0.00, 0.00, 0.00};

        //Side
        System.out.println("Incoming! Now did you want anything else on the side? Don't worry, I won't leave you hanging. These are free too!");
        String[] sidesOptions = {"Au Jus, Special Sauce"};
        double[] sidesPrices = {0.00, 0.00};

        // Choose size:
        String size = chooseOption("Size: ", sizeChoices, sizePrices, breadChoices);
        int sizePrice = getPrice(size, sizeChoices, breadChoices, sizePrices);

        //Choose bread:
        String bread = ("Bread: ");

        // Choose meat:
        String meat = chooseOption("Meat: ", meatChoices, meatPrices);
        double meatPrice = getPrice(meat, meatChoices, meatPrices);

        // Choose extra meat option:
        System.out.print("Hup hup! Would you like extra meat for any extra hunger? (yes/no): ");
        String extraMeat = chooseOption("Extra Meat: ", meatChoices, meatPrices);
        boolean extraMeatOptionsLabel = scanner.nextLine().equalsIgnoreCase("yes");

        // Choose cheese:
        String cheese = chooseOption("Cheese: ", cheeseOptions, cheesePrices);
        double cheesePrice = getPrice(cheese, cheeseOptions, cheesePrices);

        // Choose extra cheese option:
        System.out.print("Tactical! Would you like extra cheese for any extra hunger? (yes/no): ");
        String extraCheese = chooseOption("Meats: ", meatChoices, meatPrices);
        boolean extraCheeseOptionsLabel= scanner.nextLine().equalsIgnoreCase("yes");

        // Choose topping:
        String topping = chooseOption("Topping: ", toppingOptions, toppingPrices);
        double toppingPrice = getPrice(topping, toppingOptions, toppingPrices);

        // Choose condiment:
        String condiment = chooseOption("Condiment: ", condimentOptions, condimentPrices);
        double condimentPrice = getPrice(condiment, condimentOptions, condimentPrices);

        // Choose side:
        String side = chooseOption("Side: ", sidesOptions, sidesPrices);
        double sidesPrice = getPrice(side, sidesOptions, sidesPrices);

        // Toasted option:
        System.out.print("Steady now... Would you like your sandwich toasted? (yes/no): ");
        boolean toasted = scanner.nextLine().equalsIgnoreCase("yes");

        // Add to receipt:
        String sandwichDetails = size + "Size: " + bread + " Bread: " + toasted + "Toasted: " + meat + " Meat: " + extraMeat + "Extra Meat: " + cheese + " Cheese: " + extraCheese + "Extra Cheese: " + topping + "Topping: " + condiment + "Condiment: " + side + "Sides: ";
        receiptItems.add("Sandwich: " + sandwichDetails);
        totalPrice += sizePrice + meatPrice + cheesePrice;
        System.out.println("Added: " + sandwichDetails + " ($" + totalPrice + ")"); }

    private static void addDrink() {
        System.out.println("Add A Drink to Cool Off Your Engine?");
        String[] drinkSizes = {"Small", "Medium", "Large"};
        double[] drinkPrices = {2.00, 2.50, 3.00};
        String size = chooseOption("Drink Size: ", drinkSizes, drinkPrices);
        double price = getPrice(size, drinkSizes, drinkPrices);
        receiptItems.add("Drink: " + size + " - $" + price);
        totalPrice += price;
        System.out.println("Added: " + size + " Drink ($" + price + ")"); }

    private static void addChips() {
        System.out.println("Ready for more? How about some chips to go with your sandwich?");
        String[] chipOptions = {"Original", "Barbecue", "Sour Cream and Onion", "Flamin' Hot"};
        double chipPrice = 1.50;
        String chips = chooseOption("Chips", chipOptions, null);
        receiptItems.add("Chips: " + chips + " - $" + chipPrice);
        totalPrice += chipPrice;
        System.out.println("Added: Chips - " + chips + " ($1.50)"); }

    private static void checkout() {
        System.out.println("Let me take a look at what you've chosen and see what we have on this receipt: "); //TODO enter a fancy receipt name
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
        String fileName = "soldiers-pyre-receipts/" + timestamp + ".txt";

        try (FileWriter writer = new FileWriter(fileName)) {
            writer.write("Let me take a look at what you've chosen and see what we have on this receipt: ");
            for (String item : receiptItems) {
                writer.write(item + "\n"); }

            writer.write(String.format("Total Price: $%.2f\n", totalPrice));
            writer.write("Soldier's Pyre Tavern and Deli: Eyes on victory, tummy on dinner.");
            System.out.println("Receipt saved under: " + fileName);
        } catch (IOException e) {
            System.out.println("Failed to save receipt: " + e.getMessage()); }
    }

    //math functions here that hurt my brain but they're needed:
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
                return prices != null ? prices[i] : 0.0; }
        }
        return 0.0;

        //TODO: add payment collection somehow? another reader writer?
    }
}
