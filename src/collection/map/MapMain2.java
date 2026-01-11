package collection.map;

import java.util.HashMap;
import java.util.Map;

public class MapMain2 {
	
	public static void main(String[] args) {
		
		//맵에 같은키로 다른데이터 저장하면 ????
		Map<String, Integer> stuendtMap = new HashMap<>();

		//학생 데이터 추가
		stuendtMap.put("student1" , 90);
		System.out.println(stuendtMap);
		
		//같은 키에 저장  >> 기존값이 교체
		stuendtMap.put("student1" , 50);
		System.out.println(stuendtMap);
		
	
	}
	
	
	
}
