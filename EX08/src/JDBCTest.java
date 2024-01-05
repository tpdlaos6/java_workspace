import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCTest {

	public static void main(String[] args) {
		
		Connection con=null;
		Statement stmt=null;
		ResultSet rs=null; // null은 reference 값이 없다는 의미
		
		String sql=null;
		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver"); // oracle driver 로드
			// oracle 연결. 임포트 필수.
			con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","user1","1234");
			// sql 문을 실행하기 위한, statement 객체 생성. 임포트 필수. 
			stmt=con.createStatement();
			
			// auto commit이 기본값. 만약 수동커밋으로 전환하고 싶으면 아래 명령어
//			con.setAutoCommit(false); // 수동 commit으로 전환하는 명령어
			
			// insert문 실행
			sql="insert into student values('20231222','신사임당','국문과','제주도 서귀포시')";

			//update문 실행
			sql="update student set address='경기도 분당' where id='20160001'";
			
			//delete문 실행 // 참조키로 설정한 값은 지워지지 않음!!!
			sql="delete from student where id='20231222'"; 
			stmt.executeUpdate(sql);
			
			// select문 실행. 임포트 필수
			
			sql="select * from student";
			
			rs=stmt.executeQuery(sql);
			// Fetch
			while(rs.next()) {
				System.out.println(rs.getString("id")+"\t"+rs.getString("name")+"\t"+rs.getString("department")+"\t"+ rs.getString("address"));
			}
		}catch(Exception e) {			
			e.printStackTrace(); // 디버깅을 위해
//			try {
//				con.rollback();
//			} catch (SQLException e1) {
//				e1.printStackTrace();
//			}
		}finally {
			if(rs!=null) {
				try {rs.close();} catch (SQLException e) {e.printStackTrace();}
			}
		}
	}

}
