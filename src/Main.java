public class Main{
    public static void main(String[] args){
        //pilha
        Pilha pilha = new Pilha();
        pilha.insere(10);
        pilha.insere(20);
        pilha.insere(30);

        System.out.println("Pilha inicial");
        pilha.imprime();
        System.out.println();

        pilha.remove();
        System.out.println("Pilha após remover o último elemento:");
        pilha.imprime();
        System.out.println();

        //fila
        Fila fila = new Fila();
        fila.insereUltimo(10);
        fila.insereUltimo(20);
        fila.insereUltimo(30);

        System.out.println("Fila inicial:");
        fila.imprime();
        System.out.println();

        fila.removePrimeiro();
        System.out.println("Fila após remover o primeiro elemento:");
        fila.imprime();
        System.out.println();

        //merge fila
        Fila filaA = new Fila();
        Fila filaB = new Fila();

        filaA.insereUltimo(12);
        filaA.insereUltimo(35);
        filaA.insereUltimo(52);
        filaA.insereUltimo(64);

        filaB.insereUltimo(5);
        filaB.insereUltimo(15);
        filaB.insereUltimo(23);
        filaB.insereUltimo(55);
        filaB.insereUltimo(75);

        System.out.println("\nFila A:");
        filaA.imprime();
        System.out.println();
        System.out.println("Fila B:");
        filaB.imprime();

        Fila filaC = MergeListaEncadeada.mergeFilas(filaA, filaB);

        System.out.println("\nFila C:");
        filaC.imprime();

        //vetor
        int tamanhoA = 4;
        int tamanhoB = 5;

        int[] vetorA = new int[tamanhoA];
        int[] vetorB = new int[tamanhoB];

        vetorA[0] = 12;
        vetorA[1] = 35;
        vetorA[2] = 52;
        vetorA[3] = 64;

        vetorB[0] = 5;
        vetorB[1] = 15;
        vetorB[2] = 23;
        vetorB[3] = 55;
        vetorB[4] = 75;

        System.out.println("\nVetor A:");
        MergeVetor.imprimeVetor(vetorA, tamanhoA);
        System.out.println();
        System.out.println("Vetor B:");
        MergeVetor.imprimeVetor(vetorB, tamanhoB);

        int[] vetorC = MergeVetor.mergeVetores(vetorA, tamanhoA, vetorB, tamanhoB);

        System.out.println("\nVetor C:");
        MergeVetor.imprimeVetor(vetorC, tamanhoA + tamanhoB);

    }

}
