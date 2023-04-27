import java.util.Random;
import java.util.Scanner;
//tem que reposizionar no meio a cada certa quantidade
//poder posicionar o current em outras posições 
//fazer um menu para as etapas e esse tipo de coisa
public class Main {
    public static void main(String[] args) {
        System.out.println("Etapa 1");
        int numOps = 10000;
        int numAuxNext = 0; //quantidade de vezes que a operação aux.next é executada 
        int opcao = 1;
        Random rand = new Random();

        Scanner entrada = new Scanner(System.in);

        LinkedListOfInteger lista = new LinkedListOfInteger();//lista da etapa 1
        do{
            System.out.println("1 - etapa 1 ");
            System.out.println("2 - etapa 2 ");
            System.out.println("3 - etapa 3 ");
            System.out.println("10 - sair");


        }while(opcao!=10);

        switch(opcao){

            case 1:
            

        for (int i = 0; i < 1000; i++) {
            if (i % 10000 == 0)
                System.out.println("Mais 1000...");
                lista.add(rand.nextInt(1000));
        }
        System.out.println("A lista tem " + lista.size() + " elementos.");
        System.out.print( numAuxNext = lista.getNumAuxNext());
 
       for (int i = 0; i < numOps; i++) {
            int op = rand.nextInt(3);
            int value = rand.nextInt(10000);

            switch (op) {
                case 0:
                    lista.add(value, value);
                    break;
                case 1:
                    lista.get(value);
                    break;
                case 2:
                    lista.removeByIndex(value);
                    break;
                  
            }
           
            System.out.print( numAuxNext = lista.getNumAuxNext());//colocando o numeros de vezes dento de uma variavel 
        }
            break;
  
            case 2:


            for (int i = 0; i < 1000; i++) {
                if (i % 10000 == 0)
                    System.out.println("Mais 1000...");
                    lista.add(rand.nextInt(1000));
            }
            System.out.println("A lista tem " + lista.size() + " elementos.");
            System.out.print( numAuxNext = lista.getNumAuxNext());
     
           for (int i = 0; i < numOps; i++) {
                int op = rand.nextInt(3);
                int value = rand.nextInt(10000);
    
                switch (op) {
                    case 0:
                        lista.add(value, value);
                        break;
                    case 1:
                        lista.get(value);
                        break;
                    case 2:
                        lista.removeByIndex(value);
                        break;
                      
                }
               
                System.out.print( numAuxNext = lista.getNumAuxNext());//colocando o numeros de vezes dento de uma variavel 
            }
            break; 

            case 3:

            break;


        }


        
        //ETAPA 3
        
    }}
