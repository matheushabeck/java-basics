package Desafios;

import java.util.Scanner;

public class DesafioFinal {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

            String nome = "Matheus Howe Habeck";
            String tipoConta = "Corrente";
            double saldo = 500.00;

            System.out.println("-----------------------------------------------------");
            System.out.println("Usuário: " + nome);
            System.out.println("Tipo de Conta: " + tipoConta);
            System.out.println("Saldo: " + saldo);
            System.out.println("-----------------------------------------------------");

            while(true){
            System.out.println("\nServiços");
            System.out.println("1. Consultar saldo");
            System.out.println("2. Receber valor");
            System.out.println("3. Tranferir");
            System.out.println("4. Sair");
            System.out.println("Digite o número da opção que deseja: ");
            int opcao = sc.nextInt();

             if (opcao ==1) {
                System.out.println(saldo);
            }

            else if (opcao ==2) {
                 System.out.println("Valor que deseja receber: ");
                 double valorReceber = sc.nextDouble();
                 saldo += valorReceber;
                 System.out.println("Saldo atual: " + saldo);
            }

            else if (opcao ==3) {
                 System.out.println("Valor que deseja transferir: ");
                 double valorTransferir = sc.nextDouble();

                 if (valorTransferir > saldo) {
                     System.out.println("Saldo insuficiente");
                 }  else {
                     System.out.println("Transação bem-sucedida");
                     saldo -= valorTransferir;
                     System.out.println("Saldo atual: " + saldo);
                 }
            }

            else if (opcao == 4){
                System.out.println("Saindo...");
                break;
            }   else {
                 System.out.println("Opção inválida. Tente novamente.");
            }
        }
    }
}

