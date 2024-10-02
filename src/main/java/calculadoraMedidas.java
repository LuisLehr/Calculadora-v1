// Imports da classe calculadoraMedidas
import java.util.Scanner;

public class calculadoraMedidas {
    //Scanner para entrada de dados
    Scanner Teclado = new Scanner(System.in);

    // Classe excecutar para rodar o programa na classe Principal
    public void excecutar() {
        int op = 1;

        while (op == 1) {
            // Cabeçalho da calculadora
            System.out.println(" ");
            System.out.println("-----------------------");
            System.out.println("Calculadora de Medidas");
            System.out.println("-----------------------");

            // Entrada de medida de entrada
            System.out.print("Digite a medida de entrada (MM, CM, DM, M, DAM, HM, KM): ");
            String unidadeOrigem = Teclado.next().trim().toUpperCase();

            // Entrada de medida de saida
            System.out.print("Digite a medida de saída (MM, CM, DM, M, DAM, HM, KM): ");
            String unidadeSaida = Teclado.next().trim().toUpperCase();

            // Entrada do valor a ser convertido
            System.out.print("Digite o valor a ser convertido: ");
            double valor = Teclado.nextDouble();

            while (!unidadeOrigem.equals("MM") && !unidadeOrigem.equals("CM") && !unidadeOrigem.equals("DM") &&
                    !unidadeOrigem.equals("M") && !unidadeOrigem.equals("DAM") && !unidadeOrigem.equals("HM") &&
                    !unidadeOrigem.equals("KM") || !unidadeSaida.equals("MM") && !unidadeSaida.equals("CM") &&
                    !unidadeSaida.equals("DM") && !unidadeSaida.equals("M") && !unidadeSaida.equals("DAM") &&
                    !unidadeSaida.equals("HM") && !unidadeSaida.equals("KM")) {

                System.out.println(" ");
                System.out.println("-----------------------");
                System.out.println("   MEDIDA INVÁLIDA");
                System.out.println("-----------------------");

                // Entrada de medida de entrada
                System.out.print("Digite a medida de entrada (MM, CM, DM, M, DAM, HM, KM): ");
                unidadeOrigem = Teclado.next().trim().toUpperCase();

                // Entrada de medida de saida
                System.out.print("Digite a medida de saída (MM, CM, DM, M, DAM, HM, KM): ");
                unidadeSaida = Teclado.next().trim().toUpperCase();

                // Entrada do valor a ser convertido
                System.out.print("Digite o valor a ser convertido: ");
                valor = Teclado.nextDouble();

                // Realiza a conversao
                try {
                    double resultado = converterUnidades(valor, unidadeOrigem, unidadeSaida);
                    System.out.println("---------------");
                    System.out.printf("Resultado: %.3f %s\n", resultado, unidadeSaida);
                    System.out.println("---------------");
                } catch (IllegalArgumentException e) {
                    System.out.println(e.getMessage());
                }


                // Pergunta se o usuário deseja continuar
                System.out.print("Deseja realizar outra conversão? \nDigite 1 para continuar \nDigite 0 para sair: ");
                op = Teclado.nextInt();
            }
        }
    }

    // Método para converter as unidades
    public double converterUnidades(double valor, String unidadeOrigem, String unidadeSaida){
        // Definir os fatores de conversao baseados nas medidas
        double fatorOrigem = obterFator(unidadeOrigem);
        double fatorSaida = obterFator(unidadeSaida);

        // Calculo para converter as medidas
        return valor * (fatorOrigem / fatorSaida);
    }

    public double obterFator(String unidade){
        switch (unidade.toUpperCase()){
            case "MM": return 1; // milimetros
            case "CM": return 10; // centrimetros
            case "DM": return 10 * 10; // decímetros
            case "M": return 10 * 10 * 10; //metros
            case "DAM": return 10 * 10 * 10 * 10; //decâmetro
            case "HM": return  10 * 10 * 10 * 10 * 10; //hectometro
            case "KM": return 10 * 10 * 10 * 10 * 10 * 10; //kilômetro
            default: throw new IllegalArgumentException("Unidade Inválida: " + unidade);
        }
    }
    
    public boolean unidadeValida(String unidade){
        return unidade.equals("MM") || unidade.equals("CM") || unidade.equals("DM") || unidade.equals("M") ||
               unidade.equals("DAM") || unidade.equals("HM") || unidade.equals("KM");
    }
}
