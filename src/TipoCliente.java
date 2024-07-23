public enum TipoCliente {
    VIP(new DescontoClienteVIP()),
    FUNCIONARIO(new DescontoFuncionario()),
    REGULAR(new DescontoClienteRegular());

    private final DescontoEstrategy descontoEstrategy;

    TipoCliente(DescontoEstrategy descontoEstrategy) {
        this.descontoEstrategy=descontoEstrategy;
    }

    public DescontoEstrategy getDescontoEstrategy(){
        return this.descontoEstrategy;
    }
}
