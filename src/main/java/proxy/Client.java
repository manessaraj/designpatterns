package proxy;


import flyweight.SystemErrorMessage;
import proxy.dynamic.Point2D;

public class Client {

	public static void main(String[] args) {
		Image image = ImageFactory.getImage("A1.bmp");
		image.setLocation(new Point2D(10,10));
		System.out.println(image.getLocation());
		System.out.println("Rendering Image now ...");
		image.render();
	}

}
