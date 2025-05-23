import java.util.*;

class Student {
	private String name;
	private int exam1;
	private int exam2;
	private int exam3;
	
	//void
		boolean validateMarks(int marks)//throws Exception ---->
		{
			if(marks>=0 && marks<=100){ 
				return true;
			}else{
				return false;	
				throws new Exception("Exception!");
			}
		}
		
	Student(String name,int exam1,int exam2,int exam3)throws Exception{
		this.name=name;
	
		if(validateMarks(exam1) ){
				this.exam1=exam1;
				
			}else{
				System.out.println("Exam scores must be between 0 and 100.");
				throws new Exception("Invalid Marks");
			}
			
		if(validateMarks(exam2) ){
				this.exam2=exam2;
			}else{
				System.out.println("Exam scores must be between 0 and 100.");
				throws new Exception("Invalid Marks");
			}
			
		if(validateMarks(exam3)){
				this.exam3=exam3;
			}else{
				System.out.println("Exam scores must be between 0 and 100.");
				throws new Exception("Invalid Marks");
			}
	}
		String getName(){
			return name;
		}
		int getExam1(){
			return exam1;
		}
		int getExam2(){
			return exam2;
		}
		int getExam3(){
			return exam3;
		}
	}

class StudentDemo{
	public static void main(String []args){
		Scanner scan = new Scanner(System.in);
		try{
			Student s1 = new Student("John",75,110,90);
			System.out.println("Name of the Student 1: "+s1.getName());
			System.out.println("Marks of the Student 1 for Exam 1: "+s1.getExam1());
			System.out.println("Marks of the Student 1 for Exam 2: "+s1.getExam2());
			System.out.println("Marks of the Student 1 for Exam 3: "+s1.getExam3());
			System.out.println();
			
			Student s2 = new Student("Beccy",75,80,90);
			System.out.println("Name of the Student 2: "+s2.getName());
			System.out.println("Marks of the Student 2 for Exam 1: "+s2.getExam1());
			System.out.println("Marks of the Student 2 for Exam 2: "+s2.getExam2());
			System.out.println("Marks of the Student 2 for Exam 3: "+s2.getExam3());
		}catch{
			throws new Exception("Exception!");
			
		}
	}	
}