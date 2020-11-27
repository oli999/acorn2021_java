package test.main;

import java.util.ArrayList;
import java.util.List;

public class MainClass03 {
	public static void main(String[] args) {
		//친구 목록이라고 가정하지 
		String name1="김구라";
		String name2="해골";
		String name3="원숭이";
		
		//만일 아래와 같이 담는다면 방의 크기를 동적으로 조절할수가 없다.
		//String[] names= {"김구라","해골","원숭이"};
		
		List<String> names=new ArrayList<String>();
		names.add("김구라");
		names.add("해골");
		names.add("원숭이");
		
		//각각의 방에 저장된 값 불러오기 
		String n1=names.get(0);
		String n2=names.get(1);
		String n3=names.get(2);
		
		//방의 사이즈 참조
		int size=names.size();
		
		//특정 인덱스의 아이템 수정(덮어쓰기)
		names.set(0, "이정호");
		
		//특정 인덱스의 방 삭제하기
		names.remove(1); //1번방 "해골" 삭제
		
		//전체 삭제
		names.clear();
		
	}
}





