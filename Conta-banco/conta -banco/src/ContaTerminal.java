import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args)  {

        try (Scanner scanner = new Scanner(System.in)) {
            
            System.out.println("Por Favor,digite o numero da Conta:");
                 int numero = scanner.nextInt();
            
            System.out.println("Por Favor,digite o numero da Agencia:");
                 String agencia = scanner.next();

            System.out.println("Por Favor,digite o Nome do Cliente:");
                    String nomeCliente = scanner.next();

            System.out.println("Por Favor,digite o Saldo");
                    double saldo = scanner.nextDouble();

 
             System.out.println("Olá,Obrigado por criar uma conta em nosso banco, os dados da sua conta são :");
 
   
             System.out.println("Numero da Conta: " + numero);
             System.out.println("Agencia: " + agencia);
             System.out.println("Nome do Cliente: " + nomeCliente);
             System.out.println("Saldo: "+ saldo);
        }

     }

}

    

