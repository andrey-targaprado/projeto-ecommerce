
public  class Pagamento {
    private OpcoesPagamento opcao;
    private int parcelas;

    public int getParcelas() {
        return parcelas;
    }

    public void setParcelas(int parcelas) {
        this.parcelas = parcelas;
    }

    public OpcoesPagamento getPagamento() {
        return opcao;
    }

    public void setPagamento(OpcoesPagamento opcao, int parcelas) {
        this.opcao = opcao;
        if(opcao == OpcoesPagamento.CARTAO_PARCELADO && parcelas >= 1 && parcelas <= 3) {
            this.parcelas = parcelas;
        } else {
            this.parcelas = 1;
        }
    }

    public OpcoesPagamento getOpcao() {
        return opcao;
    }
    
    
}
