package quiz;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

public class D02_LottoSet {
	
		// 1부터 45 사이의 중복없는 랜덤숫자 7개로 이루어진 HashSet을 생성하여 
		// 반환하는 메서드를 작성후 테스트해보기	

		public HashSet<Integer> getLottoSet(){
			HashSet<Integer> lotto = new HashSet<>();
			
			while (lotto.size() < 6) {
				lotto.add((int)(Math.random() * 45 + 1));
			}
			return lotto;
	}
		
		/*
		  		1부터 45 사이의 중복없는 랜덤숫자 7개로 이루어진 ArrayList [] 을 생성하여
		  		반환하는 메서드를 작성 후 테스트
		*/
		
		public ArrayList<Integer> getLottoList(){
			ArrayList<Integer> lotto1 = new ArrayList<>(); 
			
			while (lotto1.size() < 6) {
				lotto1.add((int)(Math.random() * 45 + 1));
			}
			return lotto1;
			//return new ArrayList<>(getLootoSet());
	}
		
		/*
  			1부터 45 사이의 중복없는 랜덤숫자 7개로 이루어진 integer [] 을 생성하여
  			반환하는 메서드를 작성 후 테스트
 		*/
	
		public Integer[] getLottoArray() {
			return getLottoList().toArray(new Integer[7]);
		}
		public int[] getLottoArray2() {
		Integer [] lotto = getLottoArray();
			int[] result = new int[7];
			
			for (int i = 0; i < 7; ++i) {
				result[i] = lotto[i];
			}
			return result;
		}
		
		public static void main(String[] args) {
			HashSet<Integer> lotto = new D02_LottoSet().getLottoSet();
			ArrayList<Integer> lotto1 = new D02_LottoSet().getLottoList();
			System.out.println(lotto);
		}
}

//			HashSet<Integer> lotto = new HashSet<>();
//
//			while (lotto.size() < 7) {
//				lotto.add((int)(Math.random() * 45) + 1);
//			}
//			System.out.println(lotto);
		






