public class AddressBook {
   private int num;
   private String name;
   private String tel;
   private String email;
   
   public int getNum() {
      return num;
   }
   public void setNum(int num) {
      this.num = num;
   }
   public String getName() {
      return name;
   }
   public void setName(String name) {
      this.name = name;
   }
   public String getTel() {
      return tel;
   }
   public void setTel(String tel) {
      this.tel = tel;
   }
   public String getEmail() {
      return email;
   }
   public void setEmail(String email) {
      this.email = email;
   }
   
   void output() {
      System.out.println("번호 : "+this.num);
      System.out.println("이름 : "+this.name);
      System.out.println("전화번호 : "+this.tel);
      System.out.println("이메일 : "+this.email);
      System.out.println();
   }
}
