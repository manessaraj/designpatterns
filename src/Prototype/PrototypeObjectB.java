package Prototype;

public class PrototypeObjectB extends PrototypeObject {


    private String nameOfObject = "Awesome";
    public PrototypeObjectB(){}

    @Override
    public PrototypeObject clone() throws CloneNotSupportedException{
        throw new CloneNotSupportedException();
    }

    @Override
    public void resetUnit() {
        throw new UnsupportedOperationException("Can't reset the state");
    }
}
