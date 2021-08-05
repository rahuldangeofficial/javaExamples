//demonstrate the do while loop
class DoWhile{
    public static void main(String args[]){
        int n=10;
        
        /*
        do{
            //body of loop
        }while(condition);
        
        */
        
        do{
            System.out.println("tick "+n);
            n--;
        }while(n>0);
    }
}
