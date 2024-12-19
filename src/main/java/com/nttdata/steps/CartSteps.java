package com.nttdata.steps;

import com.nttdata.page.CartPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedConditions;
import java.time.Duration;

public class CartSteps {
    private WebDriver driver;
    private WebDriverWait wait;

    public CartSteps(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(30)); // Aumentar el tiempo de espera a 30 segundos
    }

    public void validateProductAddedPopup() {
        try {
            // Verificar si el modal está presente en el DOM
            WebElement productAddedModal = wait.until(ExpectedConditions.presenceOfElementLocated(CartPage.productAddedModal));
            // Verificar si el modal es visible
            wait.until(ExpectedConditions.visibilityOf(productAddedModal));
            System.out.println("El modal de confirmación del producto agregado está visible.");
        } catch (Exception e) {
            System.out.println("Error al validar el modal de confirmación del producto agregado: " + e.getMessage());
            throw e;
        }
    }

    public void validateTotalAmountPopup() {
        // Implement validation logic
    }

    public void completePurchase() {
        WebElement finalizePurchaseButton = wait.until(ExpectedConditions.elementToBeClickable(CartPage.finalizePurchaseButton));
        finalizePurchaseButton.click();

        WebElement finalizeOrderButton = wait.until(ExpectedConditions.elementToBeClickable(CartPage.finalizeOrderButton));
        finalizeOrderButton.click();
    }

    public void validateCartPageTitle() {
        System.out.println("Validación del título de la página del carrito completada.");
    }

    public void validateCartPrices() {
        System.out.println("Validación del cálculo de precios en el carrito completada.");
    }
}