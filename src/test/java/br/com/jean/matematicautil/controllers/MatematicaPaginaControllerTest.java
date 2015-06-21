package br.com.jean.matematicautil.controllers;

import static org.junit.Assert.assertEquals;
import org.junit.Before;
import org.junit.Test;
import org.mockito.MockitoAnnotations;

public class MatematicaPaginaControllerTest {
    private MatematicaPaginaController controller;
    
    @Before
    public void setUp() {
        MockitoAnnotations.initMocks(this);
        controller = new MatematicaPaginaController();
    }
    
    @Test
    public void testarSeQuandoPedirAPaginaIndexRetorneIndex() {
        String retorno = controller.paginaIndex();
        String esperado = "index";
        
        assertEquals(esperado, retorno);
    }
    
    @Test
    public void testarPaginaDeMMC() {
        String retorno = controller.paginaMMC();
        String esperado = "mmc";
        
        assertEquals(esperado, retorno);
    }
    
    @Test
    public void testarPaginaDeMDC() {
        String retorno = controller.paginaMDC();
        String esperado = "mdc";
        
        assertEquals(esperado, retorno);
    }
    
    @Test
    public void testarPaginaProduto() {
        String retorno = controller.paginaProduto();
        String esperado = "produto";
        
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
        String esperado = "verificar_casas_decimais";
        
        assertEquals(esperado, retorno);
    }
    
    @Test
    public void testarPaginaVerificarQtdNumerosPares() {
        String retorno = controller.paginaVerificarQtdNumerosPares();
        String esperado = "verificar_numeros_pares";
        
        assertEquals(esperado, retorno);
    }
    
    @Test
    public void testarPaginaVerificarSeEhPar() {
        String retorno = controller.paginaVerificarSeEhPar();
        String esperado = "verificar_se_par";
        
        assertEquals(esperado, retorno);
    }
    
    @Test
    public void testarPaginaVerificarSeExisteNumerosIguais() {
        String retorno = controller.paginaVerificarSeExisteNumerosIguais();
        String esperado = "verificar_numeros_iguais";
        
        assertEquals(esperado, retorno);
    }
    
    @Test
    public void testarPaginaSeExisteNumerosIguais() {
        String retorno = controller.paginaVerificarSeExisteNumerosIguais();
        String esperado = "verificar_numeros_iguais";
        
        assertEquals(esperado, retorno);
    }
    
    @Test
    public void testarPaginaVerificarSeEhMaiorQueOutro() {
        String retorno = controller.paginaVerificarSeEhMaiorQueOutro();
        String esperado = "verificar_numero_maior";
        
        assertEquals(esperado, retorno);
    }
}
