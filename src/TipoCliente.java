public enum TipoCliente {
    VIP(new DescontoClienteVIP()),
    FUNCIONARIO(new DescontoFuncionario()),
    REGULAR(new DescontoClienteRegular())
}
