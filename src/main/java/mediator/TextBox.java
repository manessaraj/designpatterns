package mediator;



public class TextBox  implements UIControl{
	private UIMediator mediator;
	private String text;
	public TextBox(UIMediator mediator) {
		this.mediator = mediator;
		this.text = "text";
		mediator.register(this);
	}


	@Override
	public void controlChanged(UIControl control) {
		System.out.println(control.getControlName() + ": " + control.getControlValue());
		this.text = control.getControlValue();
	}

	@Override
	public String getControlValue() {
		return getText();
	}

	@Override
	public String getControlName() {
		return "TextValue";
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
		this.mediator.valueChanged(this);
	}
}
