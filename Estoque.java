import java.util.ArrayList;
import java.util.List;

public class Estoque {
    private List<Produto> produtos;

    public Estoque() {
        this.produtos = new ArrayList<>();
    }

    public void adicionarProduto(Produto produto) {
        produtos.add(produto);
        System.out.println("Produto " + produto.getNome() + " adicionado ao estoque.");
    }

    public void removerProduto(String nomeProduto) {
        Produto produtoParaRemover = null;
        for (Produto produto : produtos) {
            if (produto.getNome().equalsIgnoreCase(nomeProduto)) {
                produtoParaRemover = produto;
                break;
            }
        }
        if (produtoParaRemover != null) {
            produtos.remove(produtoParaRemover);
            System.out.println("Produto " + produtoParaRemover.getNome() + " removido do estoque.");
        } else {
            System.out.println("Produto não encontrado no estoque.");
        }
    }

    public void exibirPrecosComDesconto(double porcentagem) {
        System.out.println("\n--- Preços com Desconto (" + porcentagem + "%) ---");
        if (produtos.isEmpty()) {
            System.out.println("Nenhum produto no estoque.");
        } else {
            for (Produto produto : produtos) {
                double precoComDesconto = produto.calcularDesconto(porcentagem);
                System.out.println("Produto: " + produto.getNome() + " | Preço original: " + produto.getPreco() + " | Preço com desconto: " + precoComDesconto);
            }
        }
    }

    public List<Produto> getProdutos() {
        return produtos;
    }
}