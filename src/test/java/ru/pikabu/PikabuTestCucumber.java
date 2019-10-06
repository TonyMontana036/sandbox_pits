package ru.pikabu;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources",
        glue = "ru/pikabu",
        tags = "1"
)
public class PikabuTestCucumber {

}