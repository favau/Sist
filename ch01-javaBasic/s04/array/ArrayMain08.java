package kr.s04.array;
//args를 이용한 입력 (Run Configurations)
public class ArrayMain08 {
	public static void main(String[] args) {
		if(args.length>0) {
			for(int i=0;i<args.length;i++) {
				System.out.println(i + ":" +args[i]);
			}
		}else {//args.length==0 의미
			//전달된 데이터가 없음
			System.out.println("입력한 내용이 없습니다.");
		}
	}
}
