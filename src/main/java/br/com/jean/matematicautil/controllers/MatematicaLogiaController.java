package br.com.jean.matematicautil.controllers;

import br.com.jean.matematicautil.utils.FuncoesMatematicas;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MatematicaLogiaController {
    private final FuncoesMatematicas funcoesMatematicas;

    public MatematicaLogiaController() {
        this.funcoesMatematicas = new FuncoesMatematicas();
    }
    
    @RequestMapping( value = "/calcularMMC", method = RequestMethod.POST)
    public String calcularMMC(@RequestParam(
            value="numero1", required=true) Integer numero1,
            @RequestParam(
            value="numero2", required=true) Integer numero2, Model model) {
        
        Integer resultado = funcoesMatematicas.calcularMMC(numero1, numero2);
        
        model.addAttribute("resultado", resultado);
        
        return "mmc";
    }

    @RequestMapping( value = "/calcularMDC", method = RequestMethod.POST)
    public String calcularMDC(@RequestParam(
            value="numero1", required=true) Integer numero1,
            @RequestParam(
            value="numero2", required=true) Integer numero2, Model model) {
        
        Integer resultado = funcoesMatematicas.calcularMDC(numero1, numero2);
        
        model.addAttribute("resultado", resultado);
        
        return "mdc";
    }
    
    @RequestMapping( value = "/calcularProduto", method = RequestMethod.POST)
    public String calcularProduto(@RequestParam(
            value="numero1", required=true) Integer numero1,
            @RequestParam(
            value="numero2", required=true) Integer numero2, Model model) {
        
        Integer resultado = funcoesMatematicas.calcularProduto( numero1, numero2);
        
        model.addAttribute("resultado", resultado);
        
        return "produto";
    }
    
    @RequestMapping( value = "/calcularAreaCirculo", method = RequestMethod.POST)
    public String calcularAreaCirculo(@RequestParam(
            value="raioCirculo", required=true) Double raioCirculo, Model model) {
        
        Double resultado = funcoesMatematicas.calcularAreaCirculo( raioCirculo );
        
        model.addAttribute("resultado", resultado);
        
        return "raio_circulo";
    }
    
    @RequestMapping( value = "/calcularPotencia", method = RequestMethod.POST)
    public String calcularPotencia(@RequestParam(
            value="base", required=true) Integer base,
            @RequestParam(
            value="potencia", required=true) Integer potencia, Model model) {
        
        Integer resultado = funcoesMatematicas.calcularPotencia( base, potencia );
        
        model.addAttribute("resultado", resultado);
        
        return "potencia";
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
        
        return "verificar_casas_decimais";
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
        
        return "verificar_se_par";
    }
    
    @RequestMapping( value = "/verificarQtdNumerosParesTemNaString", method = RequestMethod.POST)
    public String verificarQtdNumerosParesTemNaString(@RequestParam(
            value="numeros", required=true) String numeros, Model model) {
        
        Integer qtdNumerosPares = funcoesMatematicas
                .verificarQuantosNumerosParesTemNaString(numeros);
        
        model.addAttribute("resultado", qtdNumerosPares);
        
        return "verificar_numeros_pares";
    }
    
    @RequestMapping( value = "/verificarSeExistemNumerosIguais", method = RequestMethod.POST)
    public String verificarSeExistemNumerosIguais(@RequestParam(
            value="numeros", required=true) String numeros, Model model) {
        
        Boolean retorno = funcoesMatematicas
                .verificarSeExistemNumerosIguais(numeros);
        
        String resultado = "";
        
        if( retorno )
            resultado = "Tem números iguais";
        else
            resultado = "Não tem números iguais";
        
        model.addAttribute("resultado", resultado);
        
        return "verificar_numeros_iguais";
    }
    
    @RequestMapping( value = "/verificarSeEhMaiorQueOutro", method = RequestMethod.POST)
    public String verificarSeEhMaiorQueOutro(@RequestParam(
            value="numero1", required=true) Integer numero1,
            @RequestParam(
            value="numero2", required=true) Integer numero2, Model model) {
        
        Integer resultado = funcoesMatematicas.verificarSeEhMaiorQueOutro( numero1, numero2 );
        
        model.addAttribute("resultado", resultado + " é o maior");
        
        return "verificar_numero_maior";
    }
}