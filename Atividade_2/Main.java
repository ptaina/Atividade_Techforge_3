public class Main {
    public static void main(String[] args) {

        ContaBancaria conta1 = new ContaBancaria("12345", "Carlos Silva", 500.0);
        ContaBancaria conta2 = new ContaBancaria("67890", "Ana Oliveira", 1000.0);


        conta1.exibirInformacoes();
        System.out.println();
        conta2.exibirInformacoes();
        System.out.println();


        conta1.depositar(150.0);
        conta1.sacar(200.0);
        conta1.sacar(500.0);
        System.out.println();

        conta2.depositar(-50.0);
        conta2.sacar(300.0);
        conta2.exibirInformacoes();
    }
}
