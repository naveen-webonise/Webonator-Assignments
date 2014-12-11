import java.util.Scanner;


public class Shape {

	
	public static void main(String[] args) {
		
		GetInput inputObject = new GetInput();
		int numberOfSides = inputObject.getInput();
		System.out.println(numberOfSides);
		Polygon polygonObject;
		 switch(numberOfSides)
	      {
	         case 3 :
	        	
	        	 polygonObject = new Triangle();
	        	 polygonObject.angleSum(numberOfSides);
	        	 polygonObject.perimeterSum(numberOfSides,inputObject.sides);	            
	            break;
	         case 4 :
	        	 
	        	 polygonObject = new Quadrilateral();
	        	 polygonObject.angleSum(numberOfSides);
	        	 polygonObject.perimeterSum(numberOfSides,inputObject.sides);	            
	            break;
	         case 5 :
	        	
	        	 polygonObject = new Pentagon();
	        	 polygonObject.angleSum(numberOfSides);
	        	 polygonObject.perimeterSum(numberOfSides,inputObject.sides);	            
	            break;
	         case 6 :
		        	
	        	 polygonObject = new Hexagon();
	        	 polygonObject.angleSum(numberOfSides);
	        	 polygonObject.perimeterSum(numberOfSides,inputObject.sides);	            
	            break;
	         case 7 :
	        	 
	        	 polygonObject = new Heptagon();
	        	 polygonObject.angleSum(numberOfSides);
	        	 polygonObject.perimeterSum(numberOfSides,inputObject.sides);	            
	            break;
	         case 8 :
	        	
	        	 polygonObject = new Octagon();
	        	 polygonObject.angleSum(numberOfSides);
	        	 polygonObject.perimeterSum(numberOfSides,inputObject.sides);	            
	            break;
	         case 9 :
	        	 
	        	 polygonObject = new Nonagon();
	        	 polygonObject.angleSum(numberOfSides);
	        	 polygonObject.perimeterSum(numberOfSides,inputObject.sides);	            
	            break;
	         case 10 :
	        	
	        	 polygonObject = new Decagon();
	        	 polygonObject.angleSum(numberOfSides);
	        	 polygonObject.perimeterSum(numberOfSides,inputObject.sides);	            
	            break;
	         default :
	            System.out.println("Enter sides between 3 and 10");
	            System.exit(0);
	      }
		
	}

}
class GetInput{
	public int numberOfSides;
	int[] sides = new int[10];
	int getInput(){
		System.out.println("Enter the number of sides");
		Scanner input = new Scanner(System.in);
		numberOfSides = input.nextInt();
		System.out.println(numberOfSides);
		System.out.println("in perimetersum"+numberOfSides);
	
		
		System.out.println("Enter the length of"+numberOfSides+"sides of polygon");
		
		for(int i=0;i<numberOfSides;i++){
			sides[i] = input.nextInt();
		}
		
		return numberOfSides;
	}
}

interface Polygon{
	void angleSum(int numberOfSides);
	void perimeterSum(int numberOfSides,int[] sides);
}
class Triangle implements Polygon{
	
	public void angleSum(int numberOfSides){
		int sumOfAngles = ((numberOfSides-2)*180);
		System.out.println("The sum of interior angles is"+sumOfAngles);
		
	}
	public void perimeterSum(int numberOfSides,int[] sides){
		
		int sum = 0;
		int arrayLength = sides.length;
		for(int i=0;i<arrayLength;i++){
			sum = sum + sides[i];
		}
		System.out.println("The sum of perimeter of Triangle is "+sum);
	}
}
class Quadrilateral implements Polygon{
	
	public void angleSum(int numberOfSides){
		int sumOfAngles = ((numberOfSides-2)*180);
		System.out.println("The sum of interior angles is"+sumOfAngles);
		
	}
	public void perimeterSum(int numberOfSides,int[] sides){
		
		int sum = 0;
		int arrayLength = sides.length;
		for(int i=0;i<arrayLength;i++){
			sum = sum + sides[i];
		}
		System.out.println("The sum of perimeter of Quadrilateral is "+sum);
	}
}
class Pentagon implements Polygon{
	
	public void angleSum(int numberOfSides){
		int sumOfAngles = ((numberOfSides-2)*180);
		System.out.println("The sum of interior angles is"+sumOfAngles);
		
	}
	public void perimeterSum(int numberOfSides,int[] sides){
		
		int sum = 0;
		int arrayLength = sides.length;
		for(int i=0;i<arrayLength;i++){
			sum = sum + sides[i];
		}
		System.out.println("The sum of perimeter of Pentagon is "+sum);
	}
}
class Hexagon implements Polygon{
	
	public void angleSum(int numberOfSides){
		int sumOfAngles = ((numberOfSides-2)*180);
		System.out.println("The sum of interior angles is"+sumOfAngles);
		
	}
	public void perimeterSum(int numberOfSides,int[] sides){
		
		int sum = 0;
		int arrayLength = sides.length;
		for(int i=0;i<arrayLength;i++){
			sum = sum + sides[i];
		}
		System.out.println("The sum of perimeter of Hexagon is "+sum);
	}
}
class Heptagon implements Polygon{
	
	public void angleSum(int numberOfSides){
		int sumOfAngles = ((numberOfSides-2)*180);
		System.out.println("The sum of interior angles is"+sumOfAngles);
		
	}
	public void perimeterSum(int numberOfSides,int[] sides){
		
		int sum = 0;
		int arrayLength = sides.length;
		for(int i=0;i<arrayLength;i++){
			sum = sum + sides[i];
		}
		System.out.println("The sum of perimeter of Heptagon is "+sum);
	}
}
class Octagon implements Polygon{
	
	public void angleSum(int numberOfSides){
		int sumOfAngles = ((numberOfSides-2)*180);
		System.out.println("The sum of interior angles is"+sumOfAngles);
		
	}
	public void perimeterSum(int numberOfSides,int[] sides){
		
		int sum = 0;
		int arrayLength = sides.length;
		for(int i=0;i<arrayLength;i++){
			sum = sum + sides[i];
		}
		System.out.println("The sum of perimeter of Octagon is "+sum);
	}
}
class Nonagon implements Polygon{
	
	public void angleSum(int numberOfSides){
		int sumOfAngles = ((numberOfSides-2)*180);
		System.out.println("The sum of interior angles is"+sumOfAngles);
		
	}
	public void perimeterSum(int numberOfSides,int[] sides){
		
		int sum = 0;
		int arrayLength = sides.length;
		for(int i=0;i<arrayLength;i++){
			sum = sum + sides[i];
		}
		System.out.println("The sum of perimeter of Nongagon is "+sum);
	}
}
class Decagon implements Polygon{
	
	public void angleSum(int numberOfSides){
		int sumOfAngles = ((numberOfSides-2)*180);
		System.out.println("The sum of interior angles is"+sumOfAngles);
		
	}
	public void perimeterSum(int numberOfSides,int[] sides){
		
		int sum = 0;
		int arrayLength = sides.length;
		for(int i=0;i<arrayLength;i++){
			sum = sum + sides[i];
		}
		System.out.println("The sum of perimeter of Decagon is "+sum);
	}
}