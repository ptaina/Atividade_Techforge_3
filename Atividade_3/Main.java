public class Main {
    public static void main(String[] args) {

        Aluno aluno1 = new Aluno("João", 17, 70.0, 1.75);
        Aluno aluno2 = new Aluno("Maria", 22, 60.0, 1.65);


        aluno1.exibirInformacoes();
        System.out.println();
        aluno2.exibirInformacoes();
    }
}
