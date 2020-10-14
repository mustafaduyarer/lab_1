package lab1;

public class Question_2 {

	public static void main(String[] args) {
		
		love6(15, 6) ;
		love6(6, 5) ;
		love6(1, 5) ;
		love6(13, 9); 
		love6(2, 3); 
	}

	public static void love6(int a, int b) {
		if(a==6 || b==6 || a+b==6 || a-b==6 || b-a==6 || a*b==6) {
			System.out.println(true);
		}else {
			System.out.println(false);
		}
	}
}
