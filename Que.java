import java.util.Scanner;
import java.io.*;


class Que {

    public static void main(String args[]) throws Exception {
		Numb comeco= new Numb();
		Numb  fim= new Numb();
		Numb count=new Numb();
		Numb zero=new Numb();
        Numb j=new Numb();
        Numb k= new Numb();
        k.inteiro++;
        k.inteiro++;

		Scanner s= new Scanner(System.in);
		comeco.inteiro=s.nextInt();
		fim.inteiro=s.nextInt();

        for(;comeco.inteiro<=fim.inteiro;comeco.inteiro++){
            
            count=new Numb();
            j=new Numb();
            for(j.inteiro++;j.inteiro<=comeco.inteiro;j.inteiro++){
                
                if(comeco.inteiro%j.inteiro==zero.inteiro){
                    
                    count.inteiro++;
                    
                }
                
                
                
                
            }
            
            if(count.inteiro==k.inteiro){
                
                System.out.println(comeco.inteiro);
                
            }
                
            
            
        }
        
        
    }
}
