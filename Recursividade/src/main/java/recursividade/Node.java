
package recursividade;
 //Classe que representa um nó na Árvore Binária de Busca (BST).
public class Node {
    int valor;
    Node esquerda;
    Node direita;
    
    // Construtor para um novo nó.
     
    public Node(int valor) {
        this.valor = valor;
        this.esquerda = null; // Inicialmente, sem filho à esquerda.
        this.direita = null;  // Inicialmente, sem filho à direita.
    }
}
    
