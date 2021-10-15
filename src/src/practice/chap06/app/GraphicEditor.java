//실습6-04
package src.practice.chap06.app;

import src.practice.chap06.derived.Circle;
import src.practice.chap06.base.Shape;

public class GraphicEditor {
    public static void main(String[] args) {
        Shape shape= new Circle();
        shape.draw();
    }
}
