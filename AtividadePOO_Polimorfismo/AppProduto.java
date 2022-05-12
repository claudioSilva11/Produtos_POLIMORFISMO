import java.util.Scanner;
import java.util.ArrayList;

public class AppProduto {
    public static void main(String[] args) {
        Scanner escreva = new Scanner(System.in);
        ArrayList<Produto> produtos = new ArrayList<Produto>();

        while(true){
            AppProduto.menu();
            System.out.println("Informe a opção desejada");
            int opcoes = escreva.nextInt();

            switch(opcoes){
                case 1:
                String nome;
                double preco;
                double custoAlfandega;
                String dataFabricacao;
                int opcoesProduto;

                AppProduto.menuProdutos();
                System.out.println("---->>");

                while(true){
                    opcoesProduto = escreva.nextInt();
                    if(opcoesProduto ==1 || opcoesProduto == 2 || opcoesProduto ==3){
                        break;
                    }else{
                        System.out.println("opção invalida: ");
                        AppProduto.menuProdutos();
                        System.out.println("...");
                    }
                }
                    System.out.println("digite o nome do produto: ");
                    System.out.println("----");
                    nome=escreva.next();

                    System.out.println("digite o preço do produto: ");
                    System.out.println("----");
                    preco=escreva.nextDouble();

                switch(opcoesProduto){
                    case 1:
                    produtos.add(new Produto(nome, preco));
                    break;

                    case 2:
                    System.out.println("informe o custo da alfândega: ");
                    System.out.println("porcentagem");
                    System.out.println("--");
                    custoAlfandega=escreva.nextDouble();

                    produtos.add(new ProdutoImportado(nome, preco, custoAlfandega));
                    break;

                    case 3:
                    System.out.println("informe a data de fabricação do produto: ");
                    System.out.println("formato a ser escrito dia/mês/ano ");
                    System.out.println("----->");
                    dataFabricacao=escreva.next();

                    produtos.add(new ProdutoUsado(nome, preco, dataFabricacao));
                    break;

                }
                break;

                case 2:
                int id =1;
                    System.out.println("sair: ");
                    System.out.println("alterar produtos:");

                    for (Produto produto : produtos){
                        System.out.println("produto:"+ id);
                        System.out.println(produto.precoTag());
                        id++;
                    }
                    break;

                    default:
                    System.out.println("opção invalida");
            }
            if (opcoes == 2){
                escreva.close();
                break;
            }
        }
    }
    static void menu(){
        System.out.println("----------------------\n"+
                          "|1 inserir produto    |\n"+ 
                          "|2 finalizar programa |\n"+
                          "----------------------\n");
    }
    static void menuProdutos(){
        System.out.println("---------------------------\n"+
        "|   1 produto              |\n "+
        "|   2 produto importado    |\n "+
        "|   3 produto usado        |\n "+
        "----------------------------\n");
    }
}
