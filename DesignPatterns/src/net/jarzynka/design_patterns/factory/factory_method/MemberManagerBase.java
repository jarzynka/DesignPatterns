package net.jarzynka.design_patterns.factory.factory_method;

//'abstract' is not necessary for the Factory Method pattern.
//It was used by author's choice.
abstract class MemberManagerBase
{

	private EmailServiceBase emailService;

	//Make is an important prefix to use in FactoryMethod naming.
	//It's "protected" so descendants can call it and "abstract" so
	//descendants must implement an override method
	protected abstract EmailServiceBase MakeEmailService(); 

	//getter for private member emailService
	//lazy instantiation - if a service object doesn’t exist, create it
	//then return instance.
	protected EmailServiceBase getEmailService()
	{
		if (emailService==null) emailService = MakeEmailService();
		return emailService;
	}

	public void doSomeWork()
	{
		System.out.println("Validations are completed.");
		getEmailService().sendEmails();
		System.out.println("Data has been saved.");
		System.out.println("Work completed.");
	}

	//constructor
	public MemberManagerBase()
	{
		//this might be a good place to put dependency injection
	}

}

