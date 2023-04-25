package kr.s17.network;
import java.net.MalformedURLException; //url 형식 오류
import java.net.URL;
//getProtocol
//getHost
//getDefaultPort
//getPort
//getPath
public class URLMain {
	public static void main(String[] args) {
		
		try {
			URL url = new URL("http://java.sun.com/index.jsp?name=kim#content");
			System.out.println("프로토콜 : " + url.getProtocol());
			System.out.println("호스트 : " + url.getHost());
			System.out.println("기본 포트 : " + url.getDefaultPort());
			System.out.println("포트 : " + url.getPort());
			System.out.println("패스 : " + url.getPath());
			
		}catch(MalformedURLException e) {
			e.printStackTrace();
		}
	}
}
