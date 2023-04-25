package kr.s06.map;
import java.util.HashMap;
//HashMap
public class HashMapMain01 {
	public static void main(String[] args) {
		HashMap<String,Integer> map = new HashMap<String,Integer>();
		
		map.put("김신",95);
		map.put("지은탁",100);
		map.put("저승사자",85);
		map.put("써니",93);
		map.put("유덕화",70);
		//key는 중복해서 저장 가능하지만 마지막 value만 인정됨
		map.put("지은탁",0);
		
		//value, key null 인정
		map.put("홍길동",null);
		map.put(null,100);
		
		//HashMap의 key,value의 쌍의 저장된 정보의 목록
		System.out.println(map);
		System.out.println("----------");
		
		//key값을 통해서 value값 출력
		Integer num = map.get("지은탁");
		System.out.println("지은탁의 성적은 " + num);
	}
}
