
public class Lotto {

   public static void main(String[] args) {
      // TODO Auto-generated method stub
      int lottoNumber[] = new int[6];
      int index=0;

      //난수 6개 중복되지 않게 배열안에 숫자 넣기
      for(;;) {
         //1. 1~45의 난수 6개를 구한다
         int randomNum = (int)(Math.random()*45)+1;   //1~45 까지 수 중에 랜덤
         //처음 난수는 무조건 입력
         if(index ==0 ) {
            lottoNumber[index] = randomNum;            //랜덤값 배열에 입력
            index++;                           //해당인덱스 사용하였으니 +1
         //처음 난수(1번째) 입력후 그다음 숫자 2~6번째 숫자는 중복여부 체크해서 넣어주기
         }else if(index >0 && index <6) {
            int test = 0;    //중복이 발생했는지 체크하는 숫자. 중복이 아니면0, 중복이면 1
            //중복 체크하기
            for(int j=0; j<index; j++) {
               //배열안의 값이랑 난수가 겹칠때
               if(lottoNumber[j]==randomNum) {
                  test =1;
                  break;
               }
            }
            //test 가 0이면 중복이 없으므로 해당값 배열의 해당 index 칸에 정보 입력해주기
            if(test ==0) {
               lottoNumber[index] = randomNum;            //랜덤값 배열에 입력
               index++;                           //해당인덱스 사용하였으니 +1
            }else {
               System.out.println("값이 중복되었습니다.");
            }
         //index가 6부터는 배열안의 숫자가 다 찼으므로 전체 종료
         }else if(index>5) {
            System.out.println("번호 생성이 끝났습니다.");
            break;
         }
      }
      // 오름차순 정렬 코드 -> 얘는 공부 안하셔도 됩니다.........
      for(int i=0; i<lottoNumber.length-1; i++) {
         for(int j=0; j<lottoNumber.length-i-1; j++) {
            if(lottoNumber[j] > lottoNumber[j+1]) {
               int temp= lottoNumber[j];
               lottoNumber[j] = lottoNumber[j+1];
               lottoNumber[j+1] = temp;
            }
         }
      }
      
      //중복되지 않은 난수들을 넣은 배열의 값 출력하기
      for(int i=0; i<lottoNumber.length; i++) {
         System.out.println((i+1)+"번째 숫자 : "+lottoNumber[i]);
      }
      
   }

}