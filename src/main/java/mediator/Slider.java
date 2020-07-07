package mediator;

public class Slider implements UIControl{

	private UIMediator mediator;
	private float slide = 0;

	public Slider(UIMediator mediator) {
		this.mediator = mediator;
		mediator.register(this);
	}

    @Override
    public void controlChanged(UIControl control) {
        System.out.println(control.getControlName() + ": " + control.getControlValue());
        this.slide = 0;
    }

    @Override
    public String getControlValue() {
       return Double.valueOf(this.slide).toString();
    }

    @Override
    public String getControlName() {
        return "Slider";
    }

    public float getSlide() {
        return slide;
    }

    public void setSlide(float slide) {
        this.slide = slide;
        this.mediator.valueChanged(this);
    }
}
