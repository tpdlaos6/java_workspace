import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;

public class HashMapTest {

	public static void main(String[] args) {
        HashMap<String, String> map = new HashMap<>();
        map.put("people", "사람");
        map.put("baseball", "야구");
        
        System.out.println(map.get("people")); // 키값을 지정해야, 밸류가 출력
        System.out.println(map.get("java")); // 키 값이 없으면 null 이 뜸
        System.out.println(map.containsKey("people")); // 해당 키가 있으면 true, 없으면 false
//        System.out.println(map.remove("people")); // 삭제
        System.out.println(map.containsKey("people")); // 삭제 후이기 때문에 false가 뜸
        System.out.println(map.keySet()); // 모든 key를 호출
        
        //for in 문 or for each 문
        for(String key : map.keySet()) {
        	System.out.println(map.get(key));
        }
        
        HashMap<String, Book> map2=new HashMap<>();
        map2.put("java",new Book());
        map2.get("java").title="자바";
        System.out.println(map2.get("java").title);
        
        
        HashSet<Integer> s1 = new HashSet<>(Arrays.asList(1, 2, 3, 4, 5, 6));
        HashSet<Integer> s2 = new HashSet<>(Arrays.asList(4, 5, 6, 7, 8, 9));
        
        s1.retainAll(s2);  // 교집합 수행
        System.out.println(s1);  // [4, 5, 6] 출력
        
        s1.addAll(s2); // 합집합 수행
        System.out.println(s1);  // [1, 2, 3, 4, 5, 6, 7, 8, 9] 출력
        
        s1.removeAll(s2); // 차집합 수행
        System.out.println(s1);  // [1, 2, 3] 출력
        }
    
        
        
	}

