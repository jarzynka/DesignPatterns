package net.jarzynka.design_patterns.factory.factory_method;

public class EmailServiceStub extends EmailServiceBase {

	@Override
	public void sendEmails() {
		// TODO Auto-generated method stub
		// simulates sending several e-mail files
		System.out.println("No e-mails were sent. Testing only!");
	}

}
