import java.util.Scanner;

public class java05_7_HongSG {

	public static void main(String[] args) {
	      Scanner sc = new Scanner(System.in);
	      String idCheck = "";
	      String check="!,@,#,$,%,^";
	      String[] result3 = check.split(",");
	      int a = 0;         // 잘못 되었는지 안되었는지 체크하는 숫자
	      
	      System.out.println("id를 입력하세요");
	      idCheck = sc.next();
	      
	      for(int i=0; i<result3.length; i++) {
	         //포함되지 말아야 할 문자가 포함되어 있을 경우
	         if(idCheck.contains(result3[i])== true) {
	            System.out.println("아이디에 !,@,#,$,%,^가 포함되면 안됩니다.");
	            break;
	         }else {
	            a++;   //위의 문자가 포함되지 않았을경우마다 +1 씩하여 총 배열 갯수만큼 누적됨
	         }
	         if(a ==result3.length) {   //배열갯수만큼 누적되면 문제가 없으므로 해당 문구 출력
	            System.out.println("정상적으로 입력되었습니다.");
	         }
	      }

	}

}
