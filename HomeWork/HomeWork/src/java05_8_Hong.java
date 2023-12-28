import java.awt.print.Book;
import java.util.ArrayList;
import java.util.Scanner;

public class java05_8_Hong {

	public static void main(String[] args) {
		   Scanner sc = new Scanner(System.in);
		   Book book = new Book();
		   ArrayList<Book> al = new ArrayList<Book>();
		      
		   System.out.print("책 제목을 입력하세요 : ");
		   String title = sc.next();
		   System.out.print("저자를 입력하세요 : ");
		   String writer = sc.next();
		   System.out.print("출판사를 입력하세요 : ");
		   String publisher = sc.next();
		   System.out.print("가격을 입력하세요 : ");
		   int price = sc.nextInt();
		      
		   al.add(book);
		   al.get(0).title = title;
		   al.get(0).writer =writer;
		   al.get(0).publisher = publisher;
		   al.get(0).price = price; 
		   System.out.println(al.get(0).title+" , "+al.get(0).writer+" , "+ al.get(0).publisher+ " , "+ al.get(0).price );



	}

}
