package testing123;

public class TestingPurpose {
	
	int id;
	String name;
	
	 TestingPurpose(){
		return ;
	}
	
	void display(int id, String name){
		id = id;
		name = name;
		System.out.println(id+" "+name);
		
	}
	
	int rateOfInterest(){
		
		return 5;
	}
	
	
	
	public static void main(String args[]){
		
		TestingPurpose abcd = new TestingPurpose();
		abcd.display(5, "Pradeep");
	}

}
