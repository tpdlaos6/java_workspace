
public class Recu {
	
   public static String a= "";
   
      
   public static int fact(int n) {
      if(n<= 1) {
         a+=Integer.toString(n);
         return n;
      }
      else {
         a += Integer.toString(n)+"*";
         return n*fact(n-1);
      }
   }
   
   public static void main(String[] args) {
      System.out.println(fact(4));
      System.out.println(Recu.a);
      
      
   }

}
