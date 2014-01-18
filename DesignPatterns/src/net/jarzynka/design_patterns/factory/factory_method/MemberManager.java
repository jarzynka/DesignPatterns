package net.jarzynka.design_patterns.factory.factory_method;

public class MemberManager extends MemberManagerBase {

	@Override
	protected EmailServiceBase MakeEmailService() {
		// Return the actual E-mail Service
		return new EmailService();
	}

}
