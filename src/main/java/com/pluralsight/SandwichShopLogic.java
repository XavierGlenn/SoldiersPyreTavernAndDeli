package com.pluralsight;


public class SandwichShopLogic {

    private String specialtySandwiches;
    private double specialtyPrices;
    private int sizeOptions;
    private String breadOptions;
    private double sizePrices;
    private String meatOptions;
    private double meatPrices;
    private String extraMeatOptionsLabel;
    private double extraMeatPrices;
    private String cheeseOptions;
    private double cheesePrices;
    private String extraCheeseOptionsLabel;
    private double extraCheesePrices;
    private String toppingsOptions;
    private double toppingPrice;
    private String condimentOptions;
    private double condimentPrices;
    private String sidesOptions;
    private double sidesPrices;
    private String chipsOptions;
    private double chipsPrices;
    private String drinksSizes;
    private String drinksOptions;
    private double drinksPrices;
    private String specialRequests;
    private String applyCoupon;
    private String diningOptions;
    boolean toasted;

    public SandwichShopLogic(double specialtyPrices, String specialtySandwiches, int sizeOptions, String breadOptions, double breadPrices, String meatOptions, double meatPrices, String extraMeatOptionsLabel, String cheeseOptions, double extraMeatPrices, double cheesePrices, String extraCheeseOptionsLabel, double extraCheesePrices, String toppingsOptions, double toppingPrice, String condimentOptions, double condimentPrices, double sidesPrices, String sidesOptions, String chipsOptions, double chipsPrices, String drinksSizes, String drinksOptions, double drinksPrices, String specialRequests, String applyCoupon, String diningOptions, boolean toasted) {
        this.specialtyPrices = specialtyPrices;
        this.specialtySandwiches = specialtySandwiches;
        this.sizeOptions = sizeOptions;
        this.breadOptions = breadOptions;
        this.sizePrices = sizePrices;
        this.meatOptions = meatOptions;
        this.meatPrices = meatPrices;
        this.extraMeatOptionsLabel = extraMeatOptionsLabel;
        this.cheeseOptions = cheeseOptions;
        this.extraMeatPrices = extraMeatPrices;
        this.cheesePrices = cheesePrices;
        this.extraCheeseOptionsLabel = extraCheeseOptionsLabel;
        this.extraCheesePrices = extraCheesePrices;
        this.toppingsOptions = toppingsOptions;
        this.toppingPrice = toppingPrice;
        this.condimentOptions = condimentOptions;
        this.condimentPrices = condimentPrices;
        this.sidesPrices = sidesPrices;
        this.sidesOptions = sidesOptions;
        this.chipsOptions = chipsOptions;
        this.chipsPrices = chipsPrices;
        this.drinksSizes = drinksSizes;
        this.drinksOptions = drinksOptions;
        this.drinksPrices = drinksPrices;
        this.specialRequests = specialRequests;
        this.applyCoupon = applyCoupon;
        this.diningOptions = diningOptions;
        this.toasted = toasted;
    }

    public String getSpecialtySandwiches() {
        return specialtySandwiches;
    }

    public void setSpecialtySandwiches(String specialtySandwiches) {
        this.specialtySandwiches = specialtySandwiches;
    }

    public double getSpecialtyPrices() {
        return specialtyPrices;
    }

    public void setSpecialtyPrices(double specialtyPrices) {
        this.specialtyPrices = specialtyPrices;
    }

    public int getSizeOptions() {
        return sizeOptions;
    }

    public void setSizeOptions(int sizeOptions) {
        this.sizeOptions = sizeOptions;
    }

    public String getBreadOptions() {
        return breadOptions;
    }

    public void setBreadOptions(String breadOptions) {
        this.breadOptions = breadOptions;
    }

    public double getBreadPrices() {
        return sizePrices;
    }

    public void setBreadPrices(double breadPrices) {
        this.sizePrices = breadPrices;
    }

    public String getMeatOptions() {
        return meatOptions;
    }

    public void setMeatOptions(String meatOptions) {
        this.meatOptions = meatOptions;
    }

