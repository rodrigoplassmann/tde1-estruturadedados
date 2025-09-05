# Estruturas de Dados em Java

Esse repositório contém implementações de pilha, fila e merge de vetores/listas encadeadas em Java.  

## Arquivos

- `No.java` → Classe nó da lista encadeada  
- `Pilha.java` → Implementação de pilha 
- `Fila.java` → Implementação de fila 
- `MergeVetor.java` → Merge de dois vetores ordenados  
- `MergeListaEncadeada.java` → Merge de duas filas ordenadas  
- `Main.java` → Uso das estruturas  

## Como executar

1. Instale o Java (JDK 8 ou superior)  
2. Compile os arquivos:  
   ```bash
   javac *.java
   ```
3. Execute o programa principal:  
   ```bash
   java Main
   ```

## Exemplos de saída

### Pilha
```
30 -> 20 -> 10 -> null
20 -> 10 -> null
```

### Fila
```
Fila A:
12 -> 35 -> 52 -> 64 -> Null

Fila B:
5 -> 15 -> 23 -> 55 -> 75 -> Null

Fila C:
5 -> 12 -> 15 -> 23 -> 35 -> 52 -> 55 -> 64 -> 75 -> Null
```

### Vetores
```
Vetor A:
12 35 52 64

Vetor B:
5 15 23 55 75

Vetor C:
5 12 15 23 35 52 55 64 75
```
