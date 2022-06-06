class Node <D> {  
    private D info;
    private Node <D> prox;
    
    Node (D valor) {
        this.info = valor;
    }
    
    D getInfo() {
        return this.info;
    }
    
    void setInfo (D valor) {
        this.info = valor;
    }
    
    Node getProx() {
        return this.prox;
    }
    
    void setProx(Node novoProx) {
        this.prox = novoProx;
    }
 }
