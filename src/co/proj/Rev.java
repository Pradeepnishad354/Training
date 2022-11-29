package co.proj;

public class Rev {
	
	public static void main(String[] args) {
		
		String s1="saurabh";
		
		int leng= s1.length();
		String rev="";
		
		for(int i=leng-1; i>=0; i--) {
			
			rev=rev+s1.charAt(i);
			
			
		
	}
		System.out.println(rev);
	}

}
