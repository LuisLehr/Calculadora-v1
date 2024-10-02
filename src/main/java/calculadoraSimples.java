// Imports java
import java.text.DecimalFormat;
import java.util.Scanner;

// Declaração da classe
public class calculadoraSimples {

    // Método excecutavel
    public void excecutar(){
        //Declaração de variaveis
        int operacao = 0;
        int op = 1;
        double n1, n2;
        boolean close = false;

        // Formato para dois números após a vírgula
        DecimalFormat df = new DecimalFormat("#.00");

        //Inicio da classe Scanner Teclado
        Scanner Teclado = new Scanner(System.in);

        //Inicio do programa
        // Loop while para se manter dentro do menu
        while (op == 1){
                System.out.println(" ");
                System.out.println("-------------------");
                System.out.println("Calculadora simples");
                System.out.println("-------------------");
                System.out.println("Operações disponíveis");
                System.out.println("[1] Adição");
                System.out.println("[2] Subtração");
                System.out.println("[3] Multiplicação");
                System.out.println("[4] Divisão");
                System.out.println("[5] Potencialização");
                System.out.println("[6] Raiz quadrada");
                System.out.println("[7] Sair");
                System.out.print("Digite a opção desejada: ");
                operacao = Teclado.nextInt();

                // Loop while que se repete caso a opção digitada seja uma inválida
                while (operacao < 1 || operacao > 7) {
                    System.out.println(" ");
                    System.out.println("---------OPÇÃO INVÁLIDA!---------");
                    System.out.println("Operações disponíveis");
                    System.out.println("[1] Adição");
                    System.out.println("[2] Subtração");
                    System.out.println("[3] Multiplicação");
                    System.out.println("[4] Divisão");
                    System.out.println("[5] Potencialização");
                    System.out.println("[6] Raiz quadrada");
                    System.out.println("[7] Sair");
                    System.out.print("Digite a opção desejada: ");
                    operacao = Teclado.nextInt();
                }
                // If's para efetuar as operações
                // OPÇÃO 1 - SOMA
                if (operacao == 1) {

                    // Loop while para repetir a operação caso o usuario deseje
                    while (!close) {
                        System.out.println(" ");
                        System.out.print("Digite o primeiro número: ");
                        n1 = Teclado.nextDouble();
                        System.out.print("Digite o segundo número: ");
                        n2 = Teclado.nextDouble();
                        System.out.println("-------------------");
                        System.out.println(n1 + " + " + n2 + " = " + (n1 + n2));
                        System.out.println("-------------------");
                        System.out.println("Deseja fazer outra operação de adição?");
                        System.out.print("Digite 1 para continuar. \nDigite 0 para sair.\nOpção desejada: ");
                        op = Teclado.nextInt();

                        if (op == 0){
                            close = true;
                            break;
                        }
                    }
                }

                // OPÇÃO 2 - SUBTRAÇÃO
                if (operacao == 2) {

                    // Loop while para repetir a operação caso o usuario deseje
                    while (!close) {
                        System.out.println(" ");
                        System.out.print("Digite o primeiro número: ");
                        n1 = Teclado.nextDouble();
                        System.out.print("Digite o segundo número: ");
                        n2 = Teclado.nextDouble();
                        System.out.println("-------------------");
                        System.out.println(n1 + " - " + n2 + " = " + (n1 - n2));
                        System.out.println("-------------------");
                        System.out.println("Deseja fazer outra operação de subtração?");
                        System.out.print("Digite 1 para continuar. \nDigite 0 para sair.\nOpção desejada: ");
                        op = Teclado.nextInt();

                        if (op == 0){
                            close = true;
                            break;
                        }
                    }
                }

                // OPÇÃO 3 - MULTIPLICAÇÃO
                if (operacao == 3) {

                    // Loop while para repetir a operação caso o usuario deseje
                    while (!close) {
                        System.out.println(" ");
                        System.out.print("Digite o primeiro número: ");
                        n1 = Teclado.nextDouble();
                        System.out.print("Digite o segundo número: ");
                        n2 = Teclado.nextDouble();
                        System.out.println("-------------------");
                        System.out.println(n1 + " - " + n2 + " = " + (n1 * n2));
                        System.out.println("-------------------");
                        System.out.println("Deseja fazer outra operação de multiplicação?");
                        System.out.print("Digite 1 para continuar. \nDigite 0 para sair.\nOpção desejada: ");
                        op = Teclado.nextInt();

                        if (op == 0){
                            close = true;
                            break;
                        }
                    }
                }

                // OPÇÃO 4 - DIVISÃO
                if (operacao == 4) {

                    // Loop while para repetir a operação caso o usuario deseje
                    while (!close) {
                        System.out.println(" ");
                        System.out.print("Digite o primeiro número: ");
                        n1 = Teclado.nextDouble();
                        System.out.print("Digite o segundo número: ");
                        n2 = Teclado.nextDouble();

                        if (n2 == 0){
                            System.out.println(" ");
                            System.out.println("--------------------");
                            System.out.println("Erro, divisão por 0");
                            System.out.println("--------------------");
                        }
                        else {
                            System.out.println("-------------------");
                            System.out.println(n1 + " / " + n2 + " = " + (n1 / n2));
                            System.out.println("-------------------");
                            System.out.println("Deseja fazer outra operação de divisão?");
                            System.out.print("Digite 1 para continuar. \nDigite 0 para sair.\nOpção desejada: ");
                            op = Teclado.nextInt();

                            if (op == 0){
                                close = true;
                                break;
                            }
                        }
                    }
                }

                // OPÇÃO 5 - POTENCIAÇÃO
                if (operacao == 5) {

                    // Loop while para repetir a operação caso o usuario deseje
                    while (!close) {
                        System.out.println(" ");
                        System.out.print("Digite o número: ");
                        n1 = Teclado.nextDouble();
                        System.out.print("Digite a potencia: ");
                        n2 = Teclado.nextDouble();
                        System.out.println("-------------------");
                        System.out.println(n1 + " elevado a " + n2 + " é: " + Math.pow(n1,n2));
                        System.out.println("-------------------");
                        System.out.println("Deseja fazer outra operação de potenciação?");
                        System.out.print("Digite 1 para continuar. \nDigite 0 para sair.\nOpção desejada: ");
                        op = Teclado.nextInt();

                        if (op == 0){
                            close = true;
                            break;
                        }
                    }
                }

                // OPÇÃO 6 - RAIZ QUADRADA
                if (operacao == 6) {

                    // Loop while para repetir a operação caso o usuario deseje
                    while (!close) {
                        System.out.println(" ");
                        System.out.print("Digite o número: ");
                        n1 = Teclado.nextDouble();
                        System.out.println("-------------------");
                        System.out.println("A raiz quadrada de " + n1 + " é: " + df.format(Math.sqrt(n1)));
                        System.out.println("-------------------");
                        System.out.println("Deseja descobrir a raiz quadrada de outro número?");
                        System.out.print("Digite 1 para continuar. \nDigite 0 para sair.\nOpção desejada: ");
                        op = Teclado.nextInt();

                        if (op == 0){
                            close = true;
                            break;
                        }
                    }
                }

                // OPÇÃO 7 - SAIR
                if (operacao == 7){
                    System.out.println("Saindo...");
                    break;
                }
        }
    }
}
