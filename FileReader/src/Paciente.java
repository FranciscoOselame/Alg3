
public class Paciente {
	String rg;
	String nome;
	String dataDeNascimento;
	
	public Paciente(String nome, String rg, String dataDeNascimento){
		this.rg = rg;
		this.nome = nome;
		this.dataDeNascimento = dataDeNascimento;
	}
	
	public String getRg() {
		return rg;
	}
	public void setRg(String rg) {
		this.rg = rg;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getDataDeNascimento() {
		return dataDeNascimento;
	}
	public void setDataDeNascimento(String dataDeNascimento) {
		this.dataDeNascimento = dataDeNascimento;
	}
	
	public String toString(){
		return "Nome: "+getNome()+
			   "\nRG: "+getRg()+
			   "\nData de Nascimento: "+getDataDeNascimento()+
			   "\n-----\\-------\\-----\\-------\\------\\";
	}
}
