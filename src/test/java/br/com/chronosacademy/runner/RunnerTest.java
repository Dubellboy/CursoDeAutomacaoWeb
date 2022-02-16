package br.com.chronosacademy.runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/features/",
        tags = "",
        glue = "br.com.chronosacademy.steps",//Localização Classe de testes
        plugin = {"json:target/reports/CucumberReports.json","pretty" },
        snippets = CucumberOptions.SnippetType.CAMELCASE

)
public class RunnerTest {


}