    public double getMeatPrices() {
        return meatPrices;
    }

    public void setMeatPrices(double meatPrices) {
        this.meatPrices = meatPrices;
    }

    public String getExtraMeatOptionsLabel() {
        return extraMeatOptionsLabel;
    }

    public void setExtraMeatOptionsLabel(String extraMeatOptionsLabel) {
        this.extraMeatOptionsLabel = extraMeatOptionsLabel;
    }

    public String getCheeseOptions() {
        return cheeseOptions;
    }

    public void setCheeseOptions(String cheeseOptions) {
        this.cheeseOptions = cheeseOptions;
    }

    public double getExtraMeatPrices() {
        return extraMeatPrices;
    }

    public void setExtraMeatPrices(double extraMeatPrices) {
        this.extraMeatPrices = extraMeatPrices;
    }

    public double getCheesePrices() {
        return cheesePrices;
    }

    public void setCheesePrices(double cheesePrices) {
        this.cheesePrices = cheesePrices;
    }

    public double getExtraCheesePrices() {
        return extraCheesePrices;
    }

    public void setExtraCheesePrices(double extraCheesePrices) {
        this.extraCheesePrices = extraCheesePrices;
    }

    public String getExtraCheeseOptionsLabel() {
        return extraCheeseOptionsLabel;
    }

    public void setExtraCheeseOptionsLabel(String extraCheeseOptionsLabel) {
        this.extraCheeseOptionsLabel = extraCheeseOptionsLabel;
    }

    public String getToppingsOptions() {
        return toppingsOptions;
    }

    public void setToppingsOptions(String toppingsOptions) {
        this.toppingsOptions = toppingsOptions;
    }

    public double getToppingPrice() {
        return toppingPrice;
    }

    public void setToppingPrice(double toppingPrice) {
        this.toppingPrice = toppingPrice;
    }

    public String getCondimentOptions() {
        return condimentOptions;
    }

    public void setCondimentOptions(String condimentOptions) {
        this.condimentOptions = condimentOptions;
    }

    public double getCondimentPrices() {
        return condimentPrices;
    }

    public void setCondimentPrices(double condimentPrices) {
        this.condimentPrices = condimentPrices;
    }

    public String getSidesOptions() {
        return sidesOptions;
    }

    public void setSidesOptions(String sidesOptions) {
        this.sidesOptions = sidesOptions;
    }

    public double getSidesPrices() {
        return sidesPrices;
    }

    public void setSidesPrices(double sidesPrices) {
        this.sidesPrices = sidesPrices;
    }

    public String getChipsOptions() {
        return chipsOptions;
    }

    public void setChipsOptions(String chipsOptions) {
        this.chipsOptions = chipsOptions;
    }

    public double getChipsPrices() {
        return chipsPrices;
    }

    public void setChipsPrices(double chipsPrices) {
        this.chipsPrices = chipsPrices;
    }

    public String getDrinksSizes() {
        return drinksSizes;
    }

    public void setDrinksSizes(String drinksSizes) {
        this.drinksSizes = drinksSizes;
    }

    public String getDrinksOptions() {
        return drinksOptions;
    }

    public void setDrinksOptions(String drinksOptions) {
        this.drinksOptions = drinksOptions;
    }

    public double getDrinksPrices() {
        return drinksPrices;
    }

    public void setDrinksPrices(double drinksPrices) {
        this.drinksPrices = drinksPrices;
    }

    public String getSpecialRequests() {
        return specialRequests;
    }

    public void setSpecialRequests(String specialRequests) {
        this.specialRequests = specialRequests;
    }

    public String getApplyCoupon() {
        return applyCoupon;
    }

    public void setApplyCoupon(String applyCoupon) {
        this.applyCoupon = applyCoupon;
    }

    public String getDiningOptions() {
        return diningOptions;
    }

    public void setDiningOptions(String diningOptions) {
        this.diningOptions = diningOptions;
    }

    public boolean isToasted() {
        return toasted;
    }

    public void setToasted(boolean toasted) {
        this.toasted = toasted;
    }
}