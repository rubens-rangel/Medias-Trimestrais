public class Aluno {
	public String nome;
	public String status;
	public double nota1t;
	public double nota2t;
	public double nota3t;

	public double Media() {
	double media = nota1t + nota2t + nota3t;
	return media;
	}
	public String Situacao(){
		  if (this.Media() >= 60.00 ){ status = "Aprovado"; }
		  if (this.Media() < 50.00){status = "Reprovado";}
		  if (this.Media() >= 50.00 && this.Media() <= 69.00){ status = "Fara a Avaliacao Final"; }
		  return status;
	}	
}
