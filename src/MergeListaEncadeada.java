public class MergeListaEncadeada {
    public static Fila mergeFilas(Fila a, Fila b) {
        Fila c = new Fila();
        while (!a.vazia() && !b.vazia()) {
            if (a.primeiroElemento() <= b.primeiroElemento()) {
                c.insereUltimo(a.removePrimeiro());
            } else {
                c.insereUltimo(b.removePrimeiro());
            }
        }
        while(!a.vazia()) {
            c.insereUltimo(a.removePrimeiro());
        }
        while(!b.vazia()) {
            c.insereUltimo(b.removePrimeiro());
        }
        return c;
    }
}
