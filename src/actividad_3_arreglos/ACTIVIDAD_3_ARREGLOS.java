
package actividad_3_arreglos;

import java.util.Scanner;

public class ACTIVIDAD_3_ARREGLOS {

    public static void main(String[] args) {
        
        //EJERCICIO 1
        System.out.println("EJERCICIO 1");
 int suma=0;
        for (int i = 0; i <=102; i++) {
            suma=suma+i;
            System.out.println("La suma es: "+suma);
        }
       
        
        
        //EJERCICIO 2
        System.out.println("EJERCICIO 2");
           int contador=1;
        int oper = 1;
        for (int i = 1; i <103; i++) {
            contador=contador+1;
            oper=oper*contador;
            System.out.println("El factorial es: "+oper);
        }
        
        
        //EHERCICIO3
        System.out.println("EJERCICIO 3");
            Scanner teclado=new Scanner(System.in);
        int num;
        int contado=1;
        int ope=1;
        System.out.println("Ingrese un numero: ");
        num=teclado.nextInt();
        for (int i = 1; i < num; i++) {
            contado=contado+1;
            ope=ope*contado;

        }
        System.out.println("El factorial es: "+ope);
        
        
        
        //EJERCICIO4
        System.out.println("EJERCICIO 4");
        int numE;
        int sumA=0;
        int contadr=0;
        int media = 0;
        System.out.println("Ingrese un numero: ");
        numE=teclado.nextInt();
        for (int i = 0; i <= numE; i++) {
          sumA=sumA+i;
          media=sumA/numE;

        }
        System.out.println("La suma es "+sumA);
        System.out.println("La media de la suma de los numeros es: "+media);
        
        
        //EJERCICIO5
        
        System.out.println("EJERCICIO 5");
        int n, x[], mayor, menor, su=0,con=0,prom;

        System.out.println("Cantidad de elementos:");
        n= teclado.nextInt();    
        x= new int[n];

        for(int i=0;i<n;i++)
        {
            System.out.println("Ingresa un numero ");
            x[i]= teclado.nextInt();

        }
         mayor=menor=x[0];
         for(int i=0;i<n;i++)
             if(x[i]>mayor)
                 mayor=x[i];
         else
                 if(x[i]<menor)
                     menor=x[i];

         for(int i=0;i<n;i++)
             su= x[i]+su;
        prom=su/n;
         System.out.println("La suma es:" +su); 
         System.out.println("El numero mayor es:" +mayor);
         System.out.println("El numero menor es:" +menor);
         System.out.println("El promedio es: "+prom);
         
         
         
         //EJERCICIO6
         System.out.println("EJRCICIO 6");
           String semana [] = new String [7];
        semana [0]="LUNES";
        semana [1]="MARTES";
        semana [2]="MIERCOLES";        
        semana [3]="JUEVES";     
        semana [4]="VIERNES";        
        semana [5]="SABADO"; 
        semana [6]="DOMINGO";

        for (int i = 0; i <7; i++) {
            System.out.println(""+semana[i]);
        }
        
        
        
        //EJERCICIO7
        System.out.println("EJERCICIO 7");
          String starwars [][] = new String [5][5];
         starwars[0][0]="DARTH VADER";
        starwars[0][1]="YODA";
        starwars[0][2]="CHEWBACCA";
        starwars[0][3]="R2-D2";
        starwars[0][4]="OBI-WAN KENOBI";
        starwars[1][0]="ANAKIN SKYWALKER";
        starwars[1][1]="LUKE SKYWALKER";
        starwars[1][2]="C3PO";
        starwars[1][3]="HAN SOLO";
        starwars[1][4]="LEIA SKYWALKER";
        starwars[2][0]="BB8";
        starwars[2][1]="KYLO REN";
        starwars[2][2]="REY";
        starwars[2][3]="QUI-GON JINN";
        starwars[2][4]="PADME AMIDALA";
        starwars[3][0]="DARTH MAUL";
        starwars[3][1]="JAR JAR BINKS";
        starwars[3][2]="GENERAL GRIEVOUS";
        starwars[3][3]="DARTH SIDIOUS";
        starwars[3][4]="CONDE DOOKU";
        starwars[4][0]="MACE WINDU";
        starwars[4][1]="FINN";
        starwars[4][2]="POE DAMERON";
        starwars[4][3]="MAZ KANATA";
        starwars[4][4]="SNOKE";
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print("["+i+"]["+j+ "]="+starwars[i][j]+"  ");
            }
            System.out.println("");
        }
        
        

       
        //EJERCICIO8
           System.out.println("EJERCICIO 8");
        int gato [][] = new int [3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.println("Ingrese el valor de [" + i+ "," + j+ "]");
                gato[i][j]=teclado.nextInt();
            }
        }


        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(" "+gato[i][j]+" ");
            }
            System.out.println("");
        }
    }

}
    
    

