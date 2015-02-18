package sample;

import javafx.scene.control.ListCell;
import javafx.scene.paint.Paint;
import javafx.scene.shape.Circle;

/**
 * Created by Admin on 18-02-2015.
 */
public class NumberCell extends ListCell<String> {
    @Override
    public void updateItem(String item,boolean empty){
        super.updateItem(item,empty);
        Circle circle = new Circle(5);
        if (item != null) {
            circle.setFill(Paint.valueOf("gold"));
            setGraphic(circle);
        }
    }
}
