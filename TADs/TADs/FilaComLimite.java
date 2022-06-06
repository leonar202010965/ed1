public class FilaComLimite <D> {
    private Node<D> inicio;
    private int qtd;
    private Node<D> fim;
    public boolean isEmpty() {
       return this.inicio == null && this.fim == null;
    }
    public boolean isFull() {
        return this.qtd >= 20;
    }
    public D head() {
        return this.inicio.getInfo();
    }
    public boolean enqueue (D num) {
        Node<D> novo = new Node (num);
        if (!this.isFull()) {
            if (this.isEmpty() == true) {
                this.inicio = novo;
                this.fim = novo;
                this.qtd++;
            }
            else {
                this.fim.setProx(novo);
                this.fim = novo;
                this.qtd++;
            }
            return true;
        }else{
            
            return false;
        }
    }
    public D dequeue () {
        Node<D> aux = this.inicio;
        D num;
        this.inicio = this.inicio.getProx();
        if (this.inicio == null) {
            this.fim = null;
        }
        num = aux.getInfo();
        this.qtd--;
        return num;
    }
}
