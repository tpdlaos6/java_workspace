package addressbook_231221;

import java.util.Scanner;

public class Java03 {

	public static void main(String[] args) {
		
		
		AddressBook[] aBook = new AddressBook[5];		
		
		for(int i=0;i<aBook.length;i++) {
			aBook[i]=new AddressBook();			
		}
		
		aBook[0].setNo(1);
		aBook[0].setName("홍상기");
		aBook[0].setPhoneNumber("01012345678");
		aBook[0].setEmail("HSG.naver.com");
		
		aBook[1].setNo(2);
		aBook[1].setName("정인수");
		aBook[1].setPhoneNumber("01012345678");
		aBook[1].setEmail("JIS.naver.com");
		
		aBook[2].setNo(3);
		aBook[2].setName("김기정");
		aBook[2].setPhoneNumber("01012345678");
		aBook[2].setEmail("KKJ.naver.com");
		
		aBook[3].setNo(4);
		aBook[3].setName("설희민");
		aBook[3].setPhoneNumber("01012345678");
		aBook[3].setEmail("SHM.naver.com");
		
		aBook[4].setNo(5);
		aBook[4].setName("이경무");
		aBook[4].setPhoneNumber("01012345678");
		aBook[4].setEmail("LKM.naver.com");
		
	
		// 1~5번 입력 하면 해당 번호 학생의 이름,번호,이메일 나오게.
		// 그 외 번호 입력하면 다시 입력해달라는 문구.
		
		Scanner s=new Scanner(System.in);
		System.out.println("번호를 입력하시오");
		int n=s.nextInt();
		if(n==1) {
			System.out.println("이름 : "+aBook[0].getName()+"\r"+"전화번호 : "+aBook[0].getPhoneNumber()+"\r"+"이메일 : "+aBook[0].getEmail());
		}else if(n==2) {
			System.out.println("이름 : "+aBook[1].getName()+"\r"+"전화번호 : "+aBook[1].getPhoneNumber()+"\r"+"이메일 : "+aBook[1].getEmail());		
		}else if(n==3) {
			System.out.println("이름 : "+aBook[2].getName()+"\r"+"전화번호 : "+aBook[2].getPhoneNumber()+"\r"+"이메일 : "+aBook[2].getEmail());		
		}else if(n==4) {
			System.out.println("이름 : "+aBook[3].getName()+"\r"+"전화번호 : "+aBook[3].getPhoneNumber()+"\r"+"이메일 : "+aBook[3].getEmail());		
		}else if(n==5) {
			System.out.println("이름 : "+aBook[4].getName()+"\r"+"전화번호 : "+aBook[4].getPhoneNumber()+"\r"+"이메일 : "+aBook[4].getEmail());		
		}else {
			System.out.println("다시 입력해 주십시오");		
			
		}
	}

}
