package ui;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class ChangePassord extends JFrame implements ActionListener,FocusListener{

	private JLabel jl_name;
	private JLabel jl_oldPassord;
	private JLabel jl_newPassord;
	private JLabel jl_againPassord;
	private JTextField jtf_name;
	private JTextField jtf_oldPassord;
	private JPasswordField jtf_newPassord;
	private JPasswordField jtf_againPassord;
	private JButton jbu_yes;
	private JButton jbu_no;
	
	public ChangePassord() {
		// TODO Auto-generated constructor stub
        setLayout(null);
        setTitle("修改密码");// 窗口标题
        setSize(300, 300);// 窗口大小
        setBackground(Color.gray);//设置背景颜色
        setLocationRelativeTo(null);// 窗口居于屏幕中央
//        setDefaultCloseOperation(EXIT_ON_CLOSE);// 点击关闭窗口后退出jvm虚拟机
        getContentPane().setLayout(new BorderLayout(10, 10));// 边界布局,水平间距10,垂直间距10
        setResizable(false);//设置使得用户不能改变窗口大小
        
        // 菜单栏组件初始化
//        initMenu();
 
        // 主要面板的初始化
        initPanel();		
	}

	
	private void initPanel() {
		// TODO Auto-generated method stub
		
		JPanel jp = new JPanel();
		
		jl_name = new JLabel("用  户  名 ：");
		jl_name.setBounds(30,50,80,25);
		jtf_name = new JTextField();
		jtf_name.setBounds(100, 50, 150, 25);
		jtf_name.addActionListener(this);
		
		jl_oldPassord = new JLabel("密        码 ：");
		jl_oldPassord.setBounds(30, 85, 80, 25);
		jtf_oldPassord = new JTextField();
		jtf_oldPassord.setBounds(100, 85, 150, 25);
		jtf_oldPassord.addActionListener(this);
		
		jl_newPassord = new JLabel("新  密  码 ：");
		jl_newPassord.setBounds(30, 120, 80, 25);
		jtf_newPassord = new JPasswordField();
		jtf_newPassord.setBounds(100, 120, 150, 25);
		jtf_newPassord.addActionListener(this);
		
		jl_againPassord = new JLabel("再次输入 ：");
		jl_againPassord.setBounds(30, 155, 80, 25);
		jtf_againPassord = new JPasswordField();
		jtf_againPassord.setBounds(100, 155, 150, 25);
		jtf_againPassord.addActionListener(this);
		
		jbu_yes = new JButton("确  认");
		jbu_yes.setBounds(50, 200, 80, 25);
		jbu_yes.addActionListener(this);
		jbu_no = new JButton("取  消");
		jbu_no.setBounds(150, 200, 80, 25);
		jbu_no.addActionListener(this);
		
		jp.add(jl_name);
		jp.add(jtf_name);
		jp.add(jl_oldPassord);
		jp.add(jtf_oldPassord);
		jp.add(jl_newPassord);
		jp.add(jtf_newPassord);
		jp.add(jl_againPassord);
		jp.add(jtf_againPassord);
		jp.add(jbu_yes);
		jp.add(jbu_no);
		
		jp.setLayout(null);
        jp.setBounds(0,0,100,100);
        getContentPane().add(jp, BorderLayout.CENTER);
		
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
		
	}

}
