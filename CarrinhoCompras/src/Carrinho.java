import java.util.ArrayList;
import java.util.List;

public class Carrinho {
    private List<Produto> produtos;

    public Carrinho() {
        this.produtos = new ArrayList<>();
    }

    public void adicionarProduto(Produto produto) {

        for (Produto p : produtos) {
            if (p.getNome().equals(produto.getNome())) {
                p.setQuantidade(p.getQuantidade() + produto.getQuantidade());
                return;
            }
        }
        produtos.add(produto);
    }

    public void removerProduto(String nomeProduto) {
        produtos.removeIf(produto -> produto.getNome().equals(nomeProduto));
    }

    public void atualizarQuantidade(String nomeProduto, int quantidade) {
        for (Produto p : produtos) {
            if (p.getNome().equals(nomeProduto)) {
                p.setQuantidade(quantidade);
            }
        }
    }

    public double calcularTotal() {
        double total = 0;
        for (Produto p : produtos) {
            total += p.getTotal();
        }
        return total;
    }

    public void exibirCarrinho() {
        if (produtos.isEmpty()) {
            System.out.println("O carrinho está vazio.");
        } else {
            for (Produto p : produtos) {
                System.out.println(p.getNome() + " - Quantidade: " + p.getQuantidade() + " - Preço: R$ " + p.getTotal());
            }
            System.out.println("Valor total: R$ " + calcularTotal());
        }
    }
}