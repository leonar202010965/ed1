public class FilaComLimite <T> {
    private Node<T> inicio;
    private int qtd;
    private Node<T> fim;
    public boolean isEmpty() {
       return this.inicio == null && this.fim == null;
    }
    public boolean isFull() {
        return this.qtd >= 20;
    }
    public T head() {
        return this.inicio.getInfo();
    }
    public boolean enqueue (T valor) {
        Node<T> novo = new Node (valor);
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
            // Mensagem printada do Main
            return false; // System.out.println("Por favor retorno outro momento \n Motivo: Fila cheia (Mais de 20 clientes na fila)");
        }
    }
    public T dequeue () {
        Node<T> aux = this.inicio;
        T valor;
        this.inicio = this.inicio.getProx();
        if (this.inicio == null) {
            this.fim = null;
        }
        valor = aux.getInfo();
        this.qtd--;
        return valor;
    }
}