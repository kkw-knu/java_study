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
		map.put("c", "���Ͻ� ��ġ��");
		map.put("java", "���ӽ� ����");
		map.put("python", "���Ͻ�����");
		map.put("python", "�͵��ݷν�");
		map.put("linux", "�����");
		map.put("git", "�����");
		System.out.println(map);
	}

}

