package main;
import java.util.*;

public class Main {
	Scanner scanner = new Scanner(System.in);
	
    public static void main( String[] args ) {
    	
        Main llamando = new Main();
        llamando.begin();
        
    }
    
    void begin(){
       
        int N = Integer.parseInt( scanner.next() );
        int[] a = new int[N];
        for(int i=0; i<N; ++i){
         a[i] = Integer.parseInt( scanner.next() ); 
        }
            
         int money = Integer.parseInt(scanner.next());
         int libro1=-1 , libro2=-1;
            
         for(int i=0; i<N-1; ++i){
            for(int j=i+1; j<N; ++j){
                  if( a[i]+a[j] == money ){
                   if( libro1 == -1 && libro2 == -1 ){
                       libro1=i;
                       libro2=j;
                       } else if( Math.abs(a[i]-a[j])<Math.abs(a[libro1]-a[libro2]) ){
                        	libro1=i;
                        	libro2=j;
                        }
                    }
                }
            }
            int i=a[libro1] , j=a[libro2] ;
            System.out.printf("Peter should buy books whose prices are %d and %d.\n\n", Math.min(i,j) , Math.max(i,j)  );
        }
    }


