public class MergeVetor {
    public static int[] mergeVetores(int[] a, int tamanhoA, int[] b, int tamanhoB) {
        int tamanhoC = tamanhoA + tamanhoB;
        int[] c = new int[tamanhoC];

        int i = 0;
        int j = 0;
        int k = 0;

        while(i < tamanhoA && j < tamanhoB) {
            if (a[i] <= b[j]) {
                c[k] = a[i];
                i++;
            }else{
                c[k] = b[j];
                j++;
            }
            k++;
        }

        while(i < tamanhoA) {
            c[k] = a[i];
            i++;
            k++;
        }
        while(j < tamanhoB) {
            c[k] = b[j];
            j++;
            k++;
        }
        return c;
    }

    public static void imprimeVetor(int[] vetor, int tamanho) {
        int i = 0;
        while (i < tamanho) {
            System.out.print(vetor[i] + " ");
            i++;
        }
        System.out.println();
    }
}
