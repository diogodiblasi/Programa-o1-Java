package Av1;

import java.util.ArrayList;
import java.util.List;

public class AlunoPosGraduacao extends Pessoa implements SolicitacoesAluno{
	
	
	private int modulo;
	public int getModulo() {
		return modulo;
	}
	
	List<Disciplina> disciplina = new ArrayList <Disciplina>();


	public void setModulo(int modulo) {
		this.modulo = modulo;
	}

	private String trabalhoConclusao;

	public String getTrabalhoConclusao() {
		return trabalhoConclusao;
	}

	public void setTrabalhoConclusao(String trabalhoConclusao) {
		this.trabalhoConclusao = trabalhoConclusao;
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
