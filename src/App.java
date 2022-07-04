public class App {

    public static void main(String[] args) {

        Pedido pedido1 = new Pedido(new Cliente("Cachorro", "123456789", "999663354",
                "cachorro@email.com"), new Produto("Roupa", 2, 4.5));

        pedido1.setPagamento(OpcoesPagamento.BOLETO);




    }
}
