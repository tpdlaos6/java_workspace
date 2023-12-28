import java.io.BufferedReader;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.util.Scanner;

public class 파일입출력_테스트2 {

	public static void main(String[] args) throws Exception{
		// error log, web server log 등 log 기록을 할 때 사용
		
		FileOutputStream output = new FileOutputStream("c:/file/out.txt",true);
		Scanner s=new Scanner(System.in);
		System.out.println("주소 : ");
		String address=s.nextLine();
		output.write(address.getBytes());

		
		output.close(); 
		
	}

}
