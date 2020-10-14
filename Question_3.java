package lab1;

public class Question_3 {

	public static void main(String[] args) {
		specialEleven(22);
		specialEleven(23);
		specialEleven(24);
		specialEleven(11);
		specialEleven(55);


	}

	private static void specialEleven(int num) {
		
		if(num%11==0 || (num-1)%11 ==0 || num%11==1)
			System.out.println(true);
	 else {
		System.out.println(false);
	}
		
		
    

}
}