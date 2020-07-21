package proxy;

import proxy.dynamic.Point2D;

//Proxy class.
public class ImageProxy implements Image{

    private BitmapImage bitmapImage;
    private String name;
    private Point2D point2D;

    public ImageProxy(String name) {
        this.name = name;
    }

    @Override
    public void setLocation(Point2D point2d) {
        if (bitmapImage != null) {
            bitmapImage.setLocation(point2d);
        } else {
            this.point2D = point2d;
        }
    }

    @Override
    public Point2D getLocation() {
        return bitmapImage != null ? bitmapImage.getLocation(): point2D;
    }

    @Override
    public void render() {
        if (bitmapImage == null) {
            bitmapImage = new BitmapImage(name);
            bitmapImage.setLocation(point2D);
        }
        bitmapImage.render();
    }
}
