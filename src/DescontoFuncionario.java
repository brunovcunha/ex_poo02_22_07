public class DescontoFuncionario implements DescontoEstrategy{

   private double consumo;

    @Override
    public Double calcularDesconto(double desconto) {
        return consumo * 0.3;
    }
}
