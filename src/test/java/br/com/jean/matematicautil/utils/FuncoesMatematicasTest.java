package br.com.jean.matematicautil.utils;

import static org.junit.Assert.assertEquals;
import org.junit.Test;
import org.junit.Before;

public class FuncoesMatematicasTest {
    private FuncoesMatematicas funcoes;
    
    @Before
    public void setUp() {
        funcoes = new FuncoesMatematicas();
    }

    @Test
    public void testarSeOCalculoDoMMCPassando10Eh2Retornara10() {
        Integer retorno = funcoes.calcularMMC(10, 2);
        Integer esperado = 10;
        
        assertEquals( esperado, retorno );
    }
    
    @Test
    public void testarSeOCalculoDoMDCPassando10Eh2Retornara2() {
        Integer retorno = funcoes.calcularMDC(10, 2);
        Integer esperado = 2;
        
        assertEquals( esperado, retorno );
    }
    
    @Test
    public void testarSeOCalculoDaAreaDoCirculoPassando10Retornara314() {
        Double retorno = funcoes.calcularAreaCirculo( 10.0 );
        Double esperado = 314.1592653589793;
        
        assertEquals( esperado, retorno );
    }
    
    @Test
    public void testarSeOCalculoDoProdutoPassando10Eh2Retornara20() {
        Integer retorno = funcoes.calcularProduto( 10, 2 );
        Integer esperado = 20;
        
        assertEquals( esperado, retorno );
    }
    
    @Test
    public void testarSeOCalculoDaPotenciaDeUmNumeroPassando10Eh2Retornara100() {
        Integer retorno = funcoes.calcularPotencia( 10, 2 );
        Integer esperado = 100;
        
        assertEquals( esperado, retorno );
    }
    
    @Test
    public void testarSeOCalculoDaSomaPassando10Eh2Retornara12() {
        Integer retorno = funcoes.calcularSoma( 10, 2 );
        Integer esperado = 12;
        
        assertEquals( esperado, retorno );
    }
    
    @Test
    public void testarSeOCalculoDaDivisaoPassando10Eh2Retornara5() {
        Integer retorno = funcoes.calcularDivisao( 10, 2 );
        Integer esperado = 5;
        
        assertEquals( esperado, retorno );
    }
    
    @Test
    public void testarSeOCalculoDaSubtracaoPassando10Eh2Retornara8() {
        Integer retorno = funcoes.calcularSubtracao( 10, 2 );
        Integer esperado = 8;
        
        assertEquals( esperado, retorno );
    }
}
