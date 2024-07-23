public class CalculadoraDescontos {

    private double consumo;
    private String tipoCliente;
    private DescontoEstrategy descontoEstrategy;

    public void setDescontoEstrategy(DescontoEstrategy descontoEstrategy) {
        this.descontoEstrategy = descontoEstrategy;
    }

    public void setTipoCliente(String tipoCliente) {
        this.tipoCliente = tipoCliente;
    }

    public CalculadoraDescontos(double consumo) {
        this.consumo = consumo;
    }

    public Double valorDesconto() {
        descontoEstrategy.calcularDesconto(consumo);
    }
}
