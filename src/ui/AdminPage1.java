package ui;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class AdminPage1 extends JFrame implements ActionListener,FocusListener {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public AdminPage1(){
        // ----------窗口属性的设置----------
//    	FlowLayout layout = new FlowLayout();
        setLayout(null);
        setTitle("分析系统");// 窗口标题
        setSize(600, 100);// 窗口大小
        setBackground(Color.gray);//设置背景颜色
        setLocationRelativeTo(null);// 窗口居于屏幕中央
        setDefaultCloseOperation(EXIT_ON_CLOSE);// 点击关闭窗口后退出jvm虚拟机
        getContentPane().setLayout(new BorderLayout(10, 10));// 边界布局,水平间距10,垂直间距10
        setResizable(false);//设置使得用户不能改变窗口大小
        
        // 菜单栏组件初始化
        initMenu();
 
        // 主要面板的初始化
        initPanel();
    }
	
	
	//主要面板的初始化方法
	private void initPanel() {
		// TODO Auto-generated method stub
		JPanel jp = new JPanel();
        jp.setLayout(null);
        jp.setBounds(0,0,100,100);
        getContentPane().add(jp, BorderLayout.CENTER);
	}

	//菜单栏初始化和设置
	private void initMenu() {
		
        JMenuBar jmb = new JMenuBar();
        
        JMenu jm1 = new JMenu("系统");
        
        JMenu jm101 =new JMenu(" * 数据库管理 ");
        JMenuItem addDB = new JMenuItem(" ** 添加数据库 ");
        addDB.addActionListener(this);
        JMenuItem deleteDB = new JMenuItem(" ** 删除数据库 ");
        deleteDB.addActionListener(this);
        JMenuItem setDB = new JMenuItem(" ** 设置数据库 ");
        setDB.addActionListener(this);
        jm101.add(addDB);
        jm101.add(deleteDB);
        jm101.add(setDB);
        jm1.add(jm101);
        
        JMenu jm102 = new JMenu(" * 用户管理 ");
        JMenuItem deleteUser = new JMenuItem(" ** 删除用户 ");
        deleteUser.addActionListener(this);
        JMenuItem updateUser = new JMenuItem(" ** 修改用户 ");
        updateUser.addActionListener(this);
        JMenuItem searchUser = new JMenuItem(" ** 查询用户 ");
        searchUser.addActionListener(this);
        jm102.add(deleteUser);
        jm102.add(updateUser);
        jm102.add(searchUser);
        jm1.add(jm102);
        
        JMenuItem jmi103 = new JMenuItem(" * 修改密码 ");
        jmi103.addActionListener(this);
        JMenuItem jmi104 = new JMenuItem(" * 注销 ");
        jmi104.addActionListener(this);
        JMenuItem jmi105 = new JMenuItem(" * 退出 ");
        jmi105.addActionListener(this);
        jm1.add(jmi103);
        jm1.add(jmi104);
        jm1.add(jmi105);
        
        JMenu jm2 = new JMenu("操作数据");
        
        JMenuItem jmi201 = new JMenuItem(" * 数据分析 ");
        jmi201.addActionListener(this);
        JMenuItem jmi202 = new JMenuItem(" * 数据更新 ");
        jmi202.addActionListener(this);
        JMenuItem jmi203 = new JMenuItem(" * 数据删除 ");
        jmi203.addActionListener(this);
        JMenuItem jmi204 = new JMenuItem(" * 数据导出 ");
        jmi204.addActionListener(this);
        
//        JMenu jm201 = new JMenu(" * 数据分析 ");
//        JMenuItem searchHFTD = new JMenuItem(" ** 分析逐笔数据 ");
//        searchHFTD.addActionListener(this);
//        JMenuItem searchPMDB = new JMenuItem(" ** 分析分钟数据 ");
//        searchPMDB.addActionListener(this);
//        JMenuItem searchTKDB = new JMenuItem(" ** 分析分笔数据 ");
//        searchTKDB.addActionListener(this);
//        JMenuItem searchPDDB = new JMenuItem(" ** 分析日频数据 ");
//        searchPDDB.addActionListener(this);
//        
//        jm201.add(searchHFTD);
//        jm201.add(searchPMDB);
//        jm201.add(searchPDDB);
//        jm201.add(searchTKDB);
        
//        JMenu jm202 = new JMenu(" * 数据更新 ");
//        JMenuItem updateHFTD = new JMenuItem(" ** 上传逐笔数据 ");
//        updateHFTD.addActionListener(this);
//        JMenuItem updatePMDB = new JMenuItem(" ** 上传分钟数据 ");
//        updatePMDB.addActionListener(this);
//        JMenuItem updateTKDB = new JMenuItem(" ** 上传分笔数据 ");
//        updateTKDB.addActionListener(this);
//        JMenuItem updatePDDB = new JMenuItem(" ** 上传日频数据 ");
//        updatePDDB.addActionListener(this);
        
//        jm202.add(updateHFTD);
//        jm202.add(updatePMDB);
//        jm202.add(updatePDDB);
//        jm202.add(updateTKDB);
        
//        JMenu jm203 = new JMenu(" * 数据删除 ");
//        JMenuItem deleteHFTD = new JMenuItem(" ** 删除逐笔数据 ");
//        deleteHFTD.addActionListener(this);
//        JMenuItem deletePMDB = new JMenuItem(" ** 删除分钟数据 ");
//        deletePMDB.addActionListener(this);
//        JMenuItem deleteTKDB = new JMenuItem(" ** 删除分笔数据 ");
//        deleteTKDB.addActionListener(this);
//        JMenuItem deletePDDB = new JMenuItem(" ** 删除日频数据 ");
//        deletePDDB.addActionListener(this);
        
//        jm203.add(deleteHFTD);
//        jm203.add(deletePMDB);
//        jm203.add(deletePDDB);
//        jm203.add(deleteTKDB);
//        
//        JMenu jm204 = new JMenu(" * 数据导出 ");
//        JMenuItem getHFTD = new JMenuItem(" ** 删除逐笔数据 ");
//        getHFTD.addActionListener(this);
//        JMenuItem getPMDB = new JMenuItem(" ** 删除分钟数据 ");
//        getPMDB.addActionListener(this);
//        JMenuItem getTKDB = new JMenuItem(" ** 删除分笔数据 ");
//        getTKDB.addActionListener(this);
//        JMenuItem getPDDB = new JMenuItem(" ** 删除日频数据 ");
//        getPDDB.addActionListener(this);
        
//        jm204.add(getHFTD);
//        jm204.add(getPMDB);
//        jm204.add(getPDDB);
//        jm204.add(getTKDB);
        
//        jm2.add(jm201);
//        jm2.add(jm202);
//        jm2.add(jm203);
//        jm2.add(jm204);
        
        jm2.add(jmi201);
        jm2.add(jmi202);
        jm2.add(jmi203);
        jm2.add(jmi204);
        
        
        JMenu jm3 = new JMenu("关于");
        JMenuItem help = new JMenuItem(" * 帮助 ");
        help.addActionListener(this);
        JMenuItem illustration = new JMenuItem(" * 说明 ");
        illustration.addActionListener(this);
        
        jm3.add(help);
        jm3.add(illustration);
        
        jmb.add(jm1);
        jmb.add(jm2);
        jmb.add(jm3);
        setJMenuBar(jmb);//设置菜单栏   
	}

	@Override//获得焦点处理
	public void focusGained(FocusEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override//失去焦点处理
	public void focusLost(FocusEvent arg0) {
		// TODO Auto-generated method stub
		
	}
	
	@Override//动作相应处理
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
		String cmd = e.getActionCommand();//根据命令来区分不同的操作
        
        if(cmd.equals(" ** 添加数据库 ")){
//        	String[] args = {"navicat.exe","D:\\MySQL Datafiles\\Navicat Premium"}
//        	Runtime.getRuntime().exec(args);
        }
        
        if(cmd.equals(" ** 添加数据库 ")){
        	
        }

        if(cmd.equals(" ** 删除数据库 ")){
        	
        }
        
        if(cmd.equals(" ** 设置数据库 ")){
        	
        }
        
        if(cmd.equals(" ** 查询用户 ")){
        	
        }
        
        if(cmd.equals(" ** 修改用户 ")){
        	
        }
        
        if(cmd.equals(" ** 删除用户 ")){
        	
        }
        
        if(cmd.equals(" * 修改密码 ")){
        	new ChangePassord().setVisible(true);
        }
        
        if(cmd.equals(" * 注销 ")){
        	int m = JOptionPane.showConfirmDialog(null," 确定注销此账号？ ","删除",JOptionPane.YES_NO_OPTION);
        	if(m==0){
        		dispose();
        		new Login().setVisible(true);
        	}
        }
        
        if(cmd.equals(" * 退出 ")){
        	System.exit(0);
        }
        
        if(cmd.equals(" * 数据分析 ")){
        	new AnalyseDate().setVisible(true);
        }
        
        if(cmd.equals(" * 数据更新 ")){
        	new UpdateData().setVisible(true);
        }
        
        if(cmd.equals(" * 数据删除 ")){
        	
        }
        
        if(cmd.equals(" * 数据导出 ")){
        	
        }
        
        
        


        
        
        
        
        
	}
	
}
