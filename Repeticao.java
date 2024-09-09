public class Repeticao {
    public static void main(String[] args) {
        System.err.println("Contando ate 100 com while");
        int contador = 0;

        while (contador <= 100){
            System.err.println(contador);
            contador += 1;
        }

        System.err.println("\nContando ate 100 com for");
        for (int i = 0; i <= 100; i++){
            System.out.println(i);
        }
    }
}