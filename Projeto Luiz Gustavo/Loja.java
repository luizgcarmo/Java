//Nome : Luiz Gustavo do Carmo RA : 2209993

import java.util.Scanner;

public class Loja {

public static void main(String[] args) {
	Scanner le = new Scanner(System.in);    
	Manga Mang = new Manga();
	Estoque Est = new Estoque();
	EntDados entD = new EntDados();
	boolean disp;
	int i=0;
    
	System.out.println("\n\t\t=== Bem Vindo a Loja! ======\n");
	System.out.println("\tEscolha a forma de entrada :");
    
	entD.entD();
	System.out.println("\tMostrar os Mangas Disponivel??");
	System.out.println("\t\t1 - Sim. \n\t\t2 - Nao.");

        i = le.nextInt();
        le.nextLine();

        if(i==1){            
            System.out.println("Nome do Manga : - "+Mang.getNome());
            System.out.println("\nNome do Autor : - "+Mang.getAutor());
            System.out.println("\nGenero : -"+Est.getGenero());
            System.exit(0);
            disp=Est.getDisponivel();
        if(disp){
            System.out.println("\nDisponivel no Estoque");
        }else
            System.out.println("\nIndisponivel no Estoque");
        }
	
    }
}