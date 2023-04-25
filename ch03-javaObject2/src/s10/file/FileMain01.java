package kr.s10.file;
import java.io.File;

public class FileMain01 {
	public static void main(String[] args) {
		//경로 지정
		String path = "C:\\";
		
		File f = new File(path);
		
		if(!f.exists() || !f.isDirectory()) {
			System.out.println("유효하지 않은 디렉토리입니다.");
			//프로그램 종료
			System.exit(0);
		}
		
		//지정한 경로의 하위 디렉토리와 파일 정보를 File 배열로 반환
		File[] files = f.listFiles();
		
		for(int i=0;i<files.length;i++) {
			File f2 = files[i];
			if(f2.isDirectory()) {
				//디렉토리인 경우
				System.out.println("["+f2.getName()+"]");
			}else {
				//파일인 경우
				System.out.println(f2.getName());
				System.out.printf("(%,dbytes\n",f2.length());
			}
		}
	}
}
