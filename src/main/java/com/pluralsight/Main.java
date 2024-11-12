import java.util.ArrayList;
import java.util.Scanner;

public static void main(String[] args) {
    //comment: Had an epiphany at 4am about how this should go. But does it work?

//Name: "Soldier's Pyre Tavern and Deli"
//fixme//help//todo//note//bookmark//comment
/*home screen -> new order -> exit
order screen -> add sandwich -> add drink -> add chips -> checkout -> cancel order
add sandwich -> sandwich size -> bread -> toasted? -> toppings (free) -> toppings (premium) -> extra toppings? -> sides
add drink -> add chips -> add another sandwich -> confirm -> checkout -> print receipt -> cancel -> back to main
 */

    // note:
    //  Clive's Favorite: spicy vegan patty. Crafted with love, with a warm picnic feel in mind.
    //  Tiefling's Delight: buffalo. A comforting classic with a little bit of warmth, for the person who wants something different and adventurous.
    //  Heart of Avernus: cajun. A sandwich that can add warmth to the coldest heart.
    //  The Forge: italian sausage. When you want a sandwich reminiscent of home.
    //  Infernal Resilience: brisket. A tough adventurer needs a sandwich tough enough to give the protein they need to keep going.

    String[] specialtySandwiches = {"Clive's Favorite, Tiefling's Delight, Heart of Avernus, The Forge, Infernal Resilience"};
    double[] specialtyPrices = {7.00, 7.50, 8.00, 8.50, 9.00};

    //TODO: Custom Sandwich
    //Make an array for size: 4, 8, 12
    int[] sizeOptions = {4, 8, 12};

    //Make an array for bread: white, wheat, rye, wrap
    String[] breadOptions = {"White, Wheat, Rye, Wrap"};
    double[] breadPrices = {5.50, 7.00, 8.50};

    //make an array for meat: steak, ham, salami, roast beef, chicken, bacon
    String[] meatOptions = {"Steak, Ham, Salami, Roast Beef, Chicken, Bacon, None"};
    double[] meatPrices = {1.00, 2.00, 3.00};

    //extra meat boolean y/n
    boolean extraMeat = false;
    String[] extraMeatOptionsLabel = {"Steak, Ham, Salami, Roast Beef, Chicken, Bacon, None"};
    double[] extraMeatPrices = {0.50, 1.00, 1.50, 0};

    //make an array for cheese: american, provolone, cheddar, swiss
    String[] cheeseOptions = {"American, Provolone, Cheddar, Swiss, None"};
    double[] cheesePrices = {0.75, 1.50, 2.25, 0};

    //make an array for extra cheese, boolean y/n
    boolean extraCheeseOptions = false;
    String[] extraCheeseOptionsLabel = {"American, Provolone, Cheddar, Swiss, None"};
    double[] extraCheesePrices = {0.30, 0.60, 0.90, 0};

    // toasted boolean y/n
    boolean toasted = false;

    //make an array for regular toppings: lettuce, peppers, onions, tomatoes, jalapenos, cucumbers, pickles, guacamole, mushrooms, none
    String[] toppingOptions = {"Lettuce, Peppers, Onions, Tomatoes, Jalapenos, Cucumbers, Pickles, Guacamole, Mushrooms, None"};
    double[] toppingPrices = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
    //Ask for one topping each time, and then ask if we want to add another and re-ask the logic.

    //make an array for condiments: mayo, mustard, ketchup, ranch, thousand island, vinaigrette
    String[] condimentOptions = {"Mayonnaise, Mustard, Ketchup, Ranch, Thousand Island, Vinaigrette, None"};
    double[] condimentPrices = {0, 0, 0, 0, 0, 0, 0, 0};

    //note: ***if I have time, special requests will go here!***

    //make an array for sides: Au jus, condiments, boolean y/n
    String[] sidesOptions = {"Au Jus, Extra Condiments, None"};
    double[] sidesPrices = {0, 0, 0};

    //make a loop that allows them to add another sandwich

    //make an array for chips: original flavor, barbecue, sour cream and onion, flamin' hot, none
    String[] chipsOptions = {"Original Flavor, Barbecue, Sour Cream and Onion, Flamin' Hot, None"};
    double[] chipsPrices = {1.50, 1.50, 1.50, 1.50, 0};

    //drink sizes: small, medium, large, none
    //drinks: cola, root beer, lemon lime, orange, grape, diet cola, water, none
    String[] drinksSizes = {"Small, Medium, Large"};
    String[] drinksOptions = {"Cola, Root Beer, Lemon Lime, Orange, Grape, Diet Cola, Water, None"};
    double[] drinksPrices = {2.00, 2.50, 3.00, 0};

    // confirmation screen for the whole order, or a loop back to the main menu.

    //note: extras if I have time:
    // make an array for take out, delivery, or dine-in.
    String[] diningOptions = {"Dine-in, Pickup, Delivery"};

    Scanner scanner = new Scanner(System.in);
    ArrayList<String> receiptItems = new ArrayList<>(); //Stores all items the customer wants
    double totalPrice = 0.0;
    boolean restart = false;

    //Main Menu initialization:
    int choice = showMenu(scanner);
    if (choice == 1) {
        totalPrice = processSpecialtySandwich(scanner, receiptItems);
        { else if (choice == 2) {
            totalPrice = processCustomSandwich(scanner, receiptItems);
        } else {
            System.out.println("Invalid selection, please try again.");
        }
        }

        //Special request handling:
        handleSpecialRequests(scanner, totalPrice);

        //Coupon handling:
        totalPrice = applyCoupon(scanner, totalPrice);

        //Dining options handling:
        handleDiningOptions(scanner);

        // random order number on receipt
        Random random = new Random();
        int orderNumber = random.nextInt(100) + 1;

        //collect payment
        String[] paymentOptions = {"cash, gift card, debit/credit card "};

        //print receipt
        printReceipt(receiptItems, totalPrice, orderNumber);
        scanner.close();

        //if cancelled it directs you to the home screen //help: how?

        System.out.println("Welcome to Soldier's Pyre Tavern and Deli. What can I do you for, soldier?");
        System.out.println("Would you like a Specialty Sandwich or would you like to make one of your own?");
        System.out.println("1. Specialty Sandwich");
        System.out.println("2. Build My Own Sandwich");
        System.out.println("Enter the number corresponding to your choice here: ");
        return scanner.nextInt();

        private static double processSpecialtySandwich (Scanner scanner, ArrayList < String > receiptItems){
            System.out.println("Our specialty sandwiches are as follows: ");
            for (int i = 0; i < specialtySandwiches.length,i++){
                System.out.println("5d. %s ($%.2f) \n, i + 1, specialtySandwiches[i], specialtyPrices[i]); }
                        System.out.println("\n Enter your choice below: -1" + specialtySandwiches.length + ") ");
                int choice = scanner.nextInt();

                if (choice < 1 || choice > specialtySandwiches.length) {
                    System.out.println("Invalid choice. Please try again.");
                    return 0.0;
                }

                //Now to add the sandwich to the receipt:
                receiptItems.add(specialtyPrices[choice - 1] + "-$" + specialtyPrices[choice - 1]);
                double totalPrice = specialtyPrices[choice - 1];

                //Chips and drinks as add-ons if requested:
                totalPrice += processAddOnes(scanner, receiptItems);

                return totalPrice;
            }

            //Building a custom sandwich
            private static double processCustomSandwich (Scanner scanner, ArrayList < String > receiptItems){
                double totalPrice = 0.0;

                //Now to transfer it from the array to the menu:
                System.out.println("Our custom options for sandwiches are as follows: ");
                totalPrice += chooseItem("Bread: ", breadOptions, breadPrices, scanner, receiptItems);
                totalPrice += chooseItem("Size: ", sizeOptions);
                totalPrice += chooseItem("Meat? ", meatOptions, meatPrices, scanner, receiptItems);
                totalPrice += chooseItem("Extra Meat?: ", extraMeatOptionsLabel, extraMeatPrices, scanner, receiptItems);
                totalPrice += chooseItem("Cheese? ", cheeseOptions, cheesePrices, scanner, receiptItems);
                totalPrice += chooseItem("Extra Cheese? ", extraCheeseOptionsLabel, extraCheesePrices, scanner, receiptItems);
                totalPrice += chooseItem("Other Toppings? ", toppingOptions, toppingPrices, scanner, receiptItems);
                totalPrice += chooseItem("Sauces? ", condimentOptions, condimentPrices, scanner, receiptItems);
                totalPrice += chooseItem("Size: ", addExtraSandwich);

                totalPrice += processAddOns("Chips ", chipsOptions, chipsPrices);
                totalPrice += processAddOns("Drink ", drinksOptions, drinksPrices);

                return totalPrice;
            }

            //Generic method for selecting an item from the list:
            private static double chooseItem (String category, String[]options,double[] prices, Scanner
            scanner, ArrayList < String > receiptItems){
                System.out.println("\n Choose your " + category + ":");
                for (int i = 0; i < options.length; i++) {
                    System.out.println("%d. %s ($%.2f) \n", i + 1, options[i], prices[i]);
                }

                System.out.print("Enter your choice 1-" + options.length + "): ");
                int choice = scanner.nextInt();
                //Ew I hate writing functions. That hurt my brain to read, and hurt it even more to type.

                if (choice < 1 || choice > options.length) {
                    System.out.println("Invalid choice. Please try again.");
                    return 0.0;
                }

                //Add the items to the receipt now
                double price = prices[choices - 1];
                receiptItems.add(options[choice - 1] + " - $" + price);
                return price;

                //Process chips and drink add-ons now
                private static double processAddOns (Scanner scanner, ArrayList < String > receiptItems){
                    double totalPrice = 0.0;

                    //Chip selection:
                    System.out.println("\n Would you like chips with your order?");
                    System.out.println("1. Original Flavor");
                    System.out.println("2. Barbecue");
                    System.out.println("3. Sour Cream and Onion");
                    System.out.println("4. Flamin' Hot");
                    System.out.println("5. None");

                    //drink sizes: small, medium, large, none
                    //drinks: cola, root beer, lemon lime, orange, grape, diet cola, water, none
                    System.out.println("Would you like a drink?");
                    System.out.println("What size would you like?");
                    System.out.println("1. Small");
                    System.out.println("2. Medium");
                    System.out.println("3. Large");
                    System.out.println("Enter the number that corresponds with your choice: ");
                    int chipsChoice ==scanner.nextInt();

                    System.out.println("What drink would you like?");
                    System.out.println("Cola");
                    System.out.println("Root Beer");
                    System.out.println("Lemon Lime");
                    System.out.println("Orange");
                    System.out.println("Grape");
                    System.out.println("Diet Cola");
                    System.out.println("Water");
                    System.out.println("None");
                    int drinksChoice ==scanner.nextInt();
                }
            }
        }
    }
}
