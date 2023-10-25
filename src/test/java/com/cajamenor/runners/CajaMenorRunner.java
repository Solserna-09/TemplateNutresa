package com.cajamenor.runners;



import com.cajamenor.utils.BeforeSuite;
import com.cajamenor.utils.DataToFeature;
import io.cucumber.junit.CucumberOptions;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.junit.runner.RunWith;

import java.io.IOException;



@CucumberOptions (features = "src/test/resources/features/cajaMenor.feature",
        tags= "@CajaMenor",
        glue = "com.cajamenor.stepsDefinitions",
        snippets = CucumberOptions.SnippetType.CAMELCASE)
@RunWith(RunnerPersonalizado.class)
public class CajaMenorRunner {
    @BeforeSuite
    public static void test() throws InvalidFormatException, IOException {
        DataToFeature.overrideFeatureFiles("./src/test/resources/features/cajaMenor.feature");
    }
}
