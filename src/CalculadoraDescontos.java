public class CalculadoraDescontos {

    private double consumo;
    private DescontoEstrategy descontoEstrategy;

    public void setDescontoEstrategy(DescontoEstrategy descontoEstrategy) {
        this.descontoEstrategy = descontoEstrategy;
    }
    

    public CalculadoraDescontos(double consumo) {
        this.consumo = consumo;
    }


    public Double valorDesconto() {
       return descontoEstrategy.calcularDesconto(consumo);
    }

}
 
