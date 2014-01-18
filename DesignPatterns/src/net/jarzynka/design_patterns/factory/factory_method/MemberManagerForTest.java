package net.jarzynka.design_patterns.factory.factory_method;

public class MemberManagerForTest extends MemberManagerBase {

	@Override
	protected EmailServiceBase MakeEmailService() {
		// Return the actual E-mail Service
		return new EmailServiceStub();
	}

}
