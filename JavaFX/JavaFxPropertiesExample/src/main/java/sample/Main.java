package sample;

public class Main {

    public static void main(String[] args){

        Rectangle rectangle = new Rectangle(){{setWidth(100);
        setHeight(100);}};
        System.out.println(rectangle.areaProperty().getValue()+" "+rectangle.getHeight()+" "+rectangle.getWidth());
        rectangle.setHeight(200);
        System.out.println(rectangle.areaProperty().get()+" "+rectangle.getHeight()+" "+rectangle.getWidth());
    }
}
