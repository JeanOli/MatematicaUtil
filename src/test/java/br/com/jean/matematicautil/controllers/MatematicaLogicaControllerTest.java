package br.com.jean.matematicautil.controllers;

import static org.junit.Assert.assertEquals;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.ui.Model;

public class MatematicaLogicaControllerTest {
    private MatematicaLogiaController controller;
    
    @Mock
    private Model model;
    
    @Before
    public void setUp() {
        MockitoAnnotations.initMocks(this);
        controller = new MatematicaLogiaController();
    }
    
    @Test
    public void testarCalcularMMC() {
        String retorno = controller.calcularMMC(10, 2, model);
        String esperado = "mmc";
        
        assertEquals(esperado, retorno);
    }
    
    @Test
    public void testarCalcularMDC() {
        String retorno = controller.calcularMDC(10, 2, model);
        String esperado = "mdc";
        
        assertEquals(esperado, retorno);
    }
    
    @Test
    public void testarCalcularProduto() {
        String retorno = controller.calcularProduto(10, 2, model);
        String esperado = "produto";
        
        assertEquals(esperado, retorno);
    }
    
    @Test
    public void testarCalcularAreaCirculo() {
        String retorno = controller.calcularAreaCirculo(10.0, model);
        String esperado = "raio_circulo";
        
        assertEquals(esperado, retorno);
    }
    
    @Test
    public void testarCalcularPotencia() {
        String retorno = controller.calcularPotencia(10, 2, model);
        String esperado = "potencia";
        
        assertEquals(esperado, retorno);
    }
    
    @Test
    public void testarVerificarSeTemCasasDecimais() {
        String retorno = controller.verificarSeTemCasasDecimais(10.0, model);
        String esperado = "verificar_casas_decimais";
        
        assertEquals(esperado, retorno);
    }
    
    @Test
    public void testarVerificarSeNumeralEhPar() {
        String retorno = controller.verificarSeNumeralEhPar(2, model);
        String esperado = "verificar_se_par";
        
        assertEquals(esperado, retorno);
    }
    
    @Test
    public void testarVerificarQuantosNumerosParesTemNaString() {
        String retorno = controller.verificarQtdNumerosParesTemNaString( "245786", model);
        String esperado = "verificar_numeros_pares";
        
        assertEquals(esperado, retorno);
    }
    
    @Test
    public void testarVerificarSeExistemNumerosIguais() {
        String retorno = controller.verificarSeExistemNumerosIguais( "1233", model);
        String esperado = "verificar_numeros_iguais";
        
        assertEquals(esperado, retorno);
    }
    
    /*@Test
    public void testarVerificarSeEhMaiorQueOutro() {
        String retorno = controller.verificarSeEhMaiorQueOutro( 20, 2, model);
        String esperado = "verificar_numero_maior";
        
        assertEquals(esperado, retorno);
    }*/
}
