public class Estudante {
    private int matricula;
    private String nome;
    private char sexo;
    private double notas [] = new double[4];

    public Estudante(int matricula, String nome, char sexo) {
        this.matricula = matricula;
        this.nome = nome;
        this.sexo = sexo;
    }

    public void exibir() {
        System.out.println("matricula = " + matricula);
        System.out.println("nome = " + nome);
        System.out.println("sexo = " + sexo);
        System.out.println("notas = ");
        for (int i =0; i < notas.length; i++) {
            System.out.println(notas[i] + " ");
        }
    }

    public void atribuirNota(int numProva, double nota) {
        if (numProva >= 1 && numProva <= 4) {
            notas[numProva - 1] = nota;
        } else {
            System.out.println("Valor inválido.");
        }
    }

    public double lerNota (int numProva) {
        if (numProva > 0 && numProva <= 4) {
            return notas[numProva - 1];
        } else {
            throw new IllegalArgumentException("Valor inválido");
        }
    }

    public int getMatricula() {
        return matricula;
    }

    public String getNome() {
        return nome;
    }

    public char getSexo() {
        return sexo;
    }

    public double[] getNotas() {
        return notas;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public void setNotas(double[] notas) {
        this.notas = notas;
    }
}
