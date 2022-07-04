import java.util.Map;

public class Pedido {

    private Cliente cliente;
    private Map<Produto, Integer> produtos;
    private OpcoesPagamento pagamento;

    public Pedido(Cliente cliente){
        this.cliente = cliente;
    }

    public OpcoesPagamento getPagamento() {
        return pagamento;
    }

    public void setPagamento(OpcoesPagamento pagamento) {
        this.pagamento = pagamento;
    }
}
