class twoDarray{
   public static void main(String args[]){
        int twoD[][]=new int[4][5];
        //this allocates a 4 by 5 (4 rows and 5 coloum)  array and assign it twoD
        int i,j,k=0;
        
        for(i=0;i<4;i++){  //loop to assign values 
         for(j=0;j<5;j++){
            twoD[i][j]=k;
            k++; 
         
         }
        }
        
        for(i=0;i<4;i++){  //loop to print the values
            for(j=0;j<5;j++)
                System.out.print(twoD[i][j]+" ");
            System.out.println();
        }
   }
}
