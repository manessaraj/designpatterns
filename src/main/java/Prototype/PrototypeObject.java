package Prototype;


public abstract class PrototypeObject implements Cloneable {

    private long unit;

    @Override
    public PrototypeObject clone() throws CloneNotSupportedException{
        PrototypeObject object = (PrototypeObject) super.clone();
        object.initialize();
        return object;
    }

    /*
    * Set self state.
    * */
    public void initialize() {
        this.unit = 0;
        this.resetUnit();
    }

    public abstract void resetUnit();


}
