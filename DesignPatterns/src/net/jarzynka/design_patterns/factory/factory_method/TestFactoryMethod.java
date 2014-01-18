package net.jarzynka.design_patterns.factory.factory_method;

public class TestFactoryMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MemberManager memberManager = new MemberManager();
		memberManager.doSomeWork();
		
		MemberManagerForTest memberManagerForTest = new MemberManagerForTest();
		memberManagerForTest.doSomeWork();
	

	}

}
