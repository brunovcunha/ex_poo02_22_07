public class App {
    public static void main(String[] args) throws Exception{

        double consumo = 1200.0;
        TipoCliente tipoCliente = TipoCliente.FUNCIONARIO;

        CalculadoraDescontos calculadora = new CalculadoraDescontos(consumo);

        calculadora.setDescontoEstrategy(tipoCliente.getDescontoEstrategy());

        Double desconto = calculadora.valorDesconto();
        System.out.println("O valor do desconto é: " + desconto);
    
    }
}
