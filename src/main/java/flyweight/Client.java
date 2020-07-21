package flyweight;


public class Client {

	public static void main(String[] args) {
		SystemErrorMessage message1 = ErrorMessageFactory.getInstance().getError(ErrorMessageFactory.ErrorType.GenericSystemError);
		System.out.println(message1.getText("14011"));

		UserBannedErrorMessage message2 = ErrorMessageFactory.getInstance().getUserBannedMessage("1401");
		System.out.println(message2.getText(null));
	}

}
