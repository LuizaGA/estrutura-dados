public class Main {
    public static void main(String[] args) {
        PilhaString pilhaString = new PilhaString(5);
        System.out.println(pilhaString.checarPalindromo("arara"));

        System.out.println("--------------------------------");

        Pilha pilha = new Pilha(8);
        pilha.adicionarFinal(3);
        pilha.adicionarFinal(1);
        pilha.adicionarFinal(9);
        pilha.adicionarFinal(2);
        pilha.adicionarFinal(5);
        
        pilha.printarPilha();
        pilha.inverterPilha();
        pilha.printarPilha();
        pilha.eliminarMaior();
        pilha.printarPilha();
        pilha.eliminarMenor();
        pilha.printarPilha();
    }
}