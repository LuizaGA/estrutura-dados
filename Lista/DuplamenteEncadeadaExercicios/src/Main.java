public class Main {
    public static void main(String[] args) throws EstruturaVaziaException {
        Lista lista = new Lista();
        lista.adicionarInicio(5);
        lista.adicionarInicio(6);
        lista.adicionarInicio(3);
        lista.adicionarInicio(4);
        lista.adicionarFinal(1);
        lista.adicionarFinal(9);
        lista.adicionarFinal(7);
        lista.printarLista();

        System.out.println("qual a posicao do elemento 9?");
        System.out.println(lista.buscarElemento(9));
        System.out.println("remover elemento meio");
        lista.removerNoMeio();
        lista.printarLista();
        System.out.println("a lista contem elementos repetidos?");
        System.out.println(lista.verificarRepetidos());
        System.out.println("inverter lista");
        lista.inverterLista();
        lista.printarLista();
        System.out.println("remover o elemento da posicao 2");
        lista.removerNaPosicao(2);
        lista.printarLista();
    }
}
