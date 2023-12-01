package ExercicioMath;

import java.util.Random;
import java.util.Scanner;

public class Projetin {
    public static void main(String[] args) {
        // Criar um objeto da classe Random para gerar o número aleatório
        Random random = new Random();

        // Gerar um número aleatório entre 1 e 100 (inclusive)
        int numeroAleatorio = random.nextInt(100) + 1;

        // Inicializar o scanner para a entrada do usuário
        Scanner scanner = new Scanner(System.in);

        // Variável para armazenar a tentativa do usuário
        int tentativa;

        // Contador de tentativas
        int tentativas = 0;

        System.out.println("Bem-vindo ao 'Guess the Number!'");

        // Loop do-while para permitir múltiplas tentativas
        do {
            // Solicitar a tentativa do usuário
            System.out.print("Digite um número entre 1 e 100: ");
            tentativa = scanner.nextInt();

            // Incrementar o contador de tentativas
            tentativas++;

            // Verificar se a tentativa está correta
            if (tentativa == numeroAleatorio) {
                System.out.println("Parabéns! Você acertou em " + tentativas + " tentativas.");
            } else if (tentativa < numeroAleatorio) {
                System.out.println("Tente um número maior.");
            } else {
                System.out.println("Tente um número menor.");
            }

        } while (tentativa != numeroAleatorio);

        // Fechar o scanner
        scanner.close();
    }
}

