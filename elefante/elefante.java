class elefante{

	

	public String frase;

	public void printa(){

		int i;

		
		String incomoda="incomodam";

		for (i=1;i<11;i++ ){


			if (i==1){
				System.out.println("1 elefante incomoda muito a gente");
				
			}else {
				System.out.print(i+" elefantes "); 
				for(int j=0;j<i;j++){

					System.out.print("incomodam ");



				}
				System.out.print("muito mais\n");
			}
			
			
		}



	}





	
}