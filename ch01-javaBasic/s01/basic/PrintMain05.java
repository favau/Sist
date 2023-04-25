package kr.s01.basic;
//printf
public class PrintMain05 {
	public static void main(String[] args) {
		//System.out.printf(포맷문자, 데이터)를
		//이용한 출력(데이터의 종류를 표시할 수 있는 포맷문자 지원)

		//문자
		System.out.printf("%c\n", 'A');
		//6자리 확보, 오른쪽에 정렬
		System.out.printf("%6c\n", 'B');
		//6자리 확보, 왼쪽에 정렬
		System.out.printf("%-6c\n", 'C');
		
		//정수
		System.out.printf("%d\n",67);
		//3자리 단위로 쉼표 표시
		System.out.printf("%,d원\n",10000000);
		//5자리 확보 오른쪽 정렬
		System.out.printf("%5d\n",20);
		//5자리 확보 왼쪽 정렬
		System.out.printf("%-5d\n",20);
		
		//실수
		//소수점 6째 자리까지, 빈 자리는 0으로 출력
		System.out.printf("%f\n",3.141592);
		//소수점 4째 자리까지 반올림
		System.out.printf("%.4f\n",3.141592);
		//10자리 확보, 소수점 2째 자리까지 반올림
		System.out.printf("%10.2f\n",3.141592);
		
		//문자열
		System.out.printf("%s\n","우주");
		
		//논리값
		System.out.printf("%b\n",true);
		
		//데이터의 종류가 여러 개 일 경우		
		System.out.printf("%s는 %d점입니다.\n","점수",98);
	}
}
