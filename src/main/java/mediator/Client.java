package mediator;


public class Client {


	public void start() {
		UIMediator mediator = new UIMediator();
		Slider slider = new Slider(mediator);
		Label label = new Label(mediator);
		TextBox box = new TextBox(mediator);
		box.setText("Change1");
		label.setLabel("Chnage2");
		slider.setSlide(100);
	}

	public static void main(String[] args) {
		Client client = new Client();
		client.start();
	}
}
