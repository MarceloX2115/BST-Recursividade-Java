# 🌳 Trabalho Prático - Árvores Binárias e Recursividade

**Trabalho Prático da disciplina de Estrutura de Dados** sobre **Árvores Binárias de Busca (BST)**. Este projeto implementa as operações fundamentais de inserção, busca e travessia (pré-ordem, em ordem e pós-ordem) **utilizando exclusivamente o conceito de recursividade** em Java.

**Objetivo:** Compreender e aplicar a recursividade na implementação de uma Árvore Binária de Busca (BST).

---

## Parte 1 - Conceito e Explicação 

### 1. O que é recursividade?

Recursividade é um método dentro da programação onde uma função chama ela mesma para resolver um problema. Para ser eficaz, ela divide um problema grande em versões menores e idênticas de si mesmo, até atingir a condição de parada.

Todo algoritmo recursivo deve conter dois elementos:
1.  **Caso Base (Condição de Parada):** É o ponto em que a função não se chama mais, retornando um resultado direto. Isso impede um loop infinito (Stack Overflow).
2.  **Chamada Recursiva:** A função chama a si mesma, mas sempre trabalhando em uma entrada mais simples que a original.

### 2. Como a recursividade é usada na percorrência (travessia) de uma árvore binária?

A recursividade é natural para percorrer árvores binárias porque cada nó pode ser visto como a raiz de uma subárvore.

A recursividade simplifica a travessia de uma árvore (pré-ordem, em ordem, pós-ordem). Em vez de criar laços complexos para navegar, o problema é resolvido com três passos simples, realizados a partir de qualquer nó:

1.  Processar o nó atual (Raiz).
2.  Chamar a função recursivamente para a subárvore Esquerda.
3.  Chamar a função recursivamente para a subárvore Direita.

O **Caso Base** para a travessia é quando o nó atual é `null`, momento em que a função retorna, subindo um nível na pilha de chamadas.

### 3. Qual a diferença entre recursão e laço (for/while)?

Tanto a recursão quanto os laços (`for`/`while`) são mecanismos de repetição, mas operam de maneira diferente:

| Característica | Recursão | Laço (`for`/`while`) |
| :--- | :--- | :--- |
| **Mecanismo** | Funções chamando a si mesmas. | Um bloco de código sendo repetido. |
| **Controle de Fluxo** | Controlado pelo **Caso Base** (parada). | Controlado por uma **Condição Booleana** (continuação/saída). |
| **Uso de Memória** | Usa a **Pilha de Chamadas (Stack)**, consumindo mais memória. | Usa **variáveis simples** (contadores/iteradores), sendo mais eficiente. |
| **Aplicação Típica** | Problemas naturalmente recursivos (Árvores, Fatorial). | Repetições simples ou iterações sobre coleções. |

Geralmente, a recursão oferece um código mais **legível** para estruturas recursivas (como árvores), enquanto o laço é mais **eficiente** para tarefas iterativas simples.

---

## Parte 2 - Implementação da Árvore Binária 

Esta parte consiste na implementação de uma Árvore Binária de Busca (BST) em Java, aplicando o conceito de recursividade em todos os métodos.

### 🛠️ Estrutura do Projeto

O projeto foi implementado seguindo a estrutura de três classes principais:

1.  **`Node.java`**: Representa um nó da árvore, com atributos como `valor`, `esquerda` e `direita`.
2.  **`ArvoreBinaria.java`**: Contém os métodos de inserção, busca e percursos, todos utilizando recursividade.
3.  **`Main.java`**: Classe principal interativa para testes e demonstração das funcionalidades.

### ⚙️ Métodos Implementados (Recursivos)

| Método | Função | Ordem de Visita (Percursos) |
| :--- | :--- | :--- |
| `inserir(int valor)` | Insere o valor, posicionando-o corretamente na BST (valores menores à esquerda e maiores à direita). | - |
| `buscar(int valor)` | Procura o valor e retorna `true` se existir ou `false` caso contrário. | - |
| `preordem()` | Percurso: **Raiz** → Esquerda → Direita. |
| `emordem()` | Percurso: Esquerda → **Raiz** → Direita (retorna valores ordenados). |
| `posordem()` | Percurso: Esquerda → Direita → **Raiz**. |
