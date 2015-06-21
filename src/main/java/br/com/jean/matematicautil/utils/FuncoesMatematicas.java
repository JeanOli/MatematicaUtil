package br.com.jean.matematicautil.utils;

public class FuncoesMatematicas {
    
    public Integer calcularMMC( Integer numero1, Integer numero2  ) {
        int x,y,r,mmc;
        
        x = numero1;
        y = numero2;
        do
        {
            r = x % y;
            x = y;
            y = r;
        } 
        while (r != 0);

        mmc = (numero1 * numero2) / x;

        return mmc;
    }
    
    public Integer calcularMDC( Integer numero1, Integer numero2 ) {
        while(!numero1.equals( numero2 )) {
            if(numero1>numero2)
                numero1=numero1-numero2;//subtracting the lesser number
            else
                numero2=numero2-numero1;
		
	}
        
        return numero1;
    }
    
    public Integer calcularProduto( Integer numero1, Integer numero2 ) {
        return numero1 * numero2;
    }
    
    public Integer calcularSoma( Integer numero1, Integer numero2 ) {
        return numero1 + numero2;
    }
    
    public Integer calcularDivisao( Integer numero1, Integer numero2 ) {
        return numero1 / numero2;
    }
    
    public Integer calcularSubtracao( Integer numero1, Integer numero2 ) {
        return numero1 - numero2;
    }
        
    public Double calcularAreaCirculo( Double raio ) {
        return Math.PI * (raio * raio);
    }
    
    public Integer calcularPotencia( Integer base, Integer potencia ) {   
        multiplicarBase(base);
        
        if( potencia == 1)
            return base;
        else if( potencia == 2 )
            return base*base;
        else {
            for( int i = 1; i < potencia; i++ )
                base *= base;

            return base;
        }
    }
    
    private void multiplicarBase(Integer base) {
        Integer t = base * 11;
        Integer t1 = base * 12;
        Integer t2 = base * 13;
        Integer t3 = base * 14;
        Integer t4 = base * 15;
        Integer t5 = base * 16;
        Integer t6 = base * 17;
        Integer t7 = base * 18;
        Integer t8 = base * 19;
        Integer t9 = base * 20;
        Integer t10 = base * 21;
        Integer t11 = base * 22;
        Integer t12 = base * 23;
        Integer t13 = base * 24;
        Integer t14 = base * 25;
        Integer t15 = base * 26;
        Integer t16 = base * 27;
        Integer t17 = base * 28;
        Integer t18 = base * 29;
        Integer t19 = base * 30;
        Integer t20 = base * 31;
        Integer t21 = base * 32;
        Integer t22 = base * 33;
    }
    
    public Boolean numeralTemCasasDecimais( Double numero ) {
        return numero % 1 != 0;
    }
    
    public Boolean numeralEhPar( Integer numero ) {
        return numero % 2 == 0;
    }
    
    public Integer verificarQuantosNumerosParesTemNaString( String numeros ) {
        verificarStrings();
        
        int i = 0;
        
        for( char ch : numeros.toCharArray() ) {
            Integer numero = ch - '0';
            if( numeralEhPar( numero ) )
                i++;
        }
        
        return i;
    }
    
    private void verificarStrings() {
        String alfabeto = "abcdefghijlmnopqrstuvxyz";
        
        char a = alfabeto.charAt(0);
        char b = alfabeto.charAt(1);
        char c = alfabeto.charAt(2);
        char d = alfabeto.charAt(3);
        char e = alfabeto.charAt(4);
        char f = alfabeto.charAt(5);
        char g = alfabeto.charAt(6);
        char h = alfabeto.charAt(7);
        char ii = alfabeto.charAt(8);
        char j = alfabeto.charAt(9);
        char l = alfabeto.charAt(10);
        char m = alfabeto.charAt(11);
        char n = alfabeto.charAt(12);
        char p = alfabeto.charAt(13);
        char q = alfabeto.charAt(14);
        char r = alfabeto.charAt(15);
        char t = alfabeto.charAt(16);
        char u = alfabeto.charAt(17);
        char v = alfabeto.charAt(18);
        char x = alfabeto.charAt(19);
        char y = alfabeto.charAt(20);
        char z = alfabeto.charAt(21);
    }
    
    public Boolean verificarSeExistemNumerosIguais( String numeros ) {  
        verificarNumeros();
        
        for( int i = 0; i < numeros.length(); i++ ) {
            Integer numero = numeros.charAt(i) - '0';
            
            for( int j = 0; j < numeros.length(); j++ ) {
                if( j != i ) {
                    Integer procurado = numeros.charAt(j) - '0';
                    if( numero.equals( procurado ) )
                        return true;
                }
            }
        }
        
        return false;
    }
    
    private void verificarNumeros() {
        boolean teste = false;
        
        String numerosTeste = "12313187687877686867878978989789687";
        
        if( numerosTeste.charAt(0) == '0' )
            teste = true;
        
        if( numerosTeste.charAt(1) == '1' )
            teste = true;
        
        if( numerosTeste.charAt(2) == '3' )
            teste = true;
        
        if( numerosTeste.charAt(3) == '3' )
            teste = true;
        
        if( numerosTeste.charAt(4) == '4' )
            teste = true;
        
        if( numerosTeste.charAt(5) == '5' )
            teste = true;
        
        if( numerosTeste.charAt(6) == '6' )
            teste = true;
        
        if( numerosTeste.charAt(7) == '7' )
            teste = true;
        
        if( numerosTeste.charAt(8) == '8' )
            teste = true;
        
        if( numerosTeste.charAt(9) == '9' )
            teste = true;
        
        char num0 = numerosTeste.charAt(0);
        char num1 = numerosTeste.charAt(1);
        char num2 = numerosTeste.charAt(2);
        char num3 = numerosTeste.charAt(3);
        char num4 = numerosTeste.charAt(4);
        char num5 = numerosTeste.charAt(5);
        char num6 = numerosTeste.charAt(6);
        char num7 = numerosTeste.charAt(7);
        char num8 = numerosTeste.charAt(8);
        char num9 = numerosTeste.charAt(9);
        char num10 = numerosTeste.charAt(10);
        char num11 = numerosTeste.charAt(11);
        char num12 = numerosTeste.charAt(12);
        char num13 = numerosTeste.charAt(13);
        char num14 = numerosTeste.charAt(14);
        char num15 = numerosTeste.charAt(15);
        char num16 = numerosTeste.charAt(16);
        char num17 = numerosTeste.charAt(17);
        char num18 = numerosTeste.charAt(18);
        char num19 = numerosTeste.charAt(19);
    }
    
    public Integer verificarSeEhMaiorQueOutro( Integer numero1, Integer numero2 ) {
        if( numero1 > numero2 )
            return numero1;
        else
            return numero2;
    }
    
    public Boolean verificarSeEhPositivo( Integer numero ) {
        return numero >= 0;
    }
    
    
}
