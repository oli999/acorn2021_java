package json;

import org.json.JSONArray;

public class MainClass05 {
	public static void main(String[] args) {
		/*
		 *  인터냇으로 부터 다운받은 문자열이 JSON 형식인 경우도 많이 있다.
		 *  해당 문자열에서 원하는 정보를 추출하는 연습을 해 보자 
		 */
		String info="[10, 20, 30, 40, 50]";
		//위의 문자열에서 숫자만 순서대로 추출해서 콘솔창에 순서대로 출력할수 있을까?
		JSONArray nums=new JSONArray(info);
		/*
		 *  nums 에 들어 있는 참조값을 이용해서( JSONArray 객체의 메소드를 활용해서 )
		 *  
		 *  0 번째 인덱스 : 10
		 *  1 번째 인덱스 : 20 
		 *  .
		 *  .
		 *  4 번째 인덱스 : 50   
		 *  
		 *  위와 같은 형식으로 콘솔창에 출력해 보세요.
		 */
//		System.out.println(0+" 번째 인덱스 : "+nums.getInt(0));
//		System.out.println(1+" 번째 인덱스 : "+nums.getInt(1));
//		System.out.println(2+" 번째 인덱스 : "+nums.getInt(2));
//		System.out.println(3+" 번째 인덱스 : "+nums.getInt(3));
//		System.out.println(4+" 번째 인덱스 : "+nums.getInt(4));
		
		for(int i=0; i<nums.length() ; i++) {
			//int tmp=(int)nums.get(i);
			System.out.println(i+" 번째 인덱스 : "+nums.getInt(i));
		}
	}
}







