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
		// ----------�������Ե�����----------
//	    	FlowLayout layout = new FlowLayout();
		setLayout(null);
		setTitle("��ӭ��¼");// ���ڱ���
		setSize(400, 230);// ���ڴ�С
		setBackground(Color.gray);//���ñ�����ɫ
		setLocationRelativeTo(null);// ���ھ�����Ļ����
		setDefaultCloseOperation(EXIT_ON_CLOSE);// ����رմ��ں��˳�jvm�����
		getContentPane().setLayout(new BorderLayout(10, 10));// �߽粼��,ˮƽ���10,��ֱ���10
		setResizable(false);
		setResizable(false);//����ʹ���û����ܸı䴰�ڴ�С
		
		// ��Ҫ���ĳ�ʼ��
		initPanel();
	}
	
private void initPanel() {
		
		JPanel jp = new JPanel();
		jp.setLayout(null);
		
		label_name = new JLabel("�˺� �� ");
		label_name.setBounds(50, 30, 50, 25);
		
		tf_name = new JTextField(30);
		tf_name.setBounds(110, 30, 170, 25);
		tf_name.addFocusListener(this);// ��ӽ�����Ӧ
		
		label_password=new JLabel("���� �� ");
		label_password.setBounds(50, 80, 50, 25);
		
		tf_passord = new JPasswordField(30);
		tf_passord.setBounds(110,80, 170, 25);
		tf_passord.addFocusListener(this);
		
		jbu_forget = new JButton("�������룿");
		jbu_forget.setBounds(280, 80, 100, 25);
		jbu_forget.setBorderPainted(false);//���ñ߿�͸��
		jbu_forget.setContentAreaFilled(false);//���ñ���͸��
		jbu_forget.addActionListener(this);//��Ӷ�����Ӧ 	�������밴ť
		jbu_forget.addFocusListener(this);//��ӽ�����Ӧ		�������밴ť
		
		jbu_login = new JButton("��¼");
		jbu_login.setBounds(80, 140, 80, 25);
		jbu_login.addActionListener(this);// ��Ӷ�����Ӧ     ��½��ť
		jbu_login.addFocusListener(this);// ��ӽ�����Ӧ        ��½��ť
		
		jbu_new = new JButton("ע��");
		jbu_new.setBounds(220, 140, 80, 25);
		jbu_new.addActionListener(this);// ��Ӷ�����Ӧ	ע�ᰴť
		jbu_new.addFocusListener(this);// ��ӽ�����Ӧ	ע�ᰴť
		
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
		
		String cmd = e.getActionCommand();//�������������ֲ�ͬ�Ĳ���
		
//		if (cmd.equals("�˳�")) {
//			System.exit(0);
//		}
		
		if (cmd.equals("��¼")) {
			String name = tf_name.getText();
			if(name.equals("admin")){//adminstrator
				new AdminPage1().setVisible(true);
				dispose();
			}else{//user
				new User1().setVisible(true);
				dispose();
			}

		}
		
		if(cmd.equals("ע��")){
			new Register().setVisible(true);
		}
		
		if(cmd.equals("�������룿")){
			JOptionPane.showMessageDialog(this, "��������");
		}
	}

}
