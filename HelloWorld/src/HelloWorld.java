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
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;


public class HelloWorld extends JPanel {

   JLabel lblID =  null;
   JTextField tfID = null;
   JLabel lblName =  null;
   JTextField tfName = null;
   JLabel lblDepartment =  null;
   JTextField tfDepartment = null;
   JLabel lblAddress =  null;
   JTextField tfAddress = null;
   DefaultTableModel model=null;
   JTable table =null;
   
   
   JButton btnInsert = null;
   JButton btnSelect = null;
   JButton btnUpdate = null;
   JButton btnDelete = null;
   
   JButton btnSearch = null;

   Connection con= null;   //연결객체
   Statement stmt =null;   //sql 생성. 실행객체
   ResultSet rs = null;   //null은 reference값이 없다는 의미.
   String sql = null;   
   
   public HelloWorld() {

      setLayout(new FlowLayout());
      
      lblID=new JLabel("학번");
      add(lblID);
      tfID=new JTextField(13);
      add(tfID);
      
      this.btnSearch = new JButton("search");
      this.btnSearch.addActionListener(new ActionListener() {
         
         @Override
         public void actionPerformed(ActionEvent e) {
            sql = "select * from student where id='"+tfID.getText()+"'";
            list();
         }
      });
      add(btnSearch);
      
      this.lblName=new JLabel("이름");
      add(this.lblName);
      this.tfName= new JTextField(20);
      add(tfName);
      
      this.lblDepartment=new JLabel("학과");
      add(this.lblDepartment);
      this.tfDepartment= new JTextField(20);
      add(tfDepartment);

      String[] colName= {"학번","이름","학과"};   //컬럼명
      this.model= new DefaultTableModel(colName,0);
      this.table = new JTable(model);      //table과 model 바인딩
      this.table.setPreferredScrollableViewportSize(new Dimension(250,200));
      add(new JScrollPane(this.table));   //scroll 추가
      
      this.table.addMouseListener(new MouseListener() {
         @Override
         public void mouseClicked(MouseEvent e) {
            //클릭한 컴포넌트 구하기
            table=(JTable)e.getComponent();
            //모델 구하기
            model = (DefaultTableModel)table.getModel();
            //선택한 행의 행index, 열index로 컬럼값 구하기
            String id =(String)model.getValueAt(table.getSelectedRow(), 0);         //id
            tfID.setText(id);
            String name =(String)model.getValueAt(table.getSelectedRow(), 1);      //name
            tfName.setText(name);
            String department =(String)model.getValueAt(table.getSelectedRow(), 2);   //department
            tfDepartment.setText(department);
         }
         @Override
         public void mouseReleased(MouseEvent e) {}
         @Override
         public void mousePressed(MouseEvent e) {}
         @Override
         public void mouseExited(MouseEvent e) {}
         @Override
         public void mouseEntered(MouseEvent e) {}
      });
      
      this.btnInsert = new JButton("등록");
      this.btnInsert.addActionListener(new ActionListener() {
         
         @Override
         public void actionPerformed(ActionEvent e) {
            sql="insert into student(id,name,department) values('"+tfID.getText()+"','"+tfName.getText()+"','"+tfDepartment.getText()+"')";            
            list();
            JOptionPane.showMessageDialog(null, "등록되었습니다");
         }
      });
      add(this.btnInsert);
      this.btnSelect = new JButton("목록");
      this.btnSelect.addActionListener(new ActionListener() {

         @Override
         public void actionPerformed(ActionEvent e) {
            sql = "select * from student";
            list();
         }
      });
      add(this.btnSelect);
      this.btnUpdate = new JButton("수정");
      this.btnUpdate.addActionListener(new ActionListener() {
         @Override
         public void actionPerformed(ActionEvent e) {
            sql="update student set name='"+tfName.getText()+"', department='"+tfDepartment.getText()+
                     "' where id='"+tfID.getText()+"'";
            list();
            JOptionPane.showMessageDialog(null, "수정되었습니다");
         }
      });
      
      add(this.btnUpdate);
      this.btnDelete = new JButton("삭제");
      this.btnDelete.addActionListener(new ActionListener() {
         @Override
         public void actionPerformed(ActionEvent e) {
            int result = JOptionPane.showConfirmDialog(null, "삭제하겠습니까?","알림",JOptionPane.YES_NO_OPTION);
            System.out.println(result);
            if(result ==JOptionPane.YES_OPTION) {   
               sql="delete student where id='"+tfID.getText()+"'";
               list();
            }
         }
      });
      add(this.btnDelete);
   
      this.setSize(280,500);
      this.setVisible(true);

   }
   
   public void list() {
      try {
         Class.forName("oracle.jdbc.driver.OracleDriver");   //oracle driver 로드
         con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","user1","1234");
         stmt = con.createStatement();
         
         //등록의 경우 stmt의 실행문이 update여야 하므로 구분
         if(sql.contains("insert") == true ) {
            stmt.executeUpdate(sql);
            //삭제, 수정의 경우 출력할 정보가 위의 알림 외에 없으므로 해당건만 실행
         }else if(sql.contains("delete") ==true ||sql.contains("update")==true) {   
            stmt.executeQuery(sql);
            //나머지는 해당 처리 된후 해당 정보 불러와야 함
         }else {
            rs = stmt.executeQuery(sql);
            //목록 초기화
            model.setRowCount(0);   //model의 행의 수를 0으로 변경
            //받아온 정보 추가해주기
            while(rs.next()) {
               String[] row = new String[3];
               row[0] = rs.getString("id");
               row[1] = rs.getString("name");
               row[2] = rs.getString("department");
               model.addRow(row);      //위의 받아온 정보들 한줄씩 출력
            }
         }
      }catch (Exception e1) {
         e1.printStackTrace();
      }finally {
         try {
            if(rs!=null) {rs.close();}
            if(stmt!=null) {stmt.close();}
            if(con!=null) {con.close(); }
         }
         catch (Exception e2) {
            e2.printStackTrace();
         }
      }
   }

}