package state;

public class New implements OrderState {


    @Override
    public double handleCancellation() {
        System.out.println("Its a new object, charge 0");
        return 0;
    }
}
