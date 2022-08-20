
public class Ineuron {

	public static void main(String[] args) {
	/*	 
	//1 1 1 1	
	//2	2 2 2
	//3 3 3 3
    //4 4 4 4
		
		
		int n=4;
		 for(int i=0;i<n;i++ )
		 {  
			  for(int j=0;j<n;j++)
			    {                 
			      System.out.print(i+1+" ");          
			    }                                        
			  System.out.print("\n");
		 }  */
//----------------------------------------------------------------------------------------------------------		 
	//	* * * * * * * * * * * * * * 
	//	* * * * * *   * * * * * * * 
	//	* * * * *       * * * * * * 
	//	* * * *           * * * * * 
	//	* * *               * * * * 
	//	* *                   * * * 
	//	*                       * * 
	//	*                         * 
	//	*                         * 
	//	*                         * 
	//	*                         * 
	//	*                         * 
	//	*                         * 
	//	* * * * * * * * * * * * * * 
/*		int n=14; 
		 for(int i=0;i<n;i++) 
		 {
			 for(int j=0;j<n;j++)
			 {
		      if(i==0 ||j==0 ||i==n-1 ||j==n-1|| i+j<=(n-1)/2 ||j-i>=(n-1)/2)   
			        System.out.print("* ");                                 
			 else                                                    
					System.out.print("  ") ;                            
			  }                                                          
	         System.out.print("\n");		                                         
	     }    */
//---------------------------------------------------------------------------------------------------
	//	*                       * 
	//	* *                   * * 
	//	* * *               * * * 
	//	* * * *           * * * * 
	//	* * * * *       * * * * * 
	//	* * * * * *   * * * * * * 
	//	* * * * * * * * * * * * * 
	/*	int n=13; 
		 for(int i=0;i<n;i++) 
		 {
			 for(int j=0;j<n;j++)
			 {
		      if( i-j>=(n-1)/2 ||i+j>=(n-1)+(n-1)/2 ||j==0 && i>=(n-1)/2 ||j==n-1 && i>=(n-1)/2 || i==n-1)   
			        System.out.print("* ");                                 
			 else                                                    
					System.out.print("  ") ;                            
			  }                                                          
	         System.out.print("\n");
		 }
	*/
//---------------------------------------------------------------------------------------------------------	
	//	* * * * * * * * * * * * * 
	//	* * * * * *               
	//	* * * * *                 
	//	* * * *                   
	//	* * *                     
	//	* *                       
	//	*                         
	//	* *                       
	//	* * *                     
	//	* * * *                   
	//	* * * * *                 
	//	* * * * * *               
	//	* * * * * * * * * * * * * 

/*		int n=13;
	for(int i=0;i<n;i++) 
	 {
		 for(int j=0;j<n;j++)
		 {
	      if( i-j>=(n-1)/2 ||i+j<=(n-1)/2 ||j==0  ||i==0 || i==n-1)   
		        System.out.print("* ");                                 
		 else                                                    
				System.out.print("  ") ;                            
		  }                                                          
        System.out.print("\n");
	 }*/
//----------------------------------------------------------------------------------------------------	
//		IIIIIIII  n      n  eeeeeeee  u      u  rrrrrrrr  oooooooo  n      n  
//		   I      nn     n  e         u      u  r      r  o      o  nn     n  
//		   I      n n    n  e         u      u  r      r  o      o  n n    n  
//		   I      n  n   n  eeeeeeee  u      u  rrrrrrrr  o      o  n  n   n  
//		   I      n   n  n  e         u      u  r   r     o      o  n   n  n  
//		   I      n    n n  e         u      u  r    r    o      o  n    n n  
//		   I      n     nn  e         u      u  r     r   o      o  n     nn  
//		IIIIIIII  n      n  eeeeeeee  uuuuuuuu  r      r  oooooooo  n      n  

	/*	int n=8;
		for(int i=0;i<n;i++) 
		 {
			 for(int j=0;j<n;j++)
			 {
		      if(i==0 ||i==n-1 ||j==(n-1)/2 )   
			        System.out.print("I");                                 
			  else                                                    
					System.out.print(" ") ;                            
			  } 
			 System.out.print("  ");
			 for(int j=0;j<n;j++)
			 {
				if( i==j ||j==0 || j==n-1)   
					        System.out.print("n");                                 
			    else                                                    
							System.out.print(" ") ;                            
			 }  
			 System.out.print("  ");
			 for(int j=0;j<n;j++)
			 {
				if( i==0 ||j==0  || i==n-1 ||i==(n-1)/2)   
					        System.out.print("e");                                 
			    else                                                    
							System.out.print(" ") ;                            
			 }  
			 System.out.print("  ");       
			 for(int j=0;j<n;j++)
			 {
				if(  j==n-1 || j==0|| i==n-1 )   
					        System.out.print("u");                                 
			    else                                                    
							System.out.print(" ") ;                            
			 }  
			 System.out.print("  "); 
			 for(int j=0;j<n;j++)
			 {
				if( i==0 ||j==0  || i==(n-1)/2 ||j==n-1 &&i<=(n-1)/2 || i==j && i>=(n-1)/2)   
					        System.out.print("r");                                 
			    else                                                    
							System.out.print(" ") ;                            
			 }  
			 System.out.print("  ");
			 for(int j=0;j<n;j++)
			 {
				if( i==0 ||j==0  || i==n-1 ||j==n-1)   
					        System.out.print("o");                                 
			    else                                                    
							System.out.print(" ") ;                            
			 }  
			 System.out.print("  "); 
			 for(int j=0;j<n;j++)
			 {
				if(j==0  || j==n-1 ||i==j)   
					        System.out.print("n");                                 
			    else                                                    
							System.out.print(" ") ;                            
			 }  
			 System.out.print("  ");
			 System.out.print("\n");
		 }*/
	}
}
