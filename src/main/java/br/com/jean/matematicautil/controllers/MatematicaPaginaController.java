package br.com.jean.matematicautil.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MatematicaPaginaController {
    
    @RequestMapping( "/" )
    public String paginaIndex() {
        return "index";
    }
    
    @RequestMapping( "/mmc" )
    public String paginaMMC() {
        return "mmc";
    }
    
    @RequestMapping( "/mdc" )
    public String paginaMDC() {
        return "mdc";
    }
    
    @RequestMapping( "/produto" )
    public String paginaProduto() {
        return "produto";
    }
    
    @RequestMapping( "/raioCirculo" )
    public String raioCirculo() {
        return "raio_circulo";
    }
    
    @RequestMapping( "/potencia" )
    public String paginaPotencia() {
        return "potencia";
    }
    
    @RequestMapping( "/verificarCasasDecimais" )
    public String paginaVerificarCasasDecimais() {
        return "verificar_casas_decimais";
    }
    
    @RequestMapping( "/verificarSeEhPar" )
    public String paginaVerificarSeEhPar() {
        return "verificar_se_par";
    }
    
    @RequestMapping( "/verificarQtdNumerosPares" )
    public String paginaVerificarQtdNumerosPares() {
        return "verificar_numeros_pares";
    }
    
    @RequestMapping( "/verificarSeExisteNumerosIguais" )
    public String paginaVerificarSeExisteNumerosIguais() {
        return "verificar_numeros_iguais";
    }
    
    @RequestMapping( "/verificarSeEhMaiorQueOutro" )
    public String paginaVerificarSeEhMaiorQueOutro() {
        return "verificar_numero_maior";
    }
}