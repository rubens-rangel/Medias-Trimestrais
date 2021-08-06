import java.io.IOException;
import java.util.Scanner;

public class Medias {
  public static void main(String[] args) throws IOException {
  
	  //variaveis

	int i= 0;
	//String status = null; 

   // double media;  	
    System.out.println("Escreva quantidade de alunos:");
    Scanner sc = new Scanner(System.in);
    int qtd = sc.nextInt();
    Aluno aluno[] = new Aluno[qtd];
    
    do {  	 	
   	aluno[i] = new Aluno(); 	
   	
    Scanner scst = new Scanner(System.in);
    System.out.printf("Escreva nome do Aluno:");
    aluno[i].nome = scst.nextLine();
    System.out.println("Escreva as notas do 1Trimestre:");
    aluno[i].nota1t = scst.nextDouble();
    if (aluno[i].nota1t > 30) {System.out.println("Nota invalida"); break; }
    System.out.println("Escreva as notas do 2Trimestre:");
    aluno[i].nota2t = scst.nextDouble();
    if (aluno[i].nota1t > 30) {System.out.println("Nota invalida"); break;}
    System.out.println("Escreva as notas do 3Trimestre:");
    aluno[i].nota3t = scst.nextDouble(); 
    if (aluno[i].nota1t > 40) {System.out.println("Nota invalida"); break;}
    System.out.printf("Media: %.1f\n",aluno[i].Media());
    
  //  if (aluno[i].Media() >= 60.00 ){ status = "Aprovado"; }
   // else if (aluno[i].Media() < 50.00){status = "Reprovado";}
   // else if (aluno[i].Media() >= 50.00 && aluno[i].Media() <= 69.00){ status = "Fara a Avaliacao Final"; }
    i++;   
    
    }while ( i < qtd );
    
    for ( i=0; i<qtd; i++) {
    	System.out.println("Nome: " + aluno[i].nome + ", Media: " + aluno[i].Media() + ", Situacao: " + aluno[i].Situacao());
    }
    sc.close();
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

    
