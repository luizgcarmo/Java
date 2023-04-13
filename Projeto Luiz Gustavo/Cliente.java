//Nome : Luiz Gustavo do Carmo RA : 2209993

import java.util.Scanner;

public class Cliente{
    Scanner L = new Scanner(System.in);
    private String NomeClient = "Teste";
    private int CPF = 001;


    public void setCliente(String NomeCliente, int CPF){
        this.NomeClient = NomeClient;
        this.CPF = CPF;
    }

    public void Cliente(){
        System.out.println("\n\t Menu Cliente : \n\t\t 1 - Compra. \n\t\t 2 - Leitura.");
        int s = 0;
        boolean x = true;
        do{
        
        s = L.nextInt();

	L.nextLine();
        
	if(s==1 || s==2){
            x = false;
            break;
        }
        else{
                System.out.println("Erro de Entrada!!!");
		System.exit(0);            
        }
        
        }while(x);

      }
        
      public String getClienteNome(){
           return NomeClient;
      }
      public int getClienteCpf(){
          return CPF;
      }
        
}