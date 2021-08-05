/*
    A program that uses a box class 
    
    class classname{
        type instance-variable1;
        type instance-variable2;
        .
        .
        type instance-variableN;
        
        type methodname1(parameter-list){
            //body of the method
        }
        
        type methodname2(parameter-list){
            //body of the method 
        }
        
        .
        .
        
        type methodnameN(parameter-list){
            //body of the method
        }
    }
    
*/
//class Box{
//    double width;
//    double height;
//    double depth;
//}

//this class declares an object of type box 
class BoxDemo{
    public static void main(String args[]){
        Box mybox=new Box();
        double vol;
        
        //assign values to mybox's instance variables
        mybox.width=10;
        mybox.height=20;
        mybox.depth=15;
        
        //compute volume of box
        vol=mybox.width*mybox.height*mybox.depth;
        
        System.out.println("Volume is "+vol);
    }
}

class Box{
    double width;
    double height;
    double depth;
}
