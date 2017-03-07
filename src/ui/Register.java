package ui;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Register extends JFrame implements ActionListener,FocusListener{

	private static final long serialVersionUID = 1L;
	private JLabel jl_haveto;
    private JLabel jl_nothaveto;
    private JTextField tf_name;
    private JTextField tf_pass;
    private JTextField tf_pass_again;
	private JLabel jl_name;
	private JLabel jl_pass;
	private JLabel jl_pass_again;
	private JLabel jl_role;
	private JComboBox<String> jcb_role;
    private JButton jbu_yes;
    private JButton jbu_no;
    
    public Register(){
        // ----------窗口属性的设置----------
        setLayout(null);
        setTitle("注册");// 窗口标题
        setSize(370,350);// 窗口大小
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
    	
        JPanel jp = new JPanel();
        jp.setLayout(null);
        
        jl_haveto = new JLabel("  *   必填项    ----------");
        jl_haveto.setBounds(30,30,200,30);
        
//        jl_haveto.setPreferredSize(new Dimension(200, 30));
        
        jl_name = new JLabel("姓         名 ： ");
        jl_name.setBounds(50,80,100,25);
        
        tf_name = new JTextField(30);
        tf_name.setBounds(120,80,150,25);
        tf_name.addFocusListener(this);// 添加焦点响应
        
        jl_pass = new JLabel("密         码 ： ");
        jl_pass.setBounds(50, 120, 100, 25);
        
        tf_pass = new JTextField();
        tf_pass.setBounds(120, 120, 150, 25);
        tf_pass.addActionListener(this);
        
        jl_pass_again = new JLabel("确认密码 ： ");
        jl_pass_again.setBounds(50, 160, 100, 25);
        
        tf_pass_again = new JTextField();
        tf_pass_again.setBounds(120, 160, 150, 25);
        tf_pass_again.addActionListener(this);
        
        jl_role = new JLabel("角         色 ： ");
        jl_role.setBounds(50, 200, 100, 25);
        
        jcb_role = new JComboBox<String>();
        jcb_role.addItem("普通用户");
        jcb_role.addItem("管理员");
        jcb_role.setBounds(120, 200, 150, 25);
        
        jl_nothaveto = new JLabel("  *  选填项     ----------");
        jl_nothaveto.setBounds(30,260,200,30);
        
        jbu_yes = new JButton("注册");
        jbu_yes.setBounds(60,260,80,25);
        jbu_yes.addActionListener(this);// 添加动作响应     登陆按钮
        jbu_yes.addFocusListener(this);// 添加焦点响应        登陆按钮
        
        jbu_no = new JButton("取消");
        jbu_no.setBounds(200,260,80,25);
        jbu_no.addActionListener(this);// 添加动作响应	注册按钮
        jbu_no.addFocusListener(this);// 添加焦点响应	注册按钮

        jp.add(jl_name);
        jp.add(tf_name);
        jp.add(jl_haveto);
//        jp.add(jl_nothaveto);
        jp.add(jbu_yes);
        jp.add(jbu_no);
        jp.add(jl_pass);
        jp.add(jl_pass_again);
        jp.add(tf_pass);
        jp.add(tf_pass_again);
        jp.add(jl_role);
        jp.add(jcb_role);
        
        getContentPane().add(jp, BorderLayout.CENTER);
 
    }
    
    // 动作响应处理
    public void actionPerformed(ActionEvent e) {
        String cmd = e.getActionCommand();//根据命令来区分不同的操作
        if (cmd.equals("取消")) {
//            System.exit(0);
        	dispose();
        }
        if (cmd.equals("注册")) {
        	
            JOptionPane.showMessageDialog(this, "注册成功！");
        }
    }
 
    // 焦点响应处理
    public void focusGained(FocusEvent e) {//获得焦点

    }
 
    public void focusLost(FocusEvent e) {//失去焦点

    }
    
    
	
}
