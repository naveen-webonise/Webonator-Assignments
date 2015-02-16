package sample;

import javafx.beans.binding.Bindings;
import javafx.beans.binding.NumberBinding;
import javafx.beans.property.DoubleProperty;
import javafx.beans.property.SimpleDoubleProperty;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;

public class Rectangle {
    private DoubleProperty width;
    private DoubleProperty height;
    private DoubleProperty area;

    public final DoubleProperty areaProperty() {
        if(this.area == null){
            this.area = new SimpleDoubleProperty();
            this.area.addListener(new ChangeListener<Number>() {
                @Override
                public void changed(ObservableValue<? extends Number> observable, Number oldValue, Number newValue) {
                    System.out.println("area is changed");
                }
            });
            this.area.bind(multiply);
        }
        return this.area;
    }

    public final double getHeight() {
        return height.get();
    }

    public DoubleProperty heightProperty() {
        if(this.height == null){
            this.height = new SimpleDoubleProperty();
        }
        return height;
    }

    public final void setHeight(double height) {
        this.height.set(height);
    }

    public final double getWidth() {
        return width.get();
    }

    public DoubleProperty widthProperty() {
        if(this.width == null){
            this.width = new SimpleDoubleProperty();
        }
        return width;
    }

    public final void setWidth(double width) {
        this.width.set(width);
    }

    NumberBinding multiply = Bindings.multiply(this.widthProperty(),this.heightProperty());


}
