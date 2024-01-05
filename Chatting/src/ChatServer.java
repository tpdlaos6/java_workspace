import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;

import javax.sound.midi.Receiver;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class ChatServer extends JFrame implements ActionListener {
	private BufferedReader in=null;
	private BufferedWriter out=null;
	private ServerSocket listener = null;
	private Socket socket = null;
	private Receiver receiver = null; // JTextArea를 상속받고 Runnable 인터페이스를 구현한 클래스로서 받은 정보를 담는 객체
	private JTextField sender=null;
	
	public ChatServer() {
		this.setTitle("서버채팅창");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container c = this.getContentPane();
		c.setLayout(new BorderLayout()); //BorderLayout 배치관리자의 사용
		receiver=new Receiver(); // 클라이언트에서 받은 메시지를 출력할 컴퍼넌트
		receiver.setEditable(false); // 편집 불가
		
		sender = new JTextField();
		sender.addActionListener(this);
		
		add(new JScrollPane(receiver),BorderLayout.CENTER);
		add(sender,BorderLayout.SOUTH);
				
		this.setSize(400,200);
		this.setVisible(true);
		
		try {
			setupConnection();
		}catch(IOException e) {
			handleError(e.getMessage());
		}
		
		//thread 생성
		Thread th=new Thread(receiver); // 상대로부터 메시지 수신을 위한 쓰레드 생성
		th.start();
	}
	
	//Connection
	private void setupConnection() throws IOException{
		listener=new ServerSocket(9999);
		socket=listener.accept();
		receiver.append("클라이언트로부터 연결 완료");
		int pos=receiver.getText().length();
		receiver.setCaretPosition(pos); // 마지막 위치로 자동 스크롤
		
		in=new BufferedReader(new InputStreamReader(socket.getInputStream())); // 클라이언트로부터의 입력 스트림
		out=new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));// 클라이언트로의 출력 스트림
	}
	
	
	
	//Error Message출력. 앱종료
	private static void handleError(String string) {
		System.out.println(string);
		System.exit(1); // 프로그램 강제종료
	//일반적으로 0은 정상종료, 0 이외의 값은 오류 or 예외상황에 쓰임
	}
	
	//inner class
	private class Receiver extends JTextArea implements Runnable{

		@Override
		public void run() {
			String msg=null;
			while(true) {
				try {
					msg=in.readLine();					
				}catch(Exception e) {
					handleError(e.getMessage());					
				}
				this.append("\n 클라이언트 : "+msg);
				int pos=this.getText().length();
				this.setCaretPosition(pos);
			}
		}
		
	}
	

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==sender) {
			String msg=sender.getText();
			try {
				out.write(msg+"\n"); // 문자열 전송
				out.flush();
				
				receiver.append("\n서버 : "+msg);
				int pos=receiver.getText().length();
				receiver.setCaretPosition(pos);
				sender.setText(null);
			}catch(IOException e1) {
				handleError(e1.getMessage());
			}
		}
	}

	public static void main(String[] args) {
		new ChatServer();
		
	}
}
