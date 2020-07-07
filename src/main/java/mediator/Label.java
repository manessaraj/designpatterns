package mediator;

public class Label implements UIControl{

	private UIMediator mediator;
	private String label;

	public Label(UIMediator mediator) {
		this.mediator = mediator;
		this.label = "LABEL";
		mediator.register(this);
	}

	@Override
	public void controlChanged(UIControl control) {
        System.out.println(control.getControlName() + ": " + control.getControlValue());
        this.label = control.getControlValue();
    }

	@Override
	public String getControlValue() {
		return getLabel();
	}

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
        this.mediator.valueChanged(this);
    }

    @Override
	public String getControlName() {
		return "Label";
	}
}
