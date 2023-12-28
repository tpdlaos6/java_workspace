import java.io.BufferedReader;
import java.io.FileOutputStream;
import java.io.FileReader;

public class 파일입출력_테스트 {

	public static void main(String[] args) throws Exception{
		
		// 실행하면 아래 디렉토리 주소 안에 out.txt가 만들어짐
		FileOutputStream output = new FileOutputStream("c:/file/out.txt");
		
		// 실행하면 만들어진 txt 안에 아래 코드의 출력값이 작성됨
		for(int i=1; i<11; i++) {
            String data = i+" 번째 줄입니다.\r\n";
            output.write(data.getBytes());
		}
		output.close(); 
// 기본값은 덮어쓰기. 여러번 실행했다고 값이 반복해서 출력작성되지 않음
// 덮어쓰기가 아닌, 추가하고싶다면 8번째줄 "c:/file/out.txt"뒤에 ,true 붙이면 됨
		
		BufferedReader br = new BufferedReader(new FileReader("c:/file/out.txt"));
        while(true) {
            String line = br.readLine();
            if (line==null) {
            	break;  // 더 이상 읽을 라인이 없을 경우 while 문을 빠져나간다.
            }
            System.out.println(line);
        }
        br.close();
		
	}

}
