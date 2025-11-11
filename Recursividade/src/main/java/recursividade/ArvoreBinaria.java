
package recursividade;

public class ArvoreBinaria {
    
 // Implementa uma Árvore Binária de Busca (BST) usando recursividade.
    Node raiz;

    public ArvoreBinaria() {
        this.raiz = null;
    }

    // --- Métodos de Interface Pública ---

    public void inserir(int valor) {
        this.raiz = inserirRecursivo(this.raiz, valor);
    }

    public boolean buscar(int valor) {
        return buscarRecursivo(this.raiz, valor);
    }

    public void PreOrdem() {
        System.out.print("Pré-Ordem: ");
        preordemRecursivo(this.raiz);
        System.out.println();
    }

    public void EmOrdem() {
        System.out.print("Em Ordem: ");
        emordemRecursivo(this.raiz);
        System.out.println();
    }

    public void PosOrdem() {
        System.out.print("Pós-Ordem: ");
        posordemRecursivo(this.raiz);
        System.out.println();
    }

    // --- Métodos de Implementação Recursiva (Privados) ---

    private Node inserirRecursivo(Node atual, int valor) {
        // **Caso Base:** Se o nó for nulo, cria e retorna o novo nó.
        if (atual == null) {
            return new Node(valor);
        }

        // **Chamada Recursiva:** Decide se desce para a esquerda ou direita.
        if (valor < atual.valor) {
            atual.esquerda = inserirRecursivo(atual.esquerda, valor);
        } else if (valor > atual.valor) {
            atual.direita = inserirRecursivo(atual.direita, valor);
        }
        // Se valor == atual.valor, ignora (não permite duplicatas).
        
        return atual;
    }

    private boolean buscarRecursivo(Node atual, int valor) {
        //Caso Base 1: Se não encontrado chega ao fim do ramo.
        if (atual == null) {
            return false;
        }

        // Caso Base 2: Caso Encontrado.
        if (valor == atual.valor) {
            return true;
        }

        // Chamada Recursiva: Desce para a esquerda se for menor, ou para a direita se for maior.
        if (valor < atual.valor) {
            return buscarRecursivo(atual.esquerda, valor);
        } else {
            return buscarRecursivo(atual.direita, valor);
        }
    }

    private void preordemRecursivo(Node atual) {
        // Caso Base: Condição de parada.
        if (atual == null) {
            return;
        }

        // 1. Visita a Raiz
        System.out.print(atual.valor + " ");

        // 2. Chamada Recursiva para Esquerda
        preordemRecursivo(atual.esquerda);

        // 3. Chamada Recursiva para Direita
        preordemRecursivo(atual.direita);
    }

    private void emordemRecursivo(Node atual) {
        // Caso Base: Condição de parada.
        if (atual == null) {
            return;
        }

        // 1. Chamada Recursiva para Esquerda
        emordemRecursivo(atual.esquerda);

        // 2. Visita a Raiz
        System.out.print(atual.valor + " ");

        // 3. Chamada Recursiva para Direita
        emordemRecursivo(atual.direita);
    }

    private void posordemRecursivo(Node atual) {
        // Caso Base: Condição de parada.
        if (atual == null) {
            return;
        }

        // 1. Chamada Recursiva para Esquerda
        posordemRecursivo(atual.esquerda);

        // 2. Chamada Recursiva para Direita
        posordemRecursivo(atual.direita);

        // 3. Visita a Raiz
        System.out.print(atual.valor + " ");
    }
}
