// Imports da classe calculadoraMassas
import java.util.Scanner;

// Inicio da classe calculadoraMassas
public class calculadoraMassas {
    // iniciando variaveis da classe
    int op = 1;
    String medidaEntrada = "";
    String medidaSaida = "";
    double valor = 0;

    // Iniciando a classe Scanner
    Scanner Teclado = new Scanner(System.in);

    // Inicio do metodo excecutar, esse método é puxado na classe Principal
    public void excecutar() {
        while (op == 1) {
            // Cabeçalho da calculadora
            System.out.println(" ");
            System.out.println("---------------------");
            System.out.println(" Conversor de massas");
            System.out.println("---------------------");

            // Entrada da medida de entrada para conversao
            System.out.print("Digite a medida de entrada (MG, CG, DG, G, DAG, HG, KG): ");
            medidaEntrada = Teclado.next().trim().toUpperCase();

            // Entrada da medida de saida da conversao
            System.out.print("Digite a medida de saída (MG, CG, DG, G, DAG, HG, KG): ");
            medidaSaida = Teclado.next().trim().toUpperCase();

            //Entrada do valor a ser convertido
            System.out.print("Digite o valor a ser convertido: ");
            valor = Teclado.nextDouble();

            //Loop while para repetir toda vez que o usuario entrar com uma medida invalida
            while (!medidaEntrada.equals("MG") && !medidaEntrada.equals("CG") && !medidaEntrada.equals("DG") && !medidaEntrada.equals("G") &&
                    !medidaEntrada.equals("DAG") && !medidaEntrada.equals("HG") && !medidaEntrada.equals("KG") || !medidaSaida.equals("MG") &&
                    !medidaSaida.equals("CG") && !medidaSaida.equals("DG") && !medidaSaida.equals("G") && !medidaSaida.equals("DAG") &&
                    !medidaSaida.equals("HG") && !medidaSaida.equals("KG")) {

                System.out.println(" ");
                System.out.println("---------------------- ");
                System.out.println("    MEDIDA INVÁLIDA");
                System.out.println("---------------------- ");

                System.out.print("Digite a medida de entrada (MG, CG, DG, G, DAG, HG, KG): ");
                medidaEntrada = Teclado.next();

                System.out.print("Digite a medida de saída (MG, CG, DG, G, DAG, HG, KG): ");
                medidaSaida = Teclado.next();

                System.out.print("Digite o valor a ser convertido: ");
                valor = Teclado.nextDouble();
            }

            // Realiza a conversão
            try {
                double resultado = converterUnidades(valor, medidaEntrada, medidaSaida);
                System.out.println("---------------");
                System.out.printf("Resultado: %.2f %s\n", resultado, medidaSaida);
                System.out.println("---------------");
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }


            // Pergunta se o usuário deseja continuar
            System.out.print("Deseja realizar outra conversão? \nDigite 1 para continuar \nDigite 0 para sair: ");
            op = Teclado.nextInt();

        }
    }

    // Método para converter as unidades
    public double converterUnidades ( double valor, String unidadeOrigem, String unidadeSaida){
        //Definir os fatores de conversao baseado nas medidas
        double fatorOrigem = obterFator(unidadeOrigem);
        double fatorSaida = obterFator(unidadeSaida);

        // Calculo para converter as medidas
        return valor * (fatorOrigem / fatorSaida);
    }


    public double obterFator (String unidade){
        switch (unidade.toUpperCase()) {
            case "MG":
                return 1; // Miligrama
            case "CG":
                return 10; // Centigrama
            case "DG":
                return 10 * 10; // Decigrama
            case "G":
                return 10 * 10 * 10; // Grama
            case "DAG":
                return 10 * 10 * 10 * 10; //Decagrama
            case "HG":
                return 10 * 10 * 10 * 10 * 10; // Hectograma
            case "KG":
                return 10 * 10 * 10 * 10 * 10 * 10; // Quilograma
            default:
                throw new IllegalArgumentException("Unidade inválida: " + unidade);
        }
    }
}



