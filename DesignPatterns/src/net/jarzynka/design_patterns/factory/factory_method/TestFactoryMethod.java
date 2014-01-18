package net.jarzynka.design_patterns.factory.factory_method;

public class TestFactoryMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MemberManagerBase memberManager = new MemberManager();
		memberManager.doSomeWork();
		
		memberManager = new MemberManagerForTest();
		memberManager.doSomeWork();
	

	}

}
