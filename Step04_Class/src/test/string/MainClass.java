package test.string;

public class MainClass {
	public static void main(String[] args) {
		String name1="김구라";
		String name2="김구라";
		String name3=new String("김구라");
		String name4=new String("김구라");
		
		System.out.println(name1);
		System.out.println(name3);
		//String type 의 참조값 비교 
		boolean result1 = name1 == name2; //true
		boolean result2 = name1 == name3; //false
		
		//String type 의 문자열 내용 비교 
		boolean result3 = name1.equals(name2); //true
		boolean result4 = name1.equals(name3); //true
		boolean result5 = name3.equals(name4); //true
		boolean result6 = "김구라".equals(name1); //true
		boolean result7 = name1.equals("김구라"); //true
	}
}





