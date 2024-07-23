public class DescontoFuncionario implements DescontoEstrategy{

    @Override
    public Double calcularDesconto(Double consumo) {
        return consumo * 0.3;
    }
}
