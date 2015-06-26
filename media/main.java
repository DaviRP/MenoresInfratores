import java.util.Scanner;
import java.io.*;


class main {
   


    public static void main(String args[]){

    	Scanner s = new Scanner(System.in);
    	int i;
    	double media=0;

    	System.out.println("digites 5 numeros pra media  \n");

    	int [] num;
    	num = new int[5];

    	for (i=0;i<5;i++){
			
			num [i] = s.nextInt();

		}

		for (i=0;i<5;i++){

			media = media + num[i];
			
		}

		media=media/5;

		System.out.println("media ="+media);


        
        
        
        
        
    }
}
