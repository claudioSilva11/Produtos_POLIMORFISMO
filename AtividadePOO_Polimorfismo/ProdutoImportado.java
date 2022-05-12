public class ProdutoImportado extends Produto {
    private double custoAlfandega;

    public ProdutoImportado(String nome, double preco, double custoAlfandega){
        super(nome,preco);
        this.custoAlfandega=custoAlfandega;
    }
    public double getCustoAlfandega(){
        return custoAlfandega;
    }
    public void setCustoAlfandega(double custoAlfandega){
        this.custoAlfandega=custoAlfandega;
    }
    public double precoTotal(){
        return getPreco() + this.getPreco()*(getCustoAlfandega()/100);
    }
    @Override
    public String precoTag(){
        return super.precoTag()+ "Custo da Alfândega: "+ getCustoAlfandega()+"%"+ "Valor Completo: "+ precoTotal();
    }

}
