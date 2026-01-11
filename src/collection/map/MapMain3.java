package collection.map;

import java.util.HashMap;
import java.util.Map;

public class MapMain3 {
	
	public static void main(String[] args) {
		
		//같은 학생이 map에 없는 경우만 데이터 저장 하려면?
		Map<String, Integer> stuendtMap = new HashMap<>();

		//학생 데이터 추가
		stuendtMap.put("student1" , 90);
		System.out.println(stuendtMap);
		
		//학생이 없는 경우에만 추가
		//containsKey >>맵에 지정된 key가 있는지 확인
		if (!stuendtMap.containsKey("student1")) {
			stuendtMap.put("student1" , 90);
		}
		
		stuendtMap.putIfAbsent("student1" , 50);
		stuendtMap.putIfAbsent("student2" , 90);
		stuendtMap.putIfAbsent("student3" , 90);
		
		
		//hah
		
	}
	
	
	
}
