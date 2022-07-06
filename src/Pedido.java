import java.util.HashMap;
import java.util.Map;

public class Pedido {

    public Cliente cliente;
    private Map<Produto, Integer> produtos = new HashMap<>();
    private Pagamento pagamento;

    public Pedido(Cliente cliente, Pagamento pagamento){
        this.cliente = cliente;
        this.pagamento = pagamento;
    }

    public void adicionarProduto(Produto produto, int quantidade){
        produtos.put(produto, quantidade);

    }

    private void listarProdutos(){
        for (Map.Entry<Produto, Integer> item : produtos.entrySet()) {
            System.out.println("Produto: " + item.getKey().getNome() + "\nPreço: " + item.getKey().getPreco() + " reais" + 
            " \nQuantidade: " + item.getValue() + " unidades " + "\n");
        }
    }

    private double totalPedido() {
        double soma = 0.0;
        for(Map.Entry<Produto, Integer> item : produtos.entrySet()) {
            soma += item.getKey().getPreco() * item.getValue();
        }
        return soma;
    }

    public void finalizarPedido() {
        System.out.println("Cliente: " + cliente.getNome() + "\n");
        System.out.println("-- COMPRAS --");
        listarProdutos();
        System.out.println("-- PAGAMENTO --");
        System.out.println("A opção de pagamento foi " + pagamento.getOpcao());
        if(pagamento.getPagamento() == OpcoesPagamento.CARTAO_PARCELADO) {
            System.out.println("Total: " + totalPedido() + ", em " + pagamento.getParcelas() + " X de " + totalPedido()/pagamento.getParcelas());
        } else {
            System.out.println("Total: " + totalPedido());
        }
        System.out.println("=============================================================\n");
    }
}
