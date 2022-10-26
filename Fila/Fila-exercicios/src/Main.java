import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Fila fila2 = new Fila(6);
        fila2.adicionarFinal(1);
        fila2.adicionarFinal(2);
        fila2.adicionarFinal(3);
        fila2.adicionarFinal(4);
        fila2.printarFila();
        fila2.adicionarInicio(9);
        fila2.printarFila();
        fila2.removerInicio();
        fila2.printarFila();
        fila2.removerFinal();
        fila2.printarFila();
        System.out.println("---------------------------");

        Scanner sc = new Scanner(System.in);
        int tamanho = sc.nextInt();
        Fila fila = new Fila(tamanho);
        int entrada = sc.nextInt();
        while (entrada == 1 || entrada == 2 || entrada == 3){
            if (entrada == 1){
                int elemento = sc.nextInt();
                fila.adicionarFinal(elemento);
            } else if (entrada == 2) {
                fila.removerFinal();
            } else if (entrada == 3) {
                fila.maiorElemento();
            }
            entrada = sc.nextInt();
        }
        System.out.println("---------------------------");

    }
}
