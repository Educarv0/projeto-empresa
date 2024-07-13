import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner teclado = new Scanner(System.in);
        double estoque_gasolina_comum = 100.0;
        double estoque_gasolina_aditivada = 100.0;
        double estoque_disel= 100.0;
        double estoque_etanol = 100.0;
        int resp = 1;
        double valor_total = 0.0;
        int login, senha;

        System.out.println("\033[0;1m=================================");
        System.out.println("|       BEM VINDOS AO           |");
        System.out.println("|                               |");
        System.out.println("|        POSTO PATOS            |");
        System.out.println("|                               |");
        System.out.println("|   SISTEMA DESENVOLVIDO POR:   |");
        System.out.println("|       - ANTONIO EDUARDO       |");
        System.out.println("|       - MATEUS GOMES          |");
        System.out.println("=================================");

        do {
            System.out.println("Digite o seu login: ");
            login = teclado.nextInt();
            System.out.println("Digite a sua senha: ");
            senha = teclado.nextInt();
            if (login != 111 || senha != 111) {
                System.out.println("Login ou senha inválidos");
            }
        } while (login != 111 || senha != 111);

        System.out.println("1. Gasolina Comum - R$5,15");
        System.out.println("1. Gasolina Aditivada - R$5,30");
        System.out.println("1. Etanol - R$6,00");
        System.out.println("1. Disel - R$5,80");
        System.out.println("1. Qual opção deseja: ");
        int op = teclado.nextInt();

        switch (resp) {
            case 1:
              System.out.println("digite quantos litros deseja");
              double qtd_litros = teclado.nextDouble();
              estoque_gasolina_comum = qtd_litros - estoque_gasolina_comum;
              valor_total = 5.15 * qtd_litros;
                break;
            case 2: 
               System.out.println("digite quantos litros deseja");
               
                break;
            case 3:

                break;
            case 4:
                
                break;
        
            default:
                break;
        }


    }

}
