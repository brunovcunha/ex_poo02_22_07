public class DescontoClienteVIP implements DescontoEstrategy{

    private double consumo;

    @Override
    public Double calcularDesconto(double desconto) {
        if (consumo > 1000) {
            return consumo * 0.10;
        } else {
            return consumo * 0.05;
        }
    }
}
