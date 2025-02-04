package br.com.erudio.api_gateway;

import br.com.erudio.api_gateway.exceptions.UnsupportedMathOperationException;

public class NumberOperations {
    
    private static boolean isNumeric(String Strnumber) {
        if (Strnumber == null)
            return false;
        String number = Strnumber.replaceAll(",", ".");
        return number.matches("[-+]?[0-9]*\\.?[0-9]+");
    }

    public static Double convertToDouble(String Strnumber) {
        if (Strnumber == null) {
            return 0D;
        }
        String number = Strnumber.replaceAll(",", ".");
        return Double.parseDouble(number);

    }

    public static boolean IsNumber(String any){
        if (!NumberOperations.isNumeric(any)){
            throw new UnsupportedMathOperationException("Plase set a numeric value");
        }
        return true;
    }
}
