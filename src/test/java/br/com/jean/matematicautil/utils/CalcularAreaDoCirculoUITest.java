package br.com.jean.matematicautil.utils;

import static org.junit.Assert.assertEquals;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;

public class CalcularAreaDoCirculoUITest {
    private HtmlUnitDriver driver;
    
    @Before
    public void setUp() {
        driver = new HtmlUnitDriver();
    }
    
    @Test
    public void testarSeORaioDe10Sera314() {
        driver.get( "http://localhost:8080/raioCirculo" );
        driver.findElement(By.name("raioCirculo")).sendKeys( "10" );
        driver.findElement(By.name("calcular")).click();
        String retorno = driver.findElement(By.id("resultado")).getText();
        String esperado = "Resultado: 314.1592653589793";
        
        assertEquals( esperado, retorno );
    }
}
