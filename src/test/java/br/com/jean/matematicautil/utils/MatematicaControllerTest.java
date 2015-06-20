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
}
