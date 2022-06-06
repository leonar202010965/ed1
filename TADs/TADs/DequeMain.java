import java.util.Scanner;

public class DequeMain {

    public static void main(String[] args) {

        Deque<Integer> pilha = new Deque();  // Pilha de caracteres
        int numeroSenhaAtual = 1,n, matr;
        char op;
        Scanner in = new Scanner (System.in);
        boolean sairFila = false;
        

        while (!sairFila) {
            exibirMenu();
            op = in.next().charAt(0); in.nextLine();
            switch(op) {
                case '1': System.out.println("Qual numero voce deseja inserir ?");
                matr = in.nextInt();
                pilha.push(matr);
                        break;
                case '2' : n = pilha.pop();
                         System.out.println("Numero Removido " + n);
                        break;
                case '3' : System.out.println("Qual numero voce deseja inserir ?");
                matr = in.nextInt();
                pilha.inject(matr);
                       break;
                case '4' : n = pilha.eject();
                       System.out.println("Numero Removido " + n);
                      break;

                case '0' : System.out.println("Progama Finalizado");
                        sairFila = true;
                        break;
                default: System.out.println("Opção inválida!");
            }
        }
    }

    public static void exibirMenu() {
        System.out.println("Opções");
        System.out.println("1 - Inserir no Inicio");
        System.out.println("2 - Remover do Inicio");
        System.out.println("3 - Inserir do Final");
        System.out.println("4 - Remover do Final");
        System.out.println("0 - Sair do programa");
        System.out.print("Informe a opção desejada: ");
    }

}