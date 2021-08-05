class ForTick{
 public static void main(String args[]){
    int n;
    
    /*
    for(initialization;condition;iteration){
     //body
    }
    */
    //here you can also declare n inside for loop
    //for(int n=10;n>0;n--) <----- like this
    
    //but if you declare n inside the loop then the scope of n will be only upto that loop only 
    for(n=10;n>0;n--)
        System.out.println("tick "+n);
 
 }

}
