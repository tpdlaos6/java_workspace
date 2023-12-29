import java.util.Scanner;


// 컴퓨터 정답을 만드는 클래스
class Answer{
   // 1. 정답구하기 -> 난수 이용하여 배열 사이즈3에 맞춰서 만들기 
   int answerNumber[] = new int[3];
   int index=0;
   
   public Answer() {}   //기본생성자
   
   
   // 정답 만들어주는 함수
   public void makeAnswer() {
      // 1-1. 난수 3개 중복되지 않게 배열안에 숫자 넣기
      while(true){
         //1. 1~9의 난수 6개를 구한다
         int randomNum = (int)(Math.random()*9)+1;   //1~45 까지 수 중에 랜덤
         //처음 난수는 무조건 입력
         if(index ==0 ) {
            answerNumber[index] = randomNum;            //랜덤값 배열에 입력
            index++;                              //해당인덱스 사용하였으니 +1
         //처음 난수(1번째) 입력후 그다음 숫자 2~6번째 숫자는 중복여부 체크해서 넣어주기
         }else if(index >0 && index <3) {
            int test = 0;    //중복이 발생했는지 체크하는 숫자. 중복이 아니면0, 중복이면 1
                     
            //중복 체크하기
            for(int i=0; i<index; i++) {
               //배열안의 값이랑 난수가 겹칠때
               if(answerNumber[i]==randomNum) {
                  test =1;
                  break;
               }
            }
            //test 가 0이면 중복이 없으므로 해당값 배열의 해당 index 칸에 정보 입력해주기
            if(test ==0) {
               answerNumber[index] = randomNum;            //랜덤값 배열에 입력
               index++;                           //해당인덱스 사용하였으니 +1
            }else {}                              //값이 중복되었을 경우 아무 동작하지 않고 다시 반복문 실행
         //index가 3부터는 배열안의 숫자가 다 찼으므로 전체 종료
         }else if(index>=3) {
            break;
         }
      }
   }
   
   //만든 답 확인하는 함수
   public void checkAnswer() {
      System.out.println("-------정 답--------");
      //정답 확인용 -> 디버깅용 (나중에는 이걸 없애서 정답 노출 x)
      for(int i=0; i<3; i++) {
         System.out.print(answerNumber[i]+"  ");
      }
      System.out.println();
   }
   
   
   
}

//사용자 입력값 받을 클래스
// 입력값을 이용하여 컴퓨터 정답 클래스의 값과 비교하여 답을 찾는다.
class UserAnswer{
   int[] userNumber = new int[3];   //받을 숫자 입력받고 넣을 공간
   int index=0;
   
   //받은 입력값을 가지고 중복 확인하고, 배열 3짜리 답을 만들어주는 함수
   public void makeUserAnswer(String answer) {
      //첫번째 칸의 값을 가지고 2,3번째 칸이랑 비교 후 2번째 칸이랑 세번재 칸 비교하면서 중복 체크하기
      int[] temp = new int[3];
      String[] tmpStr = new String[3];
      
      if(answer.length()>3 || answer.length()<3) {
         //3보다 크거나 작으면 1)게임 다시하기, 2) 게임종료하기, 3)잘못 입력했는지 체크하기
         System.out.println("다시 입력하세요.");
      }else if(answer.length()==3) {
         //입력값 3개로 나눠서 저장하기
         tmpStr = answer.split("");
         //사이즈가 3이면 제대로 입력되었음
         for(int i=0; i<answer.length(); i++) {
            //각 자리 값 입력해주기
            temp[i] = Integer.parseInt(tmpStr[i]);
         }
         //입력한 값 중복 없는지 체크
         if(temp[0] == temp[1] || temp[0] == temp[2] || temp[1] == temp[2] ) {
            //중복이면 다시입력하게 하기
         }else {
            //중복없이 정답이 잘 입력되었으므로 게임 진행
            userNumber = temp;
         }
      }
   }
   
   //만든 답 확인하는 함수
   public void checkAnswer() {
      System.out.println("-------유저 답--------");
      //정답 확인용 -> 디버깅용 (나중에는 이걸 없애서 정답 노출 x)
      for(int i=0; i<3; i++) {
         System.out.print(userNumber[i]+"  ");
      }
      System.out.println();
   }
   
}

class PlayGame{
   boolean result = false; //결과가 false면 패배, true면 승리
   int strike = 0;
   int ball = 0;
   
   
   public void check(Answer answer, UserAnswer useranswer) {
      strike = 0;
      ball = 0;
      if(answer.answerNumber[0]==useranswer.userNumber[0]) {
         strike++;
      }
      if(answer.answerNumber[1]==useranswer.userNumber[1]) {
         strike++;
      }
      if(answer.answerNumber[2]==useranswer.userNumber[2]) {
         strike++;
      }
      if(answer.answerNumber[0] == useranswer.userNumber[1]) {
         ball++;
      }
      if(answer.answerNumber[0] == useranswer.userNumber[2]) {
         ball++;
      }
      if(answer.answerNumber[1] == useranswer.userNumber[0]) {
         ball++;
      }
      if(answer.answerNumber[1] == useranswer.userNumber[2]) {
         ball++;
      }
      if(answer.answerNumber[2] == useranswer.userNumber[0]) {
         ball++;
      }
      if(answer.answerNumber[2] == useranswer.userNumber[1]) {
         ball++;
      }
      if(strike == 3) {
         result =true; //3strike의 경우 전부 다 맞춰서 게임 종료
      }   
      else {
         System.out.println(strike+"strike "+ball+"ball 입니다.");
      }
   }
   
   public boolean resultGame() {
      return result;
   } 
   
}

public class baseball_HSG_231228 {

   public static void main(String[] args) {
      int a= 0;   //게임 횟수 체크용
      //컴퓨터 답 객체 생성 및 답 생성
      Answer as = new Answer();
      as.makeAnswer();
//      as.checkAnswer();

      //유저용 객체 생성 및 답 입력받아서 체크하기
      UserAnswer us = new UserAnswer();
      
      //게임용 객체 생성
      PlayGame game = new PlayGame();
            
      Scanner sc = new Scanner(System.in);
      
      System.out.println("--------게임을 시작합니다.!!!!!--------------- ");
      while(true){
         System.out.print("숫자 세자리 입력하세요!  :  ");
         String tmp = sc.next();
         //입력받아서 유저 값 생성
         us.makeUserAnswer(tmp);
//         //입력값 제대로 들어갔는지 체크
         us.checkAnswer();
         
         //정답과 유저값 체크해서 확인
         game.check(as, us);
         a++;      //게임 횟수 체크
         
         if(game.resultGame()) {
            System.out.println("게임이 끝났습니다.");
            break;
         }
      }
      System.out.println(a+"번째 답에 정답입니다.");
   }

}