# Estruturas de Dados em Java

Este repositório contém implementações de pilha, fila, merge de filas e merge de vetores em Java.

## Arquivos do Projeto

1. **No.java** - Classe nó da lista encadeada, usada por pilha e fila.
2. **Pilha.java** - Implementa pilha (LIFO) com métodos de inserção, remoção e impressão.
3. **Fila.java** - Implementa fila (FIFO) com métodos de inserção, remoção e impressão.
4. **MergeVetor.java** - Funções para mesclar dois vetores ordenados em um novo vetor ordenado.
5. **MergeListaEncadeada.java** - Função para mesclar duas filas ordenadas em uma nova fila ordenada.
6. **Main.java** - Testa e demonstra todas as estruturas.

## Como executar

1. Abra o terminal na pasta do projeto.  
2. ```bash
      javac *.java
      java Main

### Pilha
```text
Pilha inicial
30 -> 20 -> 10 -> null

Pilha após remover o último elemento:
20 -> 10 -> null
```

### Fila
```text
Fila inicial:
10 -> 20 -> 30 -> Null

Fila após remover o primeiro elemento:
20 -> 30 -> Null
```

### Merge de Filas
```text
Fila A:
12 -> 35 -> 52 -> 64 -> Null

Fila B:
5 -> 15 -> 23 -> 55 -> 75 -> Null

Fila C (merge das filas A e B):
5 -> 12 -> 15 -> 23 -> 35 -> 52 -> 55 -> 64 -> 75 -> Null
```

### Merge de Vetores
```text
Vetor A:
12 35 52 64

Vetor B:
5 15 23 55 75

Vetor C (merge dos vetores A e B):
5 12 15 23 35 52 55 64 75
```
