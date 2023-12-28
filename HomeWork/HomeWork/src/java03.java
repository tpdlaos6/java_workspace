import java.util.Scanner;

public class java03 {

   public static void main(String[] args) {
      // TODO Auto-generated method stub
      AddressBook addBook = new AddressBook();
      
      AddressBook addB[] = new AddressBook[15];
      
      
      
      Scanner s = new Scanner(System.in);
      //15개 객체 저장할 내용 받기
      for(int i=0; i<15; i++) {
         try {
            //각 값 입력받기
            System.out.print("번호를 입력하세요 : ");
            int num = s.nextInt();
            System.out.print("이름을 입력하세요 : ");
            String name = s.next();
            System.out.print("전화번호을 입력하세요 - 표시 : ");
            String tel = s.next();
            System.out.print("이메일을 입력하세요 ex)xxx@naver.com : ");
            String email = s.next();
            addB[i] = new AddressBook();      //새로운 객체 생성해서 해당 인덱스에 저장
            
            //해당 인덱스에 입력받은 값 저장시키기
            //getter, setter사용해보기
            addB[i].setNum(num);
            addB[i].setName(name);
            addB[i].setTel(tel);
            addB[i].setEmail(email);
            
         }catch (Exception e) {
            // TODO: handle exception
            //잘못입력해도 중간에 끊기지 않게 예외처리
            System.out.println("잘못입력하셨습니다..");
         }
      }
      //받은 입력값들 출력해보기
      for(int i=0; i < addB.length; i++) {
         System.out.println((i+1)+"번쨰 객체 내용물");
         System.out.println("번호 : "+addB[i].getNum());
         System.out.println("번호 : "+addB[i].getName());
         System.out.println("번호 : "+addB[i].getTel());
         System.out.println("번호 : "+addB[i].getEmail());
      }
      
   }

}
