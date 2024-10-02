// Imports da classe Principal
import java.util.Scanner;

//Inicio da classe Principal
public class Principal {

    //Método para rodar o programa
    public static void main(String[] args) {

        //Variavel pré definida que será usada no Menu
        int op = 1;

        //Iniciando a classe Scanner
        Scanner Teclado = new Scanner(System.in);

        //Looping while para repetir o Menu
        while (op > -1 && op < 6) {
            System.out.println("================================");
            System.out.println("          Calculadora!");
            System.out.println("================================");
            System.out.println("Selecione uma das opções abaixo:");
            System.out.println("(1) Calculadora");
            System.out.println("(2) Calculadora de IMC");
            System.out.println("(3) Calculadora de bits X Bytes");
            System.out.println("(4) Conversor de medidas");
            System.out.println("(5) Conversor de massas");
            System.out.println("(0) Sair");
            System.out.print("Digite a opção desejada: ");
            op = Teclado.nextInt();

            while (op < 0 || op > 5) {
                System.out.println(" ");
                System.out.println("---------OPÇÃO INVÁLIDA!---------");
                System.out.println("Selecione uma das opções abaixo:");
                System.out.println("(1) Calculadora simples");
                System.out.println("(2) Calculadora de IMC");
                System.out.println("(3) Calculadora de bits X Bytes");
                System.out.println("(4) Conversor de medidas");
                System.out.println("(5) Conversor de massas");
                System.out.println("(0) Sair");
                System.out.print("Digite a opção desejada: ");
                op = Teclado.nextInt();
            }

            // Inicio do Switch Case
            switch (op) {

                // OPÇÃO 1- CALCULADORA SIMPLES
                case 1:
                    calculadoraSimples calcSimples = new calculadoraSimples();
                    calcSimples.excecutar();
                    break;

                // OPÇÃO 2 - CALCULADORA DE IMC
                case 2:
                    calculadoraIMC calcIMC = new calculadoraIMC();
                    calcIMC.excecutar();
                    break;

                // OPÇÃO 3 - CALCULADORA DE BITS X BYTES
                case 3:
                    calculadoraBitsXBytes calcBytes = new calculadoraBitsXBytes();
                    calcBytes.excecutar();
                    break;

                // OPÇÃO 4 - CALCULADORA DE MEDIDAS
                case 4:
                    calculadoraMedidas calcMedidas = new calculadoraMedidas();
                    calcMedidas.excecutar();
                    break;

                // OPÇÃO 5 - CALCULADORA DE MASSAS
                case 5:
                    calculadoraMassas calcMassas = new calculadoraMassas();
                    calcMassas.excecutar();
                    break;

                // OPÇÃO 6 - SAIR DO PROGRAMA
                case 0:
                    System.out.println(" ");
                    System.out.println("--------------------");
                    System.out.println("Programa Finalizado!");
                    System.out.println("--------------------");
                    break;

            }
            if (op == 0){
                break;
            }
        }
    }
}

