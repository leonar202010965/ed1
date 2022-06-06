public class Deque<T> {
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

    public void push(T valor) {
        Node<T> novo = new Node(valor);
        if (this.isEmpty() == true) {
            this.inicio = novo;
            this.fim = novo;
            this.qtd++;
        } else {
            novo.setProx(this.inicio);
            this.qtd++;
            inicio = novo;
        }
    }

    public void inject(T valor) {
        Node<T> novo = new Node(valor);
        if (this.isEmpty() == true) {
            this.qtd++;
            this.inicio = novo;
            this.fim = novo;
        } else {
            this.fim.setProx(novo);
            this.qtd++;
            this.fim = novo;
        }
    }

    public T eject() {
        Node<T> aux;
        T valor;
        if (this.isEmpty() == true) {
            return null;
        } else {
            aux = this.inicio;
            while (aux.getProx() != this.fim) {
                aux = aux.getProx();
            }
            valor = aux.getInfo();
            aux.setProx(null);
            this.fim = aux;
            this.qtd--;
            return valor;
        }
    }

    public T pop() {
        T valor;
        Node<T> aux;
        aux = this.inicio;
        this.inicio = this.inicio.getProx();
        valor = aux.getInfo();
        this.qtd--;
        return valor;
    }
}