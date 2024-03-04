import java.util.Random;

public class GeradorNumerosAleatorios {
    public static void main(String[] args) {
        Random random = new Random();
        
        int numeroAleatorio = random.nextInt(100);
        
        System.out.println("Número Aleatório: " + numeroAleatorio);
    }
}
