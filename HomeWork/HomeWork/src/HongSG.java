
	public class HongSG {

		   public static void main(String[] args) {
		      // TODO Auto-generated method stub
		      Mouse m1 = new Mouse();
		      m1.output("mouse");
		      System.out.println();
		      
		      WheelMouse wm1 = new WheelMouse();
		      wm1.output("Wheelmouse");
		      System.out.println();
		      
		      MagicMouse mm1 = new MagicMouse();
		      mm1.output("MagicMouse");
		      System.out.println();
		      
		      MsArcMouse mam1 = new MsArcMouse();
		      mam1.output("MsArcmouse");
		      System.out.println();
		   }
		}


		class Mouse {

		   boolean wire;       //유선인지 무선인지
		   boolean mouseWheel; //마우스휠 있는지 없는지
		   boolean leftClick;  //왼쪽버튼 있는지 없는지
		   boolean rightClick; //오른쪽버튼 있는지 없는지
		   boolean moveLaser;   //바닥 센서가 레이저인지 아닌지.
		   //마우스 초기값은 전부 true
		   Mouse(){
		      wire=true;
		      mouseWheel=true;
		      leftClick=true;
		      rightClick=true;
		      moveLaser=true;
		   }
		   //해당 정보 출력
		   void output(String name) {
		      System.out.println(name+"입니다.");
		      if(this.wire ==true) {
		         System.out.println("유선입니다.");
		      }else {
		         System.out.println("무선입니다.");
		      }
		      if(this.mouseWheel==true) {
		         System.out.println("마우스 휠이 있습니다.");
		      }else {
		         System.out.println("마우스 휠이 없습니다.");
		      }
		      if(this.leftClick==true) {
		         System.out.println("왼쪽 버튼이 있습니다.");
		      }else{
		         System.out.println("왼쪽 버튼이 없습니다.");         
		      }
		      if(this.rightClick==true) {
		         System.out.println("오른쪽 버튼이 있습니다.");
		      }else{
		         System.out.println("오른쪽 버튼이 없습니다.");         
		      }
		      if(this.moveLaser==true) {
		         System.out.println("바닥센서가 있습니다.");
		      }else{
		         System.out.println("바닥센서가 없습니다.");         
		      }
		   }//end out put
		}



	 class WheelMouse extends Mouse {
		   boolean isSound;
		   
		   WheelMouse(){
		      wire=true;
		      mouseWheel=true;
		      leftClick=true;
		      rightClick=true;
		      moveLaser=true;
		      isSound=false;
		   }

		   void output(String name) {
		      super.output(name);
		      if(this.isSound==true) {
		         System.out.println("무소음 마우스가 아닙니다.");
		      }else {
		         System.out.println("무소음 마우스입니다.");         
		      }
		   }
		}



	 class MagicMouse extends Mouse{
		   boolean isSound;
		   boolean sector;
		   
		   MagicMouse(){
		      wire=false;
		      mouseWheel=false;
		      leftClick=false;
		      rightClick=false;
		      moveLaser=true;
		      isSound=false;
		      sector=false;
		   }
		   void output(String name) {
		      super.output(name);
		      if(isSound==true) {
		         System.out.println("무소음 마우스가 아닙니다.");
		      }else {
		         System.out.println("무소음 마우스입니다.");         
		      }
		      if(sector==true) {
		         System.out.println("버튼간 구분이 있습니다.");
		      }else {
		         System.out.println("버튼간 구분이 없습니다.");         
		      }
		   }
		}



	 class MsArcMouse extends Mouse {
		   boolean sector;
		   boolean flexible;
		   
		   MsArcMouse(){
		      wire=false;
		      mouseWheel=false;
		      leftClick=false;
		      rightClick=false;
		      moveLaser=true;
		      flexible=true;
		      sector=true;
		   }
		   void output(String name) {
		      super.output(name);
		      if(sector==true) {
		         System.out.println("버튼간 구분이 있습니다.");
		      }else {
		         System.out.println("버튼간 구분이 없습니다.");         
		      }
		      if(flexible==true) {
		         System.out.println("마우스 몸통이 휘어있습니다.");
		      }else {
		         System.out.println("마우스 몸통이 휘어있지 않습니다.");         
		      }
		   }
		}

	

