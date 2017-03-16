package br.com.sinergiavirtual.sc.api.resource.stepDefs;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

import java.util.List;
import java.util.Map;

import br.com.sinergiavirtual.sc.api.resource.BaseStepDefs;
import br.com.sinergiavirtual.sc.api.resource.EndPointURL;
import br.com.sinergiavirtual.sc.api.resource.StepDefinitionContext;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class ProductStepDefs extends BaseStepDefs {

    @Autowired
    private StepDefinitionContext stepDefinitionContext;

    @Before
    public void setup() {
        commonSetup();
    }

    @Given("^I'm a seller and I have the (\\d+)$")
    public void i_m_a_seller_and_I_have_the(int userId) throws Throwable {

    }

    @When("^I search products to sell$")
    public void i_search_products_to_sell() throws Throwable {

        // Request
        executeRequest(MockMvcRequestBuilders.get(EndPointURL.URL_PRODUCTS));

    }

    @Then("^The returned status is (\\d+)$")
    public void the_returned_status_is(int status) throws Throwable {
        stepDefinitionContext.getResultActions().andExpect(MockMvcResultMatchers.status().is(status));
    }

    @Then("^The products are$")
    public void the_products_are(List<List<String>> mapList) throws Throwable {

        mapList.size();
    }
}