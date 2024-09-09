public class Condicao {
    public static void main(String[] args) {
        int valor = 50;

        if (valor > 150) {
            System.out.println("Valor eh maior que 150");
        }
        else if (valor < 150){
            System.out.println("Valor eh menor que 150");
        }
        else{
            System.out.println("Valor eh 150");
        }

        boolean maiorQue100 = valor > 100;

        if (maiorQue100){
            System.out.println("Valor eh maior que 100");
        }
        else{
            System.out.println("Valor nao eh maior que 100");
        }

    }
}