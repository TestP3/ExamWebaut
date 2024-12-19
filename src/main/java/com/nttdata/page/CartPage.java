package com.nttdata.page;

import org.openqa.selenium.By;

public class CartPage {
    public static By productAddedModal = By.cssSelector("#blockcart-modal .modal-content");
    public static By finalizePurchaseButton = By.cssSelector("div.cart-content-btn a.btn.btn-primary[href*='carrito?action=show']");
    public static By finalizeOrderButton = By.cssSelector("div.text-sm-center a.btn.btn-primary[href*='pedido']");
}