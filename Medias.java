import java.io.IOException;
import java.util.Scanner;

public class Medias {
  public static void main(String[] args) throws IOException {
  
	  //variaveis
	int qtd;
	int i= 1;
	String status = null; 

	
   // double media;  
	
    Scanner sc = new Scanner(System.in);
    Scanner scst = new Scanner(System.in);
    System.out.println("Escreva quantidade de alunos");
    qtd = sc.nextInt();
    
    Aluno[] aluno = new Aluno[qtd];
    
    do {
    	aluno[i] = new Aluno(); 
    	
    System.out.printf("Escreva nome do Aluno:");
    aluno[i].nome = scst.nextLine();
    System.out.println("Escreva as notas do 1Trimestre:");
    aluno[i].nota1t = sc.nextDouble();
    System.out.println("Escreva as notas do 2Trimestre:");
    aluno[i].nota2t = sc.nextDouble();
    System.out.println("Escreva as notas do 3Trimestre:");
    aluno[i].nota3t = sc.nextDouble();   
       
    System.out.printf("Media: %.1f\n",aluno[i].Media());
    
    if (aluno[i].Media() >= 60 ){ status = "Aprovado"; }
    else if (aluno[i].Media() < 50){status = "Reprovado";}
    else if (aluno[i].Media() >= 50 && aluno[i].Media() <= 69){ status = "Fara a Avaliacao Final"; }
    i++;   
    }while ( i <= qtd );
    

    do {    	 
    	System.out.println("Nome: " + aluno[i].nome + "Media: " + aluno[i].Media() + "Situacao:" + status);
    	i++;
    }while ( i <= qtd );
  }
}
  
  
  
  
  
     /* Extra  - Estrutura para lançamento de Nota do exame final
    emexame = sc.nextFloat();
     System.out.printf("Nota do exame: %.1f\n", emexame);
      ntfinal = (emexame + media) / 2;

      if (ntfinal >= 5){
        System.out.printf("Aluno aprovado.\n");
        System.out.printf("Media final: %.1f\n", ntfinal);
      }
      else{
        System.out.printf("Aluno reprovado\n");
        System.out.printf("Media final: %.1f\n",ntfinal);
     }*/
    
