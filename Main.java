import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Estoque estoque = new Estoque();
        Scanner scanner = new Scanner(System.in);
        boolean continuar = true;

        while (continuar) {
            System.out.println("\n1. Adicionar Produto");
            System.out.println("2. Remover Produto");
            System.out.println("3. Exibir Preços com Desconto");
            System.out.println("4. Sair");
            System.out.print("Escolha uma opção: ");
            int opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {
                case 1:
                    System.out.print("Digite o tipo de produto (Eletronico ou Alimento): ");
                    String tipoProduto = scanner.nextLine();
                    System.out.print("Digite o nome do produto: ");
                    String nome = scanner.nextLine();
                    System.out.print("Digite o preço do produto: ");
                    double preco = scanner.nextDouble();
                    scanner.nextLine(); 
                    if (tipoProduto.equalsIgnoreCase("Eletronico")) {
                        Produto eletronico = new Eletronico(nome, preco);
                        estoque.adicionarProduto(eletronico);
                    } else if (tipoProduto.equalsIgnoreCase("Alimento")) {
                        Produto alimento = new Alimento(nome, preco);
                        estoque.adicionarProduto(alimento);
                    } else {
                        System.out.println("Tipo de produto inválido.");
                    }
                    break;

                case 2:
                    System.out.print("Digite o nome do produto que deseja remover: ");
                    String nomeParaRemover = scanner.nextLine();
                    estoque.removerProduto(nomeParaRemover);
                    break;

                case 3:
                    System.out.print("Digite a porcentagem de desconto: ");
                    double desconto = scanner.nextDouble();
                    estoque.exibirPrecosComDesconto(desconto);
                    break;

                case 4:
                    continuar = false;
                    break;

                default:
                    System.out.println("Opção inválida.");
            }
        }

        scanner.close();
        System.out.println("Sistema encerrado.");
    }
}