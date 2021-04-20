package study;
import java.util.Comparator;
import java.util.TreeSet;

public class D06_TreeSet {

		/*
		 		# TreeSet
		 		
		 			- 중복값을 저장할 수 없다
		 			- 데이터를 저장할 때 Comparator를 이용해 미리 정렬한다
		 			- 요소를 null을 허용하지 않는다
		 			- 처음에 정렬해서 넣기 때문에 Hash에 비해 저장속도가 느리다
		 			- 하지만 TreeSet에는 순서(인덱스)가 있기 때문에 
		 				정렬
		 */
		public static void main(String[] args) {
			TreeSet<Grape> grape_tree = new TreeSet<>(new 포도분류기_GNO기준_내림차순());
			TreeSet<Grape> grape_tree2 = new TreeSet<>(new 포도분류기_포도알맹이_오름차순());
			
			// 해당 객체 자체가 비교 가능한 객체라면 comparator를 사용하지 않을 수 있다
			TreeSet<String> word_tree = new TreeSet<>();
			TreeSet<Mango> mango_tree = new TreeSet<>();
			
			for (int i =0; i < 5; ++i) {
				mango_tree.add(
						new Mango(
											String.format("MANGO%05d",(int)(Math.random() * 10000)),
											10,
											10));
			}
			System.out.println(mango_tree);
			grape_tree.add(new Grape().setGno("1").setFruit(37));
			grape_tree.add(new Grape().setGno("2").setFruit(31));
			grape_tree.add(new Grape().setGno("3").setFruit(40));
			grape_tree.add(new Grape().setGno("4").setFruit(37));
			
			grape_tree2.addAll(grape_tree);
			
			System.out.println(grape_tree);
			System.out.println(grape_tree2);
			
			word_tree.add("cat");
			word_tree.add("pet");
			word_tree.add("pat");
			word_tree.add("fat");
			word_tree.add("bat");
			
			System.out.println(word_tree);
			
			// decendingSet() :미리 정렬해놓은 방향과 반대 방향인 Set 인스턴스를 반환
			System.out.println(grape_tree.descendingSet());
			
			// headSet(toElement) : 맨 앞부터 원하는 요소까지 자른 Set을 반환
			System.out.println(grape_tree.headSet(new Grape().setGno("3")));
			
			// tailSet(toElement) : 원하는 요소부터 맨 뒤까지 자른 Set을 반환
			System.out.println(grape_tree.tailSet(new Grape().setGno("2")));
			
			// subSet(fromElement, to Element) : 원하는 요소부터 시작해서 원하는 요소까지 자른 Set을 반환
			System.out.println(grape_tree.subSet(new Grape().setGno("3"), new Grape().setGno("1")));
			
			TreeSet<Integer> int_tree = new TreeSet<>();
			
			int_tree.add(99);
			int_tree.add(5);
			int_tree.add(15);
			int_tree.add(75);
			int_tree.add(33);
			int_tree.add(21);
			int_tree.add(9);
			int_tree.add(1);
			
			System.out.println(int_tree);
			
			// ceil(element) : 원하는 가장 가까운 요소를 대충 선택(전달한 값도 포함) 이상
			System.out.println(int_tree.ceiling(20));
			System.out.println(int_tree.ceiling(21));
			System.out.println(int_tree.ceiling(22));
			
			// floor(element) : 원하는 가장 가까운 요소를 대충 내려서 (전달한 값도 포함) 이하
			System.out.println(int_tree.floor(21));
			System.out.println(int_tree.floor(20));
			System.out.println(int_tree.floor(19));
			System.out.println(int_tree.floor(18));
			
			// higher(element) : 원하는 가장 가까운 요소를 올려서 선택 (전달한 값 미포함) 초과
			System.out.println(int_tree.higher(21));
			// lower(element) : 원하는 가장 가까운 요소를 내려서 선택 (전달한 값 미포함) 미만
			System.out.println(int_tree.lower(21));
			
			
			
			// 연습문제 : 망고트리에 망고를 5개 추가할때 mno기준 오름차순 정렬이 되도록 만들고 확인
			//					sysout으로 출력할때 보기 좋게 나와야 함 (망고주소 x)      못풀었음
			// new Mango("1234", 12, 123).setMno("4321");
		}
}

class MangoComparatorBySweetAsc implements Comparator<Mango>{
    /*
    # Comparator의 규칙
    
     - compare 메서드의 리턴 값이 1이면 o1과 o2의 순서를 바꾼다
     - compare 메서드의 리턴 값이 0이면 같은 크기로 취급한다
     - compare 메서드의 리턴 값이 -1이면 o1과 o2의 순서를 그대로 유지한다 
     
     	[3, 2, 3, 8, 99, 1, 5, 8, 9]
*/
	
	@Override
	public int compare(Mango o1, Mango o2) {
		
		if(o1.sweet < o2.sweet) {
			return 1;
		}else if(o1.sweet < o2.sweet) {
			return -1;
		}else {
			return 0;
		}
	}
}
// Comparator : 비교 할때 사용하는 비교 도구 클래스로 만드는 인터페이스
// Comparable : 이 객체가 비겨 가능한

class Mango implements Comparable<Mango>{
	String mno;
	int sweet;
	int size;
	
	public Mango(String mno, int sweet, int size) {
		this.mno = mno;
		this.sweet = sweet;
		this.size = size;
	}
	
	Mango setMno(String mno){
		this.mno = mno;
		return this;
	}
        // this vs 매개변수로 compare 메서드를 구현하면 된다
        @Override
        public int compareTo(Mango o) {
        	return this.mno.compareTo(o.mno);
        }
        
        @Override
        public String toString() {                
        	return mno + "/" + sweet + "/" + size;       
        	
        }
   
}
