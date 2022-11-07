package Av1;

import java.util.ArrayList;
import java.util.List;

public class AlunoGraduacao extends Pessoa implements SolicitacoesAluno{
	
	private int semestre;
	

	List<Disciplina> disciplina = new ArrayList <Disciplina>();

	public int getSemestre() {
		return semestre;
	}


	public void setSemestre(int semestre) {
		this.semestre = semestre;
	}


	public AlunoGraduacao() {
}


	@Override
	public void solicitarHistorico() {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void solicitarFrequencia() {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void inscreverDisciplina() {
		// TODO Auto-generated method stub
		
	}
	





	
}
