import java.util.Scanner;

public class Fila {
    private No Lista;

    public Fila() {
        this.Lista = null;
    }

    public boolean vazia(){
        return Lista == null;
    }

    public void insereUltimo(int info){
        No novo = new No();
        novo.setInformacao(info);
        novo.setProximo(null);

        if (vazia()){
            Lista = novo;
        }else{
            No atual = Lista;
            while(atual.getProximo()!=null){
                atual = atual.getProximo();
            }
            atual.setProximo(novo);
        }
    }

    public void imprime() {
        No atual = Lista;
        while (atual != null) {
            System.out.print(atual.getInformacao() + " -> ");
            atual = atual.getProximo();
        }
        System.out.println("Null");
    }

    public int removePrimeiro(){
        if (vazia()) {
            System.out.println("Fila vazia");
            return 1;
        }
        int valor = Lista.getInformacao();
        Lista = Lista.getProximo();
        return valor;
    }

    public int primeiroElemento() {
        if (vazia()) {
            return Integer.MAX_VALUE;
        }
        return Lista.getInformacao();
    }


}
