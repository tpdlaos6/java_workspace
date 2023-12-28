
public class java05_6_HongSG {
	
	public static void main(String[] args) {
		   String csvData = "EL201800001,CH201800021,EN12231";
		   String[] result2  = csvData.split(",");
		      
		   for(int i=0; i<result2.length; i++) {
		      switch(result2[i].substring(0,2)) {
		         case "EL" :
		            System.out.println("학번 : "+result2[i].substring(2)+"의 전공은 전자공학과입니다");
		            break;
		         case "CH" :
		            System.out.println("학번 : "+result2[i].substring(2)+"의 전공은 화학공학과입니다");
		            break;
		         case "EN" :
		            System.out.println("학번 : "+result2[i].substring(2)+"의 전공은 영어영문학과입니다");
		            break;
		         default:
		            System.out.println("잘못 입력되었습니다.");
		      }
		   }

	}

}
