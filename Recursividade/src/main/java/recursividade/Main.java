package recursividade;
import java.util.Scanner;


 //Classe principal para testar a implementação da Árvore Binária de Busca podendo escolher a operação
 

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArvoreBinaria bst = new ArvoreBinaria();
        int opcao;
        
        System.out.println("Implementaçao Interativa de Árvore Binária de Busca (BST)");

        // --- 1. Inserção de Valores ---
        System.out.println("\n--- INSERÇAO DE VALORES ---");
        
        // Loop para permitir a inserção de múltiplos valores
        do {
            System.out.print("Digite um valor inteiro para inserir na árvore (ou 0 para parar): ");
            if (scanner.hasNextInt()) {
                int valor = scanner.nextInt();
                if (valor == 0) {
                    break;
                }
                bst.inserir(valor);
                System.out.println("Valor " + valor + " inserido com sucesso.");
            } else {
                // Lidar com entrada não numérica
                System.out.println("Entrada invalida. Por favor, digite um número inteiro.");
                scanner.next(); // Limpa o buffer de entrada
            }
        } while (true);

        if (bst.raiz == null) {
            System.out.println("Arvore vazia. Encerrando o programa.");
            scanner.close();
            return;
        }

        // --- 2. Menu de Funções ---
        do {
            System.out.println("\n--- MENU DE FUNÇOES ---");
            System.out.println("1. Realizar Percurso Em Ordem");
            System.out.println("2. Realizar Percurso Pre-Ordem");
            System.out.println("3. Realizar Percurso Pos-Ordem");
            System.out.println("4. Buscar um Valor na Arvore");
            System.out.println("5. Sair");
            System.out.print("Escolha uma opcao (1-5): ");

            if (scanner.hasNextInt()) {
                opcao = scanner.nextInt();
                
                switch (opcao) {
                    case 1:
                        System.out.println("\n--- Percurso EM ORDEM (Ordenado) ---");
                        bst.EmOrdem();
                        break;
                    case 2:
                        System.out.println("\n--- Percurso PRÉ-ORDEM (Raiz -> Esquerda -> Direita) ---");
                        bst.PreOrdem();
                        break;
                    case 3:
                        System.out.println("\n--- Percurso PÓS-ORDEM (Esquerda -> Direita -> Raiz) ---");
                        bst.PosOrdem();
                        break;
                    case 4:
                        System.out.print("Digite o valor que deseja buscar: ");
                        if (scanner.hasNextInt()) {
                            int valorBusca = scanner.nextInt();
                            boolean encontrado = bst.buscar(valorBusca);
                            System.out.println("Resultado da Busca por " + valorBusca + ": " + (encontrado ? "ENCONTRADO na árvore." : "NÃO ENCONTRADO na árvore."));
                        } else {
                            System.out.println("Entrada inválida. Por favor, digite um número inteiro.");
                            scanner.next(); // Limpa o buffer
                        }
                        break;
                    case 5:
                        System.out.println("\nPrograma encerrado. Até mais!");
                        break;
                    default:
                        System.out.println("Opção inválida. Por favor, escolha um número entre 1 e 5.");
                }
            } else {
                System.out.println("Entrada inválida. Por favor, digite um número.");
                scanner.next(); // Limpa o buffer
                opcao = 0; // Garante que o loop continue
            }

        } while (opcao != 5);

        scanner.close();
    }
}