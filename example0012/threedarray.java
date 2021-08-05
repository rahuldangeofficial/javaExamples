class threedarray{
    public static void main(String args[]){
        int threeD[][][]=new int[3][4][5];
        int i,j,k;
        
        //just a tip
        //you can initialize array in both of these two declarations
        //int a1[]=new int[3];
        //int[] a2=new int[3];
        
        //char twd1[][]=new char[3][4];
        //char[][] twd2=new char[3][4];
        
        
        //int[] nums,nums2,nums3;
        //int nums[],nums2[],nums3[];
    
        for(i=0;i<3;i++){
            for(j=0;j<4;j++){
                for(k=0;k<5;k++){
                    threeD[i][j][k]=i*j*k;
                }
            }
        }
        
        for(i=0;i<3;i++){
            for(j=0;j<4;j++){
                for(k=0;k<5;k++){
                    System.out.print(threeD[i][j][k]+" ");
                }
            System.out.println();
            }
        System.out.println();
        }
    }
}
