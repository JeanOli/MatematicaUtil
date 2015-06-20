package br.com.jean.matematicautil.utils;

import br.com.jean.matematicautil.controllers.MatematicaController;
import static org.junit.Assert.assertEquals;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.ui.Model;

public class MatematicaControllerTest {
    private MatematicaController controller;
    
    @Mock
    private Model model;
    
    @Before
    public void setUp() {
        MockitoAnnotations.initMocks(this);
        controller = new MatematicaController();
    }
    
    @Test
    public void testarSeQuandoPedirAPaginaIndexRetorneIndex() {
        String retorno = controller.paginaIndex();
        String esperado = "index";
        
        assertEquals(esperado, retorno);
    }
    
    @Test
    public void testarPaginaDeMMC() {
        String retorno = controller.paginaMMC(model);
        String esperado = "mmc_mdc_produto";
        
        assertEquals(esperado, retorno);
    }
    
    @Test
    public void testarPaginaDeMDC() {
        String retorno = controller.paginaMDC(model);
        String esperado = "mmc_mdc_produto";
        
        assertEquals(esperado, retorno);
    }
    
    @Test
    public void testarPaginaProduto() {
        String retorno = controller.paginaProduto(model);
        String esperado = "mmc_mdc_produto";
        
        assertEquals(esperado, retorno);
    }
    
    @Test
    public void testarPaginaRaioCirculo() {
        String retorno = controller.raioCirculo();
        String esperado = "raio_circulo";
        
        assertEquals(esperado, retorno);
    }
    
    @Test
    public void testarPaginaPotencia() {
        String retorno = controller.paginaPotencia();
        String esperado = "potencia";
        
        assertEquals(esperado, retorno);
    }
    
    @Test
    public void testarPaginaVerificarCasasDecimais() {
        String retorno = controller.paginaVerificarCasasDecimais();
        String esperado = "verificar-casas-decimais";
        
        assertEquals(esperado, retorno);
    }
    
    @Test
    public void testarPaginaVerificarQtdNumerosPares() {
        String retorno = controller.paginaVerificarQtdNumerosPares();
        String esperado = "verificar-numeros-pares";
        
        assertEquals(esperado, retorno);
    }
    
    @Test
    public void testarPaginaVerificarSeEhPar() {
        String retorno = controller.paginaVerificarSeEhPar();
        String esperado = "verificar-se-par";
        
        assertEquals(esperado, retorno);
    }
    
    @Test
    public void testarPaginaVerificarSeExisteNumerosIguais() {
        String retorno = controller.paginaVerificarSeExisteNumerosIguais();
        String esperado = "verificar-numeros-iguais";
        
        assertEquals(esperado, retorno);
    }
    
    @Test
    public void testarPaginaSeExisteNumerosIguais() {
        String retorno = controller.paginaVerificarSeExisteNumerosIguais();
        String esperado = "verificar-numeros-iguais";
        
        assertEquals(esperado, retorno);
    }
    
    @Test
    public void testarPaginaVerificarSeEhMaiorQueOutro() {
        String retorno = controller.paginaVerificarSeEhMaiorQueOutro();
        String esperado = "verificar-numero-maior";
        
        assertEquals(esperado, retorno);
    }
    
    @Test
    public void testarCalcularMMC() {
        String retorno = controller.calcularMMC(10, 2, model);
        String esperado = "mmc_mdc_produto";
        
        assertEquals(esperado, retorno);
    }
    
    @Test
    public void testarCalcularMDC() {
        String retorno = controller.calcularMDC(10, 2, model);
        String esperado = "mmc_mdc_produto";
        
        assertEquals(esperado, retorno);
    }
    
    @Test
    public void testarCalcularProduto() {
        String retorno = controller.calcularProduto(10, 2, model);
        String esperado = "mmc_mdc_produto";
        
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
        String esperado = "verificar-casas-decimais";
        
        assertEquals(esperado, retorno);
    }
    
    @Test
    public void testarVerificarSeNumeralEhPar() {
        String retorno = controller.verificarSeNumeralEhPar(2, model);
        String esperado = "verificar-se-par";
        
        assertEquals(esperado, retorno);
    }
    
    @Test
    public void testarVerificarQuantosNumerosParesTemNaString() {
        String retorno = controller.verificarQuantosNumerosParesTemNaString( "245786", model);
        String esperado = "verificar-numeros-pares";
        
        assertEquals(esperado, retorno);
    }
    
    @Test
    public void testarVerificarSeExistemNumerosIguais() {
        String retorno = controller.verificarSeExistemNumerosIguais( "1233", model);
        String esperado = "verificar-numeros-iguais";
        
        assertEquals(esperado, retorno);
    }
    
    @Test
    public void testarVerificarSeEhMaiorQueOutro() {
        String retorno = controller.verificarSeEhMaiorQueOutro( 20, 2, model);
        String esperado = "verificar-numero-maior";
        
        assertEquals(esperado, retorno);
    }
}
