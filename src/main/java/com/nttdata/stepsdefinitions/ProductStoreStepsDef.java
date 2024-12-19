package com.nttdata.stepsdefinitions;

import com.nttdata.steps.LoginSteps;
import com.nttdata.steps.CategorySteps;
import com.nttdata.steps.CartSteps;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.And;
import org.openqa.selenium.WebDriver;

import static com.nttdata.core.DriverManager.getDriver;

public class ProductStoreStepsDef {
    private WebDriver driver = getDriver();
    private LoginSteps loginSteps = new LoginSteps(driver);
    private CategorySteps categorySteps = new CategorySteps(driver);
    private CartSteps cartSteps = new CartSteps(driver);

    @Given("estoy en la página de la tienda")
    public void estoy_en_la_pagina_de_la_tienda() {
        driver.get("https://qalab.bensg.com/store/pe/iniciar-sesion");
    }
    @Given("me logueo con mi usuario {string} y clave {string}")
    public void me_logueo_con_mi_usuario_y_clave(String user, String password) {
        loginSteps.login(user, password);
    }

    @When("navego a la categoria {string} y subcategoria {string}")
    public void navego_a_la_categoria_y_subcategoria(String category, String subcategory) {
        categorySteps.navigateToCategory(category, subcategory);
    }

    @When("agrego {int} unidades del primer producto al carrito")
    public void agrego_unidades_del_primer_producto_al_carrito(int quantity) {
        categorySteps.addFirstProductToCart(quantity);
    }

    @Then("valido en el popup la confirmación del producto agregado")
    public void valido_en_el_popup_la_confirmacion_del_producto_agregado() {
        cartSteps.validateProductAddedPopup();
    }

    @Then("valido en el popup que el monto total sea calculado correctamente")
    public void valido_en_el_popup_que_el_monto_total_sea_calculado_correctamente() {
        cartSteps.validateTotalAmountPopup();
    }

    @When("finalizo la compra")
    public void finalizo_la_compra() {
        cartSteps.completePurchase();
    }

    @Then("valido el titulo de la pagina del carrito")
    public void valido_el_titulo_de_la_pagina_del_carrito() {
        cartSteps.validateCartPageTitle();
    }

    @Then("vuelvo a validar el calculo de precios en el carrito")
    public void vuelvo_a_validar_el_calculo_de_precios_en_el_carrito() {
        cartSteps.validateCartPrices();
    }
}
