package testing123;

public class ReverseString extends Student {
	
	public static void main(String args[]){
		
		String firstName= "Pradeep";
		String reverseString = new StringBuffer(firstName).reverse().toString();
		System.out.println("Original String"+" "+firstName);
		System.out.println("Reversed String"+" "+reverseString);
	}

}
