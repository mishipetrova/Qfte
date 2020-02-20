public class Pair<E,T> {
    public void setFst(E fst) {
        this.fst = fst;
    }

    public void setSnd(T snd) {
        this.snd = snd;
    }

    private E fst;
    private T snd;

    public Pair(E fst , T snd){
        this.fst = fst;
        this.snd = snd;
    }


    public E getFst() {
        return fst;
    }

    public T getSnd() {
        return snd;
    }
}
