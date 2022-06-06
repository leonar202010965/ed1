class Node <T> {  // Esta classe deve ter visibilidade de pacote
    private T info;
    private Node <T> prox;
    
    Node (T valor) {
        this.info = valor;
    }
    
    T getInfo() {
        return this.info;
    }
    
    void setInfo (T valor) {
        this.info = valor;
    }
    
    Node getProx() {
        return this.prox;
    }
    
    void setProx(Node novoProx) {
        this.prox = novoProx;
    }
 }