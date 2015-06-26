class Numb{

    public int inteiro;
    
    
    public void eh_inteiro(Numb Comeco,Numb Fim){
        
        int count=0;
        int j;
        
        
        for(Comeco.inteiro=0;Comeco.inteiro<=Fim.inteiro;Comeco.inteiro++){
            
            
            for(j=1;j<=Comeco.inteiro;j++){
                
                
                if(Comeco.inteiro%j==0){
                    
                    count++;
                    
                }
                
                
                
                
            }
            
            if(count==2){
                
                System.out.println(Comeco.inteiro);
                
            }
                
            count=0;
            
        }
        
    }
    
    
    
}