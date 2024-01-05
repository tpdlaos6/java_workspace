import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.Socket;
import java.util.Scanner;

public class ClientEx {

	public static void main(String[] args) {
		BufferedReader in = null;
		BufferedWriter out = null;
		Socket socket = null;
		Scanner scanner = new Scanner(System.in);
		try {
			socket=new Socket("localhost",9999); // 서버 주소, 포트 번호
			//서버에서 보낸 메시지 받기용. 소켓사용
			in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			//서버로 메시지 보내기용. 소켓 사용
			out = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
			//무한반복
			while(true) {
				System.out.println("보내기>>");
				String outputMessage=scanner.nextLine(); // 서버로 보낼 메시지 한 행을 입력
				if(outputMessage.equalsIgnoreCase("bye")) {
					out.write(outputMessage+"\n");
					out.flush();
					break;
				}
				out.write(outputMessage+"\n"); // 서버로 메시지 송신
				out.flush();
				String inputMessage=in.readLine(); // 서버에서 보낸 메시지 수신
				System.out.println("서버 : "+inputMessage);
			}
		}catch(IOException e) {
			e.printStackTrace();
		}finally {
			try {
				scanner.close();
				if (socket!=null)socket.close();
			}catch(IOException e) {
				System.out.println("서버와 채팅 중 오류가 발생했습니다");
			}
		}
		
	}

}
