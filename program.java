package Questions;
import java.util.* ;
public class program {

	public static void main(String[] args) { int N ;
	System.out.print("please enter the number of tyres:");
	Scanner input=new Scanner(System.in) ;
	N=input.nextInt();
	switch(N)
	{case 2:Bike obj=new Bike() ;
	obj.display() ;break ;
	case 4:Car obj1=new Car() ;
	obj1.display() ;break ;
	default: Vehicle obj3=new Vehicle() ;
	obj3.display() ;
	}
		
}

