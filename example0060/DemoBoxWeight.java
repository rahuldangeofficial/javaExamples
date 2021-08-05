//this program uses inheritance to extend box

class BoxDemoWeight{
	public static void main(String args[]){
		BoxWeight mybox1=new BoxWeight(10,20,15,34.3);
		BoxWeight mybox2=new BoxWeight(2,3,4,0.076);
		double vol;

		vol=mybox1.volume();
		System.out.println("Volume of mybox1 is "+vol);
		System.out.println("Weight of mybox1 is "+mybox1.weight);

		vol=mybox2.volume();
		System.out.println("Volume of mybox2 is "+vol);
		System.out.println("Weight of mybox2 is "+mybox2.weight);
	}
}

class Box{
	double width;
	double height;
	double depth;

	//construct clone of an object
	Box(Box ob){
		width=ob.width;
		height=ob.height;
		depth=ob.depth;
	}

	//constructor used when all dimentions  are specified
	Box(double w,double h,double d){
		width=w;
		height=h;
		depth=d;
	}

	//constructor used when no dimentions are specified
	Box(){
		width=-1; //use -1 to indicate
		height=-1; //an unintialized
		depth=-1; //box
	}

	//constructor used when cube is created
	Box(double len){
		width=height=depth=len;
	}

	//compute and return volume 
	double volume(){
		return width*height*depth;
	}

}

//here ,box is extended to include weight
class BoxWeight extends Box{
	double weight; //wight of box

	BoxWeight(double w,double h,double d,double m){
		width=w;
		height=h;
		depth=d;
		weight=m;
	}
}


