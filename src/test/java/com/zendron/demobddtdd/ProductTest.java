package com.zendron.demobddtdd;

import com.zendron.demobddtdd.model.Product;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;

import static org.springframework.test.util.AssertionErrors.assertEquals;

public class ProductTest {

    Product p;

    @When("^the price is above than 50.00")
    public void verify_price_above() throws Throwable{
        p = new Product(1, "teste", 51.00);

    }

    @Then("^apply the discount")
    public void apply_the_discount() throws Throwable {
        CurrencyRules cr = new CurrencyRules();
        cr.setDiscount(0.20);
        p.setPrice(cr.applyDiscount(p.getPrice()));
        assertEquals("40.8", p.getPrice(), 40.8);
    }



    @When("^the users try to save a product with only 3 characters")
    public void users_try_to_write_tree_caracters_name() {
        p = new Product(1, "tes", 51.00);
    }

    @Then("^we have to show an error message")
    public void have_to_show_an_error_message() {
        if (p.getName().length() < 4) {
            assert(true);
        } else {
            assert(false);
        }
    }


}
