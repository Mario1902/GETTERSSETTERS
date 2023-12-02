package Domasnarabota;

public class Domasnarabota1 {

		    public static void main(String[] args) {
		  		        
		        int broj = 5;

		        long faktoriel = presmetajFaktoriel(broj);

		        System.out.println("Факториел на " + broj + " e " + faktoriel);
		    }

		    public static long presmetajFaktoriel(int n) {
		        if (n == 0) {
		            return 1;
		        } else {
		            return n * presmetajFaktoriel(n - 1);
		        }
		    }


	}

