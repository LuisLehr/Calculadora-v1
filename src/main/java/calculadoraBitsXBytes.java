import java.util.Scanner;

public class calculadoraBitsXBytes {
    // Scanner para entrada de dados
    Scanner scanner = new Scanner(System.in);

    // Método executar que pode ser chamado pela classe principal
    public void excecutar() {
        int op = 1;
        while (op == 1) {
            // Cabeçalho da calculadora
            System.out.println("---------------------");
            System.out.println("Calculadora de Bytes");
            System.out.println("---------------------");

            // Recebe a unidade de origem
            System.out.print("Digite a unidade de origem (B, KB, MB, GB, TB, PB, BIT): ");
            String unidadeOrigem = scanner.next().trim().toUpperCase();

            // Recebe a unidade de destino
            System.out.print("Digite a unidade de destino (B, KB, MB, GB, TB, PB, BIT): ");
            String unidadeDestino = scanner.next().trim().toUpperCase();

            // Recebe o valor a ser convertido
            System.out.print("Digite o valor a ser convertido: ");
            double valor = scanner.nextDouble();

            // Loop while que se repete toda vez que o usuário entra com alguma medida invalida
            while (!unidadeOrigem.equals("B") && !unidadeOrigem.equals("KB") && !unidadeOrigem.equals("MB") && !unidadeOrigem.equals("GB") &&
                    !unidadeOrigem.equals("TB") && !unidadeOrigem.equals("PB") && !unidadeOrigem.equals("BIT") || !unidadeDestino.equals("B") &&
                    !unidadeDestino.equals("KB") && !unidadeDestino.equals("MB") && !unidadeDestino.equals("GB") && !unidadeDestino.equals("TB") &&
                    !unidadeDestino.equals("PB") && !unidadeDestino.equals("BIT")) {

                System.out.println("---------------------");
                System.out.println("   MEDIDA INVÁLIDA");
                System.out.println("---------------------");

                // Recebe a unidade de origem
                System.out.print("Digite a unidade de origem (B, KB, MB, GB, TB, PB, BIT): ");
                unidadeOrigem = scanner.next().trim().toUpperCase();

                // Recebe a unidade de destino
                System.out.print("Digite a unidade de destino (B, KB, MB, GB, TB, PB, BIT): ");
                unidadeDestino = scanner.next().trim().toUpperCase();

                // Recebe o valor a ser convertido
                System.out.print("Digite o valor a ser convertido: ");
                valor = scanner.nextDouble();
            }

            try {
                // Realiza a conversão
                double resultado = converterUnidades(valor, unidadeOrigem, unidadeDestino);
                System.out.println("----------------------");
                System.out.printf("Resultado: %.3f %s\n", resultado, unidadeDestino);
                System.out.println("----------------------");
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }

            // Pergunta se o usuário deseja continuar
            System.out.print("Deseja realizar outra conversão? \nDigite 1 para continuar \nDigite 0 para sair: ");
            op = scanner.nextInt();
        }
    }

    // Função para converter entre as unidades
    public double converterUnidades(double valor, String unidadeOrigem, String unidadeDestino) {
        // Definir os fatores de conversão baseados em bytes
        double fatorOrigem = obterFator(unidadeOrigem);
        double fatorDestino = obterFator(unidadeDestino);

        // Converte para bytes como intermediário, e depois para a unidade de destino
        return valor * (fatorOrigem / fatorDestino);
    }

    // Função para obter o fator de conversão para cada unidade
    public double obterFator(String unidade) {
        switch (unidade.toUpperCase()) {
            case "B": return 1; // Bytes
            case "KB": return 1024; // Kilobytes
            case "MB": return 1024 * 1024; // Megabytes
            case "GB": return 1024 * 1024 * 1024; // Gigabytes
            case "TB": return 1024L * 1024 * 1024 * 1024; // Terabytes
            case "PB": return 1024L * 1024 * 1024 * 1024 * 1024; // Petabytes
            case "BIT": return 1.0 / 8; // Bits
            default: throw new IllegalArgumentException("Unidade inválida: " + unidade);
        }
    }
}
