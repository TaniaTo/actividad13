package act13;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Ordena {
	public static void main(String[ ]args ) {
		
		
//LISTA 
	  List<String> canciones =new ArrayList<>();
			canciones.add("Baila conmigo");
			canciones.add("Lose you to love me");
			canciones.add("Come y get it");
			canciones.add("Un año sin lluvia");
			canciones.add("It aint me ");
			canciones.add("De una vez");
			canciones.add("Back to you");
			canciones.add("Kill em with Kindness");
			canciones.add("Hands to Myself");
			canciones.add("Slow Down");
			canciones.add("Fell me ");
			canciones.add("Dices ");
			
			System.out.println("Bienvenido");
			System.out.println("Canciones de Selena Gomez");
			
			//******LAMBDA****
			
			//ORDEN ALFABETICO
			
			System.out.println("****ORDEN ALFABETICO****");
	        System.out.println("----LAMBDA--");
	
		      Collections.sort(canciones, (String p1 , String p2 )-> p1.compareTo(p2));
				
				for(String elemento : canciones) {
					System.out.println(elemento);
					}
			
				  // ORDEN LONGITUD
				
				List<String> canciones3 = canciones;
		        canciones3.sort(Comparator.comparingInt(s -> Math.abs(s.length() - "repositorio".length())));
		        System.out.println("--------------------------------------");
		        
		        
		        System.out.println("*****ORDEN POR LONGITUD*****" );
		        System.out.println("----LAMBDA-----");
				
		    	for(String elemento : canciones3) {
					System.out.println(elemento);
					}
		    	
		    	
		    	
			// *******CLASE ANONIMA**********
			//ORDEN ALFABETICO
			
	        List<String> canciones1 = canciones;
	        Collections.sort(canciones1, new Comparator<>() {
	                    @Override
	                    public int compare(String c1, String c2) {
	                        return c1.compareTo(c2);
	                    }
	                }
	        );
	        System.out.println("--------------------------------------");
	        System.out.println("****ORDEN ALFABETICO****");
	        System.out.println("----CLASE ANONIMA---\n" );
	        for(String elemento : canciones1) {
				System.out.println(elemento);
				}
	
	        
	        
	  // ORDEN LONGITUD 
        List<String> canciones2 = canciones;
        Collections.sort(canciones2, new Comparator<String>() {
                @Override
                public int compare(String p1, String p2) {
                    return p1.length() - p2.length();
                }
            }
       );
    Collections.reverse(canciones2);
    System.out.println("--------------------------------------");
    System.out.println("****ORDEN POR LONGITUD****");
    System.out.println("---CLASE ANONIMA----" );
    for(String elemento : canciones2) {
		System.out.println(elemento);
		}
    
 // ****METODO DE REFERENCIA ****
    
    //ORDEN ALFABETICO
    List<String> canciones4 = canciones;
    canciones4.sort(((Comparator<String>)String::compareToIgnoreCase));
    System.out.println("--------------------------------------");
    System.out.println("****ORDEN ALFABETICO****");
    System.out.println("---METODO DE REFERENCIA----" );
    for(String elemento : canciones4) {
		System.out.println(elemento);
		}
    
    //ORDEN  LONGITUD
    List<String> canciones7 = canciones;
    Collections.sort(canciones7, Comparator.comparing(String::length));
    Collections.reverse(canciones7);
    System.out.println("--------------------------------------");
    System.out.println("****ORDEN POR LONGITUD****");
    System.out.println("---METODO DE REFERENCIA-----" );
    for(String elemento : canciones7) {
		System.out.println(elemento);
		}
	}
}

