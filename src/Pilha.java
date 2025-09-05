public class Pilha {
    private No topo;

    public Pilha(){
        this.topo = null;
    }

    public void Insere(int x){
        No n = new No();
        n.setInformacao(x);
        n.setProximo(topo);
        topo = n;
    }
}
