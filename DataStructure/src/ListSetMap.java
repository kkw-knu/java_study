import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class ListSetMap {

	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		list.add("C");
		list.add("JAVA");
		list.add("Python");
		list.add("JAVA");
		System.out.println(list);
		
		Set<String> set = new HashSet<>();
		set.add("C");
		set.add("JAVA");
		set.add("Python");
		set.add("JAVA");
		System.out.println(set);
		
		Map<String, Object> map = new HashMap<>();
		map.put("c", "데니스 리치히");
		map.put("java", "제임스 고슬링");
		map.put("python", "하일스베르");
		map.put("python", "귀도반로썸");
		map.put("linux", "토발즈");
		map.put("git", "토발즈");
		System.out.println(map);
	}

}

