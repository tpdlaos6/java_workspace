import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class ServerEx {
   
   
   public static void main(String[] args) {
      BufferedReader in =null;
      BufferedWriter out =null;
      ServerSocket listener = null;
      Socket socket=null;
      Scanner scanner = new Scanner(System.in);
      try {
         listener=new ServerSocket(9999);//port번호 9999
         System.out.println("연결을 기다리고 있습니다....");
         socket=listener.accept(); //클라이언트의 요청이 있을 경우 받아들임. 소켓생성됨.
         //입력스트림 . 클라이언트가 보낸 메시지 수신용
         in=new BufferedReader(new InputStreamReader(socket.getInputStream()));
         //출력스트림. 클라인언트로 메세지 보내는 송신용
         out=new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
         //무한반복하다가 by면 종료
         while(true) {
            String inputMessage=in.readLine(); //클라이언트가 보낸 메시지 한줄 읽기
            if(inputMessage.equalsIgnoreCase("bye")) { //대소문자 구분없이 bye이면
               System.out.println("클라이언트가 bye로 연결을 종료함");
               break; //중지
            }
         
            System.out.println("클라이언트 : " +  inputMessage);//클라이언트가 보낸 메시지 출력
            System.out.println("보내기 >>");
            String outputMessage=scanner.nextLine();//서버에서 보낼 메시지 입력
            out.write(outputMessage + "\n");
            out.flush();//버퍼비우기   
         }
      
      }catch(Exception e) {
         System.out.println(e.getMessage());
      }finally {
         try {
            scanner.close(); //scanner닫기
            socket.close(); //통신용 소켓닫기
            listener.close();//서버소켓닫기
         }catch(Exception e) {
            System.out.println("클라이언트와 채팅 중 오류가 발생했습니다.");
         }
      }
      
      
   }
}