
public class App {

    public static void main(String[] args) {
        Cliente cliente1 = new Cliente("Claudio", "123456789", "999663354", "cachorro@email.com");
        Produto produto1 = new Camisa("camisa1", 5.5);
        Produto produto2 = new Calca("calca1", 4);
        Pagamento pagamentoBoleto = new Pagamento();
        pagamentoBoleto.setPagamento(OpcoesPagamento.BOLETO, 2);
        
        Pedido pedido1 = new Pedido(cliente1, pagamentoBoleto);
        pedido1.adicionarProduto(produto1, 8);
        pedido1.adicionarProduto(produto2, 1);
        pedido1.finalizarPedido();

        Cliente cliente2 = new Cliente("Ana", "12378945600", "119999999999", "ana@email.com");
        Produto produto3 = new Camisa("camisa2", 6.2);
        Produto produto4 = new Calca("calca2", 5.1);
        Pagamento pagamentoParcelado = new Pagamento();
        pagamentoParcelado.setPagamento(OpcoesPagamento.CARTAO_PARCELADO, 2);
        
        Pedido pedido2 = new Pedido(cliente2, pagamentoParcelado);
        pedido2.adicionarProduto(produto3, 3);
        pedido2.adicionarProduto(produto4, 4);
        pedido2.finalizarPedido();
    }
}
