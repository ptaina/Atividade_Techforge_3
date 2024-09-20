public class Main {
    public static void main(String[] args) {

        Universidade princeton = new Universidade("Princeton");
        Universidade cambridge = new Universidade("Cambridge");


        Pessoa einstein = new Pessoa("Albert Einstein", "14/03/1879", princeton);
        Pessoa newton = new Pessoa("Isaac Newton", "04/01/1643", cambridge);


        einstein.exibirInformacoes();
        System.out.println();
        newton.exibirInformacoes();
    }
}
