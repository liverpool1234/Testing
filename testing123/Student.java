package testing123;

class Student{  
    int id;  
    String name; 
      
    Student(int id,String name){  
    this.id = id;  
    this.name = name; 
    display();
    } 
    
    Student (){
    	System.out.println("Test");
    }
    
    void display(){System.out.println(id+" "+name);}  
    
    
    public static void main(String args[]){  
/*    Student s1 = new Student(111,"Karan");  
    Student s2 = new Student(222,"Aryan");  
    s1.display();  
    s2.display();*/  
    	TestingPurpose test = new TestingPurpose();
    	System.out.println("SBI Rate of Interest: "+test.rateOfInterest());  
    	new Student(123, "test").display();
      
  }
    
} 
