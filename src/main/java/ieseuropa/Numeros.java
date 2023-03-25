package main.java.ieseuropa;
import java.util.Scanner;
public class Numeros {

	public static boolean esArmstrong (int num) {
		int temp = num;
		int suma=0;
		int digitos =0;
		int ultimodigito=0;
		
		digitos=(int)(Math.log10(num)+1);
		
		while (temp>0){
			ultimodigito=temp%10;
			suma+=Math.pow(ultimodigito,digitos);
			temp=temp/10;
		}	
			if (num == suma) {
			 return true;
			}else 
			return false;
		}

	public static long numFactorial (int num) {
		long factorial=1;
		while(num!=0) {
			factorial=factorial*num;
			num--;
		}
		return factorial;
		}

	public  static  boolean  esPrimo ( int  numero ) {
		  if ( numero == 0 || numero == 1 || numero == 4 ) {
		    return  false ;
		  }
		  for ( int  x = 2 ; x < numero / 2 ; x ++) {
		     if ( numero % x == 0 )
		      return false;
		   }
		  return true ;
		}
		 		
	public static int numdelasuerte(int num) {
	       return calculaSumaDigitos(num);
        }
       
		public static int calculaSumaDigitos(int num) {
	         if (num<10) {
	             return num;
	         }else {
	             int sumaDigitos=0; 
	              int resto;
	             do {
	                 resto = num%10;
	                 sumaDigitos += resto;
	                 num = num / 10;
	             } while (num>10);
	             return sumaDigitos;
	         }
	    }

	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc = new Scanner (System.in);


System.out.println("introduce un numero");
int num=sc.nextInt();

 System.out.println((esArmstrong(num)));
 System.out.println(numFactorial(num));
 System.out.println(esPrimo(num));
 System.out.println(numdelasuerte(num));
	}

}
