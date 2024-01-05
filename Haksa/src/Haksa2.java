import java.awt.Container;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

//custom dialog. 로그인 창
class MyDialog2 extends JDialog{
	JLabel lblID=null;
	JTextField tfID=null;
	JLabel lblPW=null;
	JPasswordField tfPW=null;
	JButton btnLogin=null;
	
	public MyDialog2(JFrame frame, String title) {
		super(frame,title,true); // true 는 modal 창으로 생성
		this.setLayout(new FlowLayout());
		this.lblID=new JLabel(" ID  ");
		add(this.lblID);
		this.tfID=new JTextField(10);
		add(this.tfID);
		this.lblPW=new JLabel("PW");
		add(this.lblPW);
		this.tfPW=new JPasswordField(10);
		add(this.tfPW);
		this.setSize(200, 100);
		this.btnLogin=new JButton("로그인");
		add(this.btnLogin);
		this.setSize(170,150);
	}
}


public class Haksa2 extends JFrame {
	JLabel lblID=null;
	JTextField tfID=null;
	JLabel lblName=null;
	JTextField tfName=null;
	JLabel lblDepartment=null;
	JTextField tfDepartment=null;
	
	DefaultTableModel model=null;
	JTable table =null;
	
	JButton btnInsert=null;
	JButton btnSelect=null;
	JButton btnUpdate=null;
	JButton btnDelete=null;
	
	JButton btnSearch=null;
	
	Connection con=null; // 연결 객체
	Statement stmt=null; // sql 생성, 실행 객체
	ResultSet rs=null; // select 결과를 fetch하는 객체
	String sql=null; // sql 문자열
	MyDialog2 dialog=null; // dialog 레퍼런스 변수 선언
	
	
	public Haksa2() {
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
					
					//목록 초기화
					model.setRowCount(0); // model 의 행의 수를 0으로 변경
					
					//fetch. 한행씩 읽어오기
					while(rs.next()) {
						String[] row=new String[3];
						row[0]=rs.getString("id");
						row[1]=rs.getString("name");
						row[2]=rs.getString("department");
						model.addRow(row);
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

		String[] colName= {"학번","이름","학과"}; // 컬럼명
		this.model=new DefaultTableModel(colName,0);
		this.table=new JTable(model); // 테이블과 model 바인딩
		this.table.setPreferredScrollableViewportSize(new Dimension(250,200));
		
// MouseListener 인터페이스는 추상메서드가 5가지. 이 중 하나만 주석처리해도 에러가 발생.
//정작 내가 쓰고싶은 건 mouseClicked 하나인데, 5가지 모두 오버라이딩해야하는 불편함이 있어서
// 이를 보완하고자 MouseAdapter라는 클래스를 만듬. 
// 다만 클래스인만큼 다중상속이 불가(클래스를 상속하는 클래스는 딱 하나여야만 하기 때문)
		this.table.addMouseListener(new MouseListener() {
			
			@Override
			public void mouseClicked(MouseEvent e) {
				//클릭한 컴포넌트 구하기
				table=(JTable)e.getComponent();
				//모델 구하기
				model=(DefaultTableModel)table.getModel();
				//선택한 행의 행 index, 열 index 로 컬럼값 구하기
				String id=(String)model.getValueAt(table.getSelectedRow(),0); // id
				tfID.setText(id);
				String name=(String)model.getValueAt(table.getSelectedRow(),1); // name
				tfName.setText(name);
				String department=(String)model.getValueAt(table.getSelectedRow(),2); // department
				tfDepartment.setText(department);
			}
			@Override
			public void mousePressed(MouseEvent e) {}
			@Override
			public void mouseReleased(MouseEvent e) {}
			@Override
			public void mouseEntered(MouseEvent e) {}
			@Override
			public void mouseExited(MouseEvent e) {}
			});
		
		c.add(new JScrollPane(this.table)); // 스크롤 추가		
		
		this.btnInsert=new JButton("등록");
		this.btnInsert.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				try {
					Class.forName("oracle.jdbc.driver.OracleDriver");
					con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","user1","1234");
					stmt=con.createStatement();
					sql="insert into student(id,name,department) values('"+tfID.getText()+"','"+tfName.getText()+"','"+tfDepartment.getText()+"')";
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
				JOptionPane.showMessageDialog(null,"등록되었습니다");
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
					model.setRowCount(0); // model 의 행의 수를 0으로 변경
					
					//fetch. 한행씩 읽어오기
					while(rs.next()) {
//						System.out.println(rs.getString("ID")+"\t"+rs.getString("Name")+"\t"+rs.getString("Department"));
						String[] row=new String[3];
						row[0]=rs.getString("id");
						row[1]=rs.getString("name");
						row[2]=rs.getString("department");
						model.addRow(row);
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
					sql="update student set name='"+tfName.getText()+"', department='"+tfDepartment.getText()+"' where id='"+tfID.getText()+"'";
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
				JOptionPane.showMessageDialog(null,"수정되었습니다");
			}});
		c.add(this.btnUpdate);
		this.btnDelete=new JButton("삭제");
		this.btnDelete.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				int result=JOptionPane.showConfirmDialog(null, "삭제하시겠습니까?", "알림", JOptionPane.YES_NO_OPTION);
				System.out.println(result);
				if(result==JOptionPane.YES_NO_OPTION) {
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
				JOptionPane.showMessageDialog(null,"삭제되었습니다");
				}				
			}			
		});
		c.add(this.btnDelete);		
		
		this.setSize(300,500);
		this.setVisible(true);
		
		dialog=new MyDialog2(this,"로그인");
		dialog.setModal(true); // modal 창 설정
		dialog.setVisible(true);
	}

	public static void main(String[] args) {
		new Haksa2();
	}

}
