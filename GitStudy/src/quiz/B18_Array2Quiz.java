package quiz;

import java.util.Arrays;

public class B18_Array2Quiz {

	public static void main(String[] args) {

		int[][] numArr = new int[][] {
			{1, 1, 1, 1},
			{1, 1, 1, 1, 1, 1, 1},
			{1, 1, 1, 1, 1, 1},
			{1, 1},
			{1, 1, 1, 1, 1},
		};
		
		// 1. numArr�� ��� ���� 0 ~ 100 ������ ���� ������ �ٲ㺸����
		
		// 2. numArr�� ���հ� ����� ���ؼ� ����غ�����
		
		// 3. numArr�� �� ���� ���� ��� ���ؼ� ����غ�����
		
		// 4. numArr�� �� ���� ���� ��� ���ؼ� ����غ�����
		
	

//		int sum = 0;
//		double avg = 0;
//		
//		for(int i = 0; i < numArr.length; ++i) {
//			for(int j = 0; j<numArr[i].length; ++j) {
//				numArr[i][j] = (int) (Math.random() * 100+1);
//				System.out.print(" "+numArr[i][j]);
//				sum += numArr[i][j];
//				avg = sum / (double)100;
//			}
//			System.out.println();
//		}
//			System.out.println("�� �� : " +sum + " ��� : " +avg);
//			sum = 0;
//			
//			for(int i = 0; i < numArr.length; ++i) {
//				for(int j = 0; j<numArr[i].length; ++j) {
//					sum += numArr[i][j];
//				
//				}
//				System.out.println(sum);
//				sum =0;
//			}
//			System.out.println();
//			for(int i = 0; i < numArr.length; ++i) {
//				for(int j = 0; j<numArr[i].length; ++j) {
//					sum += numArr[j][i];
//				}
//				System.out.println(sum);
//				sum = 0;
//		}
			
		for(int i = 0; i < numArr.length; ++i) {
			for(int j = 0; j < numArr[i].length; ++j) {
				numArr[i][j] = (int)(Math.random() * 101);
				
				System.out.printf(" " +numArr[i][j]);
			}
			System.out.println();
		}
			int sum = 0;
			int count = 0;
			for(int i = 0; i < numArr.length; ++i) {
				count+=numArr[i].length;
				
				for(int j = 0; j < numArr[i].length; ++j) {
					sum += numArr[i][j];
				}
			}
			System.out.println("����"+sum +"���"+sum/(double)count);
			
			
			int[] rowSum = new int [5];
			
			for(int i = 0; i < rowSum.length; ++i) {
				
				for(int j = 0; j < numArr[i].length; ++j) {
					rowSum[i] += numArr[i][j];
				}
			}
			// Arrays.toString(): �迭 ���ϰ� ����ϱ�
			System.out.println("������"+Arrays.toString(rowSum));
			
			// # row : ��  column  : ��
			
			// ���� �� �迭 ã��
			int longest = 0;
			for(int i = 0; i < numArr.length; ++i) {
				longest = Math.max(longest, numArr[i].length);
			}
			int[] colSum = new int [longest];
			
			
			for(int i = 0; i < rowSum.length; ++i) {
				for(int j = 0; j < numArr[i].length; ++j) {
					colSum[j] += numArr[i][j];
				}
		}
			
			
//			for(int i = 0; i < colSum.length; ++i) {
//				
//				for(int j = 0; j < numArr.length; ++j) {
//					if(numArr[i].length < i) {
//						colSum[i] += numArr[j][i];
						
					
		
				
			
			System.out.println("������"+ Arrays.toString(colSum));
	}
	
}



