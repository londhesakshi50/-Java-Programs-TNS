package javaProgramTNS;

public class GradeCheak {
	public static void main(String[]args) {
		int marks=99;
		if(marks>=0 && marks<=35)
		{
			System.out.println("fail");
		}
		else if(marks>=35 && marks<60)
		{
			System.out.println("grade c");
		}
		else if(marks>=60 && marks<80) {
			System.out.println("grade b");
		}
		else if(marks>=80 && marks<=100)
		{
			System.out.println("distinction");
		}
		else 
		{
			System.out.println("invalid marks! enter between 0 and 100");
		
		}
	}
}
		
	


