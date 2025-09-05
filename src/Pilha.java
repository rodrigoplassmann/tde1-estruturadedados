public class Pilha {
    private No topo;

    public Pilha(){
        this.topo = null;
    }

    public void insere(int x){
        No n = new No();
        n.setInformacao(x);
        n.setProximo(topo);
        topo = n;
    }

    public boolean vazia(){
        return topo == null;
    }

    public int remove(){
        if(vazia()){
            System.out.println("Pilha vazia");
            return -1;
        }
        else{
            int valor = topo.getInformacao();
            topo = topo.getProximo();
            return valor;
        }
    }

    public void imprime(){
        if(vazia()){
            System.out.println("Pilha está vazia");
        }
        else{
            No atual = topo;
            while(atual != null){
                System.out.print(atual.getInformacao() + " -> ");
                atual = atual.getProximo();
            }
            System.out.println("null");
        }
    }
}
