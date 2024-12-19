package com.nttdata.page;

import org.openqa.selenium.By;

public class CategoryPage {
    public static By clothesCategory = By.cssSelector("#category-3 > a");
    public static By menSubcategory = By.cssSelector("#category-4 > a");
    public static By firstProduct = By.cssSelector("img[alt='Hummingbird printed t-shirt']");
    public static By quantityInput = By.id("quantity_wanted");
    public static By addToCartButton = By.cssSelector("button.btn.btn-primary.add-to-cart");

    public static By getCategoryLocator(String category) {
        return By.linkText(category);
    }

    public static By getSubcategoryLocator(String subcategory) {
        return By.linkText(subcategory);
    }
}