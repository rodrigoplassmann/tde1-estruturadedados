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
        }
        int valor = topo.getInformacao();
        topo = topo.getProximo();
        return valor;
    }
}
