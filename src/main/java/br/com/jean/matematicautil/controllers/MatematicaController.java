package br.com.jean.matematicautil.controllers;

import br.com.jean.matematicautil.utils.FuncoesMatematicas;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MatematicaController {
    private final FuncoesMatematicas funcoesMatematicas; 
    
    private final String PAGINA_MMC_MDC_PRODUTO = "mmc_mdc_produto";
    private final String PAGINA_RAIO_CIRCULO = "raio_circulo";
    private final String PAGINA_POTENCIA = "potencia";

    public MatematicaController() {
        this.funcoesMatematicas = new FuncoesMatematicas();
    }
    
    @RequestMapping( "/" )
    public String paginaIndex() {
        return "index";
    }
    
    @RequestMapping( "/mmc" )
    public String paginaMMC(Model model) {
        model.addAttribute("formAction", "calcularMMC");
        model.addAttribute("tituloPagina", "Cálculo do Mínimo Multiplo Comun");
        return PAGINA_MMC_MDC_PRODUTO;
    }
    
    @RequestMapping( "/mdc" )
    public String paginaMDC(Model model) {
        model.addAttribute("formAction", "calcularMDC");
        model.addAttribute("tituloPagina", "Cálculo do Mínimo Divisor Comun");
        return PAGINA_MMC_MDC_PRODUTO;
    }
    
    @RequestMapping( "/produto" )
    public String paginaProduto(Model model) {
        model.addAttribute("formAction", "calcularProduto");
        model.addAttribute("tituloPagina", "Cálculo do Produto");
        return PAGINA_MMC_MDC_PRODUTO;
    }
    
    @RequestMapping( "/raioCirculo" )
    public String raioCirculo() {
        return PAGINA_RAIO_CIRCULO;
    }
    
    @RequestMapping( "/potencia" )
    public String paginaPotencia() {
        return PAGINA_POTENCIA;
    }
    
    @RequestMapping( "/verificarCasasDecimais" )
    public String paginaVerificarCasasDecimais() {
        return "verificar-casas-decimais";
    }
    
    @RequestMapping( "/verificarSeEhPar" )
    public String paginaVerificarSeEhPar() {
        return "verificar-se-par";
    }
    
    @RequestMapping( "/verificarQtdNumerosPares" )
    public String paginaVerificarQtdNumerosPares() {
        return "verificar-numeros-pares";
    }
    
    @RequestMapping( "/verificarSeExisteNumerosIguais" )
    public String paginaVerificarSeExisteNumerosIguais() {
        return "verificar-numeros-iguais";
    }
    
    @RequestMapping( "/verificarSeEhMaiorQueOutro" )
    public String paginaVerificarSeEhMaiorQueOutro() {
        return "verificar-numero-maior";
    }
    
    @RequestMapping( value = "/calcularMMC", method = RequestMethod.POST)
    public String calcularMMC(@RequestParam(
            value="numero1", required=true) Integer numero1,
            @RequestParam(
            value="numero2", required=true) Integer numero2, Model model) {
        
        Integer resultado = funcoesMatematicas.calcularMMC(numero1, numero2);
        
        model.addAttribute("resultado", resultado);
        
        return PAGINA_MMC_MDC_PRODUTO;
    }

    @RequestMapping( value = "/calcularMDC", method = RequestMethod.POST)
    public String calcularMDC(@RequestParam(
            value="numero1", required=true) Integer numero1,
            @RequestParam(
            value="numero2", required=true) Integer numero2, Model model) {
        
        Integer resultado = funcoesMatematicas.calcularMDC(numero1, numero2);
        
        model.addAttribute("resultado", resultado);
        
        return PAGINA_MMC_MDC_PRODUTO;
    }
    
    @RequestMapping( value = "/calcularProduto", method = RequestMethod.POST)
    public String calcularProduto(@RequestParam(
            value="numero1", required=true) Integer numero1,
            @RequestParam(
            value="numero2", required=true) Integer numero2, Model model) {
        
        Integer resultado = funcoesMatematicas.calcularProduto( numero1, numero2);
        
        model.addAttribute("resultado", resultado);
        
        return PAGINA_MMC_MDC_PRODUTO;
    }
    
    @RequestMapping( value = "/calcularAreaCirculo", method = RequestMethod.POST)
    public String calcularAreaCirculo(@RequestParam(
            value="raioCirculo", required=true) Double raioCirculo, Model model) {
        
        Double resultado = funcoesMatematicas.calcularAreaCirculo( raioCirculo );
        
        model.addAttribute("resultado", resultado);
        
        return PAGINA_RAIO_CIRCULO;
    }
    
    @RequestMapping( value = "/calcularPotencia", method = RequestMethod.POST)
    public String calcularPotencia(@RequestParam(
            value="base", required=true) Integer base,
            @RequestParam(
            value="potencia", required=true) Integer potencia, Model model) {
        
        Integer resultado = funcoesMatematicas.calcularPotencia( base, potencia );
        
        model.addAttribute("resultado", resultado);
        
        return PAGINA_POTENCIA;
    }
    
    @RequestMapping( value = "/verificarSeTemCasasDecimais", method = RequestMethod.POST)
    public String verificarSeTemCasasDecimais(@RequestParam(
            value="numero", required=true) Double numero, Model model) {
        
        String resultado = "";
        if( funcoesMatematicas.numeralTemCasasDecimais(numero) )
            resultado = "Tem decimal";
        else
            resultado = "Não tem decimal";
        
        model.addAttribute("resultado", resultado);
        
        return "verificar-casas-decimais";
    }
    
    @RequestMapping( value = "/verificarSeNumeralEhPar", method = RequestMethod.POST)
    public String verificarSeNumeralEhPar(@RequestParam(
            value="numero", required=true) Integer numero, Model model) {
        
        String resultado = "";
        if( funcoesMatematicas.numeralEhPar(numero) )
            resultado = "É par";
        else
            resultado = "Não é par";
        
        model.addAttribute("resultado", resultado);
        
        return "verificar-se-par";
    }
    
    @RequestMapping( value = "/verificarQuantosNumerosParesTemNaString", method = RequestMethod.POST)
    public String verificarQuantosNumerosParesTemNaString(@RequestParam(
            value="numero", required=true) String numeros, Model model) {
        
        Integer qtdNumerosPares = funcoesMatematicas
                .verificarQuantosNumerosParesTemNaString(numeros);
        
        model.addAttribute("resultado", qtdNumerosPares);
        
        return "verificar-numeros-pares";
    }
    
    @RequestMapping( value = "/verificarSeExistemNumerosIguais", method = RequestMethod.POST)
    public String verificarSeExistemNumerosIguais(@RequestParam(
            value="numero", required=true) String numeros, Model model) {
        
        Boolean retorno = funcoesMatematicas
                .verificarSeExistemNumerosIguais(numeros);
        
        String resultado = "";
        
        if( retorno )
            resultado = "Tem números iguais";
        else
            resultado = "Não tem números iguais";
        
        model.addAttribute("resultado", resultado);
        
        return "verificar-numeros-iguais";
    }
    
    @RequestMapping( value = "/verificarSeEhMaiorQueOutro", method = RequestMethod.POST)
    public String verificarSeEhMaiorQueOutro(@RequestParam(
            value="numero1", required=true) Integer numero1,
            @RequestParam(
            value="numero2", required=true) Integer numero2, Model model) {
        
        Integer resultado = funcoesMatematicas.verificarSeEhMaiorQueOutro( numero1, numero2 );
        
        model.addAttribute("resultado", "Maior: " + resultado);
        
        return "verificar-numero-maior";
    }
}