package hello;

import javafx.beans.binding.DoubleBinding;
import javafx.beans.property.DoubleProperty;
import javafx.beans.property.SimpleDoubleProperty;

public class Main2 {
    public static void main(String[] args) {

        DoubleProperty radius = new SimpleDoubleProperty(2.0) {
        };
        DoubleBinding volumeOfSphere = new DoubleBinding() {

            {
                super.bind(radius);
            }

            @Override
            protected double computeValue() {
                System.out.println("Tu");
                return (4/3 * Math.PI * Math.pow(radius.get(),3));
            }
        };

        System.out.println(

        );
    }
}
