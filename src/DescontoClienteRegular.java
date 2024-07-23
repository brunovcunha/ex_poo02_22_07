public class DescontoClienteRegular implements DescontoEstrategy{
 
    @Override
    public Double calcularDesconto(Double consumo) {
            if (consumo > 1000) {
                return consumo * 0.05;
            } else {
                return consumo * 0.02;
            }
        }
}
