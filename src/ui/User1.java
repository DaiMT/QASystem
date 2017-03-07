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

public class User1 extends JFrame implements ActionListener,FocusListener{

	public User1(){
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
        
        JMenuItem jmi102 = new JMenuItem(" * 注册 ");
        jmi102.addActionListener(this);
        JMenuItem jmi103 = new JMenuItem(" * 修改密码 ");
        jmi103.addActionListener(this);
        JMenuItem jmi104 = new JMenuItem(" * 注销 ");
        jmi104.addActionListener(this);
        JMenuItem jmi105 = new JMenuItem(" * 退出 ");
        jmi105.addActionListener(this);
        jm1.add(jmi102);
        jm1.add(jmi103);
        jm1.add(jmi104);
        jm1.add(jmi105);
        
        JMenu jm2 = new JMenu("操作数据");
        
        JMenu jm201 = new JMenu(" * 数据分析 ");
        JMenuItem searchHFTD = new JMenuItem(" ** 逐笔数据 ");
        searchHFTD.addActionListener(this);
        JMenuItem searchPMDB = new JMenuItem(" ** 分钟数据 ");
        searchPMDB.addActionListener(this);
        JMenuItem searchTKDB = new JMenuItem(" ** 分笔数据 ");
        searchTKDB.addActionListener(this);
        JMenuItem searchPDDB = new JMenuItem(" ** 日频数据 ");
        searchPDDB.addActionListener(this);
        
        jm201.add(searchHFTD);
        jm201.add(searchPMDB);
        jm201.add(searchPDDB);
        jm201.add(searchTKDB);
        
        jm2.add(jm201);
        
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

	@Override
	public void focusGained(FocusEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void focusLost(FocusEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
		String cmd = e.getActionCommand();
		
		if(cmd.equals(" * 注册 ")){
			new Register().setVisible(true);
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
        
        if(cmd.equals(" ** 逐笔数据 ")){
        	new AnalyseDate("逐笔数据").setVisible(true);
        }
        
        if(cmd.equals(" ** 分钟数据 ")){
        	new AnalyseDate("分钟数据").setVisible(true);
        }
        
        if(cmd.equals(" ** 分笔数据 ")){
        	new AnalyseDate("分笔数据").setVisible(true);
        }
        
        if(cmd.equals(" ** 日频数据 ")){
        	new AnalyseDate("日频数据").setVisible(true);
        }
		
	}
	
	
	
	
	
	
}
