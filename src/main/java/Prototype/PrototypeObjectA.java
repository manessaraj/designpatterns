package Prototype;

import java.awt.geom.Point2D;
import java.awt.Point;

public class PrototypeObjectA extends PrototypeObject {

    public Point point;
    public PrototypeObjectA(int x, int y) {
        this.point = new Point(x, y);
    }

    @Override
    public PrototypeObject clone() throws CloneNotSupportedException{
        PrototypeObjectA object = (PrototypeObjectA) super.clone();
        return object;
    }

    @Override
    public void resetUnit() {
        this.point.x = 0;
        this.point.y = 0;
    }
}
