public class Pilha{
    private int[] vetor_elementos;
    private int numero_elementos;

    public Pilha(int tamanho){
        vetor_elementos = new int[tamanho];
        numero_elementos = 0;
    }

    public boolean pilhaVazia(){
        if(numero_elementos == 0){
            return true;
        }
        else {
            return false;
        }
    }

    public boolean pilhaCheia(){
        if(numero_elementos >= vetor_elementos.length){
            return true;
        }
        else {
            return false;
        }
    }

    public void adicionarFinal(int elemento){
        if(pilhaCheia()){
            System.out.println("Estrutura Cheia!");
        }
        else {
            int indice = numero_elementos;
            vetor_elementos[indice] = elemento;
            numero_elementos = numero_elementos + 1;
        }
    }

    public int removerFinal() {
        if(pilhaVazia()){
            System.out.println("Estrutura Vazia!");
            return 0;
        }
        else {
            int indice = numero_elementos - 1;
            int elemento_removido = vetor_elementos[indice];
            numero_elementos = indice;
            return elemento_removido;
        }
    }


    public void printarPilha(){
        Pilha auxiliar = new Pilha(numero_elementos);
        for(int indice = this.numero_elementos - 1; indice >= 0; indice--){
            int elemento = this.removerFinal();
            auxiliar.adicionarFinal(elemento);
        }
        for(int indice = auxiliar.numero_elementos - 1; indice >= 0; indice--) {
            int elemento = auxiliar.removerFinal();
            System.out.print(elemento + " ");
            this.adicionarFinal(elemento);
        }
        System.out.println("Número de elementos = " + this.numero_elementos);
    }

    public void inverterPilha(){
        Pilha auxiliar = new Pilha(numero_elementos);
        Pilha auxiliar2 = new Pilha(numero_elementos);
        for(int indice = this.numero_elementos - 1; indice >= 0; indice--){
            int elemento = this.removerFinal();
            auxiliar.adicionarFinal(elemento);
        }

        for(int indice = auxiliar.numero_elementos - 1; indice >= 0; indice--) {
            int elemento = auxiliar.removerFinal();
            auxiliar2.adicionarFinal(elemento);
        }
        for(int indice = auxiliar2.numero_elementos - 1; indice >= 0; indice--) {
            int elemento = auxiliar2.removerFinal();
            this.adicionarFinal(elemento);
        }
    }

    public int eliminarMaior(){
        if(pilhaVazia()){
            System.out.println("Estrutura Vazia!");
            return 0;
        }else {
            int maior = vetor_elementos[0];
            Pilha auxiliar = new Pilha(this.numero_elementos);

            for (int i = this.numero_elementos-1 ; i >=1 ; i--){
                auxiliar.adicionarFinal(this.removerFinal());
                if (maior < vetor_elementos[i]){
                    maior = vetor_elementos[i];
                }
            }

            for (int i = auxiliar.numero_elementos-1  ; i >= 0; i--){
                int aux = auxiliar.removerFinal();
                if(maior != aux){
                    this.adicionarFinal(aux);
                }
            }
            return maior;
        }
    }

    public int eliminarMenor(){
        if(pilhaVazia()){
            System.out.println("Estrutura Vazia!");
            return 0;
        }else {
            int menor = vetor_elementos[0];
            Pilha auxiliar = new Pilha(this.numero_elementos);

            for (int i = this.numero_elementos-1 ; i >=1 ; i--){
                auxiliar.adicionarFinal(this.removerFinal());
                if (menor > vetor_elementos[i]){
                    menor = vetor_elementos[i];
                }
            }

            for (int i = auxiliar.numero_elementos-1  ; i >= 0; i--){
                int aux = auxiliar.removerFinal();
                if(menor != aux){
                    this.adicionarFinal(aux);
                }
            }
            return menor;
        }
    }

    //public void ordenar(){}

}
