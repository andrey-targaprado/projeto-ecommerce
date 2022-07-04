import java.util.HashMap;
import java.util.Map;

public class Pedido {

    private Cliente cliente;
    private Map<Produto, Integer> produtos = new HashMap<>();
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

    public void adicionarProduto(Produto produto, int quantidade){
        produtos.put(produto, quantidade);

    }

    public void listarProdutos(){
        for (Map.Entry<Produto, Integer> item : produtos.entrySet()) {
            System.out.println(item.getKey().getNome() + " " + item.getValue());
        }
    }
}
