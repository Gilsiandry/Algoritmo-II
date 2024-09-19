public class Main {
    public static void main(String[] args) {
        Carrinho carrinho = new Carrinho();


        Produto produto1 = new Produto("Capacete", 1200.0, 1);
        Produto produto2 = new Produto("Jaqueta", 800.0, 2);


        carrinho.adicionarProduto(produto1);
        carrinho.adicionarProduto(produto2);


        carrinho.exibirCarrinho();


        carrinho.atualizarQuantidade("Jaqueta", 3);
        System.out.println("\nApós atualizar quantidade de jaqueta:");
        carrinho.exibirCarrinho();


        carrinho.removerProduto("Capacete");
        System.out.println("\nApós remover o capacete:");
        carrinho.exibirCarrinho();
    }
}
