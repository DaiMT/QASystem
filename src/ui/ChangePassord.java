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
        setTitle("�޸�����");// ���ڱ���
        setSize(300, 300);// ���ڴ�С
        setBackground(Color.gray);//���ñ�����ɫ
        setLocationRelativeTo(null);// ���ھ�����Ļ����
//        setDefaultCloseOperation(EXIT_ON_CLOSE);// ����رմ��ں��˳�jvm�����
        getContentPane().setLayout(new BorderLayout(10, 10));// �߽粼��,ˮƽ���10,��ֱ���10
        setResizable(false);//����ʹ���û����ܸı䴰�ڴ�С
        
        // �˵��������ʼ��
//        initMenu();
 
        // ��Ҫ���ĳ�ʼ��
        initPanel();		
	}

	
	private void initPanel() {
		// TODO Auto-generated method stub
		
		JPanel jp = new JPanel();
		
		jl_name = new JLabel("��  ��  �� ��");
		jl_name.setBounds(30,50,80,25);
		jtf_name = new JTextField();
		jtf_name.setBounds(100, 50, 150, 25);
		jtf_name.addActionListener(this);
		
		jl_oldPassord = new JLabel("��        �� ��");
		jl_oldPassord.setBounds(30, 85, 80, 25);
		jtf_oldPassord = new JTextField();
		jtf_oldPassord.setBounds(100, 85, 150, 25);
		jtf_oldPassord.addActionListener(this);
		
		jl_newPassord = new JLabel("��  ��  �� ��");
		jl_newPassord.setBounds(30, 120, 80, 25);
		jtf_newPassord = new JPasswordField();
		jtf_newPassord.setBounds(100, 120, 150, 25);
		jtf_newPassord.addActionListener(this);
		
		jl_againPassord = new JLabel("�ٴ����� ��");
		jl_againPassord.setBounds(30, 155, 80, 25);
		jtf_againPassord = new JPasswordField();
		jtf_againPassord.setBounds(100, 155, 150, 25);
		jtf_againPassord.addActionListener(this);
		
		jbu_yes = new JButton("ȷ  ��");
		jbu_yes.setBounds(50, 200, 80, 25);
		jbu_yes.addActionListener(this);
		jbu_no = new JButton("ȡ  ��");
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
