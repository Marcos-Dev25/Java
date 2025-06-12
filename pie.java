import java.util.Scanner;

public class SistemaEscolar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[] notas = new double[8];
        
        // Recebendo as notas do aluno
        System.out.println("Digite as 8 notas anuais:");
        for (int i = 0; i < 8; i++) {
            System.out.print("Nota " + (i + 1) + ": ");
            notas[i] = scanner.nextDouble();
        }
        
        // Calculando médias bimestrais
        double[] mediasBimestrais = new double[4];
        for (int i = 0; i < 4; i++) {
            mediasBimestrais[i] = (notas[i * 2] + notas[i * 2 + 1]) / 2;
        }

        // Calculando médias semestrais
        double[] mediasSemestrais = new double[2];
        for (int i = 0; i < 2; i++) {
            mediasSemestrais[i] = (mediasBimestrais[i * 2] + mediasBimestrais[i * 2 + 1]) / 2;
        }

        // Calculando média final
        double mediaFinal = (mediasSemestrais[0] + mediasSemestrais[1]) / 2;

        // Exibindo resultados
        System.out.println("\nResultados:");
        for (int i = 0; i < 4; i++) {
            System.out.println("Média do " + (i + 1) + "º bimestre: " + mediasBimestrais[i]);
        }
        for (int i = 0; i < 2; i++) {
            System.out.println("Média do " + (i + 1) + "º semestre: " + mediasSemestrais[i]);
        }
        System.out.println("Média final: " + mediaFinal);

        scanner.close();
    }
}