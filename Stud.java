package javasample;

public class Stud {

	 String name;
	    int rollNo;
	
	    void setStudentData(String studentName, int studentRollNo) {
	        name = studentName;
	        rollNo = studentRollNo;
	    }
	    void display() {
	        System.out.println("Name: " + name + ", Roll Number: " + rollNo);
	    }
	    
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		  Stud s1 = new Stud();
	        s1.setStudentData("Alice", 101);

	        Stud s2 = new Stud();
	        s2.setStudentData("Bob", 102);

	        Stud s3 = new Stud();
	        s3.setStudentData("Charlie", 103);

	        s1.display();
	        s2.display();
	        s3.display();
		
	}

}
