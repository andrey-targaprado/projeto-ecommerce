public class Pedido {

    private Cliente cliente;
    private Produto produto;
    private OpcoesPagamento pagamento;

    public Pedido(Cliente cliente, Produto produto){
        this.cliente = cliente;
        this.produto = produto;
    }

    public OpcoesPagamento getPagamento() {
        return pagamento;
    }

    public void setPagamento(OpcoesPagamento pagamento) {
        this.pagamento = pagamento;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Produto getProduto() {
        return produto;
    }

    public void setProduto(Produto produto) {
        this.produto = produto;
    }
}
