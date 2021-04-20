package study;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;


public class D01_ArrayList {

			/*
			 		# Java Collections
			 		
			 			- �ڹٿ��� �⺻������ �����ϴ� �ڷᱸ�� �������̽�
			 			- Collections �������̽��� ��ӹ��� �������̽��δ� List, Set �� �ִ�
			 			
			 		# java.util.ArrayList
			 		
			 			- �迭�� �ٸ��� ũ�Ⱑ �ڵ����� �����Ǵ� �ڷᱸ�� Ŭ����
			 			- �迭�� ������ �����̴�
			 			- ���������� �����Ϳ� ������ �� ���� �����ϴ�
			 			
			 */
		public static void main(String[] args) {
			
			// # Ÿ���� �����ϸ� ArrayList �����ϱ�
			// 		- Ÿ���� ������ �� ����ϴ� <>�� ���׸� (Generic)�̶�� �θ���
			//		- ���׸����� �⺻�� Ÿ���� ����� �� ���� (�⺻ Ÿ���� WrapperClass �̿�) ������ ���
			ArrayList<String> fruits = new ArrayList<>();
			ArrayList<Integer> numbers = new ArrayList<>(); // int �ȵ�
			
			
			// add(item) : ����Ʈ�� ���ϴ� �����͸� ���������� �� �ڿ� �߰��Ѵ�
			fruits.add("apple");
			fruits.add("kiwi");
			fruits.add("apple");
			fruits.add("apple");
			fruits.add("apple");
			fruits.add("kiwi");
			
			numbers.add(10);			
			numbers.add(20);			
			numbers.add(30);			
			numbers.add(40);			


			// add(index, item) : ����Ʈ�� ���ϴ� ��ġ�� �����͸� �ִ´�
			fruits.add(2, "orange");
			fruits.add(2, "peach");
			fruits.add(2, "grape");
			
			System.out.println(fruits);
			System.out.println(numbers);
			
			
			// get(index) : ����Ʈ���� ���ϴ� �ε����� �����͸� �ϳ� ������
			System.out.println(fruits.get(0));
			System.out.println(fruits.get(1));
			System.out.println(fruits.get(2));
			System.out.println(fruits.get(3));
			
			// size() : �ش� �÷����� ũ�⸦ ��ȯ�Ѵ�
			System.out.println("fruit�� ũ�� : " + fruits.size());
			System.out.println("numbers�� ũ�� : " + numbers.size());
			
			// remove(index) : �ش� ��°�� �����͸� �����Ѵ�. ��� ���� �����͸� ��ȯ��
			String deleted_fruit = fruits.remove(3);
			
			System.out.println("���� �� : " + fruits);
			System.out.println("������ �� : "+ deleted_fruit);
			
			// remove(item) : �ش� �����͸� �����Ѵ�. ���� ���� ���θ� ��ȯ�Ѵ�
			if (fruits.remove("strowberry")) {
			System.out.println("strowberry�� ���������� �����߽��ϴ�");
			}else {
				System.out.println("strowberry�� ��� �������� ���߽��ϴ�");
			}
			
			// �÷��� ���� (��������)
			Collections.sort(fruits);
			System.out.println(fruits);
			
			// �迭 ���� (��������)
			int[] lottos = {45, 1, 7, 13, 8, 20, 11};
			Arrays.sort(lottos);
			System.out.println(Arrays.toString(lottos));
			
		}
		
}