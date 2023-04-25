package kr.s04.array;

public class ArrayMain10 {
	public static void main(String[] args) {
		/*
		 * [실습]
		 * 1)10,20,30,40,50을 초기값으로 갖는 1차원 배열을 
		 * test 이름으로 선언, 생성, 초기화 하시오.
		 * 
		 * 2)반복문을 이용해서 출력하시오.
		 * 3)확장 for문을 이용해서 출력하시오.
		 * 4)인덱스3의 데이터를 100으로 변경하시오.
		 * 5)마지막 요소의 값을 200으로 변경하시오.
		 * 6)반복문을 사용하여 모든 요소의 값을 0으로 초기화 하시오.
		 * 7)홀수 인덱스에 10, 짝수 인덱스에 20 저장하시오.
		 * 8)모든 요소의 총합과 평균(총합을 요소의 수로 나눔)을 구하고 출력하시오.(sum(총합),avg(평균))
		 */
		
		// 1번
		int[] test = new int[] {100,88,88,100,90};
		int sum=0;
		float avg=0;
		//2번
		for(int i=0;i<test.length;i++) {
			System.out.println(test[i]);
		}
		System.out.println("----------");
		//3번
		for(int a : test) {
			System.out.println(a);
		}
		//4번 
		test[3] = 100;
		//5번
		test[test.length-1] = 200;
		System.out.printf("%d %d\n",test[3],test[4]);
		//6번
		for(int i=0;i<test.length;i++) {
			test[i] = 0;
		}
		//7번
		for(int i=0;i<test.length;i++) {
			if(i%2==0) {
				test[i] = 20;
			} else {
				test[i] = 10;
			}
		}
		//8번
		for(int i=0;i<test.length;i++) {
			sum += test[i];
		}
		avg = sum/(float)test.length;
		System.out.printf("총합 : %d 평균 : %.1f\n",sum,avg);
		System.out.printf("%d %d %d %d %d",test[0],test[1],test[2],test[3],test[4]);
	}
}
