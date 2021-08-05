class example2{
    public static void main(String args[]){
        int num; //type variable-name
        
        num=100; //this assigns number 100 to varriable num
        
        //num is gets converted from integer into its equivalent string and 
        //then c  oncatinated with the string which preceeds it
        System.out.println("This is num: " + num); 
        
        num=num*2; 
        // multiplies the value of num 2 times (*operator for multiplication
        
        System.out.print("The value of num * 2 is ");
        //builtin print fuction is used to display the string 
        //this string is not followed by a new line 
        
        System.out.println(num); 
        
        //if condition syntax == if(condition) statement;
        //condition is a boolean expression
        num=50;
        if (num<100) System.out.println("number is less than 100");
        
    }
}
