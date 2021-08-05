class array{
    public static void main(String args[]){
        //array syntax
        //type var-name[];
        int month_days[];//[] value is set to be null
        //declaration of array
        
        //array-ver=new type[size];
        month_days=new int[12];
        
        
        //if you want to allocate and declare at same time use this 
        //int month_days[]=new int[12];
        
        
        
        //defining size of an array
        //array indexing starts from 0
        month_days[0]=31;
        month_days[1]=28;
        //placing value at array index 1
        month_days[2]=31;
        month_days[3]=30;
        month_days[4]=31;
        month_days[5]=30;
        month_days[6]=31;
        month_days[7]=31;
        month_days[8]=30;
        month_days[9]=31;
        month_days[10]=30;
        month_days[11]=31;
    
        
        //this line will print value stored at array location 4 
        System.out.println("April has "+ month_days[3] + "days");
        
        
        
    } 
}
