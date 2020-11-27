package test.main;

import java.util.HashMap;
import java.util.Map;

public class MainClass02 {
	public static void main(String[] args) {
		//한명의 회원 정보라고 가정하자.
		int num=1;
		String name="김구라";
		String addr="노량진";
		boolean isMan=true;
		
		//동일한 회원 정보를 HashMap  객체를 생성해서 담을수도 있다. 
		Map<String, Object> map1=new HashMap<String, Object>();
		map1.put("num", 1);
		map1.put("name", "김구라");
		map1.put("addr", "노량진");
		map1.put("isMan", true);
		
		//map1  을 이용해서 "num" 이라는 키값으로 저장된 int 불러오기
		int a=(int)map1.get("num");
		//"name" 이라는 키값으로 저장된 String 불러오기
		String b=(String)map1.get("name");
		//"addr" 이라는 키값으로 저장된 String 불러오기
		String c=(String)map1.get("addr");
		//"isMan" 이라는 키값으로 저장된 boolean 불러오기
		boolean d=(boolean)map1.get("isMan");
		
		//저장된 아이템의 갯수 (4)
		int size=map1.size();
		
		//"addr" 로 저장된 아이템 삭제하기 
		map1.remove("addr");
		
		//모든 아이템 삭제하기 
		map1.clear();
	}
}





