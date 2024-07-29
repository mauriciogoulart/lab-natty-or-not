package br.com.mg;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CalculadoraController {

    @GetMapping("/calcular")
    public String calcular(
        @RequestParam(name = "primeiroNumero") double primeiroNumero,
        @RequestParam(name = "segundoNumero") double segundoNumero,
        @RequestParam(name = "operacao") String operacao) {

        double resultado;
        try {
            switch (operacao.toLowerCase()) {
                case "adicionar":
                    resultado = Calculadora.adicionar(primeiroNumero, segundoNumero);
                    break;
                case "subtrair":
                    resultado = Calculadora.subtrair(primeiroNumero, segundoNumero);
                    break;
                case "multiplicar":
                    resultado = Calculadora.multiplicar(primeiroNumero, segundoNumero);
                    break;
                case "dividir":
                    resultado = Calculadora.dividir(primeiroNumero, segundoNumero);
                    break;
                default:
                    return "Erro: Operação não reconhecida. Use adicionar, subtrair, multiplicar ou dividir.";
            }
        } catch (ArithmeticException e) {
            return "Erro: " + e.getMessage();
        }

        return "Resultado: " + resultado;
    }
}
