package net.jarzynka.design_patterns.factory.factory_method;

public class EmailService extends EmailServiceBase {

	@Override
	public void sendEmails() {
		// TODO Auto-generated method stub
		// simulates sending several e-mail files
		System.out.println("All e-mails sent from e-mail service!");
	}

}
