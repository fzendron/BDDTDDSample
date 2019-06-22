package com.zendron.demobddtdd;

import com.zendron.demobddtdd.model.Product;
import cucumber.api.CucumberOptions;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/java/com/zendron/demobddtdd/features")
public class CucumberBDDTest {

}
