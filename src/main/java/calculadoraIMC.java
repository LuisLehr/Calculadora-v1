// Imports da classe
import java.util.Scanner;
import java.text.DecimalFormat;

// Inicio da classe calculadoraIMC
public class calculadoraIMC {
    // Definindo as variaveis da classe
    int op = 1;
    double altura = 0;
    double peso = 0;
    double imc = 0;
    String classificacao = "";

    // Formato para dois números após a vírgula
    DecimalFormat df = new DecimalFormat("#.00");

    //Inicio da classe Scanner Teclado
    Scanner Teclado = new Scanner(System.in);

    // Método excecutavel da classe
    public void excecutar() {

        while (op == 1) {
            System.out.println(" ");
            System.out.println("-----------------------------------");
            System.out.println("Seja bem vindo a calculadora de IMC");
            System.out.println("-----------------------------------");
            System.out.print("Digite sua altura em centímetros (exemplo: 185): ");
            altura = Teclado.nextDouble();

            // Convertendo a altura para os padroes do calculo de IMC
            altura = altura / 100;

            System.out.print("Digite seu peso (exemplo: 72.5): ");
            peso = Teclado.nextDouble();

            // Calculo de IMC
            imc = (peso / (altura * altura));

            // Condicoes para classificar o IMC do usuario dentro da tabela
            if (imc <= 16.9){
                classificacao = "Muito abaixo do peso";
            }
            if (imc >= 17  && imc <= 18.4){
                classificacao = "Abaixo do peso";
            }
            if (imc >= 18.5 && imc <= 24.9){
                classificacao = "Peso normal";
            }
            if (imc >= 25 && imc <= 29.9){
                classificacao = "Acima do peso";
            }
            if (imc >= 30 && imc <= 34.9){
                classificacao = "Obesidade grau I";
            }
            if (imc >=  35 && imc <= 40){
                classificacao = "Obesidade grau II";
            }
            if (imc > 40){
                classificacao = "Obesidade grau III";
            }

            System.out.println("--------------------------------------");
            System.out.println("            TABELA DE IMC");
            System.out.println("--------------------------------------");
            System.out.println("Menor que 16.9: muito abaixo do peso");
            System.out.println("17 a 18.4: abaixo do peso");
            System.out.println("18.5 a 24.9: peso normal");
            System.out.println("25 a 29.9: acima do peso");
            System.out.println("30 a 34.9: obesidade grau I");
            System.out.println("35 a 40: obesidade grau II");
            System.out.println("Acima de 40: obesidade grau III");
            System.out.println(" ");
            System.out.println("----------------------");
            System.out.println("Seu IMC é: " + df.format(imc));
            System.out.println(classificacao);
            System.out.println("----------------------");
            System.out.println("Deseja fazer outro calculos de IMC?");
            System.out.print("Digite 1 para continuar. \nDigite 0 para sair.\nOpção desejada: ");
            op = Teclado.nextInt();

            if (op == 0){
                break;
            }
        }
    }
}
