public class Main {
    public static void main(String[] args) {
        Estudante estudante = new Estudante(1234, "Carlos", 'M');

        estudante.atribuirNota(1, 10.0);
        estudante.atribuirNota(2, 7.0);
        estudante.atribuirNota(3, 9.0);
        estudante.atribuirNota(4, 8.5);
        estudante.exibir();

        System.out.println("Nota da Prova 1: " + estudante.lerNota(1));
    }
}