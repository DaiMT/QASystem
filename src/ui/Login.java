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
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class Login extends JFrame implements ActionListener,FocusListener{

	private static final long serialVersionUID = 1L;
	private JLabel label_name;
	private JLabel label_password;
	private JTextField tf_name;
	private JPasswordField tf_passord;
	private JButton jbu_forget;
	private JButton jbu_login;
	private JButton jbu_new;
	
	public Login(){
		// ----------窗口属性的设置----------
//	    	FlowLayout layout = new FlowLayout();
		setLayout(null);
		setTitle("欢迎登录");// 窗口标题
		setSize(400, 230);// 窗口大小
		setBackground(Color.gray);//设置背景颜色
		setLocationRelativeTo(null);// 窗口居于屏幕中央
		setDefaultCloseOperation(EXIT_ON_CLOSE);// 点击关闭窗口后退出jvm虚拟机
		getContentPane().setLayout(new BorderLayout(10, 10));// 边界布局,水平间距10,垂直间距10
		setResizable(false);
		setResizable(false);//设置使得用户不能改变窗口大小
		
		// 主要面板的初始化
		initPanel();
	}
	
private void initPanel() {
		
		JPanel jp = new JPanel();
		jp.setLayout(null);
		
		label_name = new JLabel("账号 ： ");
		label_name.setBounds(50, 30, 50, 25);
		
		tf_name = new JTextField(30);
		tf_name.setBounds(110, 30, 170, 25);
		tf_name.addFocusListener(this);// 添加焦点响应
		
		label_password=new JLabel("密码 ： ");
		label_password.setBounds(50, 80, 50, 25);
		
		tf_passord = new JPasswordField(30);
		tf_passord.setBounds(110,80, 170, 25);
		tf_passord.addFocusListener(this);
		
		jbu_forget = new JButton("忘记密码？");
		jbu_forget.setBounds(280, 80, 100, 25);
		jbu_forget.setBorderPainted(false);//设置边框透明
		jbu_forget.setContentAreaFilled(false);//设置背景透明
		jbu_forget.addActionListener(this);//添加动作响应 	忘记密码按钮
		jbu_forget.addFocusListener(this);//添加焦点响应		忘记密码按钮
		
		jbu_login = new JButton("登录");
		jbu_login.setBounds(80, 140, 80, 25);
		jbu_login.addActionListener(this);// 添加动作响应     登陆按钮
		jbu_login.addFocusListener(this);// 添加焦点响应        登陆按钮
		
		jbu_new = new JButton("注册");
		jbu_new.setBounds(220, 140, 80, 25);
		jbu_new.addActionListener(this);// 添加动作响应	注册按钮
		jbu_new.addFocusListener(this);// 添加焦点响应	注册按钮
		
		jp.add(label_name);
		jp.add(tf_name);
		jp.add(label_password);
		jp.add(tf_passord);
		jp.add(jbu_forget);
		jp.add(jbu_login);
		jp.add(jbu_new);
		
		getContentPane().add(jp, BorderLayout.CENTER);
		
	}
	
	
	
	
	
	@Override
	public void focusGained(FocusEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void focusLost(FocusEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
		String cmd = e.getActionCommand();//根据命令来区分不同的操作
		
//		if (cmd.equals("退出")) {
//			System.exit(0);
//		}
		
		if (cmd.equals("登录")) {
			String name = tf_name.getText();
			if(name.equals("admin")){//adminstrator
				new AdminPage1().setVisible(true);
				dispose();
			}else{//user
				new User1().setVisible(true);
				dispose();
			}

		}
		
		if(cmd.equals("注册")){
			new Register().setVisible(true);
		}
		
		if(cmd.equals("忘记密码？")){
			JOptionPane.showMessageDialog(this, "忘记密码");
		}
	}

}
