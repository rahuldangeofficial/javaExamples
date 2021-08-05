//a simple example of the switch

class SampleSwitch{
    public static void main(String args[]){
         for(int i=0;i<6;i++){
            
            /*
            switch(expression){
                case value1:
                    //statement sequence
                    break;
                case value2:
                    //statement sequence
                    break;
                case value3:
                    //statement sequence
                    break;
                case value4:
                    //statement sequence 
                    break;
                .
                .
                .
                .
                case valueN:
                    //statement sequence
                    break;
                default:
                    //default statement sequence    
            }
            */
            
            switch(i){
                case 0:
                    System.out.println("i is zero");
                    break;
                case 1:
                    System.out.println("i is one");
                    break;
                case 2:
                    System.out.println("i is two");
                    break;
                case 3:
                    System.out.println("i is three");
                    break;
                case 4:
                    System.out.println("i is four");
                    break;
                default:
                    System.out.println("i is greater than 4");        
            }
        }
    }
}
