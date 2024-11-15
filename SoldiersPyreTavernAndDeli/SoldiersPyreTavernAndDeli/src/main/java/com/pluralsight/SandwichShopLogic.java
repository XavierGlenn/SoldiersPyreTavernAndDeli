package com.pluralsight;

public class SandwichShopLogic {

    private int sizeOptions = 0;
    private String breadOptions = "";
    private double sizePrices = 0.00;
    private String meatOptions = "";
    private double meatPrices = 0.00;
    private String extraMeatOptionsLabel = "";
    private double extraMeatPrices = 0.00;
    private String cheeseOptions = "";
    private double cheesePrices = 0.00;
    private String extraCheeseOptionsLabel = "";
    private double extraCheesePrices = 0.00;
    private String toppingChoices = "";
    private double toppingPrice = 0.00;
    private String condimentOptions = "";
    private double condimentPrices = 0.00;
    private String sidesOptions = "";
    private double sidesPrices = 0.00;
    private String chipsOptions = "";
    private double chipsPrices = 0.00;
    private String drinksSizes = "";
    private String drinksOptions = "";
    private double drinksPrices = 0.00;
    boolean toasted = false;

    public int getSizeOptions() {
        return sizeOptions; }

    public void setSizeOptions(int sizeOptions) {
        this.sizeOptions = sizeOptions; }

    public boolean isToasted() {
        return toasted; }

    public void setToasted(boolean toasted) {
        this.toasted = toasted; }

    public double getDrinksPrices() {
        return drinksPrices; }

    public void setDrinksPrices(double drinksPrices) {
        this.drinksPrices = drinksPrices; }

    public String getDrinksOptions() {
        return drinksOptions; }

    public void setDrinksOptions(String drinksOptions) {
        this.drinksOptions = drinksOptions; }

    public String getDrinksSizes() {
        return drinksSizes; }

    public void setDrinksSizes(String drinksSizes) {
        this.drinksSizes = drinksSizes; }

    public String getChipsOptions() {
        return chipsOptions; }

    public void setChipsOptions(String chipsOptions) {
        this.chipsOptions = chipsOptions; }

    public double getChipsPrices() {
        return chipsPrices; }

    public void setChipsPrices(double chipsPrices) {
        this.chipsPrices = chipsPrices; }

    public double getSidesPrices() {
        return sidesPrices; }

    public void setSidesPrices(double sidesPrices) {
        this.sidesPrices = sidesPrices; }

    public String getSidesOptions() {
        return sidesOptions; }

    public void setSidesOptions(String sidesOptions) {
        this.sidesOptions = sidesOptions; }

    public double getCondimentPrices() {
        return condimentPrices; }

    public void setCondimentPrices(double condimentPrices) {
        this.condimentPrices = condimentPrices; }

    public String getCondimentOptions() {
        return condimentOptions; }

    public void setCondimentOptions(String condimentOptions) {
        this.condimentOptions = condimentOptions; }

    public double getToppingPrice() {
        return toppingPrice; }

    public void setToppingPrice(double toppingPrice) {
        this.toppingPrice = toppingPrice; }

    public String getToppingChoices() {
        return toppingChoices; }

    public void setToppingChoices(String toppingChoices) {
        this.toppingChoices = toppingChoices; }

    public double getExtraCheesePrices() {
        return extraCheesePrices; }

    public void setExtraCheesePrices(double extraCheesePrices) {
        this.extraCheesePrices = extraCheesePrices; }

    public String getExtraCheeseOptionsLabel() {
        return extraCheeseOptionsLabel; }

    public void setExtraCheeseOptionsLabel(String extraCheeseOptionsLabel) {
        this.extraCheeseOptionsLabel = extraCheeseOptionsLabel; }

    public double getCheesePrices() {
        return cheesePrices; }

    public void setCheesePrices(double cheesePrices) {
        this.cheesePrices = cheesePrices; }

    public String getCheeseOptions() {
        return cheeseOptions; }

    public void setCheeseOptions(String cheeseOptions) {
        this.cheeseOptions = cheeseOptions; }

    public double getExtraMeatPrices() {
        return extraMeatPrices; }

    public void setExtraMeatPrices(double extraMeatPrices) {
        this.extraMeatPrices = extraMeatPrices; }

    public String getExtraMeatOptionsLabel() {
        return extraMeatOptionsLabel; }

    public void setExtraMeatOptionsLabel(String extraMeatOptionsLabel) {
        this.extraMeatOptionsLabel = extraMeatOptionsLabel; }

    public double getMeatPrices() {
        return meatPrices; }

    public void setMeatPrices(double meatPrices) {
        this.meatPrices = meatPrices; }

    public String getMeatOptions() {
        return meatOptions; }

    public void setMeatOptions(String meatOptions) {
        this.meatOptions = meatOptions; }

    public double getSizePrices() {
        return sizePrices; }

    public void setSizePrices(double sizePrices) {
        this.sizePrices = sizePrices; }

    public String getBreadOptions() {
        return breadOptions; }

    public void setBreadOptions(String breadOptions) {
        this.breadOptions = breadOptions;
    }
}
