import java.util.Scanner;

public class Forca {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[] palavras = {"computador","senac","programação","java","tecnologia","estudo"};
        String palavraEscolhida = palavras[(int) (Math.random() * palavras.length)];
        char[] palavraSecreta = new char[palavraEscolhida.length()];
        boolean[] letraDescobertas = new boolean[palavraEscolhida.length()];
        int tentativas = 6;

        for(int i =0; i < palavraEscolhida.length(); i++){
            palavraSecreta[i] = '_';
        }

        while(tentativas > 0){
            System.out.println("Palavra: ");

            for(int i = 0; i < palavraEscolhida.length(); i++){
               
               if(letraDescobertas[i]){
                  System.out.println(palavraEscolhida.charAt(i)+" ");
               }else{
                System.out.println(palavraSecreta[i]+" ");
               }
              
            }
            System.out.println("\n Tentativas restantes: "+ tentativas);
            System.out.println("Digite uma letra: ");
            char letra = input.nextLine().charAt(0);

            boolean letraEncontrada = false;
            for(int i = 0; i < palavraEscolhida.length(); i ++){
                if(palavraEscolhida.charAt(i) == letra){
                    letraDescobertas[i] = true;
                    letraEncontrada = true;
                }
            }

            boolean todsaLetrasDescobertas = true;
            for( boolean descobertas : letraDescobertas){
                if(!descobertas){
                    todsaLetrasDescobertas = false;
                    break;
                }
            }

            if(todsaLetrasDescobertas){
                System.out.println("Parabéns Zé! Vai ser pai de novo! palavra escolhida era: "+ palavraEscolhida);
                break;
            }

            if(!letraEncontrada){
                tentativas ++;
                System.out.println("Letra incorreta, Tente novamente");
            }

            if(tentativas == 0){
                System.out.println("Perdeu Playboy! A palavra era: "+ palavraEscolhida);
            }

        } input.close();
    }
}
