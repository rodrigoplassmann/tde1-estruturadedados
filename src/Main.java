public class Main{
    public static void main(String[] args){
        Pilha pilha = new Pilha();
        pilha.insere(10);
        pilha.insere(20);
        pilha.insere(30);

        pilha.imprime();

        pilha.remove();
        pilha.imprime();

    }
}