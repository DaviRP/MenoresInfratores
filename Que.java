import java.util.Scanner;
import java.io.*;


class Que {

    public static void main(String args[]) throws Exception {
		Numb comeco= new Numb();
		Numb  fim= new Numb();
		Numb count=new Numb();
        Numb j=new Numb();

		Scanner s= new Scanner(System.in);
		comeco.inteiro=s.nextInt();
		fim.inteiro=s.nextInt();
//		comeco.eh_inteiro(comeco,fim);

        for(;comeco.inteiro<=fim.inteiro;comeco.inteiro++){
            
            
            for(j.inteiro=1;j.inteiro<=comeco.inteiro;j.inteiro++){
                
                
                if(comeco.inteiro%j.inteiro==0){
                    
                    count.inteiro++;
                    
                }
                
                
                
                
            }
            
            if(count.inteiro==2){
                
                System.out.println(comeco.inteiro);
                
            }
                
            count=new Numb();
            
        }
        
        
    }
}
