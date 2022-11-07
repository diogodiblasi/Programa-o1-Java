package Av1;

public class TesteAluno {
	public static void main(String[] args) {
		
		
		AlunoGraduacao aluno1 = new AlunoGraduacao();
		
		aluno1.nome = "Diogo";
		aluno1.cpf = 1454942443;
		aluno1.email = "diogodiblasi@gmail.com";
		aluno1.endereco = "Rua blasi";
		aluno1.telefone = 12432424;
		aluno1.matricula = 1990;
		
		
		System.out.println("Aluno 1 cadastro: " + aluno1);
		
	}

}
