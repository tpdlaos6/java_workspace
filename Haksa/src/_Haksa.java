import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class _Haksa extends JFrame {
	JLabel lblID=null;
	JTextField tfID=null;
	JLabel lblName=null;
	JTextField tfName=null;
	JLabel lblDepartment=null;
	JTextField tfDepartment=null;
	
	JLabel lblAddress=null;
	JTextField tfAddress=null;
	
	JTextArea taList=null;
	JButton btnInsert=null;
	JButton btnSelect=null;
	JButton btnUpdate=null;
	JButton btnDelete=null;
	
	JButton btnSearch=null;
	
	Connection con=null; // 연결 객체
	Statement stmt=null; // sql 생성, 실행 객체
	ResultSet rs=null; // 
	
	String sql=null;
	
	public _Haksa() {
		this.setTitle("학사관리");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container c=this.getContentPane();
		c.setLayout(new FlowLayout());
		
		lblID=new JLabel("학번");
		c.add(lblID);
		tfID=new JTextField(13);
		c.add(tfID);		
		
		this.btnSearch=new JButton("search");
		this.btnSearch.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				try {
					Class.forName("oracle.jdbc.driver.OracleDriver");
					con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","user1","1234");
					stmt=con.createStatement();
					sql="select * from student where id='"+tfID.getText()+"'";
					rs=stmt.executeQuery(sql); // select한 결과를 rs가 가리킴
					
					//목록 초기화. setText는 덮어쓰기. 따라서 빈 문자열을 덮어쓰라는 코드는 싹 지우라는 것과 같은 효과
					taList.setText("");
					
					//fetch. 한행씩 읽어오기
					while(rs.next()) {
//						System.out.println(rs.getString("ID")+"\t"+rs.getString("Name")+"\t"+rs.getString("Department"));
						taList.append(rs.getString("ID")+"\t"+rs.getString("Name")+"\t"+rs.getString("Department")+"\t"+rs.getString("Address")+"\n");
						tfID.setText(rs.getString("id")); // 검색한 값이 상단 id 탭에도 뜨게 하는 의도
						tfName.setText(rs.getString("name")); // 검색한 값이 상단 name 탭에도 뜨게 하는 의도
						tfDepartment.setText(rs.getString("department")); // 검색한 값이 상단 department 탭에도 뜨게 하는 의도
					}
					
				}catch(Exception e1) {
					e1.printStackTrace();
				}finally {
					try {
						if(rs!=null) {rs.close();}
						if(stmt!=null) {stmt.close();}
						if(con!=null) {con.close();}
					} catch (Exception e2) {
						e2.printStackTrace();
					}
					
				}
			}
			
		});
		c.add(btnSearch);
		
		this.lblName=new JLabel("이름");
		c.add(this.lblName);
		this.tfName=new JTextField(20);
		c.add(tfName);
		
		this.lblDepartment=new JLabel("학과");
		c.add(this.lblDepartment);
		this.tfDepartment=new JTextField(20);
		c.add(this.tfDepartment);
		
		this.lblAddress=new JLabel("주소");
		c.add(this.lblAddress);
		this.tfAddress=new JTextField(20);
		c.add(tfAddress);
		

		this.taList=new JTextArea(15,23);
		c.add(new JScrollPane(this.taList)); // 스크롤 추가		
		
		this.btnInsert=new JButton("등록");
		this.btnInsert.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				try {
					Class.forName("oracle.jdbc.driver.OracleDriver");
					con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","user1","1234");
					stmt=con.createStatement();
					sql="insert into student(id,name,department,address) values('"+tfID.getText()+"','"+tfName.getText()+"','"+tfDepartment.getText()+"','"+tfAddress.getText()+"')";
					stmt.executeUpdate(sql);
				}catch(Exception e1) {
					e1.printStackTrace();
				}finally {
					try {
						if(rs!=null) {rs.close();}
						if(stmt!=null) {stmt.close();}
						if(con!=null) {con.close();}
					} catch (Exception e2) {
						e2.printStackTrace();
					}
					
				}
			}});
		c.add(this.btnInsert);
		this.btnSelect=new JButton("목록");
		this.btnSelect.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				try {
					Class.forName("oracle.jdbc.driver.OracleDriver");
					con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","user1","1234");
					stmt=con.createStatement();
					sql="select * from student";
					rs=stmt.executeQuery(sql); // select한 결과를 rs가 가리킴
					
					//목록 초기화. setText는 덮어쓰기. 따라서 빈 문자열을 덮어쓰라는 코드는 싹 지우라는 것과 같은 효과
					taList.setText("");
					
					//fetch. 한행씩 읽어오기
					while(rs.next()) {
//						System.out.println(rs.getString("ID")+"\t"+rs.getString("Name")+"\t"+rs.getString("Department"));
						taList.append(rs.getString("ID")+"\t"+rs.getString("Name")+"\t"+rs.getString("Department")+"\t"+rs.getString("Address")+"\n");
					}
					
				}catch(Exception e1) {
					e1.printStackTrace();
				}finally {
					try {
						if(rs!=null) {rs.close();}
						if(stmt!=null) {stmt.close();}
						if(con!=null) {con.close();}
					} catch (Exception e2) {
						e2.printStackTrace();
					}
					
				}
				
			}});
		
		c.add(this.btnSelect);
		this.btnUpdate=new JButton("수정");
		this.btnUpdate.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				try {
					Class.forName("oracle.jdbc.driver.OracleDriver");
					con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","user1","1234");
					stmt=con.createStatement();
					sql="update student set name='"+tfName.getText()+"', department='"+tfDepartment.getText()+"', Address='"+tfAddress.getText()+"' where id='"+tfID.getText()+"'";
					stmt.executeUpdate(sql);
				}catch(Exception e1) {
					e1.printStackTrace();
				}finally {
					try {
						if(rs!=null) {rs.close();}
						if(stmt!=null) {stmt.close();}
						if(con!=null) {con.close();}
					} catch (Exception e2) {
						e2.printStackTrace();
					}
					
				}
			}});
		c.add(this.btnUpdate);
		this.btnDelete=new JButton("삭제");
		this.btnDelete.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				try {
					Class.forName("oracle.jdbc.driver.OracleDriver");
					con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","user1","1234");
					stmt=con.createStatement();
					sql="delete from student where id='"+tfID.getText()+"'";
					stmt.executeUpdate(sql);
				}catch(Exception e1) {
					e1.printStackTrace();
				}finally {
					try {
						if(rs!=null) {rs.close();}
						if(stmt!=null) {stmt.close();}
						if(con!=null) {con.close();}
					} catch (Exception e2) {
						e2.printStackTrace();
					}
					
				}
				
			}
			
		});
		c.add(this.btnDelete);
		
		this.setSize(300,500);
		this.setVisible(true);
	}

	public static void main(String[] args) {
		new _Haksa();
	}

}
