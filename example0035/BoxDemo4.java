//now , volume() returns the volume of the box.

class BoxDemo4{
    public static void main(String args[]){
        Box mybox1=new Box();
        Box mybox2=new Box();
        double vol;
        
        //assign values to mybox1's instasnce variables
        mybox1.width=10;
        mybox1.height=20;
        mybox1.depth=15;
        
        
        //assign different values to mybox's instance variables
        mybox2.width=3;
        mybox2.height=6;
        mybox2.depth=9;
        
        //get volume of first box
        vol=mybox1.volume();
        System.out.println("Volume is "+vol);
        //or System.out.println("Volume is "+mybox1.volume());
        
        //get volume of second box
        vol=mybox2.volume();
        System.out.println("Volume is "+vol); 
        //or System.out.println("Volume is "+mybox2.volume());
    }
}

class Box{
    double height; //instance variables
    double depth;
    double width;
    
    //compute and return volume 
    double volume(){ //method
        return width*height*depth;
    }
}

 
