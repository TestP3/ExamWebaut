package com.nttdata.steps;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedConditions;
import java.time.Duration;
import com.nttdata.page.CategoryPage;

public class CategorySteps {
    private final WebDriverWait wait;
    private WebDriver driver;

    public CategorySteps(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }

    public void navigateToCategory(String category, String subcategory) {
        try {
            // Espera explícita para asegurarse de que el elemento esté presente
            WebElement categoryElement = wait.until(ExpectedConditions.visibilityOfElementLocated(CategoryPage.clothesCategory));
            categoryElement.click();

            WebElement subcategoryElement = wait.until(ExpectedConditions.visibilityOfElementLocated(CategoryPage.menSubcategory));
            subcategoryElement.click();
        } catch (Exception e) {
            System.out.println("Error al navegar a la categoría: " + e.getMessage());
            throw e;
        }
    }

    public void addFirstProductToCart(int quantity) {
        try {
            // Espera explícita para asegurarse de que el elemento esté presente
            WebElement productElement = wait.until(ExpectedConditions.visibilityOfElementLocated(CategoryPage.firstProduct));
            productElement.click();

            WebElement quantityInput = wait.until(ExpectedConditions.visibilityOfElementLocated(CategoryPage.quantityInput));
            quantityInput.clear();
            quantityInput.sendKeys(String.valueOf(quantity));

            WebElement addToCartButton = wait.until(ExpectedConditions.elementToBeClickable(CategoryPage.addToCartButton));
            addToCartButton.click();
        } catch (Exception e) {
            System.out.println("Error al agregar el producto al carrito: " + e.getMessage());
            throw e;
        }
    }
}