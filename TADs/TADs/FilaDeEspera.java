    import java.util.Scanner;

    public class FilaDeEspera {

        public static void main(String[] args) {

            FilaComLimite<Integer> pilha = new FilaComLimite();  // Pilha de caracteres
            int numeroSenhaAtual = 1,n;
            char op;
            Scanner in = new Scanner (System.in);
            boolean sairFila = false;
            

            while (!sairFila) {
                exibirMenu();
                op = in.next().charAt(0); in.nextLine();
                switch(op) {
                    case '1': 
                            if (pilha.enqueue(numeroSenhaAtual)) {
                                System.out.println("Sua senha: " + numeroSenhaAtual);  
                                numeroSenhaAtual++;
                            }else{
                                System.out.println("Por favor retorno outro momento \n Motivo: Fila cheia (Mais de 20 clientes na fila)");   
                            }
                            break;
                    case '2' : n = pilha.dequeue();
                            System.out.println("Senha chamada para o atendimento: " + n);
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
            System.out.println("1 - Pegar uma senha");
            System.out.println("2 - Chamar uma senha para o atendimento");
            System.out.println("0 - Sair do programa");
            System.out.print("Informe a opção desejada: ");
        }

    }