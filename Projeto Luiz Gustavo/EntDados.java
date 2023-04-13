//Nome : Luiz Gustavo do Carmo RA : 2209993

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class EntDados{
    Scanner Ler = new Scanner(System.in);
    Cliente Cliente = new Cliente();
    Estoque estoq = new Estoque();
    InputStreamReader c = new InputStreamReader(System.in);
    BufferedReader cd = new BufferedReader(c);
    
    private boolean cont = true;
    private int x = 0;
    private int i = 0;
    private int ve = 0;
    private int b = 0;
    private String n = "";

    public void entD(){
        System.out.println("\t\t Metododo de Entrada: \n \t\t - 1 Funcionario \n\t\t - 2 Cliente");
        
        x = Ler.nextInt();

    switch (x) {
        case 1:
            System.out.println("\tCadastro de Cliente? \n\t\t 1 - Sim. \n\t\t 2 - Nao");
            do{
		Ler.nextLine();
                ve = Ler.nextInt();

                if(ve==1 || ve==2){
                    cont = false;
                    break;
                }else{
                    System.out.println("Entrada errada!!");
                }

            }while(cont);
            
            if(ve==1){
                System.out.println("\n\t Digite o Nome do cliente \n");
		
		try{          
                    n = cd.readLine();                
                }
		catch(IOException e){
	                System.out.println("Erro de entrada");
            	}

                System.out.println("\t Digite o CPF do Cliente : \n");
                
		Ler.nextLine();
		
		b = Ler.nextInt();

                Cliente.setCliente(n,b);
		
		System.out.println("\tMostrar Cliente cadastrado?");
		System.out.println("\t\t1 - Sim.  \n\t\t2 - Nao.");
	
		i = Ler.nextInt();
		Ler.nextLine();
	
		if(i==1){
	        	System.out.println("\t Nome : "+Cliente.getClienteNome());
			System.out.println("\t CPF : "+Cliente.getClienteCpf());
		}    
            
                           
            }

           
            if(ve==2){
            System.out.println("\n\t\tVerificaçao do estoque.");
            
            System.out.println("Em Estoque :\n");
            System.out.println("Quantidade em Estoque : "+estoq.getNumEstoque());
            System.out.println("Quantidade de Volumes : "+estoq.getquantVol());  
	    
	    }
        break;
        case 2:  
            Cliente.Cliente();
        break;

        default:
            System.out.println("Erro de Entrada");
	    System.exit(0);
            
        }
    }
}
        
        

     
    

