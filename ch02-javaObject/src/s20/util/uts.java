package kr.s20.util;
import java.util.Random;
import java.util.Scanner;
public class uts {
	/*
	 * [실습]
	 * 가위바위보 게임
	 * [입력 예시]
	 * 가위바위보 입력(0.가위 1.바위 2.보) : 1
	 * 
	 * [출력 예시]
	 * -> 컴퓨터 : 가위, 사람 : 바위
	 * 결과 : 사람 승
	 */
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] item = {"가위","바위","보"};
		                    // 0       1     2
		double ran = Math.random();
		int index = (int)(ran*3);
		while(true) {
			System.out.println("--------------------");
			System.out.println("1.게임하기 | 2.종료하기");
			System.out.println("--------------------");
			System.out.println("메뉴>");
			int num = sc.nextInt();
			if(num==1) {
				System.out.println("가위바위보 입력(0.가위 1.바위 2.보) : ");
				int user = sc.nextInt();
				if(user < 0 || user > 2) {
					System.out.println("잘못 입력했습니다.");
					continue;
				}
				//0~2
				int computer = (int)(Math.random()*3);
				
				/*
				 * 컴퓨터 사용자 결과
				 *    0       0       0       무
				 *    0       1      -1       
				 *    0       2      -2
				 *    -------------------------
				 *    -------------------------
				 *    220
				 */
				int result = computer - user;
				System.out.println("-> 컴퓨터 : " + item[computer] + ", 사람 : " + item[user]);
				
				System.out.println("결과 : ");
				if(result == -1 || result == 2) {
					System.out.println("사람 승");
				}else if(result == -2 || result == 1) {
					System.out.println("컴퓨터 승");
				}else { //0인 경우
					System.out.println("무승부");
				}
			}else if(num == 2) {
				System.out.println("게임을 종료합니다.");
				break;
			}