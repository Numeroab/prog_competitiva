import java.util.Arrays;
import java.util.Random;

public class ImplementacaoRandom {
    //o numero maximo repetido segue log(n)
    public static void main(String[] args) {
        int[] vetor = new int[100000];
        int valor = 0;
        int contador = 0;
        int contadorAnt = 0;
        Random geradorRandom = new Random();
        for (int i = 0; i < vetor.length; i++) {
            vetor[i] = geradorRandom.nextInt(100000);
            if (vetor[i] == 1) {
                contador++;
            }
        }
        Arrays.sort(vetor);
        for (int i = 0; i < vetor.length - 1; i++) {
            if (vetor[i] != vetor[i +1]) {
                if (contadorAnt > contador) {
                    contador = contadorAnt;
                    valor = vetor[i];
                }
                contadorAnt = 0;
            } else {
                contadorAnt++;
            }
        }
        for (int i = 0; i < vetor.length; i++) {
            System.out.println(vetor[i]);

        }
        System.out.println();
        System.out.println();
        System.out.println(valor);
        System.out.println(contador);
    }
}