
/**
 * 
 * Cliente precisa ser identificado pelo email, seleciona os produtos e sua quantidade inserinda
 * no carrinho de compras.
 * 
 */


public class App {

    public static void main(String[] args) {
        Cliente cliente1 = new Cliente("Cachorro", "123456789", "999663354", "cachorro@email.com");
        Pedido pedido1 = new Pedido(cliente1);
        pedido1.adicionarProduto(new Camisa("camisa1", 5.5), 8);
        pedido1.adicionarProduto(new Calca("calca1", 4), 1);
        pedido1.listarProdutos();
        // new Produto("Roupa", 2, 4.5);
        pedido1.setPagamento(OpcoesPagamento.BOLETO);
    }
}
