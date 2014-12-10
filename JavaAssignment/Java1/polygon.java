import java.util.Scanner;
class polygon {

	public static void main(String[] args) {
		
		
		Shape s = new PolygonShape();
		s.getInput();
		s.calculateAngle();
		s.calculatePerimeter();

		

	}

}
abstract class Shape{
	int numberOfSides,length;
	void getInput(){
		System.out.println("Enter number of sides of polygon");	
				
		Scanner input = new Scanner(System.in);
		numberOfSides = input.nextInt();
		if(numberOfSides<3 || numberOfSides>10){
			System.out.println("Enter the sides of polygon between 3 to 10");
			
		}
		System.out.println("Enter the length of the side of polygon");
		
		length = input.nextInt();
	}
	abstract void calculateAngle();
		
	abstract void calculatePerimeter();
	
}

class PolygonShape extends Shape{
	
	
	void calculateAngle(){
		int sumOfAngles = ((numberOfSides-2)*180);
		 System.out.println("The sum of interior angles is"+sumOfAngles);
	}
	void calculatePerimeter(){
		
		int perimeter = numberOfSides*length;
		System.out.println("The perimeter of polygon is"+perimeter);
	}

}


