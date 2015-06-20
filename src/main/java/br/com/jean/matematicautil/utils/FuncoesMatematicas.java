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
    
    public Boolean numeralTemCasasDecimais( Double numero ) {
        return numero % 1 != 0;
    }
    
    public Boolean numeralEhPar( Integer numero ) {
        return numero % 2 == 0;
    }
    
    public Integer verificarQuantosNumerosParesTemNaString( String numeros ) {
        int i = 0;
        
        for( char c : numeros.toCharArray() ) {
            Integer numero = Integer.valueOf( c );
            if( numeralEhPar( numero ) )
                i++;
        }
        
        return i;
    }
    
    public Boolean verificarSeExistemNumerosIguais( String numeros ) {        
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
