package quiz;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

// ���׸��� �����ص� Ŭ������ �ν��Ͻ� ������ ���ϴ� Ÿ���� ���� �ְ� �ȴ�
// ���� ������ Object�� �����ȴ�
public class D02_JiphapQuiz<T> {  //DynamicType �� ���� T��� �����

		/*
		 		1. �� �÷����� �Ű������� ���� ������ �� �÷����� �������� SetŸ������ ��ȯ�ϴ� �޼���
		 		
		 		2. �� �÷����� �Ű������� ���� ������ �� �÷����� �������� SetŸ������ ��ȯ�ϴ� �޼���
		 		
		 		3. �� �÷����� �Ű������� ���� ������ �� �÷����� �������� SetŸ������ ��ȯ�ϴ� �޼���
		 */
	public  Set<T> union(Collection<? extends T> a, Collection<? extends T> b) {
		Set<T> union_set = new HashSet<>(a);
		union_set.addAll(b);
		return union_set;
	}
		
	public Set<T> intersection(Collection<? extends T> a, Collection<? extends T> b) {
		Set<T> inter_set = new HashSet<>(a);
		inter_set.retainAll(b);
		return inter_set;
	}
	
	public Set<T> diff(Collection<? extends T> a, Collection<? extends T> b) {
		Set<T> diff_set = new HashSet<>(a);
		diff_set.remove(b);
		return diff_set;
	}
	
	public static int plus(int a, int b) {
		a += b;
		return a;
	}

	
	
	public static void main(String[] args) {
		// �ҹ��ڷ� �����ϴ� Ÿ�Ե��� �Ű������� ������ �� ���� �����Ͽ� �����Ѵ�
		int int_a = 20;
		int int_b = 30;
		
		
		System.out.println(plus(int_a, int_b));
		System.out.println("plus �� int_a�� �� : " +int_a);
		
		// �빮�ڷ� �����ϴ� Ÿ�Ե�(������)�� �Ű������� ������ �� �ּҸ� �����Ͽ� �����Ѵ�
		List<String> a = new ArrayList<>();
		Set<String> b = new HashSet<>();
		Set<String> c= new HashSet<>();
		
		a.add("abc");
		a.add("application");
		a.add("abvertise");
		a.add("apple");
		
		b.add("apple");
		b.add("banana");
		b.add("ballon");
		b.add("bike");
		
		c.add("apple");
		c.add("cow");
		c.add("cat");
		c.add("crack");
		
		
		
		D02_JiphapQuiz<String> juphap_tools = new D02_JiphapQuiz<String>();
		D02_JiphapQuiz<Integer> juphap_tools2 = new D02_JiphapQuiz<Integer>();
		
		//������
		System.out.println("\nunion�� �����ϱ� ���� a : " + a);
		System.out.println(juphap_tools.union(a, b));	// ������ ������
		
		System.out.println("\nunion�� ������ ���� a : " +a);		// ���� ���� ������ �ٲ�
		System.out.println(juphap_tools.union(a, c));	// ���� �� a���� �� c�� ������
		
		//������ 
		System.out.println(juphap_tools.intersection(juphap_tools.intersection(a, b), c));
		
		//������
		System.out.println(juphap_tools.diff(a, b));
		System.out.println(juphap_tools.diff(b, c));
		
	}
}