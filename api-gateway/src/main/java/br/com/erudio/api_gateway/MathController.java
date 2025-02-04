package br.com.erudio.api_gateway;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;


@RestController
public class MathController {
    @RequestMapping(value = "/sum/{numberOne}/{numberTwo}", method = RequestMethod.GET)
    public Double sum(
            @PathVariable(value = "numberOne") String numberOne,
            @PathVariable(value = "numberTwo") String numberTwo) throws Exception {
    NumberOperations.IsNumber(numberOne);
            NumberOperations.IsNumber(numberTwo);
        return NumberOperations.convertToDouble(numberOne) + NumberOperations.convertToDouble(numberTwo);
    }
      
    @RequestMapping(value = "/sub/{numberOne}/{numberTwo}", method = RequestMethod.GET)
    public Double sub(
            @PathVariable(value = "numberOne") String numberOne,
            @PathVariable(value = "numberTwo") String numberTwo) throws Exception {
    NumberOperations.IsNumber(numberOne);
            NumberOperations.IsNumber(numberTwo);
        return NumberOperations.convertToDouble(numberOne) - NumberOperations.convertToDouble(numberTwo);
    }

    @RequestMapping(value = "/div/{numberOne}/{numberTwo}", method = RequestMethod.GET)
    public Double div(
            @PathVariable(value = "numberOne") String numberOne,
            @PathVariable(value = "numberTwo") String numberTwo) throws Exception {
    NumberOperations.IsNumber(numberOne);
            NumberOperations.IsNumber(numberTwo);
        return NumberOperations.convertToDouble(numberOne) / NumberOperations.convertToDouble(numberTwo);
    }

    @RequestMapping(value = "/mul/{numberOne}/{numberTwo}", method = RequestMethod.GET)
    public Double mul(
            @PathVariable(value = "numberOne") String numberOne,
            @PathVariable(value = "numberTwo") String numberTwo) throws Exception {
NumberOperations.IsNumber(numberOne);
        NumberOperations.IsNumber(numberTwo);
        return NumberOperations.convertToDouble(numberOne) * NumberOperations.convertToDouble(numberTwo);
    }

    @RequestMapping("/media")
    public Double media(@RequestParam String[] lista) {
        Double sum = 0.0; int cont = 0;
        for (String each : lista){
            NumberOperations.IsNumber(each);
            sum += Double.parseDouble(each);
            cont++;
        }
        return sum/cont;
    }

    
    
}


